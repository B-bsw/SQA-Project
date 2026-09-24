package org.apache.commons.lang3.text;

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
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = null;
        extendedMessageFormat2.setLocale(locale4);
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass10 = formatArray9.getClass();
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormatsByArgumentIndex();
        extendedMessageFormat5.applyPattern("");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat5.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat16.applyPattern("");
        java.text.Format[] formatArray19 = extendedMessageFormat16.getFormats();
        java.lang.String str20 = extendedMessageFormat16.toPattern();
        java.util.Locale locale21 = extendedMessageFormat16.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale21);
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale25);
        extendedMessageFormat26.applyPattern("");
        java.text.Format[] formatArray29 = extendedMessageFormat26.getFormats();
        java.lang.String str30 = extendedMessageFormat26.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat33.applyPattern("");
        java.text.Format[] formatArray36 = extendedMessageFormat33.getFormats();
        java.lang.String str37 = extendedMessageFormat33.toPattern();
        java.util.Locale locale38 = extendedMessageFormat33.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale38);
        extendedMessageFormat26.setLocale(locale38);
        extendedMessageFormat23.setLocale(locale38);
        extendedMessageFormat5.setLocale(locale38);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale38);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale38);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale38);
        java.util.Locale locale46 = extendedMessageFormat45.getLocale();
        java.util.Locale locale47 = extendedMessageFormat45.getLocale();
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "th_TH");
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray12 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray13 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray14 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        java.lang.String str15 = extendedMessageFormat14.toPattern();
        extendedMessageFormat14.applyPattern("hi!");
        java.util.Locale locale18 = extendedMessageFormat14.getLocale();
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        extendedMessageFormat22.applyPattern("");
        java.text.Format[] formatArray25 = extendedMessageFormat22.getFormats();
        java.text.Format[] formatArray26 = extendedMessageFormat22.getFormats();
        java.util.Locale locale27 = null;
        extendedMessageFormat22.setLocale(locale27);
        extendedMessageFormat22.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat34.applyPattern("");
        java.text.Format[] formatArray37 = extendedMessageFormat34.getFormats();
        java.lang.String str38 = extendedMessageFormat34.toPattern();
        java.util.Locale locale39 = extendedMessageFormat34.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale39);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale39);
        java.util.Locale locale43 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale43);
        extendedMessageFormat44.applyPattern("");
        java.text.Format[] formatArray47 = extendedMessageFormat44.getFormats();
        java.lang.String str48 = extendedMessageFormat44.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat51 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat51.applyPattern("");
        java.text.Format[] formatArray54 = extendedMessageFormat51.getFormats();
        java.lang.String str55 = extendedMessageFormat51.toPattern();
        java.util.Locale locale56 = extendedMessageFormat51.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat57 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale56);
        extendedMessageFormat44.setLocale(locale56);
        extendedMessageFormat41.setLocale(locale56);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat63 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat63.applyPattern("");
        java.text.Format[] formatArray66 = extendedMessageFormat63.getFormats();
        java.lang.String str67 = extendedMessageFormat63.toPattern();
        java.util.Locale locale68 = extendedMessageFormat63.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat69 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale68);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat70 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale68);
        extendedMessageFormat41.setLocale(locale68);
        extendedMessageFormat22.setLocale(locale68);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat73 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale68);
        extendedMessageFormat14.setLocale(locale68);
        extendedMessageFormat2.setLocale(locale68);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(formatArray54);
        org.junit.Assert.assertArrayEquals(formatArray54, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray66);
        org.junit.Assert.assertArrayEquals(formatArray66, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "th_TH");
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormats();
        java.lang.String str9 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        java.lang.String str5 = extendedMessageFormat4.toPattern();
        extendedMessageFormat4.applyPattern("hi!");
        java.util.Locale locale8 = extendedMessageFormat4.getLocale();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat12.getFormats();
        java.text.Format[] formatArray16 = extendedMessageFormat12.getFormats();
        java.util.Locale locale17 = null;
        extendedMessageFormat12.setLocale(locale17);
        extendedMessageFormat12.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat24.applyPattern("");
        java.text.Format[] formatArray27 = extendedMessageFormat24.getFormats();
        java.lang.String str28 = extendedMessageFormat24.toPattern();
        java.util.Locale locale29 = extendedMessageFormat24.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale29);
        java.util.Locale locale33 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale33);
        extendedMessageFormat34.applyPattern("");
        java.text.Format[] formatArray37 = extendedMessageFormat34.getFormats();
        java.lang.String str38 = extendedMessageFormat34.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat41.applyPattern("");
        java.text.Format[] formatArray44 = extendedMessageFormat41.getFormats();
        java.lang.String str45 = extendedMessageFormat41.toPattern();
        java.util.Locale locale46 = extendedMessageFormat41.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale46);
        extendedMessageFormat34.setLocale(locale46);
        extendedMessageFormat31.setLocale(locale46);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat53 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat53.applyPattern("");
        java.text.Format[] formatArray56 = extendedMessageFormat53.getFormats();
        java.lang.String str57 = extendedMessageFormat53.toPattern();
        java.util.Locale locale58 = extendedMessageFormat53.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat59 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale58);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale58);
        extendedMessageFormat31.setLocale(locale58);
        extendedMessageFormat12.setLocale(locale58);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat63 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale58);
        extendedMessageFormat4.setLocale(locale58);
        java.text.Format[] formatArray65 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.text.Format[] formatArray66 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.lang.String str67 = extendedMessageFormat4.toPattern();
        java.lang.Object[] objArray69 = extendedMessageFormat4.parse("hi!");
        java.lang.String str70 = java.text.MessageFormat.format("", objArray69);
        java.lang.String str71 = java.text.MessageFormat.format("hi!", objArray69);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(formatArray44);
        org.junit.Assert.assertArrayEquals(formatArray44, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray56);
        org.junit.Assert.assertArrayEquals(formatArray56, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray65);
        org.junit.Assert.assertArrayEquals(formatArray65, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray66);
        org.junit.Assert.assertArrayEquals(formatArray66, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertArrayEquals(objArray69, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        extendedMessageFormat6.applyPattern("");
        java.text.Format[] formatArray9 = extendedMessageFormat6.getFormats();
        java.lang.String str10 = extendedMessageFormat6.toPattern();
        java.util.Locale locale11 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        extendedMessageFormat6.setLocale(locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        java.lang.Class<?> wildcardClass20 = extendedMessageFormat19.getClass();
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        extendedMessageFormat8.applyPattern("");
        java.text.Format[] formatArray11 = extendedMessageFormat8.getFormatsByArgumentIndex();
        extendedMessageFormat8.applyPattern("");
        java.text.Format[] formatArray14 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.text.Format[] formatArray15 = extendedMessageFormat8.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat19.applyPattern("");
        java.text.Format[] formatArray22 = extendedMessageFormat19.getFormats();
        java.lang.String str23 = extendedMessageFormat19.toPattern();
        java.util.Locale locale24 = extendedMessageFormat19.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale24);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale24);
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale28);
        extendedMessageFormat29.applyPattern("");
        java.text.Format[] formatArray32 = extendedMessageFormat29.getFormats();
        java.lang.String str33 = extendedMessageFormat29.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat36.applyPattern("");
        java.text.Format[] formatArray39 = extendedMessageFormat36.getFormats();
        java.lang.String str40 = extendedMessageFormat36.toPattern();
        java.util.Locale locale41 = extendedMessageFormat36.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale41);
        extendedMessageFormat29.setLocale(locale41);
        extendedMessageFormat26.setLocale(locale41);
        extendedMessageFormat8.setLocale(locale41);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale41);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale41);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale41);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale41);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale41);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str53 = extendedMessageFormat52.toPattern();
        java.text.Format[] formatArray54 = extendedMessageFormat52.getFormatsByArgumentIndex();
        java.util.Locale locale55 = extendedMessageFormat52.getLocale();
        extendedMessageFormat50.setLocale(locale55);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat57 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale55);
        extendedMessageFormat57.applyPattern("hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(formatArray54);
        org.junit.Assert.assertArrayEquals(formatArray54, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "th_TH");
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        java.lang.String str10 = extendedMessageFormat2.format((java.lang.Object) formatArray9);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str13 = extendedMessageFormat2.toPattern();
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat16.applyPattern("");
        java.util.Locale locale19 = extendedMessageFormat16.getLocale();
        java.lang.String str20 = extendedMessageFormat16.toPattern();
        java.lang.String str21 = extendedMessageFormat16.toPattern();
        java.text.Format[] formatArray22 = extendedMessageFormat16.getFormats();
        java.lang.String str23 = extendedMessageFormat2.format((java.lang.Object) formatArray22);
        java.text.Format[] formatArray24 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray25 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.ParsePosition parsePosition29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = extendedMessageFormat2.parseObject("", parsePosition29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale3 = extendedMessageFormat1.getLocale();
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale10 = null;
        extendedMessageFormat7.setLocale(locale10);
        java.util.Locale locale12 = extendedMessageFormat7.getLocale();
        java.util.Locale locale13 = extendedMessageFormat7.getLocale();
        java.text.Format[] formatArray14 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.util.Locale locale15 = extendedMessageFormat7.getLocale();
        java.text.Format[] formatArray16 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.lang.String str17 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray16);
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.FieldPosition fieldPosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = extendedMessageFormat1.format((java.lang.Object) "", stringBuffer18, fieldPosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormatsByArgumentIndex();
        extendedMessageFormat3.applyPattern("");
        java.lang.String str9 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat16.applyPattern("");
        java.text.Format[] formatArray19 = extendedMessageFormat16.getFormats();
        java.lang.String str20 = extendedMessageFormat16.toPattern();
        java.util.Locale locale21 = extendedMessageFormat16.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        extendedMessageFormat13.setLocale(locale21);
        extendedMessageFormat3.setLocale(locale21);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        java.text.Format[] formatArray26 = extendedMessageFormat25.getFormatsByArgumentIndex();
        java.lang.String str27 = extendedMessageFormat25.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray32 = extendedMessageFormat30.parse("hi!");
        java.util.Locale locale33 = null;
        extendedMessageFormat30.setLocale(locale33);
        java.text.Format[] formatArray35 = extendedMessageFormat30.getFormats();
        java.util.Locale locale36 = extendedMessageFormat30.getLocale();
        java.text.Format[] formatArray37 = extendedMessageFormat30.getFormatsByArgumentIndex();
        java.lang.String str38 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray37);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat25.setFormats(formatArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertArrayEquals(objArray32, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale36);
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormats();
        java.lang.Object[] objArray4 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        extendedMessageFormat7.applyPattern("");
        java.text.Format[] formatArray10 = extendedMessageFormat7.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat7.getFormats();
        java.util.Locale locale12 = null;
        extendedMessageFormat7.setLocale(locale12);
        extendedMessageFormat7.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat19.applyPattern("");
        java.text.Format[] formatArray22 = extendedMessageFormat19.getFormats();
        java.lang.String str23 = extendedMessageFormat19.toPattern();
        java.util.Locale locale24 = extendedMessageFormat19.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale24);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale24);
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale28);
        extendedMessageFormat29.applyPattern("");
        java.text.Format[] formatArray32 = extendedMessageFormat29.getFormats();
        java.lang.String str33 = extendedMessageFormat29.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat36.applyPattern("");
        java.text.Format[] formatArray39 = extendedMessageFormat36.getFormats();
        java.lang.String str40 = extendedMessageFormat36.toPattern();
        java.util.Locale locale41 = extendedMessageFormat36.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale41);
        extendedMessageFormat29.setLocale(locale41);
        extendedMessageFormat26.setLocale(locale41);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat48.applyPattern("");
        java.text.Format[] formatArray51 = extendedMessageFormat48.getFormats();
        java.lang.String str52 = extendedMessageFormat48.toPattern();
        java.util.Locale locale53 = extendedMessageFormat48.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat54 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale53);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale53);
        extendedMessageFormat26.setLocale(locale53);
        extendedMessageFormat7.setLocale(locale53);
        extendedMessageFormat1.setLocale(locale53);
        java.text.Format[] formatArray59 = extendedMessageFormat1.getFormats();
        java.lang.Object obj60 = extendedMessageFormat1.clone();
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray51);
        org.junit.Assert.assertArrayEquals(formatArray51, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray59);
        org.junit.Assert.assertArrayEquals(formatArray59, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj60);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.util.Locale locale14 = extendedMessageFormat12.getLocale();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        extendedMessageFormat17.applyPattern("");
        java.text.Format[] formatArray20 = extendedMessageFormat17.getFormatsByArgumentIndex();
        extendedMessageFormat17.applyPattern("");
        java.text.Format[] formatArray23 = extendedMessageFormat17.getFormatsByArgumentIndex();
        extendedMessageFormat17.applyPattern("hi!");
        java.lang.Object[] objArray27 = extendedMessageFormat17.parse("hi!");
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        extendedMessageFormat30.applyPattern("");
        java.text.Format[] formatArray33 = extendedMessageFormat30.getFormats();
        java.lang.String str34 = extendedMessageFormat30.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat37.applyPattern("");
        java.text.Format[] formatArray40 = extendedMessageFormat37.getFormats();
        java.lang.String str41 = extendedMessageFormat37.toPattern();
        java.util.Locale locale42 = extendedMessageFormat37.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        extendedMessageFormat30.setLocale(locale42);
        extendedMessageFormat17.setLocale(locale42);
        extendedMessageFormat12.setLocale(locale42);
        extendedMessageFormat2.setLocale(locale42);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        extendedMessageFormat48.applyPattern("");
        java.util.Locale locale51 = extendedMessageFormat48.getLocale();
        java.util.Locale locale54 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale54);
        java.util.Locale locale56 = extendedMessageFormat55.getLocale();
        java.text.Format[] formatArray57 = extendedMessageFormat55.getFormatsByArgumentIndex();
        java.text.Format[] formatArray58 = extendedMessageFormat55.getFormatsByArgumentIndex();
        extendedMessageFormat55.applyPattern("hi!");
        java.text.Format[] formatArray61 = extendedMessageFormat55.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat48.setFormatByArgumentIndex((int) (short) 0, (java.text.Format) extendedMessageFormat55);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(formatArray40);
        org.junit.Assert.assertArrayEquals(formatArray40, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNull(locale56);
        org.junit.Assert.assertNotNull(formatArray57);
        org.junit.Assert.assertArrayEquals(formatArray57, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray58);
        org.junit.Assert.assertArrayEquals(formatArray58, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray61);
        org.junit.Assert.assertArrayEquals(formatArray61, new java.text.Format[] {});
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.util.Locale locale11 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray12 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object[] objArray14 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray15 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str16 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str19 = extendedMessageFormat18.toPattern();
        java.util.Locale locale20 = extendedMessageFormat18.getLocale();
        extendedMessageFormat2.setLocale(locale20);
        java.text.Format[] formatArray22 = extendedMessageFormat2.getFormats();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray17 = extendedMessageFormat15.parse("hi!");
        java.lang.String str18 = extendedMessageFormat11.format((java.lang.Object) objArray17);
        java.text.Format[] formatArray19 = extendedMessageFormat11.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat23.applyPattern("");
        java.text.Format[] formatArray26 = extendedMessageFormat23.getFormats();
        java.lang.String str27 = extendedMessageFormat23.toPattern();
        java.util.Locale locale28 = extendedMessageFormat23.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale28);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale28);
        extendedMessageFormat11.setLocale(locale28);
        extendedMessageFormat3.setLocale(locale28);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat34.applyPattern("");
        java.text.Format[] formatArray37 = extendedMessageFormat34.getFormats();
        java.lang.String str38 = extendedMessageFormat34.toPattern();
        java.util.Locale locale39 = extendedMessageFormat34.getLocale();
        extendedMessageFormat3.setLocale(locale39);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale39);
        extendedMessageFormat41.applyPattern("");
        java.text.Format[] formatArray44 = extendedMessageFormat41.getFormats();
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray44);
        org.junit.Assert.assertArrayEquals(formatArray44, new java.text.Format[] {});
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        extendedMessageFormat15.applyPattern("");
        java.text.Format[] formatArray18 = extendedMessageFormat15.getFormatsByArgumentIndex();
        extendedMessageFormat15.applyPattern("");
        java.text.Format[] formatArray21 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.text.Format[] formatArray22 = extendedMessageFormat15.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat26.applyPattern("");
        java.text.Format[] formatArray29 = extendedMessageFormat26.getFormats();
        java.lang.String str30 = extendedMessageFormat26.toPattern();
        java.util.Locale locale31 = extendedMessageFormat26.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale31);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale31);
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        extendedMessageFormat36.applyPattern("");
        java.text.Format[] formatArray39 = extendedMessageFormat36.getFormats();
        java.lang.String str40 = extendedMessageFormat36.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat43.applyPattern("");
        java.text.Format[] formatArray46 = extendedMessageFormat43.getFormats();
        java.lang.String str47 = extendedMessageFormat43.toPattern();
        java.util.Locale locale48 = extendedMessageFormat43.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale48);
        extendedMessageFormat36.setLocale(locale48);
        extendedMessageFormat33.setLocale(locale48);
        extendedMessageFormat15.setLocale(locale48);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat53 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale48);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat54 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale48);
        extendedMessageFormat2.setLocale(locale48);
        java.util.Locale locale59 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale59);
        extendedMessageFormat60.applyPattern("");
        extendedMessageFormat60.applyPattern("");
        java.text.Format[] formatArray65 = extendedMessageFormat60.getFormatsByArgumentIndex();
        java.util.Locale locale67 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat68 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale67);
        extendedMessageFormat68.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat72 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray74 = extendedMessageFormat72.parse("hi!");
        java.lang.String str75 = extendedMessageFormat68.format((java.lang.Object) objArray74);
        java.text.Format[] formatArray76 = extendedMessageFormat68.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat80 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat80.applyPattern("");
        java.text.Format[] formatArray83 = extendedMessageFormat80.getFormats();
        java.lang.String str84 = extendedMessageFormat80.toPattern();
        java.util.Locale locale85 = extendedMessageFormat80.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat86 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale85);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat87 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale85);
        extendedMessageFormat68.setLocale(locale85);
        extendedMessageFormat60.setLocale(locale85);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat90 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale85);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat91 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale85);
        java.lang.Object[] objArray93 = extendedMessageFormat91.parse("hi!");
        boolean boolean94 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat91);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(formatArray46);
        org.junit.Assert.assertArrayEquals(formatArray46, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray65);
        org.junit.Assert.assertArrayEquals(formatArray65, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertArrayEquals(objArray74, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(formatArray76);
        org.junit.Assert.assertArrayEquals(formatArray76, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray83);
        org.junit.Assert.assertArrayEquals(formatArray83, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertArrayEquals(objArray93, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat2.parse("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) objArray8);
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        java.lang.String str11 = extendedMessageFormat2.toPattern();
        java.util.Locale locale12 = extendedMessageFormat2.getLocale();
        java.lang.String str13 = extendedMessageFormat2.toPattern();
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat16.applyPattern("");
        java.text.Format[] formatArray19 = extendedMessageFormat16.getFormats();
        java.text.Format[] formatArray20 = extendedMessageFormat16.getFormats();
        extendedMessageFormat16.applyPattern("");
        extendedMessageFormat16.applyPattern("");
        java.text.Format[] formatArray25 = extendedMessageFormat16.getFormatsByArgumentIndex();
        java.text.Format[] formatArray26 = extendedMessageFormat16.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        java.util.Locale locale8 = null;
        extendedMessageFormat3.setLocale(locale8);
        extendedMessageFormat3.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat15.applyPattern("");
        java.text.Format[] formatArray18 = extendedMessageFormat15.getFormats();
        java.lang.String str19 = extendedMessageFormat15.toPattern();
        java.util.Locale locale20 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale20);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale20);
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale24);
        extendedMessageFormat25.applyPattern("");
        java.text.Format[] formatArray28 = extendedMessageFormat25.getFormats();
        java.lang.String str29 = extendedMessageFormat25.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat32.applyPattern("");
        java.text.Format[] formatArray35 = extendedMessageFormat32.getFormats();
        java.lang.String str36 = extendedMessageFormat32.toPattern();
        java.util.Locale locale37 = extendedMessageFormat32.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale37);
        extendedMessageFormat25.setLocale(locale37);
        extendedMessageFormat22.setLocale(locale37);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat44.applyPattern("");
        java.text.Format[] formatArray47 = extendedMessageFormat44.getFormats();
        java.lang.String str48 = extendedMessageFormat44.toPattern();
        java.util.Locale locale49 = extendedMessageFormat44.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale49);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat51 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale49);
        extendedMessageFormat22.setLocale(locale49);
        extendedMessageFormat3.setLocale(locale49);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat54 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale49);
        java.text.ParsePosition parsePosition56 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = extendedMessageFormat54.parseObject("hi!", parsePosition56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = null;
        extendedMessageFormat2.setLocale(locale6);
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        java.lang.String str18 = extendedMessageFormat14.toPattern();
        java.util.Locale locale19 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale22 = extendedMessageFormat21.getLocale();
        extendedMessageFormat14.setLocale(locale22);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale22);
        java.util.Locale locale25 = extendedMessageFormat24.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = extendedMessageFormat2.parse("", parsePosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat12.getFormats();
        java.text.Format[] formatArray16 = extendedMessageFormat12.getFormats();
        java.util.Locale locale17 = null;
        extendedMessageFormat12.setLocale(locale17);
        extendedMessageFormat12.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat24.applyPattern("");
        java.text.Format[] formatArray27 = extendedMessageFormat24.getFormats();
        java.lang.String str28 = extendedMessageFormat24.toPattern();
        java.util.Locale locale29 = extendedMessageFormat24.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale29);
        java.util.Locale locale33 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale33);
        extendedMessageFormat34.applyPattern("");
        java.text.Format[] formatArray37 = extendedMessageFormat34.getFormats();
        java.lang.String str38 = extendedMessageFormat34.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat41.applyPattern("");
        java.text.Format[] formatArray44 = extendedMessageFormat41.getFormats();
        java.lang.String str45 = extendedMessageFormat41.toPattern();
        java.util.Locale locale46 = extendedMessageFormat41.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale46);
        extendedMessageFormat34.setLocale(locale46);
        extendedMessageFormat31.setLocale(locale46);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat53 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat53.applyPattern("");
        java.text.Format[] formatArray56 = extendedMessageFormat53.getFormats();
        java.lang.String str57 = extendedMessageFormat53.toPattern();
        java.util.Locale locale58 = extendedMessageFormat53.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat59 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale58);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale58);
        extendedMessageFormat31.setLocale(locale58);
        extendedMessageFormat12.setLocale(locale58);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat63 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale58);
        extendedMessageFormat2.setLocale(locale58);
        java.text.Format[] formatArray65 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray67 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(formatArray44);
        org.junit.Assert.assertArrayEquals(formatArray44, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray56);
        org.junit.Assert.assertArrayEquals(formatArray56, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray65);
        org.junit.Assert.assertArrayEquals(formatArray65, new java.text.Format[] {});
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormats();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Locale locale13 = null;
        extendedMessageFormat11.setLocale(locale13);
        java.util.Locale locale15 = extendedMessageFormat11.getLocale();
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale17);
        extendedMessageFormat18.applyPattern("");
        extendedMessageFormat18.applyPattern("");
        extendedMessageFormat18.applyPattern("hi!");
        java.lang.String str25 = extendedMessageFormat18.toPattern();
        java.lang.String str26 = extendedMessageFormat18.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat30.applyPattern("");
        java.text.Format[] formatArray33 = extendedMessageFormat30.getFormats();
        java.lang.String str34 = extendedMessageFormat30.toPattern();
        java.util.Locale locale35 = extendedMessageFormat30.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale35);
        java.util.Locale locale39 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale39);
        extendedMessageFormat40.applyPattern("");
        java.text.Format[] formatArray43 = extendedMessageFormat40.getFormats();
        java.lang.String str44 = extendedMessageFormat40.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat47.applyPattern("");
        java.text.Format[] formatArray50 = extendedMessageFormat47.getFormats();
        java.lang.String str51 = extendedMessageFormat47.toPattern();
        java.util.Locale locale52 = extendedMessageFormat47.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat53 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale52);
        extendedMessageFormat40.setLocale(locale52);
        extendedMessageFormat37.setLocale(locale52);
        extendedMessageFormat18.setLocale(locale52);
        extendedMessageFormat11.setLocale(locale52);
        extendedMessageFormat3.setLocale(locale52);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat59 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale52);
        extendedMessageFormat59.applyPattern("");
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray43);
        org.junit.Assert.assertArrayEquals(formatArray43, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(formatArray50);
        org.junit.Assert.assertArrayEquals(formatArray50, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "th_TH");
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormats();
        java.lang.String str13 = extendedMessageFormat9.toPattern();
        java.util.Locale locale14 = extendedMessageFormat9.getLocale();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        java.lang.String str18 = extendedMessageFormat17.toPattern();
        java.text.Format[] formatArray19 = extendedMessageFormat17.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator20 = extendedMessageFormat9.formatToCharacterIterator((java.lang.Object) formatArray19);
        java.lang.String str21 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray19);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.util.Locale locale12 = null;
        extendedMessageFormat10.setLocale(locale12);
        java.util.Locale locale14 = extendedMessageFormat10.getLocale();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        extendedMessageFormat17.applyPattern("");
        extendedMessageFormat17.applyPattern("");
        extendedMessageFormat17.applyPattern("hi!");
        java.lang.String str24 = extendedMessageFormat17.toPattern();
        java.lang.String str25 = extendedMessageFormat17.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat29.applyPattern("");
        java.text.Format[] formatArray32 = extendedMessageFormat29.getFormats();
        java.lang.String str33 = extendedMessageFormat29.toPattern();
        java.util.Locale locale34 = extendedMessageFormat29.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale34);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale34);
        java.util.Locale locale38 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale38);
        extendedMessageFormat39.applyPattern("");
        java.text.Format[] formatArray42 = extendedMessageFormat39.getFormats();
        java.lang.String str43 = extendedMessageFormat39.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat46.applyPattern("");
        java.text.Format[] formatArray49 = extendedMessageFormat46.getFormats();
        java.lang.String str50 = extendedMessageFormat46.toPattern();
        java.util.Locale locale51 = extendedMessageFormat46.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale51);
        extendedMessageFormat39.setLocale(locale51);
        extendedMessageFormat36.setLocale(locale51);
        extendedMessageFormat17.setLocale(locale51);
        extendedMessageFormat10.setLocale(locale51);
        extendedMessageFormat2.setLocale(locale51);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat59 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str60 = extendedMessageFormat59.toPattern();
        java.util.Locale locale61 = null;
        extendedMessageFormat59.setLocale(locale61);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat66 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat66.applyPattern("");
        java.text.Format[] formatArray69 = extendedMessageFormat66.getFormats();
        java.lang.String str70 = extendedMessageFormat66.toPattern();
        java.util.Locale locale71 = extendedMessageFormat66.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat72 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale71);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat73 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale71);
        extendedMessageFormat59.setLocale(locale71);
        java.text.Format[] formatArray75 = extendedMessageFormat59.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray75);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray42);
        org.junit.Assert.assertArrayEquals(formatArray42, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(formatArray69);
        org.junit.Assert.assertArrayEquals(formatArray69, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray75);
        org.junit.Assert.assertArrayEquals(formatArray75, new java.text.Format[] {});
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        java.lang.String str10 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray12 = extendedMessageFormat3.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        java.lang.String str18 = extendedMessageFormat14.toPattern();
        java.util.Locale locale19 = extendedMessageFormat14.getLocale();
        extendedMessageFormat3.setLocale(locale19);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale19);
        java.lang.String str22 = extendedMessageFormat21.toPattern();
        extendedMessageFormat21.applyPattern("hi!");
        java.lang.String str25 = extendedMessageFormat21.toPattern();
        extendedMessageFormat21.applyPattern("hi!");
        java.lang.String str28 = extendedMessageFormat21.toPattern();
        java.lang.String str29 = extendedMessageFormat21.toPattern();
        java.lang.Object[] objArray31 = extendedMessageFormat21.parse("hi!");
        extendedMessageFormat21.applyPattern("hi!");
        java.lang.Class<?> wildcardClass34 = extendedMessageFormat21.getClass();
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertArrayEquals(objArray31, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = null;
        extendedMessageFormat3.setLocale(locale6);
        java.util.Locale locale8 = null;
        extendedMessageFormat3.setLocale(locale8);
        java.text.Format[] formatArray10 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat3.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat17.applyPattern("");
        java.text.Format[] formatArray20 = extendedMessageFormat17.getFormats();
        java.lang.String str21 = extendedMessageFormat17.toPattern();
        java.util.Locale locale22 = extendedMessageFormat17.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale22);
        extendedMessageFormat14.setLocale(locale22);
        java.util.Locale locale25 = extendedMessageFormat14.getLocale();
        extendedMessageFormat3.setLocale(locale25);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale25);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat29.applyPattern("");
        java.util.Locale locale32 = null;
        extendedMessageFormat29.setLocale(locale32);
        java.util.Locale locale34 = extendedMessageFormat29.getLocale();
        java.util.Locale locale37 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale37);
        extendedMessageFormat38.applyPattern("");
        java.text.Format[] formatArray41 = extendedMessageFormat38.getFormats();
        java.lang.String str42 = extendedMessageFormat38.toPattern();
        extendedMessageFormat38.applyPattern("");
        java.lang.String str45 = extendedMessageFormat38.toPattern();
        java.text.Format[] formatArray46 = extendedMessageFormat38.getFormats();
        java.text.Format[] formatArray47 = extendedMessageFormat38.getFormatsByArgumentIndex();
        java.util.Locale locale49 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale49);
        extendedMessageFormat50.applyPattern("");
        extendedMessageFormat50.applyPattern("");
        extendedMessageFormat50.applyPattern("hi!");
        java.lang.String str57 = extendedMessageFormat50.toPattern();
        java.lang.String str58 = extendedMessageFormat50.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat62 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat62.applyPattern("");
        java.text.Format[] formatArray65 = extendedMessageFormat62.getFormats();
        java.lang.String str66 = extendedMessageFormat62.toPattern();
        java.util.Locale locale67 = extendedMessageFormat62.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat68 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale67);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat69 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale67);
        java.util.Locale locale71 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat72 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale71);
        extendedMessageFormat72.applyPattern("");
        java.text.Format[] formatArray75 = extendedMessageFormat72.getFormats();
        java.lang.String str76 = extendedMessageFormat72.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat79 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat79.applyPattern("");
        java.text.Format[] formatArray82 = extendedMessageFormat79.getFormats();
        java.lang.String str83 = extendedMessageFormat79.toPattern();
        java.util.Locale locale84 = extendedMessageFormat79.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat85 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale84);
        extendedMessageFormat72.setLocale(locale84);
        extendedMessageFormat69.setLocale(locale84);
        extendedMessageFormat50.setLocale(locale84);
        extendedMessageFormat38.setLocale(locale84);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat90 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale84);
        extendedMessageFormat29.setLocale(locale84);
        extendedMessageFormat27.setLocale(locale84);
        java.lang.Class<?> wildcardClass93 = locale84.getClass();
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNull(locale34);
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(formatArray46);
        org.junit.Assert.assertArrayEquals(formatArray46, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(formatArray65);
        org.junit.Assert.assertArrayEquals(formatArray65, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray75);
        org.junit.Assert.assertArrayEquals(formatArray75, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(formatArray82);
        org.junit.Assert.assertArrayEquals(formatArray82, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat11.applyPattern("");
        java.util.Locale locale14 = null;
        extendedMessageFormat11.setLocale(locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat11.getFormats();
        java.lang.String str17 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray18 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale20);
        java.util.Locale locale22 = extendedMessageFormat21.getLocale();
        java.util.Locale locale23 = extendedMessageFormat21.getLocale();
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale25);
        extendedMessageFormat26.applyPattern("");
        java.text.Format[] formatArray29 = extendedMessageFormat26.getFormatsByArgumentIndex();
        extendedMessageFormat26.applyPattern("");
        java.text.Format[] formatArray32 = extendedMessageFormat26.getFormatsByArgumentIndex();
        extendedMessageFormat26.applyPattern("hi!");
        java.lang.Object[] objArray36 = extendedMessageFormat26.parse("hi!");
        java.util.Locale locale38 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale38);
        extendedMessageFormat39.applyPattern("");
        java.text.Format[] formatArray42 = extendedMessageFormat39.getFormats();
        java.lang.String str43 = extendedMessageFormat39.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat46.applyPattern("");
        java.text.Format[] formatArray49 = extendedMessageFormat46.getFormats();
        java.lang.String str50 = extendedMessageFormat46.toPattern();
        java.util.Locale locale51 = extendedMessageFormat46.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale51);
        extendedMessageFormat39.setLocale(locale51);
        extendedMessageFormat26.setLocale(locale51);
        extendedMessageFormat21.setLocale(locale51);
        extendedMessageFormat11.setLocale(locale51);
        extendedMessageFormat2.setLocale(locale51);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertNull(locale23);
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertArrayEquals(objArray36, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray42);
        org.junit.Assert.assertArrayEquals(formatArray42, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        java.text.Format[] formatArray17 = extendedMessageFormat15.getFormatsByArgumentIndex();
        extendedMessageFormat15.applyPattern("");
        extendedMessageFormat15.applyPattern("hi!");
        java.util.Locale locale22 = extendedMessageFormat15.getLocale();
        java.util.Locale locale23 = extendedMessageFormat15.getLocale();
        java.text.Format[] formatArray24 = extendedMessageFormat15.getFormats();
        java.lang.Class<?> wildcardClass25 = extendedMessageFormat15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator26 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) wildcardClass25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class [Ljava.lang.Object; (java.lang.Class and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertNull(locale23);
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat12.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator16 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) formatArray15);
        java.text.ParsePosition parsePosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = extendedMessageFormat1.parseObject("hi!", parsePosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator16);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat4.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormats();
        java.lang.String str8 = extendedMessageFormat4.toPattern();
        java.util.Locale locale9 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat1.setLocale(locale9);
        java.util.Locale locale12 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat16.applyPattern("");
        java.util.Locale locale19 = null;
        extendedMessageFormat16.setLocale(locale19);
        java.text.Format[] formatArray21 = extendedMessageFormat16.getFormats();
        java.text.Format[] formatArray22 = extendedMessageFormat16.getFormatsByArgumentIndex();
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale26);
        extendedMessageFormat27.applyPattern("");
        java.text.Format[] formatArray30 = extendedMessageFormat27.getFormats();
        java.text.Format[] formatArray31 = extendedMessageFormat27.getFormats();
        java.util.Locale locale32 = null;
        extendedMessageFormat27.setLocale(locale32);
        extendedMessageFormat27.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat39.applyPattern("");
        java.text.Format[] formatArray42 = extendedMessageFormat39.getFormats();
        java.lang.String str43 = extendedMessageFormat39.toPattern();
        java.util.Locale locale44 = extendedMessageFormat39.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale44);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale44);
        java.util.Locale locale48 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale48);
        extendedMessageFormat49.applyPattern("");
        java.text.Format[] formatArray52 = extendedMessageFormat49.getFormats();
        java.lang.String str53 = extendedMessageFormat49.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat56 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat56.applyPattern("");
        java.text.Format[] formatArray59 = extendedMessageFormat56.getFormats();
        java.lang.String str60 = extendedMessageFormat56.toPattern();
        java.util.Locale locale61 = extendedMessageFormat56.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat62 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale61);
        extendedMessageFormat49.setLocale(locale61);
        extendedMessageFormat46.setLocale(locale61);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat68 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat68.applyPattern("");
        java.text.Format[] formatArray71 = extendedMessageFormat68.getFormats();
        java.lang.String str72 = extendedMessageFormat68.toPattern();
        java.util.Locale locale73 = extendedMessageFormat68.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat74 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale73);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat75 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale73);
        extendedMessageFormat46.setLocale(locale73);
        extendedMessageFormat27.setLocale(locale73);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat78 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale73);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat79 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale73);
        extendedMessageFormat16.setLocale(locale73);
        java.lang.String str81 = extendedMessageFormat16.toPattern();
        java.util.Locale locale82 = extendedMessageFormat16.getLocale();
        extendedMessageFormat1.setLocale(locale82);
        java.text.ParsePosition parsePosition85 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj86 = extendedMessageFormat1.parseObject("", parsePosition85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray42);
        org.junit.Assert.assertArrayEquals(formatArray42, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray52);
        org.junit.Assert.assertArrayEquals(formatArray52, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(formatArray59);
        org.junit.Assert.assertArrayEquals(formatArray59, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray71);
        org.junit.Assert.assertArrayEquals(formatArray71, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "th_TH");
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.util.Locale locale11 = null;
        extendedMessageFormat10.setLocale(locale11);
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.text.Format[] formatArray14 = extendedMessageFormat10.getFormats();
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray17 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.lang.String str18 = extendedMessageFormat2.format((java.lang.Object) formatArray17);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat21.applyPattern("");
        java.util.Locale locale24 = null;
        extendedMessageFormat21.setLocale(locale24);
        java.text.Format[] formatArray26 = extendedMessageFormat21.getFormats();
        java.lang.String str27 = extendedMessageFormat21.toPattern();
        java.util.Locale locale28 = null;
        extendedMessageFormat21.setLocale(locale28);
        java.text.Format[] formatArray30 = extendedMessageFormat21.getFormats();
        java.lang.String str31 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray30);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.lang.String str8 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale11 = extendedMessageFormat3.getLocale();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        java.lang.String str15 = extendedMessageFormat14.toPattern();
        extendedMessageFormat14.applyPattern("");
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale19);
        extendedMessageFormat20.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray26 = extendedMessageFormat24.parse("hi!");
        java.lang.String str27 = extendedMessageFormat20.format((java.lang.Object) objArray26);
        java.util.Locale locale28 = extendedMessageFormat20.getLocale();
        java.util.Locale locale30 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale30);
        java.util.Locale locale32 = null;
        extendedMessageFormat31.setLocale(locale32);
        java.text.Format[] formatArray34 = extendedMessageFormat31.getFormatsByArgumentIndex();
        extendedMessageFormat31.applyPattern("");
        java.lang.String str37 = extendedMessageFormat31.toPattern();
        java.util.Locale locale39 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale39);
        extendedMessageFormat40.applyPattern("");
        java.text.Format[] formatArray43 = extendedMessageFormat40.getFormats();
        java.lang.String str44 = extendedMessageFormat40.toPattern();
        extendedMessageFormat40.applyPattern("");
        java.lang.String str47 = extendedMessageFormat40.toPattern();
        java.text.Format[] formatArray48 = extendedMessageFormat40.getFormats();
        java.text.Format[] formatArray49 = extendedMessageFormat40.getFormatsByArgumentIndex();
        java.util.Locale locale50 = extendedMessageFormat40.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat53 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat53.applyPattern("");
        java.text.Format[] formatArray56 = extendedMessageFormat53.getFormats();
        java.lang.String str57 = extendedMessageFormat53.toPattern();
        java.util.Locale locale58 = extendedMessageFormat53.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat59 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale58);
        extendedMessageFormat40.setLocale(locale58);
        extendedMessageFormat31.setLocale(locale58);
        extendedMessageFormat20.setLocale(locale58);
        extendedMessageFormat14.setLocale(locale58);
        extendedMessageFormat3.setLocale(locale58);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat65 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale58);
        java.text.Format[] formatArray66 = extendedMessageFormat65.getFormatsByArgumentIndex();
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(formatArray43);
        org.junit.Assert.assertArrayEquals(formatArray43, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(formatArray48);
        org.junit.Assert.assertArrayEquals(formatArray48, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale50);
        org.junit.Assert.assertNotNull(formatArray56);
        org.junit.Assert.assertArrayEquals(formatArray56, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray66);
        org.junit.Assert.assertArrayEquals(formatArray66, new java.text.Format[] {});
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormats();
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        java.lang.String str18 = extendedMessageFormat17.toPattern();
        extendedMessageFormat17.applyPattern("hi!");
        java.lang.Object[] objArray22 = extendedMessageFormat17.parse("hi!");
        java.text.Format[] formatArray23 = extendedMessageFormat17.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) '4', (java.text.Format) extendedMessageFormat17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str7 = extendedMessageFormat6.toPattern();
        java.util.Locale locale8 = null;
        extendedMessageFormat6.setLocale(locale8);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat13.applyPattern("");
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormats();
        java.lang.String str17 = extendedMessageFormat13.toPattern();
        java.util.Locale locale18 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale18);
        extendedMessageFormat6.setLocale(locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        extendedMessageFormat30.applyPattern("");
        java.util.Locale locale33 = null;
        extendedMessageFormat30.setLocale(locale33);
        java.text.Format[] formatArray35 = extendedMessageFormat30.getFormatsByArgumentIndex();
        java.text.Format[] formatArray36 = extendedMessageFormat30.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat26.setFormatByArgumentIndex((int) '4', (java.text.Format) extendedMessageFormat30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = null;
        extendedMessageFormat2.setLocale(locale4);
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        extendedMessageFormat9.applyPattern("");
        extendedMessageFormat9.applyPattern("hi!");
        java.lang.String str16 = extendedMessageFormat9.toPattern();
        java.lang.String str17 = extendedMessageFormat9.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat21.applyPattern("");
        java.text.Format[] formatArray24 = extendedMessageFormat21.getFormats();
        java.lang.String str25 = extendedMessageFormat21.toPattern();
        java.util.Locale locale26 = extendedMessageFormat21.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale26);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale26);
        java.util.Locale locale30 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale30);
        extendedMessageFormat31.applyPattern("");
        java.text.Format[] formatArray34 = extendedMessageFormat31.getFormats();
        java.lang.String str35 = extendedMessageFormat31.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat38.applyPattern("");
        java.text.Format[] formatArray41 = extendedMessageFormat38.getFormats();
        java.lang.String str42 = extendedMessageFormat38.toPattern();
        java.util.Locale locale43 = extendedMessageFormat38.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale43);
        extendedMessageFormat31.setLocale(locale43);
        extendedMessageFormat28.setLocale(locale43);
        extendedMessageFormat9.setLocale(locale43);
        extendedMessageFormat2.setLocale(locale43);
        java.util.Locale locale50 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat51 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale50);
        java.util.Locale locale52 = null;
        extendedMessageFormat51.setLocale(locale52);
        java.text.Format[] formatArray54 = extendedMessageFormat51.getFormatsByArgumentIndex();
        extendedMessageFormat51.applyPattern("");
        java.lang.String str57 = extendedMessageFormat51.toPattern();
        java.text.Format[] formatArray58 = extendedMessageFormat51.getFormatsByArgumentIndex();
        java.lang.String str59 = extendedMessageFormat2.format((java.lang.Object) formatArray58);
        extendedMessageFormat2.applyPattern("hi!");
        java.text.ParsePosition parsePosition63 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj64 = extendedMessageFormat2.parseObject("", parsePosition63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray54);
        org.junit.Assert.assertArrayEquals(formatArray54, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(formatArray58);
        org.junit.Assert.assertArrayEquals(formatArray58, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        extendedMessageFormat4.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormats();
        java.lang.String str8 = extendedMessageFormat4.toPattern();
        extendedMessageFormat4.applyPattern("");
        java.lang.String str11 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat4.getFormats();
        java.text.Format[] formatArray13 = extendedMessageFormat4.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat15.applyPattern("");
        java.text.Format[] formatArray18 = extendedMessageFormat15.getFormats();
        java.lang.String str19 = extendedMessageFormat15.toPattern();
        java.util.Locale locale20 = extendedMessageFormat15.getLocale();
        extendedMessageFormat4.setLocale(locale20);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale20);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale20);
        java.util.Locale locale24 = extendedMessageFormat23.getLocale();
        java.lang.String str25 = extendedMessageFormat23.toPattern();
        java.util.Locale locale26 = null;
        extendedMessageFormat23.setLocale(locale26);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str30 = extendedMessageFormat29.toPattern();
        java.text.Format[] formatArray31 = extendedMessageFormat29.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator32 = extendedMessageFormat23.formatToCharacterIterator((java.lang.Object) formatArray31);
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator32);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat6.applyPattern("");
        java.text.Format[] formatArray9 = extendedMessageFormat6.getFormats();
        java.lang.String str10 = extendedMessageFormat6.toPattern();
        java.util.Locale locale11 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat3.setLocale(locale11);
        java.text.Format[] formatArray14 = extendedMessageFormat3.getFormatsByArgumentIndex();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        java.util.Locale locale23 = null;
        extendedMessageFormat22.setLocale(locale23);
        java.text.Format[] formatArray25 = extendedMessageFormat22.getFormatsByArgumentIndex();
        extendedMessageFormat22.applyPattern("");
        java.lang.String str28 = extendedMessageFormat22.toPattern();
        java.util.Locale locale30 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale30);
        extendedMessageFormat31.applyPattern("");
        java.text.Format[] formatArray34 = extendedMessageFormat31.getFormats();
        java.lang.String str35 = extendedMessageFormat31.toPattern();
        extendedMessageFormat31.applyPattern("");
        java.lang.String str38 = extendedMessageFormat31.toPattern();
        java.text.Format[] formatArray39 = extendedMessageFormat31.getFormats();
        java.text.Format[] formatArray40 = extendedMessageFormat31.getFormatsByArgumentIndex();
        java.util.Locale locale41 = extendedMessageFormat31.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat44.applyPattern("");
        java.text.Format[] formatArray47 = extendedMessageFormat44.getFormats();
        java.lang.String str48 = extendedMessageFormat44.toPattern();
        java.util.Locale locale49 = extendedMessageFormat44.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale49);
        extendedMessageFormat31.setLocale(locale49);
        extendedMessageFormat22.setLocale(locale49);
        java.util.Locale locale53 = extendedMessageFormat22.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat54 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale53);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale53);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat56 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale53);
        extendedMessageFormat3.setLocale(locale53);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat58 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale53);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat59 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale53);
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray40);
        org.junit.Assert.assertArrayEquals(formatArray40, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale41);
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "th_TH");
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat13.applyPattern("");
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormats();
        java.util.Locale locale17 = null;
        extendedMessageFormat13.setLocale(locale17);
        java.text.Format[] formatArray19 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.text.Format[] formatArray20 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.lang.String str21 = extendedMessageFormat13.toPattern();
        java.text.Format[] formatArray22 = extendedMessageFormat13.getFormats();
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale25);
        extendedMessageFormat26.applyPattern("");
        java.text.Format[] formatArray29 = extendedMessageFormat26.getFormats();
        java.lang.String str30 = extendedMessageFormat26.toPattern();
        extendedMessageFormat26.applyPattern("");
        java.lang.String str33 = extendedMessageFormat26.toPattern();
        java.text.Format[] formatArray34 = extendedMessageFormat26.getFormats();
        java.text.Format[] formatArray35 = extendedMessageFormat26.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat37.applyPattern("");
        java.text.Format[] formatArray40 = extendedMessageFormat37.getFormats();
        java.lang.String str41 = extendedMessageFormat37.toPattern();
        java.util.Locale locale42 = extendedMessageFormat37.getLocale();
        extendedMessageFormat26.setLocale(locale42);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        extendedMessageFormat13.setLocale(locale42);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale42);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) '4', (java.text.Format) extendedMessageFormat46);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray40);
        org.junit.Assert.assertArrayEquals(formatArray40, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.util.Locale locale14 = extendedMessageFormat12.getLocale();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        extendedMessageFormat17.applyPattern("");
        java.text.Format[] formatArray20 = extendedMessageFormat17.getFormatsByArgumentIndex();
        extendedMessageFormat17.applyPattern("");
        java.text.Format[] formatArray23 = extendedMessageFormat17.getFormatsByArgumentIndex();
        extendedMessageFormat17.applyPattern("hi!");
        java.lang.Object[] objArray27 = extendedMessageFormat17.parse("hi!");
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        extendedMessageFormat30.applyPattern("");
        java.text.Format[] formatArray33 = extendedMessageFormat30.getFormats();
        java.lang.String str34 = extendedMessageFormat30.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat37.applyPattern("");
        java.text.Format[] formatArray40 = extendedMessageFormat37.getFormats();
        java.lang.String str41 = extendedMessageFormat37.toPattern();
        java.util.Locale locale42 = extendedMessageFormat37.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        extendedMessageFormat30.setLocale(locale42);
        extendedMessageFormat17.setLocale(locale42);
        extendedMessageFormat12.setLocale(locale42);
        extendedMessageFormat2.setLocale(locale42);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        java.text.Format[] formatArray49 = extendedMessageFormat48.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray51 = extendedMessageFormat48.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(formatArray40);
        org.junit.Assert.assertArrayEquals(formatArray40, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.util.Locale locale12 = null;
        extendedMessageFormat10.setLocale(locale12);
        java.util.Locale locale14 = extendedMessageFormat10.getLocale();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        extendedMessageFormat17.applyPattern("");
        extendedMessageFormat17.applyPattern("");
        extendedMessageFormat17.applyPattern("hi!");
        java.lang.String str24 = extendedMessageFormat17.toPattern();
        java.lang.String str25 = extendedMessageFormat17.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat29.applyPattern("");
        java.text.Format[] formatArray32 = extendedMessageFormat29.getFormats();
        java.lang.String str33 = extendedMessageFormat29.toPattern();
        java.util.Locale locale34 = extendedMessageFormat29.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale34);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale34);
        java.util.Locale locale38 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale38);
        extendedMessageFormat39.applyPattern("");
        java.text.Format[] formatArray42 = extendedMessageFormat39.getFormats();
        java.lang.String str43 = extendedMessageFormat39.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat46.applyPattern("");
        java.text.Format[] formatArray49 = extendedMessageFormat46.getFormats();
        java.lang.String str50 = extendedMessageFormat46.toPattern();
        java.util.Locale locale51 = extendedMessageFormat46.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale51);
        extendedMessageFormat39.setLocale(locale51);
        extendedMessageFormat36.setLocale(locale51);
        extendedMessageFormat17.setLocale(locale51);
        extendedMessageFormat10.setLocale(locale51);
        extendedMessageFormat2.setLocale(locale51);
        java.util.Locale locale58 = extendedMessageFormat2.getLocale();
        java.util.Locale locale60 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale60);
        extendedMessageFormat61.applyPattern("");
        java.text.Format[] formatArray64 = extendedMessageFormat61.getFormats();
        java.text.Format[] formatArray65 = extendedMessageFormat61.getFormats();
        extendedMessageFormat61.applyPattern("");
        extendedMessageFormat61.applyPattern("");
        java.lang.String str70 = extendedMessageFormat61.toPattern();
        java.text.Format[] formatArray71 = extendedMessageFormat61.getFormats();
        java.util.Locale locale73 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat74 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale73);
        java.util.Locale locale75 = extendedMessageFormat74.getLocale();
        java.text.Format[] formatArray76 = extendedMessageFormat74.getFormatsByArgumentIndex();
        java.text.Format[] formatArray77 = extendedMessageFormat74.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat82 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat82.applyPattern("");
        java.text.Format[] formatArray85 = extendedMessageFormat82.getFormats();
        java.lang.String str86 = extendedMessageFormat82.toPattern();
        java.util.Locale locale87 = extendedMessageFormat82.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat88 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale87);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat89 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale87);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat90 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale87);
        extendedMessageFormat74.setLocale(locale87);
        extendedMessageFormat61.setLocale(locale87);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator93 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) locale87);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray42);
        org.junit.Assert.assertArrayEquals(formatArray42, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray64);
        org.junit.Assert.assertArrayEquals(formatArray64, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray65);
        org.junit.Assert.assertArrayEquals(formatArray65, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(formatArray71);
        org.junit.Assert.assertArrayEquals(formatArray71, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale75);
        org.junit.Assert.assertNotNull(formatArray76);
        org.junit.Assert.assertArrayEquals(formatArray76, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray77);
        org.junit.Assert.assertArrayEquals(formatArray77, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray85);
        org.junit.Assert.assertArrayEquals(formatArray85, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "th_TH");
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormatsByArgumentIndex();
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray9 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray10 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        java.util.Locale locale15 = null;
        extendedMessageFormat14.setLocale(locale15);
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormatsByArgumentIndex();
        extendedMessageFormat14.applyPattern("");
        java.lang.String str20 = extendedMessageFormat14.toPattern();
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale22);
        extendedMessageFormat23.applyPattern("");
        java.text.Format[] formatArray26 = extendedMessageFormat23.getFormats();
        java.lang.String str27 = extendedMessageFormat23.toPattern();
        extendedMessageFormat23.applyPattern("");
        java.lang.String str30 = extendedMessageFormat23.toPattern();
        java.text.Format[] formatArray31 = extendedMessageFormat23.getFormats();
        java.text.Format[] formatArray32 = extendedMessageFormat23.getFormatsByArgumentIndex();
        java.util.Locale locale33 = extendedMessageFormat23.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat36.applyPattern("");
        java.text.Format[] formatArray39 = extendedMessageFormat36.getFormats();
        java.lang.String str40 = extendedMessageFormat36.toPattern();
        java.util.Locale locale41 = extendedMessageFormat36.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale41);
        extendedMessageFormat23.setLocale(locale41);
        extendedMessageFormat14.setLocale(locale41);
        java.util.Locale locale45 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale45);
        extendedMessageFormat3.setLocale(locale45);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray50 = extendedMessageFormat48.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale33);
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str17 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray20 = extendedMessageFormat2.parse("", parsePosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        extendedMessageFormat13.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        java.text.Format[] formatArray17 = extendedMessageFormat13.getFormats();
        java.lang.String str18 = extendedMessageFormat10.format((java.lang.Object) formatArray17);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale25);
        extendedMessageFormat26.applyPattern("");
        java.text.Format[] formatArray29 = extendedMessageFormat26.getFormats();
        java.text.Format[] formatArray30 = extendedMessageFormat26.getFormats();
        java.util.Locale locale31 = null;
        extendedMessageFormat26.setLocale(locale31);
        extendedMessageFormat26.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat38.applyPattern("");
        java.text.Format[] formatArray41 = extendedMessageFormat38.getFormats();
        java.lang.String str42 = extendedMessageFormat38.toPattern();
        java.util.Locale locale43 = extendedMessageFormat38.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale43);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale43);
        java.util.Locale locale47 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale47);
        extendedMessageFormat48.applyPattern("");
        java.text.Format[] formatArray51 = extendedMessageFormat48.getFormats();
        java.lang.String str52 = extendedMessageFormat48.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat55.applyPattern("");
        java.text.Format[] formatArray58 = extendedMessageFormat55.getFormats();
        java.lang.String str59 = extendedMessageFormat55.toPattern();
        java.util.Locale locale60 = extendedMessageFormat55.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale60);
        extendedMessageFormat48.setLocale(locale60);
        extendedMessageFormat45.setLocale(locale60);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat67 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat67.applyPattern("");
        java.text.Format[] formatArray70 = extendedMessageFormat67.getFormats();
        java.lang.String str71 = extendedMessageFormat67.toPattern();
        java.util.Locale locale72 = extendedMessageFormat67.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat73 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale72);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat74 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale72);
        extendedMessageFormat45.setLocale(locale72);
        extendedMessageFormat26.setLocale(locale72);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat77 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale72);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat78 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale72);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat79 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale72);
        extendedMessageFormat10.setLocale(locale72);
        java.text.Format[] formatArray81 = extendedMessageFormat10.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray81);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray51);
        org.junit.Assert.assertArrayEquals(formatArray51, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(formatArray58);
        org.junit.Assert.assertArrayEquals(formatArray58, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray70);
        org.junit.Assert.assertArrayEquals(formatArray70, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray81);
        org.junit.Assert.assertArrayEquals(formatArray81, new java.text.Format[] {});
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat6.applyPattern("");
        java.text.Format[] formatArray9 = extendedMessageFormat6.getFormats();
        java.lang.String str10 = extendedMessageFormat6.toPattern();
        java.util.Locale locale11 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale11);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        java.text.Format[] formatArray15 = extendedMessageFormat14.getFormats();
        extendedMessageFormat14.applyPattern("hi!");
        java.util.Locale locale18 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale22);
        java.util.Locale locale24 = extendedMessageFormat23.getLocale();
        java.text.Format[] formatArray25 = extendedMessageFormat23.getFormatsByArgumentIndex();
        java.lang.String str26 = extendedMessageFormat23.toPattern();
        java.text.Format[] formatArray27 = extendedMessageFormat23.getFormats();
        java.lang.String str28 = extendedMessageFormat23.toPattern();
        extendedMessageFormat23.applyPattern("");
        java.lang.String str31 = extendedMessageFormat23.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat33.applyPattern("");
        java.text.Format[] formatArray36 = extendedMessageFormat33.getFormats();
        java.util.Locale locale37 = null;
        extendedMessageFormat33.setLocale(locale37);
        java.text.Format[] formatArray39 = extendedMessageFormat33.getFormats();
        java.lang.String str40 = extendedMessageFormat23.format((java.lang.Object) formatArray39);
        java.lang.Object obj41 = extendedMessageFormat23.clone();
        boolean boolean42 = extendedMessageFormat20.equals(obj41);
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNull(locale24);
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = null;
        extendedMessageFormat3.setLocale(locale6);
        java.util.Locale locale8 = null;
        extendedMessageFormat3.setLocale(locale8);
        java.text.Format[] formatArray10 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat3.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat17.applyPattern("");
        java.text.Format[] formatArray20 = extendedMessageFormat17.getFormats();
        java.lang.String str21 = extendedMessageFormat17.toPattern();
        java.util.Locale locale22 = extendedMessageFormat17.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale22);
        extendedMessageFormat14.setLocale(locale22);
        java.util.Locale locale25 = extendedMessageFormat14.getLocale();
        extendedMessageFormat3.setLocale(locale25);
        java.util.Locale locale27 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale27);
        java.text.Format[] formatArray29 = extendedMessageFormat28.getFormatsByArgumentIndex();
        java.util.Locale locale31 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale31);
        java.util.Locale locale33 = null;
        extendedMessageFormat32.setLocale(locale33);
        java.text.Format[] formatArray35 = extendedMessageFormat32.getFormatsByArgumentIndex();
        java.util.Locale locale37 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale37);
        extendedMessageFormat38.applyPattern("");
        java.text.Format[] formatArray41 = extendedMessageFormat38.getFormatsByArgumentIndex();
        java.lang.String str42 = extendedMessageFormat38.toPattern();
        java.text.Format[] formatArray43 = extendedMessageFormat38.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator44 = extendedMessageFormat32.formatToCharacterIterator((java.lang.Object) formatArray43);
        extendedMessageFormat32.applyPattern("hi!");
        java.util.Locale locale49 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale49);
        extendedMessageFormat50.applyPattern("");
        java.text.Format[] formatArray53 = extendedMessageFormat50.getFormatsByArgumentIndex();
        extendedMessageFormat50.applyPattern("");
        java.text.Format[] formatArray56 = extendedMessageFormat50.getFormatsByArgumentIndex();
        java.text.Format[] formatArray57 = extendedMessageFormat50.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat61.applyPattern("");
        java.text.Format[] formatArray64 = extendedMessageFormat61.getFormats();
        java.lang.String str65 = extendedMessageFormat61.toPattern();
        java.util.Locale locale66 = extendedMessageFormat61.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat67 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale66);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat68 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale66);
        java.util.Locale locale70 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat71 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale70);
        extendedMessageFormat71.applyPattern("");
        java.text.Format[] formatArray74 = extendedMessageFormat71.getFormats();
        java.lang.String str75 = extendedMessageFormat71.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat78 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat78.applyPattern("");
        java.text.Format[] formatArray81 = extendedMessageFormat78.getFormats();
        java.lang.String str82 = extendedMessageFormat78.toPattern();
        java.util.Locale locale83 = extendedMessageFormat78.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat84 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale83);
        extendedMessageFormat71.setLocale(locale83);
        extendedMessageFormat68.setLocale(locale83);
        extendedMessageFormat50.setLocale(locale83);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat88 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale83);
        extendedMessageFormat32.setLocale(locale83);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str90 = extendedMessageFormat28.format((java.lang.Object) locale83);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(formatArray43);
        org.junit.Assert.assertArrayEquals(formatArray43, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator44);
        org.junit.Assert.assertNotNull(formatArray53);
        org.junit.Assert.assertArrayEquals(formatArray53, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray56);
        org.junit.Assert.assertArrayEquals(formatArray56, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray57);
        org.junit.Assert.assertArrayEquals(formatArray57, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray64);
        org.junit.Assert.assertArrayEquals(formatArray64, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray74);
        org.junit.Assert.assertArrayEquals(formatArray74, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(formatArray81);
        org.junit.Assert.assertArrayEquals(formatArray81, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "th_TH");
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormatsByArgumentIndex();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormats();
        java.util.Locale locale12 = extendedMessageFormat3.getLocale();
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        extendedMessageFormat15.applyPattern("");
        java.text.Format[] formatArray18 = extendedMessageFormat15.getFormats();
        java.lang.String str19 = extendedMessageFormat15.toPattern();
        extendedMessageFormat15.applyPattern("");
        java.lang.String str22 = extendedMessageFormat15.toPattern();
        java.text.Format[] formatArray23 = extendedMessageFormat15.getFormats();
        java.text.Format[] formatArray24 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.util.Locale locale25 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat30.applyPattern("");
        java.text.Format[] formatArray33 = extendedMessageFormat30.getFormats();
        java.lang.String str34 = extendedMessageFormat30.toPattern();
        java.util.Locale locale35 = extendedMessageFormat30.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        extendedMessageFormat15.setLocale(locale35);
        java.util.Locale locale42 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        extendedMessageFormat43.applyPattern("");
        java.text.Format[] formatArray46 = extendedMessageFormat43.getFormats();
        java.lang.String str47 = extendedMessageFormat43.toPattern();
        extendedMessageFormat43.applyPattern("");
        java.lang.String str50 = extendedMessageFormat43.toPattern();
        java.text.Format[] formatArray51 = extendedMessageFormat43.getFormats();
        java.text.Format[] formatArray52 = extendedMessageFormat43.getFormatsByArgumentIndex();
        java.util.Locale locale54 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale54);
        extendedMessageFormat55.applyPattern("");
        extendedMessageFormat55.applyPattern("");
        extendedMessageFormat55.applyPattern("hi!");
        java.lang.String str62 = extendedMessageFormat55.toPattern();
        java.lang.String str63 = extendedMessageFormat55.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat67 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat67.applyPattern("");
        java.text.Format[] formatArray70 = extendedMessageFormat67.getFormats();
        java.lang.String str71 = extendedMessageFormat67.toPattern();
        java.util.Locale locale72 = extendedMessageFormat67.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat73 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale72);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat74 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale72);
        java.util.Locale locale76 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat77 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale76);
        extendedMessageFormat77.applyPattern("");
        java.text.Format[] formatArray80 = extendedMessageFormat77.getFormats();
        java.lang.String str81 = extendedMessageFormat77.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat84 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat84.applyPattern("");
        java.text.Format[] formatArray87 = extendedMessageFormat84.getFormats();
        java.lang.String str88 = extendedMessageFormat84.toPattern();
        java.util.Locale locale89 = extendedMessageFormat84.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat90 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale89);
        extendedMessageFormat77.setLocale(locale89);
        extendedMessageFormat74.setLocale(locale89);
        extendedMessageFormat55.setLocale(locale89);
        extendedMessageFormat43.setLocale(locale89);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat95 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale89);
        extendedMessageFormat15.setLocale(locale89);
        extendedMessageFormat3.setLocale(locale89);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat98 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale89);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale25);
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray46);
        org.junit.Assert.assertArrayEquals(formatArray46, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(formatArray51);
        org.junit.Assert.assertArrayEquals(formatArray51, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray52);
        org.junit.Assert.assertArrayEquals(formatArray52, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(formatArray70);
        org.junit.Assert.assertArrayEquals(formatArray70, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray80);
        org.junit.Assert.assertArrayEquals(formatArray80, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(formatArray87);
        org.junit.Assert.assertArrayEquals(formatArray87, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "th_TH");
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormats();
        java.lang.String str14 = extendedMessageFormat10.toPattern();
        java.util.Locale locale15 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat7.setLocale(locale15);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat2.setLocale(locale15);
        java.text.Format[] formatArray20 = extendedMessageFormat2.getFormats();
        java.lang.String str21 = extendedMessageFormat2.toPattern();
        java.util.Locale locale22 = extendedMessageFormat2.getLocale();
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale26);
        extendedMessageFormat27.applyPattern("");
        java.text.Format[] formatArray30 = extendedMessageFormat27.getFormatsByArgumentIndex();
        extendedMessageFormat27.applyPattern("");
        java.lang.String str33 = extendedMessageFormat27.toPattern();
        java.text.Format[] formatArray34 = extendedMessageFormat27.getFormats();
        java.text.Format[] formatArray35 = extendedMessageFormat27.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat40.applyPattern("");
        java.text.Format[] formatArray43 = extendedMessageFormat40.getFormats();
        java.lang.String str44 = extendedMessageFormat40.toPattern();
        java.util.Locale locale45 = extendedMessageFormat40.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale45);
        extendedMessageFormat37.setLocale(locale45);
        extendedMessageFormat27.setLocale(locale45);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale45);
        java.text.Format[] formatArray50 = extendedMessageFormat49.getFormatsByArgumentIndex();
        java.util.Locale locale51 = extendedMessageFormat49.getLocale();
        java.util.Locale locale53 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat54 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale53);
        extendedMessageFormat54.applyPattern("");
        extendedMessageFormat54.applyPattern("");
        extendedMessageFormat54.applyPattern("hi!");
        java.lang.String str61 = extendedMessageFormat54.toPattern();
        java.lang.String str62 = extendedMessageFormat54.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat66 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat66.applyPattern("");
        java.text.Format[] formatArray69 = extendedMessageFormat66.getFormats();
        java.lang.String str70 = extendedMessageFormat66.toPattern();
        java.util.Locale locale71 = extendedMessageFormat66.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat72 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale71);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat73 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale71);
        java.util.Locale locale75 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat76 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale75);
        extendedMessageFormat76.applyPattern("");
        java.text.Format[] formatArray79 = extendedMessageFormat76.getFormats();
        java.lang.String str80 = extendedMessageFormat76.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat83 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat83.applyPattern("");
        java.text.Format[] formatArray86 = extendedMessageFormat83.getFormats();
        java.lang.String str87 = extendedMessageFormat83.toPattern();
        java.util.Locale locale88 = extendedMessageFormat83.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat89 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale88);
        extendedMessageFormat76.setLocale(locale88);
        extendedMessageFormat73.setLocale(locale88);
        extendedMessageFormat54.setLocale(locale88);
        java.lang.String str93 = extendedMessageFormat54.toPattern();
        java.util.Locale locale94 = extendedMessageFormat54.getLocale();
        extendedMessageFormat49.setLocale(locale94);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat96 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale94);
        extendedMessageFormat2.setLocale(locale94);
        java.lang.String str98 = extendedMessageFormat2.toPattern();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray43);
        org.junit.Assert.assertArrayEquals(formatArray43, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray50);
        org.junit.Assert.assertArrayEquals(formatArray50, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(formatArray69);
        org.junit.Assert.assertArrayEquals(formatArray69, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray79);
        org.junit.Assert.assertArrayEquals(formatArray79, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(formatArray86);
        org.junit.Assert.assertArrayEquals(formatArray86, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
        org.junit.Assert.assertNotNull(locale94);
        org.junit.Assert.assertEquals(locale94.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        extendedMessageFormat1.applyPattern("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.String str11 = extendedMessageFormat1.toPattern();
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.util.Locale locale8 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormatsByArgumentIndex();
        extendedMessageFormat10.applyPattern("hi!");
        java.text.Format[] formatArray14 = extendedMessageFormat10.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat16.applyPattern("");
        java.util.Locale locale19 = null;
        extendedMessageFormat16.setLocale(locale19);
        java.util.Locale locale21 = extendedMessageFormat16.getLocale();
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale24);
        extendedMessageFormat25.applyPattern("");
        java.text.Format[] formatArray28 = extendedMessageFormat25.getFormatsByArgumentIndex();
        extendedMessageFormat25.applyPattern("");
        java.lang.String str31 = extendedMessageFormat25.toPattern();
        java.text.Format[] formatArray32 = extendedMessageFormat25.getFormats();
        java.text.Format[] formatArray33 = extendedMessageFormat25.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat38.applyPattern("");
        java.text.Format[] formatArray41 = extendedMessageFormat38.getFormats();
        java.lang.String str42 = extendedMessageFormat38.toPattern();
        java.util.Locale locale43 = extendedMessageFormat38.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale43);
        extendedMessageFormat35.setLocale(locale43);
        extendedMessageFormat25.setLocale(locale43);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale43);
        java.text.Format[] formatArray48 = extendedMessageFormat47.getFormatsByArgumentIndex();
        java.lang.String str49 = extendedMessageFormat16.format((java.lang.Object) formatArray48);
        java.text.AttributedCharacterIterator attributedCharacterIterator50 = extendedMessageFormat10.formatToCharacterIterator((java.lang.Object) formatArray48);
        java.text.ParsePosition parsePosition52 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray53 = extendedMessageFormat10.parse("hi!", parsePosition52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale21);
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray48);
        org.junit.Assert.assertArrayEquals(formatArray48, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(attributedCharacterIterator50);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str11 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat2.getFormats();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        extendedMessageFormat17.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray23 = extendedMessageFormat21.parse("hi!");
        java.lang.String str24 = extendedMessageFormat17.format((java.lang.Object) objArray23);
        java.lang.String str25 = extendedMessageFormat17.toPattern();
        java.util.Locale locale26 = null;
        extendedMessageFormat17.setLocale(locale26);
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        extendedMessageFormat30.applyPattern("");
        java.text.Format[] formatArray33 = extendedMessageFormat30.getFormats();
        java.lang.String str34 = extendedMessageFormat30.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat37.applyPattern("");
        java.text.Format[] formatArray40 = extendedMessageFormat37.getFormats();
        java.lang.String str41 = extendedMessageFormat37.toPattern();
        java.util.Locale locale42 = extendedMessageFormat37.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        extendedMessageFormat30.setLocale(locale42);
        extendedMessageFormat17.setLocale(locale42);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        java.lang.String str48 = extendedMessageFormat47.toPattern();
        boolean boolean49 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat47);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(formatArray40);
        org.junit.Assert.assertArrayEquals(formatArray40, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray16 = extendedMessageFormat14.parse("hi!");
        java.lang.String str17 = extendedMessageFormat10.format((java.lang.Object) objArray16);
        java.util.Locale locale18 = extendedMessageFormat10.getLocale();
        java.lang.String str19 = extendedMessageFormat10.toPattern();
        java.util.Locale locale20 = extendedMessageFormat10.getLocale();
        java.text.Format[] formatArray21 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.text.Format[] formatArray22 = extendedMessageFormat10.getFormats();
        java.lang.String str23 = extendedMessageFormat2.format((java.lang.Object) formatArray22);
        java.lang.String str24 = extendedMessageFormat2.toPattern();
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(locale20);
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.lang.String str11 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray15 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray16 = extendedMessageFormat2.getFormats();
        java.lang.String str17 = extendedMessageFormat2.toPattern();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object[] objArray13 = extendedMessageFormat2.parse("hi!");
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        extendedMessageFormat19.applyPattern("");
        java.util.Locale locale22 = extendedMessageFormat19.getLocale();
        java.text.Format[] formatArray23 = extendedMessageFormat19.getFormats();
        java.lang.String str24 = extendedMessageFormat16.format((java.lang.Object) formatArray23);
        extendedMessageFormat16.applyPattern("");
        java.lang.String str27 = extendedMessageFormat16.toPattern();
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        extendedMessageFormat30.applyPattern("");
        java.util.Locale locale33 = extendedMessageFormat30.getLocale();
        java.lang.String str34 = extendedMessageFormat30.toPattern();
        java.lang.String str35 = extendedMessageFormat30.toPattern();
        java.text.Format[] formatArray36 = extendedMessageFormat30.getFormats();
        java.lang.String str37 = extendedMessageFormat16.format((java.lang.Object) formatArray36);
        java.text.Format[] formatArray38 = extendedMessageFormat16.getFormatsByArgumentIndex();
        java.text.Format[] formatArray39 = extendedMessageFormat16.getFormats();
        java.lang.String str40 = extendedMessageFormat16.toPattern();
        java.lang.String str41 = extendedMessageFormat16.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] {});
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(locale33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray10 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat1.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat18.applyPattern("");
        java.text.Format[] formatArray21 = extendedMessageFormat18.getFormats();
        java.lang.String str22 = extendedMessageFormat18.toPattern();
        java.util.Locale locale23 = extendedMessageFormat18.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale23);
        extendedMessageFormat15.setLocale(locale23);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale23);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale23);
        extendedMessageFormat1.setLocale(locale23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray30 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        extendedMessageFormat6.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        java.text.Format[] formatArray10 = extendedMessageFormat6.getFormats();
        java.lang.String str11 = extendedMessageFormat3.format((java.lang.Object) formatArray10);
        java.lang.String str12 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray10);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = null;
        extendedMessageFormat2.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormats();
        java.lang.String str14 = extendedMessageFormat10.toPattern();
        extendedMessageFormat10.applyPattern("");
        java.lang.String str17 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray18 = extendedMessageFormat10.getFormats();
        java.text.Format[] formatArray19 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.util.Locale locale20 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat25.applyPattern("");
        java.text.Format[] formatArray28 = extendedMessageFormat25.getFormats();
        java.lang.String str29 = extendedMessageFormat25.toPattern();
        java.util.Locale locale30 = extendedMessageFormat25.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale30);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale30);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale30);
        extendedMessageFormat10.setLocale(locale30);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale30);
        java.text.Format[] formatArray36 = extendedMessageFormat35.getFormats();
        java.lang.StringBuffer stringBuffer37 = null;
        java.text.FieldPosition fieldPosition38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer39 = extendedMessageFormat2.format((java.lang.Object) formatArray36, stringBuffer37, fieldPosition38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale20);
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = extendedMessageFormat2.parse("", parsePosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = null;
        extendedMessageFormat10.setLocale(locale13);
        java.util.Locale locale15 = null;
        extendedMessageFormat10.setLocale(locale15);
        java.util.Locale locale17 = null;
        extendedMessageFormat10.setLocale(locale17);
        java.lang.String str19 = extendedMessageFormat10.toPattern();
        extendedMessageFormat10.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat((int) (short) 1, (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        java.lang.String str10 = extendedMessageFormat2.format((java.lang.Object) formatArray9);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str13 = extendedMessageFormat2.toPattern();
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat16.applyPattern("");
        java.util.Locale locale19 = extendedMessageFormat16.getLocale();
        java.lang.String str20 = extendedMessageFormat16.toPattern();
        java.lang.String str21 = extendedMessageFormat16.toPattern();
        java.text.Format[] formatArray22 = extendedMessageFormat16.getFormats();
        java.lang.String str23 = extendedMessageFormat2.format((java.lang.Object) formatArray22);
        java.text.Format[] formatArray24 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray25 = extendedMessageFormat2.getFormats();
        java.lang.String str26 = extendedMessageFormat2.toPattern();
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        extendedMessageFormat30.applyPattern("");
        java.util.Locale locale33 = null;
        extendedMessageFormat30.setLocale(locale33);
        java.util.Locale locale35 = null;
        extendedMessageFormat30.setLocale(locale35);
        java.lang.String str37 = extendedMessageFormat30.toPattern();
        extendedMessageFormat30.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (short) 0, (java.text.Format) extendedMessageFormat30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray14 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray16 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        extendedMessageFormat2.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat18.applyPattern("");
        java.text.Format[] formatArray21 = extendedMessageFormat18.getFormats();
        java.lang.String str22 = extendedMessageFormat18.toPattern();
        java.util.Locale locale23 = extendedMessageFormat18.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale23);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale23);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale23);
        extendedMessageFormat26.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat(0, (java.text.Format) extendedMessageFormat26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str9 = extendedMessageFormat1.toPattern();
        java.lang.String str10 = extendedMessageFormat1.toPattern();
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat1.parse("hi!", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat16.applyPattern("");
        java.text.Format[] formatArray19 = extendedMessageFormat16.getFormats();
        java.lang.String str20 = extendedMessageFormat16.toPattern();
        java.util.Locale locale21 = extendedMessageFormat16.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale21);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        java.text.Format[] formatArray25 = extendedMessageFormat24.getFormats();
        java.lang.String str26 = extendedMessageFormat2.format((java.lang.Object) formatArray25);
        java.text.Format[] formatArray27 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale30 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale30);
        extendedMessageFormat31.applyPattern("");
        java.text.Format[] formatArray34 = extendedMessageFormat31.getFormats();
        java.lang.String str35 = extendedMessageFormat31.toPattern();
        java.text.Format[] formatArray36 = extendedMessageFormat31.getFormatsByArgumentIndex();
        java.lang.String str37 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray36);
        boolean boolean38 = extendedMessageFormat2.equals((java.lang.Object) formatArray36);
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.Class<?> wildcardClass7 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale19);
        extendedMessageFormat20.applyPattern("");
        java.text.Format[] formatArray23 = extendedMessageFormat20.getFormatsByArgumentIndex();
        extendedMessageFormat20.applyPattern("");
        java.lang.String str26 = extendedMessageFormat20.toPattern();
        java.text.Format[] formatArray27 = extendedMessageFormat20.getFormats();
        java.text.Format[] formatArray28 = extendedMessageFormat20.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat33.applyPattern("");
        java.text.Format[] formatArray36 = extendedMessageFormat33.getFormats();
        java.lang.String str37 = extendedMessageFormat33.toPattern();
        java.util.Locale locale38 = extendedMessageFormat33.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale38);
        extendedMessageFormat30.setLocale(locale38);
        extendedMessageFormat20.setLocale(locale38);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale38);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale38);
        extendedMessageFormat2.setLocale(locale38);
        java.lang.Class<?> wildcardClass45 = locale38.getClass();
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormatsByArgumentIndex();
        extendedMessageFormat5.applyPattern("");
        java.lang.String str11 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat5.getFormats();
        java.text.Format[] formatArray13 = extendedMessageFormat5.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat18.applyPattern("");
        java.text.Format[] formatArray21 = extendedMessageFormat18.getFormats();
        java.lang.String str22 = extendedMessageFormat18.toPattern();
        java.util.Locale locale23 = extendedMessageFormat18.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale23);
        extendedMessageFormat15.setLocale(locale23);
        extendedMessageFormat5.setLocale(locale23);
        java.lang.String str27 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray28 = extendedMessageFormat5.getFormats();
        java.util.Locale locale29 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale29);
        java.text.Format[] formatArray32 = extendedMessageFormat31.getFormats();
        java.util.Locale locale33 = extendedMessageFormat31.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale33);
        extendedMessageFormat34.applyPattern("hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormats();
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        java.util.Locale locale17 = null;
        extendedMessageFormat16.setLocale(locale17);
        java.text.Format[] formatArray19 = extendedMessageFormat16.getFormatsByArgumentIndex();
        extendedMessageFormat16.applyPattern("");
        java.lang.String str22 = extendedMessageFormat16.toPattern();
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale24);
        extendedMessageFormat25.applyPattern("");
        java.text.Format[] formatArray28 = extendedMessageFormat25.getFormats();
        java.lang.String str29 = extendedMessageFormat25.toPattern();
        extendedMessageFormat25.applyPattern("");
        java.lang.String str32 = extendedMessageFormat25.toPattern();
        java.text.Format[] formatArray33 = extendedMessageFormat25.getFormats();
        java.text.Format[] formatArray34 = extendedMessageFormat25.getFormatsByArgumentIndex();
        java.util.Locale locale35 = extendedMessageFormat25.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat38.applyPattern("");
        java.text.Format[] formatArray41 = extendedMessageFormat38.getFormats();
        java.lang.String str42 = extendedMessageFormat38.toPattern();
        java.util.Locale locale43 = extendedMessageFormat38.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale43);
        extendedMessageFormat25.setLocale(locale43);
        extendedMessageFormat16.setLocale(locale43);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale43);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale43);
        extendedMessageFormat2.setLocale(locale43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale35);
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray16 = extendedMessageFormat14.parse("hi!");
        java.lang.String str17 = extendedMessageFormat10.format((java.lang.Object) objArray16);
        java.text.Format[] formatArray18 = extendedMessageFormat10.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat22.applyPattern("");
        java.text.Format[] formatArray25 = extendedMessageFormat22.getFormats();
        java.lang.String str26 = extendedMessageFormat22.toPattern();
        java.util.Locale locale27 = extendedMessageFormat22.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale27);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale27);
        extendedMessageFormat10.setLocale(locale27);
        extendedMessageFormat2.setLocale(locale27);
        java.util.Locale locale33 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale33);
        java.util.Locale locale35 = null;
        extendedMessageFormat34.setLocale(locale35);
        java.text.Format[] formatArray37 = extendedMessageFormat34.getFormatsByArgumentIndex();
        java.util.Locale locale39 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale39);
        extendedMessageFormat40.applyPattern("");
        java.text.Format[] formatArray43 = extendedMessageFormat40.getFormatsByArgumentIndex();
        java.lang.String str44 = extendedMessageFormat40.toPattern();
        java.text.Format[] formatArray45 = extendedMessageFormat40.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator46 = extendedMessageFormat34.formatToCharacterIterator((java.lang.Object) formatArray45);
        extendedMessageFormat34.applyPattern("hi!");
        java.lang.Object obj49 = null;
        java.lang.String str50 = extendedMessageFormat34.format(obj49);
        java.text.Format[] formatArray51 = extendedMessageFormat34.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer52 = null;
        java.text.FieldPosition fieldPosition53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer54 = extendedMessageFormat2.format((java.lang.Object[]) formatArray51, stringBuffer52, fieldPosition53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray43);
        org.junit.Assert.assertArrayEquals(formatArray43, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(formatArray45);
        org.junit.Assert.assertArrayEquals(formatArray45, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(formatArray51);
        org.junit.Assert.assertArrayEquals(formatArray51, new java.text.Format[] {});
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        extendedMessageFormat13.applyPattern("");
        extendedMessageFormat13.applyPattern("");
        java.text.Format[] formatArray18 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale20);
        extendedMessageFormat21.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray27 = extendedMessageFormat25.parse("hi!");
        java.lang.String str28 = extendedMessageFormat21.format((java.lang.Object) objArray27);
        java.text.Format[] formatArray29 = extendedMessageFormat21.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat33.applyPattern("");
        java.text.Format[] formatArray36 = extendedMessageFormat33.getFormats();
        java.lang.String str37 = extendedMessageFormat33.toPattern();
        java.util.Locale locale38 = extendedMessageFormat33.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale38);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale38);
        extendedMessageFormat21.setLocale(locale38);
        extendedMessageFormat13.setLocale(locale38);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat44.applyPattern("");
        java.text.Format[] formatArray47 = extendedMessageFormat44.getFormats();
        java.lang.String str48 = extendedMessageFormat44.toPattern();
        java.util.Locale locale49 = extendedMessageFormat44.getLocale();
        extendedMessageFormat13.setLocale(locale49);
        java.util.Locale locale51 = extendedMessageFormat13.getLocale();
        java.util.Locale locale52 = extendedMessageFormat13.getLocale();
        java.text.Format[] formatArray53 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.util.Locale locale54 = extendedMessageFormat13.getLocale();
        extendedMessageFormat2.setLocale(locale54);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray58 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray53);
        org.junit.Assert.assertArrayEquals(formatArray53, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat15.applyPattern("");
        java.text.Format[] formatArray18 = extendedMessageFormat15.getFormats();
        java.lang.String str19 = extendedMessageFormat15.toPattern();
        java.util.Locale locale20 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale20);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale20);
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale24);
        extendedMessageFormat25.applyPattern("");
        java.text.Format[] formatArray28 = extendedMessageFormat25.getFormats();
        java.lang.String str29 = extendedMessageFormat25.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat32.applyPattern("");
        java.text.Format[] formatArray35 = extendedMessageFormat32.getFormats();
        java.lang.String str36 = extendedMessageFormat32.toPattern();
        java.util.Locale locale37 = extendedMessageFormat32.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale37);
        extendedMessageFormat25.setLocale(locale37);
        extendedMessageFormat22.setLocale(locale37);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat44.applyPattern("");
        java.text.Format[] formatArray47 = extendedMessageFormat44.getFormats();
        java.lang.String str48 = extendedMessageFormat44.toPattern();
        java.util.Locale locale49 = extendedMessageFormat44.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale49);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat51 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale49);
        extendedMessageFormat22.setLocale(locale49);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat53 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale49);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat54 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale49);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale49);
        java.text.Format[] formatArray56 = extendedMessageFormat55.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray56);
        org.junit.Assert.assertArrayEquals(formatArray56, new java.text.Format[] {});
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray17 = extendedMessageFormat15.parse("hi!");
        java.lang.String str18 = extendedMessageFormat11.format((java.lang.Object) objArray17);
        java.text.Format[] formatArray19 = extendedMessageFormat11.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat23.applyPattern("");
        java.text.Format[] formatArray26 = extendedMessageFormat23.getFormats();
        java.lang.String str27 = extendedMessageFormat23.toPattern();
        java.util.Locale locale28 = extendedMessageFormat23.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale28);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale28);
        extendedMessageFormat11.setLocale(locale28);
        extendedMessageFormat3.setLocale(locale28);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat34.applyPattern("");
        java.text.Format[] formatArray37 = extendedMessageFormat34.getFormats();
        java.lang.String str38 = extendedMessageFormat34.toPattern();
        java.util.Locale locale39 = extendedMessageFormat34.getLocale();
        extendedMessageFormat3.setLocale(locale39);
        java.util.Locale locale41 = extendedMessageFormat3.getLocale();
        java.util.Locale locale42 = extendedMessageFormat3.getLocale();
        java.util.Locale locale44 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale44);
        extendedMessageFormat45.applyPattern("");
        extendedMessageFormat45.applyPattern("");
        extendedMessageFormat45.applyPattern("hi!");
        java.lang.String str52 = extendedMessageFormat45.toPattern();
        java.lang.String str53 = extendedMessageFormat45.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat57 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat57.applyPattern("");
        java.text.Format[] formatArray60 = extendedMessageFormat57.getFormats();
        java.lang.String str61 = extendedMessageFormat57.toPattern();
        java.util.Locale locale62 = extendedMessageFormat57.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat63 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale62);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat64 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale62);
        java.util.Locale locale66 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat67 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale66);
        extendedMessageFormat67.applyPattern("");
        java.text.Format[] formatArray70 = extendedMessageFormat67.getFormats();
        java.lang.String str71 = extendedMessageFormat67.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat74 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat74.applyPattern("");
        java.text.Format[] formatArray77 = extendedMessageFormat74.getFormats();
        java.lang.String str78 = extendedMessageFormat74.toPattern();
        java.util.Locale locale79 = extendedMessageFormat74.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat80 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale79);
        extendedMessageFormat67.setLocale(locale79);
        extendedMessageFormat64.setLocale(locale79);
        extendedMessageFormat45.setLocale(locale79);
        extendedMessageFormat3.setLocale(locale79);
        java.lang.String str85 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray86 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str87 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray86);
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(formatArray60);
        org.junit.Assert.assertArrayEquals(formatArray60, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray70);
        org.junit.Assert.assertArrayEquals(formatArray70, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(formatArray77);
        org.junit.Assert.assertArrayEquals(formatArray77, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(formatArray86);
        org.junit.Assert.assertArrayEquals(formatArray86, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormatsByArgumentIndex();
        extendedMessageFormat3.applyPattern("");
        java.lang.String str9 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat16.applyPattern("");
        java.text.Format[] formatArray19 = extendedMessageFormat16.getFormats();
        java.lang.String str20 = extendedMessageFormat16.toPattern();
        java.util.Locale locale21 = extendedMessageFormat16.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        extendedMessageFormat13.setLocale(locale21);
        extendedMessageFormat3.setLocale(locale21);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        java.text.Format[] formatArray26 = extendedMessageFormat25.getFormatsByArgumentIndex();
        java.util.Locale locale27 = extendedMessageFormat25.getLocale();
        extendedMessageFormat25.applyPattern("hi!");
        extendedMessageFormat25.applyPattern("");
        java.lang.String str32 = extendedMessageFormat25.toPattern();
        java.util.Locale locale33 = extendedMessageFormat25.getLocale();
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        java.util.Locale locale37 = extendedMessageFormat36.getLocale();
        java.text.Format[] formatArray38 = extendedMessageFormat36.getFormatsByArgumentIndex();
        java.lang.String str39 = extendedMessageFormat36.toPattern();
        java.text.Format[] formatArray40 = extendedMessageFormat36.getFormats();
        java.lang.String str41 = extendedMessageFormat36.toPattern();
        java.text.Format[] formatArray42 = extendedMessageFormat36.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat25.setFormats(formatArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertNull(locale37);
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(formatArray40);
        org.junit.Assert.assertArrayEquals(formatArray40, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(formatArray42);
        org.junit.Assert.assertArrayEquals(formatArray42, new java.text.Format[] {});
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.util.Locale locale14 = extendedMessageFormat12.getLocale();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        extendedMessageFormat17.applyPattern("");
        java.text.Format[] formatArray20 = extendedMessageFormat17.getFormatsByArgumentIndex();
        extendedMessageFormat17.applyPattern("");
        java.text.Format[] formatArray23 = extendedMessageFormat17.getFormatsByArgumentIndex();
        extendedMessageFormat17.applyPattern("hi!");
        java.lang.Object[] objArray27 = extendedMessageFormat17.parse("hi!");
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        extendedMessageFormat30.applyPattern("");
        java.text.Format[] formatArray33 = extendedMessageFormat30.getFormats();
        java.lang.String str34 = extendedMessageFormat30.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat37.applyPattern("");
        java.text.Format[] formatArray40 = extendedMessageFormat37.getFormats();
        java.lang.String str41 = extendedMessageFormat37.toPattern();
        java.util.Locale locale42 = extendedMessageFormat37.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        extendedMessageFormat30.setLocale(locale42);
        extendedMessageFormat17.setLocale(locale42);
        extendedMessageFormat12.setLocale(locale42);
        extendedMessageFormat2.setLocale(locale42);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        java.util.Locale locale50 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat51 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale50);
        extendedMessageFormat51.applyPattern("");
        extendedMessageFormat51.applyPattern("");
        java.text.Format[] formatArray56 = extendedMessageFormat51.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass57 = formatArray56.getClass();
        java.lang.String str58 = extendedMessageFormat48.format((java.lang.Object) formatArray56);
        java.util.Locale locale60 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale60);
        java.util.Locale locale62 = extendedMessageFormat61.getLocale();
        java.text.Format[] formatArray63 = extendedMessageFormat61.getFormatsByArgumentIndex();
        java.text.Format[] formatArray64 = extendedMessageFormat61.getFormatsByArgumentIndex();
        extendedMessageFormat61.applyPattern("hi!");
        java.text.Format[] formatArray67 = extendedMessageFormat61.getFormats();
        java.text.Format[] formatArray68 = extendedMessageFormat61.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = extendedMessageFormat48.format((java.lang.Object) extendedMessageFormat61);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(formatArray40);
        org.junit.Assert.assertArrayEquals(formatArray40, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray56);
        org.junit.Assert.assertArrayEquals(formatArray56, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNull(locale62);
        org.junit.Assert.assertNotNull(formatArray63);
        org.junit.Assert.assertArrayEquals(formatArray63, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray64);
        org.junit.Assert.assertArrayEquals(formatArray64, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray67);
        org.junit.Assert.assertArrayEquals(formatArray67, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray68);
        org.junit.Assert.assertArrayEquals(formatArray68, new java.text.Format[] {});
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.lang.String str14 = extendedMessageFormat12.toPattern();
        java.lang.String str15 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray16 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.text.Format[] formatArray17 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.lang.String str18 = extendedMessageFormat2.format((java.lang.Object) formatArray17);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        java.text.Format[] formatArray14 = extendedMessageFormat11.getFormats();
        java.lang.String str15 = extendedMessageFormat11.toPattern();
        extendedMessageFormat11.applyPattern("");
        java.lang.String str18 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray19 = extendedMessageFormat11.getFormats();
        java.text.Format[] formatArray20 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.text.Format[] formatArray21 = extendedMessageFormat11.getFormatsByArgumentIndex();
        extendedMessageFormat11.applyPattern("");
        java.lang.String str24 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray25 = extendedMessageFormat11.getFormats();
        boolean boolean26 = extendedMessageFormat2.equals((java.lang.Object) formatArray25);
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        extendedMessageFormat12.applyPattern("");
        extendedMessageFormat12.applyPattern("hi!");
        java.lang.String str19 = extendedMessageFormat12.toPattern();
        java.lang.String str20 = extendedMessageFormat12.toPattern();
        java.lang.String str21 = extendedMessageFormat12.toPattern();
        extendedMessageFormat12.applyPattern("hi!");
        java.lang.Object[] objArray25 = extendedMessageFormat12.parse("hi!");
        java.text.Format[] formatArray26 = extendedMessageFormat12.getFormats();
        java.lang.StringBuffer stringBuffer27 = null;
        java.text.FieldPosition fieldPosition28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer29 = extendedMessageFormat1.format((java.lang.Object[]) formatArray26, stringBuffer27, fieldPosition28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormatsByArgumentIndex();
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray9 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray10 = extendedMessageFormat3.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        java.lang.String str18 = extendedMessageFormat14.toPattern();
        java.util.Locale locale19 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale19);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale19);
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale23);
        extendedMessageFormat24.applyPattern("");
        java.text.Format[] formatArray27 = extendedMessageFormat24.getFormats();
        java.lang.String str28 = extendedMessageFormat24.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat31.applyPattern("");
        java.text.Format[] formatArray34 = extendedMessageFormat31.getFormats();
        java.lang.String str35 = extendedMessageFormat31.toPattern();
        java.util.Locale locale36 = extendedMessageFormat31.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale36);
        extendedMessageFormat24.setLocale(locale36);
        extendedMessageFormat21.setLocale(locale36);
        extendedMessageFormat3.setLocale(locale36);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale36);
        java.util.Locale locale43 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale43);
        java.util.Locale locale45 = null;
        extendedMessageFormat44.setLocale(locale45);
        java.text.Format[] formatArray47 = extendedMessageFormat44.getFormatsByArgumentIndex();
        extendedMessageFormat44.applyPattern("");
        java.util.Locale locale51 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale51);
        extendedMessageFormat52.applyPattern("");
        java.text.Format[] formatArray55 = extendedMessageFormat52.getFormats();
        java.text.Format[] formatArray56 = extendedMessageFormat52.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator57 = extendedMessageFormat44.formatToCharacterIterator((java.lang.Object) formatArray56);
        java.lang.String str58 = extendedMessageFormat44.toPattern();
        java.text.Format[] formatArray59 = extendedMessageFormat44.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator60 = extendedMessageFormat41.formatToCharacterIterator((java.lang.Object) formatArray59);
        extendedMessageFormat41.applyPattern("");
        java.text.ParsePosition parsePosition64 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray65 = extendedMessageFormat41.parse("hi!", parsePosition64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray55);
        org.junit.Assert.assertArrayEquals(formatArray55, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray56);
        org.junit.Assert.assertArrayEquals(formatArray56, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(formatArray59);
        org.junit.Assert.assertArrayEquals(formatArray59, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator60);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        extendedMessageFormat2.applyPattern("hi!");
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale19);
        extendedMessageFormat20.applyPattern("");
        java.text.Format[] formatArray23 = extendedMessageFormat20.getFormats();
        java.lang.String str24 = extendedMessageFormat20.toPattern();
        extendedMessageFormat20.applyPattern("");
        java.lang.String str27 = extendedMessageFormat20.toPattern();
        java.text.Format[] formatArray28 = extendedMessageFormat20.getFormats();
        java.text.Format[] formatArray29 = extendedMessageFormat20.getFormatsByArgumentIndex();
        java.util.Locale locale30 = extendedMessageFormat20.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat35.applyPattern("");
        java.text.Format[] formatArray38 = extendedMessageFormat35.getFormats();
        java.lang.String str39 = extendedMessageFormat35.toPattern();
        java.util.Locale locale40 = extendedMessageFormat35.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale40);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale40);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale40);
        extendedMessageFormat20.setLocale(locale40);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale40);
        java.text.Format[] formatArray46 = extendedMessageFormat45.getFormats();
        java.lang.String str47 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = extendedMessageFormat2.format((java.lang.Object) str47);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale30);
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray46);
        org.junit.Assert.assertArrayEquals(formatArray46, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat2.getLocale();
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale17);
        extendedMessageFormat18.applyPattern("");
        java.text.Format[] formatArray21 = extendedMessageFormat18.getFormatsByArgumentIndex();
        extendedMessageFormat18.applyPattern("");
        java.lang.String str24 = extendedMessageFormat18.toPattern();
        java.text.Format[] formatArray25 = extendedMessageFormat18.getFormats();
        java.text.Format[] formatArray26 = extendedMessageFormat18.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat31.applyPattern("");
        java.text.Format[] formatArray34 = extendedMessageFormat31.getFormats();
        java.lang.String str35 = extendedMessageFormat31.toPattern();
        java.util.Locale locale36 = extendedMessageFormat31.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale36);
        extendedMessageFormat28.setLocale(locale36);
        extendedMessageFormat18.setLocale(locale36);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale36);
        java.text.Format[] formatArray41 = extendedMessageFormat40.getFormatsByArgumentIndex();
        java.util.Locale locale42 = extendedMessageFormat40.getLocale();
        java.util.Locale locale44 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale44);
        extendedMessageFormat45.applyPattern("");
        extendedMessageFormat45.applyPattern("");
        extendedMessageFormat45.applyPattern("hi!");
        java.lang.String str52 = extendedMessageFormat45.toPattern();
        java.lang.String str53 = extendedMessageFormat45.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat57 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat57.applyPattern("");
        java.text.Format[] formatArray60 = extendedMessageFormat57.getFormats();
        java.lang.String str61 = extendedMessageFormat57.toPattern();
        java.util.Locale locale62 = extendedMessageFormat57.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat63 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale62);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat64 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale62);
        java.util.Locale locale66 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat67 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale66);
        extendedMessageFormat67.applyPattern("");
        java.text.Format[] formatArray70 = extendedMessageFormat67.getFormats();
        java.lang.String str71 = extendedMessageFormat67.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat74 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat74.applyPattern("");
        java.text.Format[] formatArray77 = extendedMessageFormat74.getFormats();
        java.lang.String str78 = extendedMessageFormat74.toPattern();
        java.util.Locale locale79 = extendedMessageFormat74.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat80 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale79);
        extendedMessageFormat67.setLocale(locale79);
        extendedMessageFormat64.setLocale(locale79);
        extendedMessageFormat45.setLocale(locale79);
        java.lang.String str84 = extendedMessageFormat45.toPattern();
        java.util.Locale locale85 = extendedMessageFormat45.getLocale();
        extendedMessageFormat40.setLocale(locale85);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat87 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale85);
        java.text.Format[] formatArray88 = extendedMessageFormat87.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) '4', (java.text.Format) extendedMessageFormat87);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(formatArray60);
        org.junit.Assert.assertArrayEquals(formatArray60, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray70);
        org.junit.Assert.assertArrayEquals(formatArray70, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(formatArray77);
        org.junit.Assert.assertArrayEquals(formatArray77, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray88);
        org.junit.Assert.assertArrayEquals(formatArray88, new java.text.Format[] {});
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormats();
        java.lang.Object obj10 = extendedMessageFormat2.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("hi!");
        java.util.Locale locale9 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray10 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray11 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat16.applyPattern("");
        java.text.Format[] formatArray19 = extendedMessageFormat16.getFormats();
        java.text.Format[] formatArray20 = extendedMessageFormat16.getFormats();
        java.util.Locale locale21 = null;
        extendedMessageFormat16.setLocale(locale21);
        extendedMessageFormat16.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat28.applyPattern("");
        java.text.Format[] formatArray31 = extendedMessageFormat28.getFormats();
        java.lang.String str32 = extendedMessageFormat28.toPattern();
        java.util.Locale locale33 = extendedMessageFormat28.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale33);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale33);
        java.util.Locale locale37 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale37);
        extendedMessageFormat38.applyPattern("");
        java.text.Format[] formatArray41 = extendedMessageFormat38.getFormats();
        java.lang.String str42 = extendedMessageFormat38.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat45.applyPattern("");
        java.text.Format[] formatArray48 = extendedMessageFormat45.getFormats();
        java.lang.String str49 = extendedMessageFormat45.toPattern();
        java.util.Locale locale50 = extendedMessageFormat45.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat51 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale50);
        extendedMessageFormat38.setLocale(locale50);
        extendedMessageFormat35.setLocale(locale50);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat57 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat57.applyPattern("");
        java.text.Format[] formatArray60 = extendedMessageFormat57.getFormats();
        java.lang.String str61 = extendedMessageFormat57.toPattern();
        java.util.Locale locale62 = extendedMessageFormat57.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat63 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale62);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat64 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale62);
        extendedMessageFormat35.setLocale(locale62);
        extendedMessageFormat16.setLocale(locale62);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat67 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale62);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat68 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale62);
        java.lang.Class<?> wildcardClass69 = extendedMessageFormat68.getClass();
        boolean boolean70 = extendedMessageFormat1.equals((java.lang.Object) wildcardClass69);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(formatArray48);
        org.junit.Assert.assertArrayEquals(formatArray48, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray60);
        org.junit.Assert.assertArrayEquals(formatArray60, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormats();
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = extendedMessageFormat2.parse("hi!", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.lang.String str11 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator13 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) formatArray12);
        java.text.Format[] formatArray14 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str15 = extendedMessageFormat2.toPattern();
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale17);
        extendedMessageFormat18.applyPattern("");
        java.util.Locale locale21 = extendedMessageFormat18.getLocale();
        java.text.Format[] formatArray22 = extendedMessageFormat18.getFormats();
        java.text.Format[] formatArray23 = extendedMessageFormat18.getFormats();
        java.util.Locale locale24 = null;
        extendedMessageFormat18.setLocale(locale24);
        java.text.Format[] formatArray26 = extendedMessageFormat18.getFormatsByArgumentIndex();
        java.lang.String str27 = extendedMessageFormat18.toPattern();
        boolean boolean28 = extendedMessageFormat2.equals((java.lang.Object) str27);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator13);
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(locale21);
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        java.lang.String str18 = extendedMessageFormat14.toPattern();
        java.util.Locale locale19 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale19);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale19);
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale23);
        extendedMessageFormat24.applyPattern("");
        java.text.Format[] formatArray27 = extendedMessageFormat24.getFormats();
        java.lang.String str28 = extendedMessageFormat24.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat31.applyPattern("");
        java.text.Format[] formatArray34 = extendedMessageFormat31.getFormats();
        java.lang.String str35 = extendedMessageFormat31.toPattern();
        java.util.Locale locale36 = extendedMessageFormat31.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale36);
        extendedMessageFormat24.setLocale(locale36);
        extendedMessageFormat21.setLocale(locale36);
        extendedMessageFormat2.setLocale(locale36);
        java.lang.String str41 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray43 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        extendedMessageFormat3.applyPattern("");
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Locale locale10 = extendedMessageFormat3.getLocale();
        java.lang.Object[] objArray12 = extendedMessageFormat3.parse("hi!");
        java.lang.Object[] objArray14 = extendedMessageFormat3.parse("hi!");
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        extendedMessageFormat17.applyPattern("");
        java.util.Locale locale20 = extendedMessageFormat17.getLocale();
        java.lang.String str21 = extendedMessageFormat17.toPattern();
        java.text.Format[] formatArray22 = extendedMessageFormat17.getFormats();
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale24);
        java.util.Locale locale26 = extendedMessageFormat25.getLocale();
        java.util.Locale locale27 = null;
        extendedMessageFormat25.setLocale(locale27);
        java.util.Locale locale29 = extendedMessageFormat25.getLocale();
        java.util.Locale locale31 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale31);
        extendedMessageFormat32.applyPattern("");
        extendedMessageFormat32.applyPattern("");
        extendedMessageFormat32.applyPattern("hi!");
        java.lang.String str39 = extendedMessageFormat32.toPattern();
        java.lang.String str40 = extendedMessageFormat32.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat44.applyPattern("");
        java.text.Format[] formatArray47 = extendedMessageFormat44.getFormats();
        java.lang.String str48 = extendedMessageFormat44.toPattern();
        java.util.Locale locale49 = extendedMessageFormat44.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale49);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat51 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale49);
        java.util.Locale locale53 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat54 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale53);
        extendedMessageFormat54.applyPattern("");
        java.text.Format[] formatArray57 = extendedMessageFormat54.getFormats();
        java.lang.String str58 = extendedMessageFormat54.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat61.applyPattern("");
        java.text.Format[] formatArray64 = extendedMessageFormat61.getFormats();
        java.lang.String str65 = extendedMessageFormat61.toPattern();
        java.util.Locale locale66 = extendedMessageFormat61.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat67 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale66);
        extendedMessageFormat54.setLocale(locale66);
        extendedMessageFormat51.setLocale(locale66);
        extendedMessageFormat32.setLocale(locale66);
        extendedMessageFormat25.setLocale(locale66);
        extendedMessageFormat17.setLocale(locale66);
        extendedMessageFormat3.setLocale(locale66);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat74 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale66);
        java.util.Locale locale75 = extendedMessageFormat74.getLocale();
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertNull(locale20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale26);
        org.junit.Assert.assertNull(locale29);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray57);
        org.junit.Assert.assertArrayEquals(formatArray57, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(formatArray64);
        org.junit.Assert.assertArrayEquals(formatArray64, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "th_TH");
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        extendedMessageFormat4.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormatsByArgumentIndex();
        extendedMessageFormat4.applyPattern("");
        java.text.Format[] formatArray10 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.lang.String str11 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray10);
        java.lang.String str12 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray10);
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.util.Locale locale14 = extendedMessageFormat12.getLocale();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        extendedMessageFormat17.applyPattern("");
        java.text.Format[] formatArray20 = extendedMessageFormat17.getFormatsByArgumentIndex();
        extendedMessageFormat17.applyPattern("");
        java.text.Format[] formatArray23 = extendedMessageFormat17.getFormatsByArgumentIndex();
        extendedMessageFormat17.applyPattern("hi!");
        java.lang.Object[] objArray27 = extendedMessageFormat17.parse("hi!");
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        extendedMessageFormat30.applyPattern("");
        java.text.Format[] formatArray33 = extendedMessageFormat30.getFormats();
        java.lang.String str34 = extendedMessageFormat30.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat37.applyPattern("");
        java.text.Format[] formatArray40 = extendedMessageFormat37.getFormats();
        java.lang.String str41 = extendedMessageFormat37.toPattern();
        java.util.Locale locale42 = extendedMessageFormat37.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        extendedMessageFormat30.setLocale(locale42);
        extendedMessageFormat17.setLocale(locale42);
        extendedMessageFormat12.setLocale(locale42);
        extendedMessageFormat2.setLocale(locale42);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        extendedMessageFormat48.applyPattern("");
        java.util.Locale locale51 = extendedMessageFormat48.getLocale();
        java.util.Locale locale55 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat56 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale55);
        extendedMessageFormat56.applyPattern("");
        java.text.Format[] formatArray59 = extendedMessageFormat56.getFormats();
        java.lang.String str60 = extendedMessageFormat56.toPattern();
        extendedMessageFormat56.applyPattern("");
        java.lang.String str63 = extendedMessageFormat56.toPattern();
        java.text.Format[] formatArray64 = extendedMessageFormat56.getFormats();
        java.text.Format[] formatArray65 = extendedMessageFormat56.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat67 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat67.applyPattern("");
        java.text.Format[] formatArray70 = extendedMessageFormat67.getFormats();
        java.lang.String str71 = extendedMessageFormat67.toPattern();
        java.util.Locale locale72 = extendedMessageFormat67.getLocale();
        extendedMessageFormat56.setLocale(locale72);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat74 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale72);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat75 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale72);
        extendedMessageFormat75.applyPattern("");
        java.util.Locale locale78 = extendedMessageFormat75.getLocale();
        extendedMessageFormat48.setLocale(locale78);
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(formatArray40);
        org.junit.Assert.assertArrayEquals(formatArray40, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray59);
        org.junit.Assert.assertArrayEquals(formatArray59, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(formatArray64);
        org.junit.Assert.assertArrayEquals(formatArray64, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray65);
        org.junit.Assert.assertArrayEquals(formatArray65, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray70);
        org.junit.Assert.assertArrayEquals(formatArray70, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "th_TH");
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormats();
        java.lang.String str9 = extendedMessageFormat5.toPattern();
        extendedMessageFormat5.applyPattern("");
        java.lang.String str12 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat5.getFormats();
        java.text.Format[] formatArray14 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        extendedMessageFormat17.applyPattern("");
        extendedMessageFormat17.applyPattern("");
        extendedMessageFormat17.applyPattern("hi!");
        java.lang.String str24 = extendedMessageFormat17.toPattern();
        java.lang.String str25 = extendedMessageFormat17.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat29.applyPattern("");
        java.text.Format[] formatArray32 = extendedMessageFormat29.getFormats();
        java.lang.String str33 = extendedMessageFormat29.toPattern();
        java.util.Locale locale34 = extendedMessageFormat29.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale34);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale34);
        java.util.Locale locale38 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale38);
        extendedMessageFormat39.applyPattern("");
        java.text.Format[] formatArray42 = extendedMessageFormat39.getFormats();
        java.lang.String str43 = extendedMessageFormat39.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat46.applyPattern("");
        java.text.Format[] formatArray49 = extendedMessageFormat46.getFormats();
        java.lang.String str50 = extendedMessageFormat46.toPattern();
        java.util.Locale locale51 = extendedMessageFormat46.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale51);
        extendedMessageFormat39.setLocale(locale51);
        extendedMessageFormat36.setLocale(locale51);
        extendedMessageFormat17.setLocale(locale51);
        extendedMessageFormat5.setLocale(locale51);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat57 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale51);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat58 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale51);
        java.text.Format[] formatArray59 = extendedMessageFormat58.getFormatsByArgumentIndex();
        java.util.Locale locale60 = extendedMessageFormat58.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale60);
        java.util.Locale locale64 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat65 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale64);
        extendedMessageFormat65.applyPattern("");
        java.util.Locale locale68 = null;
        extendedMessageFormat65.setLocale(locale68);
        java.util.Locale locale70 = null;
        extendedMessageFormat65.setLocale(locale70);
        java.util.Locale locale72 = null;
        extendedMessageFormat65.setLocale(locale72);
        java.lang.String str74 = extendedMessageFormat65.toPattern();
        extendedMessageFormat65.applyPattern("");
        java.util.Locale locale79 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat80 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale79);
        extendedMessageFormat80.applyPattern("");
        java.text.Format[] formatArray83 = extendedMessageFormat80.getFormats();
        java.lang.String str84 = extendedMessageFormat80.toPattern();
        java.util.Locale locale85 = extendedMessageFormat80.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat87 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale88 = extendedMessageFormat87.getLocale();
        extendedMessageFormat80.setLocale(locale88);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat90 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale88);
        extendedMessageFormat65.setLocale(locale88);
        java.lang.String str92 = extendedMessageFormat65.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat61.setFormat((int) (byte) 0, (java.text.Format) extendedMessageFormat65);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray42);
        org.junit.Assert.assertArrayEquals(formatArray42, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray59);
        org.junit.Assert.assertArrayEquals(formatArray59, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(formatArray83);
        org.junit.Assert.assertArrayEquals(formatArray83, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNull(locale85);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        extendedMessageFormat15.applyPattern("");
        extendedMessageFormat15.applyPattern("");
        java.text.Format[] formatArray20 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale22);
        extendedMessageFormat23.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray29 = extendedMessageFormat27.parse("hi!");
        java.lang.String str30 = extendedMessageFormat23.format((java.lang.Object) objArray29);
        java.text.Format[] formatArray31 = extendedMessageFormat23.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat35.applyPattern("");
        java.text.Format[] formatArray38 = extendedMessageFormat35.getFormats();
        java.lang.String str39 = extendedMessageFormat35.toPattern();
        java.util.Locale locale40 = extendedMessageFormat35.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale40);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale40);
        extendedMessageFormat23.setLocale(locale40);
        extendedMessageFormat15.setLocale(locale40);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale40);
        extendedMessageFormat45.applyPattern("hi!");
        java.text.Format[] formatArray48 = extendedMessageFormat45.getFormats();
        java.lang.String str49 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray48);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertArrayEquals(objArray29, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray48);
        org.junit.Assert.assertArrayEquals(formatArray48, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.util.Locale locale6 = null;
        extendedMessageFormat1.setLocale(locale6);
        extendedMessageFormat1.applyPattern("hi!");
        java.util.Locale locale10 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        java.lang.String str18 = extendedMessageFormat14.toPattern();
        extendedMessageFormat14.applyPattern("");
        java.lang.String str21 = extendedMessageFormat14.toPattern();
        java.text.Format[] formatArray22 = extendedMessageFormat14.getFormats();
        java.text.Format[] formatArray23 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.util.Locale locale24 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat29.applyPattern("");
        java.text.Format[] formatArray32 = extendedMessageFormat29.getFormats();
        java.lang.String str33 = extendedMessageFormat29.toPattern();
        java.util.Locale locale34 = extendedMessageFormat29.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale34);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale34);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale34);
        extendedMessageFormat14.setLocale(locale34);
        extendedMessageFormat1.setLocale(locale34);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale24);
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray17 = extendedMessageFormat15.parse("hi!");
        java.lang.String str18 = extendedMessageFormat11.format((java.lang.Object) objArray17);
        java.text.Format[] formatArray19 = extendedMessageFormat11.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat23.applyPattern("");
        java.text.Format[] formatArray26 = extendedMessageFormat23.getFormats();
        java.lang.String str27 = extendedMessageFormat23.toPattern();
        java.util.Locale locale28 = extendedMessageFormat23.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale28);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale28);
        extendedMessageFormat11.setLocale(locale28);
        extendedMessageFormat3.setLocale(locale28);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat34.applyPattern("");
        java.text.Format[] formatArray37 = extendedMessageFormat34.getFormats();
        java.lang.String str38 = extendedMessageFormat34.toPattern();
        java.util.Locale locale39 = extendedMessageFormat34.getLocale();
        extendedMessageFormat3.setLocale(locale39);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale39);
        extendedMessageFormat41.applyPattern("hi!");
        java.lang.String str44 = extendedMessageFormat41.toPattern();
        java.lang.Object[] objArray46 = extendedMessageFormat41.parse("hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertArrayEquals(objArray46, new java.lang.Object[] {});
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.text.Format format12 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (byte) 100, format12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormats();
        java.lang.String str9 = extendedMessageFormat3.toPattern();
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        extendedMessageFormat15.applyPattern("");
        java.text.Format[] formatArray18 = extendedMessageFormat15.getFormats();
        java.lang.String str19 = extendedMessageFormat15.toPattern();
        extendedMessageFormat15.applyPattern("");
        java.lang.String str22 = extendedMessageFormat15.toPattern();
        java.text.Format[] formatArray23 = extendedMessageFormat15.getFormats();
        java.text.Format[] formatArray24 = extendedMessageFormat15.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat26.applyPattern("");
        java.text.Format[] formatArray29 = extendedMessageFormat26.getFormats();
        java.lang.String str30 = extendedMessageFormat26.toPattern();
        java.util.Locale locale31 = extendedMessageFormat26.getLocale();
        extendedMessageFormat15.setLocale(locale31);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale31);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale31);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale31);
        extendedMessageFormat3.setLocale(locale31);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale31);
        java.text.Format[] formatArray38 = extendedMessageFormat37.getFormatsByArgumentIndex();
        java.util.Locale locale40 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale40);
        extendedMessageFormat41.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray47 = extendedMessageFormat45.parse("hi!");
        java.lang.String str48 = extendedMessageFormat41.format((java.lang.Object) objArray47);
        java.lang.String str49 = extendedMessageFormat41.toPattern();
        java.util.Locale locale50 = null;
        extendedMessageFormat41.setLocale(locale50);
        java.util.Locale locale53 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat54 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale53);
        extendedMessageFormat54.applyPattern("");
        java.text.Format[] formatArray57 = extendedMessageFormat54.getFormats();
        java.lang.String str58 = extendedMessageFormat54.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat61.applyPattern("");
        java.text.Format[] formatArray64 = extendedMessageFormat61.getFormats();
        java.lang.String str65 = extendedMessageFormat61.toPattern();
        java.util.Locale locale66 = extendedMessageFormat61.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat67 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale66);
        extendedMessageFormat54.setLocale(locale66);
        extendedMessageFormat41.setLocale(locale66);
        extendedMessageFormat37.setLocale(locale66);
        java.util.Locale locale72 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat73 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale72);
        java.util.Locale locale74 = extendedMessageFormat73.getLocale();
        java.text.Format[] formatArray75 = extendedMessageFormat73.getFormatsByArgumentIndex();
        java.lang.String str76 = extendedMessageFormat73.toPattern();
        java.text.Format[] formatArray77 = extendedMessageFormat73.getFormats();
        java.lang.String str78 = extendedMessageFormat73.toPattern();
        java.lang.String str79 = extendedMessageFormat73.toPattern();
        java.text.Format[] formatArray80 = extendedMessageFormat73.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat37.setFormats(formatArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertArrayEquals(objArray47, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(formatArray57);
        org.junit.Assert.assertArrayEquals(formatArray57, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(formatArray64);
        org.junit.Assert.assertArrayEquals(formatArray64, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "th_TH");
        org.junit.Assert.assertNull(locale74);
        org.junit.Assert.assertNotNull(formatArray75);
        org.junit.Assert.assertArrayEquals(formatArray75, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(formatArray77);
        org.junit.Assert.assertArrayEquals(formatArray77, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(formatArray80);
        org.junit.Assert.assertArrayEquals(formatArray80, new java.text.Format[] {});
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale9 = extendedMessageFormat3.getLocale();
        java.lang.String str10 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray12 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray13 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str14 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray13);
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.util.Locale locale8 = null;
        extendedMessageFormat1.setLocale(locale8);
        extendedMessageFormat1.applyPattern("hi!");
        java.text.Format[] formatArray12 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        extendedMessageFormat17.applyPattern("");
        java.text.Format[] formatArray20 = extendedMessageFormat17.getFormats();
        java.lang.String str21 = extendedMessageFormat17.toPattern();
        extendedMessageFormat17.applyPattern("");
        java.lang.String str24 = extendedMessageFormat17.toPattern();
        java.text.Format[] formatArray25 = extendedMessageFormat17.getFormats();
        java.text.Format[] formatArray26 = extendedMessageFormat17.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat28.applyPattern("");
        java.text.Format[] formatArray31 = extendedMessageFormat28.getFormats();
        java.lang.String str32 = extendedMessageFormat28.toPattern();
        java.util.Locale locale33 = extendedMessageFormat28.getLocale();
        extendedMessageFormat17.setLocale(locale33);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale33);
        java.lang.String str36 = extendedMessageFormat35.toPattern();
        extendedMessageFormat35.applyPattern("hi!");
        java.util.Locale locale39 = extendedMessageFormat35.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale39);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat46.applyPattern("");
        java.text.Format[] formatArray49 = extendedMessageFormat46.getFormats();
        java.lang.String str50 = extendedMessageFormat46.toPattern();
        java.util.Locale locale51 = extendedMessageFormat46.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale51);
        extendedMessageFormat43.setLocale(locale51);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat54 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale51);
        extendedMessageFormat40.setLocale(locale51);
        extendedMessageFormat1.setLocale(locale51);
        java.util.Locale locale57 = extendedMessageFormat1.getLocale();
        java.lang.Object obj58 = extendedMessageFormat1.clone();
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj58);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray14 = extendedMessageFormat12.parse("hi!");
        java.util.Locale locale15 = null;
        extendedMessageFormat12.setLocale(locale15);
        java.text.Format[] formatArray17 = extendedMessageFormat12.getFormats();
        java.lang.Object[] objArray19 = extendedMessageFormat12.parse("hi!");
        java.text.Format[] formatArray20 = extendedMessageFormat12.getFormats();
        java.lang.String str21 = extendedMessageFormat2.format((java.lang.Object) formatArray20);
        java.lang.Object[] objArray22 = null;
        java.lang.StringBuffer stringBuffer23 = null;
        java.text.FieldPosition fieldPosition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = extendedMessageFormat2.format(objArray22, stringBuffer23, fieldPosition24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
        java.lang.Object[] objArray11 = extendedMessageFormat2.parse("hi!");
        java.lang.Object[] objArray13 = extendedMessageFormat2.parse("hi!");
        java.util.Locale locale14 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat19.applyPattern("");
        java.text.Format[] formatArray22 = extendedMessageFormat19.getFormats();
        java.lang.String str23 = extendedMessageFormat19.toPattern();
        java.util.Locale locale24 = extendedMessageFormat19.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale24);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale24);
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale28);
        extendedMessageFormat29.applyPattern("");
        java.text.Format[] formatArray32 = extendedMessageFormat29.getFormats();
        java.lang.String str33 = extendedMessageFormat29.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat36.applyPattern("");
        java.text.Format[] formatArray39 = extendedMessageFormat36.getFormats();
        java.lang.String str40 = extendedMessageFormat36.toPattern();
        java.util.Locale locale41 = extendedMessageFormat36.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale41);
        extendedMessageFormat29.setLocale(locale41);
        extendedMessageFormat26.setLocale(locale41);
        extendedMessageFormat26.applyPattern("");
        java.text.Format[] formatArray47 = extendedMessageFormat26.getFormats();
        java.text.Format[] formatArray48 = extendedMessageFormat26.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat(10, (java.text.Format) extendedMessageFormat26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] {});
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray48);
        org.junit.Assert.assertArrayEquals(formatArray48, new java.text.Format[] {});
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        extendedMessageFormat4.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormats();
        java.lang.String str8 = extendedMessageFormat4.toPattern();
        extendedMessageFormat4.applyPattern("");
        java.lang.String str11 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat4.getFormats();
        java.text.Format[] formatArray13 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Locale locale14 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat19.applyPattern("");
        java.text.Format[] formatArray22 = extendedMessageFormat19.getFormats();
        java.lang.String str23 = extendedMessageFormat19.toPattern();
        java.util.Locale locale24 = extendedMessageFormat19.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale24);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale24);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale24);
        extendedMessageFormat4.setLocale(locale24);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale24);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale24);
        extendedMessageFormat30.applyPattern("");
        java.util.Locale locale34 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale34);
        extendedMessageFormat35.applyPattern("");
        java.text.Format[] formatArray38 = extendedMessageFormat35.getFormats();
        java.lang.String str39 = extendedMessageFormat35.toPattern();
        java.lang.String str40 = extendedMessageFormat35.toPattern();
        extendedMessageFormat35.applyPattern("");
        java.text.Format[] formatArray43 = extendedMessageFormat35.getFormatsByArgumentIndex();
        java.text.Format[] formatArray44 = extendedMessageFormat35.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat30.setFormatsByArgumentIndex(formatArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(formatArray43);
        org.junit.Assert.assertArrayEquals(formatArray43, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray44);
        org.junit.Assert.assertArrayEquals(formatArray44, new java.text.Format[] {});
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray13 = extendedMessageFormat2.parse("hi!");
        java.util.Locale locale14 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray16 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] {});
        org.junit.Assert.assertNull(locale14);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        extendedMessageFormat4.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormats();
        java.lang.String str8 = extendedMessageFormat4.toPattern();
        extendedMessageFormat4.applyPattern("");
        java.lang.String str11 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat4.getFormats();
        java.text.Format[] formatArray13 = extendedMessageFormat4.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat15.applyPattern("");
        java.text.Format[] formatArray18 = extendedMessageFormat15.getFormats();
        java.lang.String str19 = extendedMessageFormat15.toPattern();
        java.util.Locale locale20 = extendedMessageFormat15.getLocale();
        extendedMessageFormat4.setLocale(locale20);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale20);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale20);
        java.util.Locale locale24 = extendedMessageFormat23.getLocale();
        java.lang.String str25 = extendedMessageFormat23.toPattern();
        java.util.Locale locale26 = null;
        extendedMessageFormat23.setLocale(locale26);
        java.util.Locale locale28 = extendedMessageFormat23.getLocale();
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(locale28);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        extendedMessageFormat22.applyPattern("");
        java.text.Format[] formatArray25 = extendedMessageFormat22.getFormatsByArgumentIndex();
        extendedMessageFormat22.applyPattern("");
        java.text.Format[] formatArray28 = extendedMessageFormat22.getFormatsByArgumentIndex();
        java.text.Format[] formatArray29 = extendedMessageFormat22.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat33.applyPattern("");
        java.text.Format[] formatArray36 = extendedMessageFormat33.getFormats();
        java.lang.String str37 = extendedMessageFormat33.toPattern();
        java.util.Locale locale38 = extendedMessageFormat33.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale38);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale38);
        java.util.Locale locale42 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        extendedMessageFormat43.applyPattern("");
        java.text.Format[] formatArray46 = extendedMessageFormat43.getFormats();
        java.lang.String str47 = extendedMessageFormat43.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat50.applyPattern("");
        java.text.Format[] formatArray53 = extendedMessageFormat50.getFormats();
        java.lang.String str54 = extendedMessageFormat50.toPattern();
        java.util.Locale locale55 = extendedMessageFormat50.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat56 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale55);
        extendedMessageFormat43.setLocale(locale55);
        extendedMessageFormat40.setLocale(locale55);
        extendedMessageFormat22.setLocale(locale55);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale55);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale55);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat62 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale55);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat63 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale55);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (short) 0, (java.text.Format) extendedMessageFormat63);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray46);
        org.junit.Assert.assertArrayEquals(formatArray46, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(formatArray53);
        org.junit.Assert.assertArrayEquals(formatArray53, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "th_TH");
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = null;
        extendedMessageFormat2.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        extendedMessageFormat11.applyPattern("");
        java.text.Format[] formatArray16 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        extendedMessageFormat19.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray25 = extendedMessageFormat23.parse("hi!");
        java.lang.String str26 = extendedMessageFormat19.format((java.lang.Object) objArray25);
        java.text.Format[] formatArray27 = extendedMessageFormat19.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat31.applyPattern("");
        java.text.Format[] formatArray34 = extendedMessageFormat31.getFormats();
        java.lang.String str35 = extendedMessageFormat31.toPattern();
        java.util.Locale locale36 = extendedMessageFormat31.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale36);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale36);
        extendedMessageFormat19.setLocale(locale36);
        extendedMessageFormat11.setLocale(locale36);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat42.applyPattern("");
        java.text.Format[] formatArray45 = extendedMessageFormat42.getFormats();
        java.lang.String str46 = extendedMessageFormat42.toPattern();
        java.util.Locale locale47 = extendedMessageFormat42.getLocale();
        extendedMessageFormat11.setLocale(locale47);
        java.text.Format[] formatArray49 = extendedMessageFormat11.getFormats();
        java.lang.String str50 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray49);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray45);
        org.junit.Assert.assertArrayEquals(formatArray45, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.Object[] objArray9 = extendedMessageFormat1.parse("hi!");
        java.lang.Object obj10 = extendedMessageFormat1.clone();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray7 = extendedMessageFormat2.parse("hi!");
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedMessageFormat2.parseObject("", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str11 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray17 = extendedMessageFormat15.parse("hi!");
        java.util.Locale locale18 = null;
        extendedMessageFormat15.setLocale(locale18);
        java.text.Format[] formatArray20 = extendedMessageFormat15.getFormats();
        java.text.Format[] formatArray21 = extendedMessageFormat15.getFormats();
        java.lang.String str22 = extendedMessageFormat2.format((java.lang.Object) formatArray21);
        java.text.Format[] formatArray23 = extendedMessageFormat2.getFormats();
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale26);
        java.util.Locale locale28 = null;
        extendedMessageFormat27.setLocale(locale28);
        java.text.Format[] formatArray30 = extendedMessageFormat27.getFormatsByArgumentIndex();
        java.text.Format[] formatArray31 = extendedMessageFormat27.getFormats();
        java.lang.String str32 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray31);
        java.lang.StringBuffer stringBuffer33 = null;
        java.text.FieldPosition fieldPosition34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer35 = extendedMessageFormat2.format((java.lang.Object[]) formatArray31, stringBuffer33, fieldPosition34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        java.util.Locale locale10 = null;
        extendedMessageFormat5.setLocale(locale10);
        extendedMessageFormat5.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat17.applyPattern("");
        java.text.Format[] formatArray20 = extendedMessageFormat17.getFormats();
        java.lang.String str21 = extendedMessageFormat17.toPattern();
        java.util.Locale locale22 = extendedMessageFormat17.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale22);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale22);
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale26);
        extendedMessageFormat27.applyPattern("");
        java.text.Format[] formatArray30 = extendedMessageFormat27.getFormats();
        java.lang.String str31 = extendedMessageFormat27.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat34.applyPattern("");
        java.text.Format[] formatArray37 = extendedMessageFormat34.getFormats();
        java.lang.String str38 = extendedMessageFormat34.toPattern();
        java.util.Locale locale39 = extendedMessageFormat34.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale39);
        extendedMessageFormat27.setLocale(locale39);
        extendedMessageFormat24.setLocale(locale39);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat46.applyPattern("");
        java.text.Format[] formatArray49 = extendedMessageFormat46.getFormats();
        java.lang.String str50 = extendedMessageFormat46.toPattern();
        java.util.Locale locale51 = extendedMessageFormat46.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale51);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat53 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale51);
        extendedMessageFormat24.setLocale(locale51);
        extendedMessageFormat5.setLocale(locale51);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat56 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale51);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat57 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale51);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat58 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale51);
        java.util.Locale locale59 = extendedMessageFormat58.getLocale();
        extendedMessageFormat58.applyPattern("");
        java.text.Format[] formatArray62 = extendedMessageFormat58.getFormats();
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray62);
        org.junit.Assert.assertArrayEquals(formatArray62, new java.text.Format[] {});
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.lang.String str11 = extendedMessageFormat10.toPattern();
        extendedMessageFormat10.applyPattern("hi!");
        java.lang.Object[] objArray15 = extendedMessageFormat10.parse("hi!");
        java.text.Format[] formatArray16 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator17 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) formatArray16);
        java.text.Format[] formatArray18 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray19 = extendedMessageFormat1.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat24.applyPattern("");
        java.text.Format[] formatArray27 = extendedMessageFormat24.getFormats();
        java.lang.String str28 = extendedMessageFormat24.toPattern();
        java.util.Locale locale29 = extendedMessageFormat24.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale29);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator33 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator17);
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray14 = extendedMessageFormat12.parse("hi!");
        java.util.Locale locale15 = null;
        extendedMessageFormat12.setLocale(locale15);
        java.text.Format[] formatArray17 = extendedMessageFormat12.getFormats();
        java.lang.Object[] objArray19 = extendedMessageFormat12.parse("hi!");
        java.text.Format[] formatArray20 = extendedMessageFormat12.getFormats();
        java.lang.String str21 = extendedMessageFormat2.format((java.lang.Object) formatArray20);
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale23);
        java.lang.String str25 = extendedMessageFormat24.toPattern();
        java.text.Format[] formatArray26 = extendedMessageFormat24.getFormatsByArgumentIndex();
        java.text.Format[] formatArray27 = extendedMessageFormat24.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator28 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) formatArray27);
        java.text.Format[] formatArray29 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (byte) 0, (java.text.Format) extendedMessageFormat32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator28);
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        extendedMessageFormat6.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        java.text.Format[] formatArray10 = extendedMessageFormat6.getFormats();
        java.lang.String str11 = extendedMessageFormat3.format((java.lang.Object) formatArray10);
        extendedMessageFormat3.applyPattern("");
        java.lang.String str14 = extendedMessageFormat3.toPattern();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        extendedMessageFormat17.applyPattern("");
        java.util.Locale locale20 = extendedMessageFormat17.getLocale();
        java.lang.String str21 = extendedMessageFormat17.toPattern();
        java.lang.String str22 = extendedMessageFormat17.toPattern();
        java.text.Format[] formatArray23 = extendedMessageFormat17.getFormats();
        java.lang.String str24 = extendedMessageFormat3.format((java.lang.Object) formatArray23);
        java.util.Locale locale27 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale27);
        java.util.Locale locale29 = null;
        extendedMessageFormat28.setLocale(locale29);
        java.text.Format[] formatArray31 = extendedMessageFormat28.getFormatsByArgumentIndex();
        extendedMessageFormat28.applyPattern("");
        java.lang.String str34 = extendedMessageFormat28.toPattern();
        java.util.Locale locale36 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale36);
        extendedMessageFormat37.applyPattern("");
        java.text.Format[] formatArray40 = extendedMessageFormat37.getFormats();
        java.lang.String str41 = extendedMessageFormat37.toPattern();
        extendedMessageFormat37.applyPattern("");
        java.lang.String str44 = extendedMessageFormat37.toPattern();
        java.text.Format[] formatArray45 = extendedMessageFormat37.getFormats();
        java.text.Format[] formatArray46 = extendedMessageFormat37.getFormatsByArgumentIndex();
        java.util.Locale locale47 = extendedMessageFormat37.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat50.applyPattern("");
        java.text.Format[] formatArray53 = extendedMessageFormat50.getFormats();
        java.lang.String str54 = extendedMessageFormat50.toPattern();
        java.util.Locale locale55 = extendedMessageFormat50.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat56 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale55);
        extendedMessageFormat37.setLocale(locale55);
        extendedMessageFormat28.setLocale(locale55);
        java.util.Locale locale59 = extendedMessageFormat28.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale59);
        extendedMessageFormat3.setLocale(locale59);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat62 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale59);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(locale20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(formatArray40);
        org.junit.Assert.assertArrayEquals(formatArray40, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(formatArray45);
        org.junit.Assert.assertArrayEquals(formatArray45, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray46);
        org.junit.Assert.assertArrayEquals(formatArray46, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale47);
        org.junit.Assert.assertNotNull(formatArray53);
        org.junit.Assert.assertArrayEquals(formatArray53, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "th_TH");
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat13.applyPattern("");
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormats();
        java.lang.String str17 = extendedMessageFormat13.toPattern();
        java.util.Locale locale18 = extendedMessageFormat13.getLocale();
        extendedMessageFormat2.setLocale(locale18);
        java.text.Format[] formatArray20 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray21 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale25);
        extendedMessageFormat26.applyPattern("");
        java.util.Locale locale29 = null;
        extendedMessageFormat26.setLocale(locale29);
        java.util.Locale locale31 = null;
        extendedMessageFormat26.setLocale(locale31);
        java.util.Locale locale33 = null;
        extendedMessageFormat26.setLocale(locale33);
        java.text.Format[] formatArray35 = extendedMessageFormat26.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        extendedMessageFormat6.applyPattern("");
        java.text.Format[] formatArray9 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.lang.String str10 = extendedMessageFormat6.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat6.getFormats();
        java.text.Format[] formatArray12 = extendedMessageFormat6.getFormats();
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = extendedMessageFormat1.format((java.lang.Object[]) formatArray12, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormats();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        java.lang.String str14 = extendedMessageFormat11.toPattern();
        java.util.Locale locale15 = extendedMessageFormat11.getLocale();
        java.util.Locale locale16 = extendedMessageFormat11.getLocale();
        java.util.Locale locale17 = null;
        extendedMessageFormat11.setLocale(locale17);
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        java.lang.String str23 = extendedMessageFormat22.toPattern();
        extendedMessageFormat22.applyPattern("");
        java.util.Locale locale27 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale27);
        extendedMessageFormat28.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray34 = extendedMessageFormat32.parse("hi!");
        java.lang.String str35 = extendedMessageFormat28.format((java.lang.Object) objArray34);
        java.util.Locale locale36 = extendedMessageFormat28.getLocale();
        java.util.Locale locale38 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale38);
        java.util.Locale locale40 = null;
        extendedMessageFormat39.setLocale(locale40);
        java.text.Format[] formatArray42 = extendedMessageFormat39.getFormatsByArgumentIndex();
        extendedMessageFormat39.applyPattern("");
        java.lang.String str45 = extendedMessageFormat39.toPattern();
        java.util.Locale locale47 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale47);
        extendedMessageFormat48.applyPattern("");
        java.text.Format[] formatArray51 = extendedMessageFormat48.getFormats();
        java.lang.String str52 = extendedMessageFormat48.toPattern();
        extendedMessageFormat48.applyPattern("");
        java.lang.String str55 = extendedMessageFormat48.toPattern();
        java.text.Format[] formatArray56 = extendedMessageFormat48.getFormats();
        java.text.Format[] formatArray57 = extendedMessageFormat48.getFormatsByArgumentIndex();
        java.util.Locale locale58 = extendedMessageFormat48.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat61.applyPattern("");
        java.text.Format[] formatArray64 = extendedMessageFormat61.getFormats();
        java.lang.String str65 = extendedMessageFormat61.toPattern();
        java.util.Locale locale66 = extendedMessageFormat61.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat67 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale66);
        extendedMessageFormat48.setLocale(locale66);
        extendedMessageFormat39.setLocale(locale66);
        extendedMessageFormat28.setLocale(locale66);
        extendedMessageFormat22.setLocale(locale66);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat72 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale66);
        extendedMessageFormat11.setLocale(locale66);
        java.util.Locale locale74 = extendedMessageFormat11.getLocale();
        java.lang.StringBuffer stringBuffer75 = null;
        java.text.FieldPosition fieldPosition76 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer77 = extendedMessageFormat2.format((java.lang.Object) locale74, stringBuffer75, fieldPosition76);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertArrayEquals(objArray34, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(locale36);
        org.junit.Assert.assertNotNull(formatArray42);
        org.junit.Assert.assertArrayEquals(formatArray42, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(formatArray51);
        org.junit.Assert.assertArrayEquals(formatArray51, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(formatArray56);
        org.junit.Assert.assertArrayEquals(formatArray56, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray57);
        org.junit.Assert.assertArrayEquals(formatArray57, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale58);
        org.junit.Assert.assertNotNull(formatArray64);
        org.junit.Assert.assertArrayEquals(formatArray64, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "th_TH");
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        java.lang.String str11 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale13 = extendedMessageFormat2.getLocale();
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale13);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        java.lang.String str10 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray12 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale13 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat18.applyPattern("");
        java.text.Format[] formatArray21 = extendedMessageFormat18.getFormats();
        java.lang.String str22 = extendedMessageFormat18.toPattern();
        java.util.Locale locale23 = extendedMessageFormat18.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale23);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale23);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale23);
        extendedMessageFormat3.setLocale(locale23);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale23);
        java.text.Format[] formatArray29 = extendedMessageFormat28.getFormats();
        java.text.ParsePosition parsePosition31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = extendedMessageFormat28.parseObject("", parsePosition31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.text.Format[] formatArray15 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.lang.String str16 = extendedMessageFormat13.toPattern();
        java.text.Format[] formatArray17 = extendedMessageFormat13.getFormats();
        java.lang.String str18 = extendedMessageFormat13.toPattern();
        java.lang.String str19 = extendedMessageFormat13.toPattern();
        extendedMessageFormat13.applyPattern("");
        extendedMessageFormat13.applyPattern("hi!");
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale26);
        extendedMessageFormat27.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray33 = extendedMessageFormat31.parse("hi!");
        java.lang.String str34 = extendedMessageFormat27.format((java.lang.Object) objArray33);
        java.util.Locale locale35 = extendedMessageFormat27.getLocale();
        java.util.Locale locale37 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale37);
        java.util.Locale locale39 = null;
        extendedMessageFormat38.setLocale(locale39);
        java.text.Format[] formatArray41 = extendedMessageFormat38.getFormatsByArgumentIndex();
        extendedMessageFormat38.applyPattern("");
        java.lang.String str44 = extendedMessageFormat38.toPattern();
        java.util.Locale locale46 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale46);
        extendedMessageFormat47.applyPattern("");
        java.text.Format[] formatArray50 = extendedMessageFormat47.getFormats();
        java.lang.String str51 = extendedMessageFormat47.toPattern();
        extendedMessageFormat47.applyPattern("");
        java.lang.String str54 = extendedMessageFormat47.toPattern();
        java.text.Format[] formatArray55 = extendedMessageFormat47.getFormats();
        java.text.Format[] formatArray56 = extendedMessageFormat47.getFormatsByArgumentIndex();
        java.util.Locale locale57 = extendedMessageFormat47.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat60.applyPattern("");
        java.text.Format[] formatArray63 = extendedMessageFormat60.getFormats();
        java.lang.String str64 = extendedMessageFormat60.toPattern();
        java.util.Locale locale65 = extendedMessageFormat60.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat66 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale65);
        extendedMessageFormat47.setLocale(locale65);
        extendedMessageFormat38.setLocale(locale65);
        extendedMessageFormat27.setLocale(locale65);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat70 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale65);
        extendedMessageFormat13.setLocale(locale65);
        java.lang.Object[] objArray73 = extendedMessageFormat13.parse("hi!");
        boolean boolean74 = extendedMessageFormat2.equals((java.lang.Object) objArray73);
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertArrayEquals(objArray33, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(locale35);
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(formatArray50);
        org.junit.Assert.assertArrayEquals(formatArray50, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(formatArray55);
        org.junit.Assert.assertArrayEquals(formatArray55, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray56);
        org.junit.Assert.assertArrayEquals(formatArray56, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale57);
        org.junit.Assert.assertNotNull(formatArray63);
        org.junit.Assert.assertArrayEquals(formatArray63, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertArrayEquals(objArray73, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) objArray8);
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        java.lang.String str11 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale14 = extendedMessageFormat2.getLocale();
        extendedMessageFormat2.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray20 = extendedMessageFormat18.parse("hi!");
        java.util.Locale locale21 = null;
        extendedMessageFormat18.setLocale(locale21);
        java.text.Format[] formatArray23 = extendedMessageFormat18.getFormats();
        java.util.Locale locale24 = extendedMessageFormat18.getLocale();
        extendedMessageFormat18.applyPattern("");
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale28);
        extendedMessageFormat29.applyPattern("");
        java.text.Format[] formatArray32 = extendedMessageFormat29.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator33 = extendedMessageFormat18.formatToCharacterIterator((java.lang.Object) formatArray32);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat37.applyPattern("");
        java.text.Format[] formatArray40 = extendedMessageFormat37.getFormats();
        java.lang.String str41 = extendedMessageFormat37.toPattern();
        java.util.Locale locale42 = extendedMessageFormat37.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        java.text.Format[] formatArray45 = extendedMessageFormat44.getFormatsByArgumentIndex();
        java.lang.String str46 = extendedMessageFormat44.toPattern();
        java.text.Format[] formatArray47 = extendedMessageFormat44.getFormatsByArgumentIndex();
        java.lang.String str48 = extendedMessageFormat18.format((java.lang.Object) formatArray47);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale24);
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator33);
        org.junit.Assert.assertNotNull(formatArray40);
        org.junit.Assert.assertArrayEquals(formatArray40, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray45);
        org.junit.Assert.assertArrayEquals(formatArray45, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale11 = extendedMessageFormat2.getLocale();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        extendedMessageFormat14.applyPattern("");
        extendedMessageFormat14.applyPattern("");
        extendedMessageFormat14.applyPattern("hi!");
        java.lang.String str21 = extendedMessageFormat14.toPattern();
        java.lang.String str22 = extendedMessageFormat14.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat26.applyPattern("");
        java.text.Format[] formatArray29 = extendedMessageFormat26.getFormats();
        java.lang.String str30 = extendedMessageFormat26.toPattern();
        java.util.Locale locale31 = extendedMessageFormat26.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale31);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale31);
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        extendedMessageFormat36.applyPattern("");
        java.text.Format[] formatArray39 = extendedMessageFormat36.getFormats();
        java.lang.String str40 = extendedMessageFormat36.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat43.applyPattern("");
        java.text.Format[] formatArray46 = extendedMessageFormat43.getFormats();
        java.lang.String str47 = extendedMessageFormat43.toPattern();
        java.util.Locale locale48 = extendedMessageFormat43.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale48);
        extendedMessageFormat36.setLocale(locale48);
        extendedMessageFormat33.setLocale(locale48);
        extendedMessageFormat14.setLocale(locale48);
        java.lang.String str53 = extendedMessageFormat14.toPattern();
        extendedMessageFormat14.applyPattern("hi!");
        java.text.Format[] formatArray56 = extendedMessageFormat14.getFormats();
        extendedMessageFormat14.applyPattern("");
        java.util.Locale locale60 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale60);
        extendedMessageFormat61.applyPattern("");
        java.text.Format[] formatArray64 = extendedMessageFormat61.getFormats();
        java.text.Format[] formatArray65 = extendedMessageFormat61.getFormats();
        extendedMessageFormat61.applyPattern("hi!");
        java.util.Locale locale72 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat73 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale72);
        extendedMessageFormat73.applyPattern("");
        java.text.Format[] formatArray76 = extendedMessageFormat73.getFormats();
        java.lang.String str77 = extendedMessageFormat73.toPattern();
        extendedMessageFormat73.applyPattern("");
        java.lang.String str80 = extendedMessageFormat73.toPattern();
        java.text.Format[] formatArray81 = extendedMessageFormat73.getFormats();
        java.text.Format[] formatArray82 = extendedMessageFormat73.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat84 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat84.applyPattern("");
        java.text.Format[] formatArray87 = extendedMessageFormat84.getFormats();
        java.lang.String str88 = extendedMessageFormat84.toPattern();
        java.util.Locale locale89 = extendedMessageFormat84.getLocale();
        extendedMessageFormat73.setLocale(locale89);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat91 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale89);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat92 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale89);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat93 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale89);
        extendedMessageFormat61.setLocale(locale89);
        extendedMessageFormat14.setLocale(locale89);
        extendedMessageFormat2.setLocale(locale89);
        java.text.Format[] formatArray97 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray98 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(formatArray46);
        org.junit.Assert.assertArrayEquals(formatArray46, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(formatArray56);
        org.junit.Assert.assertArrayEquals(formatArray56, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray64);
        org.junit.Assert.assertArrayEquals(formatArray64, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray65);
        org.junit.Assert.assertArrayEquals(formatArray65, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray76);
        org.junit.Assert.assertArrayEquals(formatArray76, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(formatArray81);
        org.junit.Assert.assertArrayEquals(formatArray81, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray82);
        org.junit.Assert.assertArrayEquals(formatArray82, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray87);
        org.junit.Assert.assertArrayEquals(formatArray87, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray97);
        org.junit.Assert.assertArrayEquals(formatArray97, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray98);
        org.junit.Assert.assertArrayEquals(formatArray98, new java.text.Format[] {});
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        extendedMessageFormat4.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormats();
        java.lang.String str8 = extendedMessageFormat4.toPattern();
        java.util.Locale locale9 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        extendedMessageFormat4.setLocale(locale12);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        java.text.ParsePosition parsePosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray18 = extendedMessageFormat15.parse("", parsePosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        java.text.Format[] formatArray14 = extendedMessageFormat10.getFormats();
        java.lang.String str15 = extendedMessageFormat7.format((java.lang.Object) formatArray14);
        extendedMessageFormat7.applyPattern("");
        java.lang.String str18 = extendedMessageFormat7.toPattern();
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale20);
        extendedMessageFormat21.applyPattern("");
        java.util.Locale locale24 = extendedMessageFormat21.getLocale();
        java.lang.String str25 = extendedMessageFormat21.toPattern();
        java.lang.String str26 = extendedMessageFormat21.toPattern();
        java.text.Format[] formatArray27 = extendedMessageFormat21.getFormats();
        java.lang.String str28 = extendedMessageFormat7.format((java.lang.Object) formatArray27);
        java.util.Locale locale31 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale31);
        java.util.Locale locale33 = null;
        extendedMessageFormat32.setLocale(locale33);
        java.text.Format[] formatArray35 = extendedMessageFormat32.getFormatsByArgumentIndex();
        extendedMessageFormat32.applyPattern("");
        java.lang.String str38 = extendedMessageFormat32.toPattern();
        java.util.Locale locale40 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale40);
        extendedMessageFormat41.applyPattern("");
        java.text.Format[] formatArray44 = extendedMessageFormat41.getFormats();
        java.lang.String str45 = extendedMessageFormat41.toPattern();
        extendedMessageFormat41.applyPattern("");
        java.lang.String str48 = extendedMessageFormat41.toPattern();
        java.text.Format[] formatArray49 = extendedMessageFormat41.getFormats();
        java.text.Format[] formatArray50 = extendedMessageFormat41.getFormatsByArgumentIndex();
        java.util.Locale locale51 = extendedMessageFormat41.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat54 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat54.applyPattern("");
        java.text.Format[] formatArray57 = extendedMessageFormat54.getFormats();
        java.lang.String str58 = extendedMessageFormat54.toPattern();
        java.util.Locale locale59 = extendedMessageFormat54.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale59);
        extendedMessageFormat41.setLocale(locale59);
        extendedMessageFormat32.setLocale(locale59);
        java.util.Locale locale63 = extendedMessageFormat32.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat64 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale63);
        extendedMessageFormat7.setLocale(locale63);
        java.lang.String str66 = extendedMessageFormat7.toPattern();
        java.util.Locale locale67 = extendedMessageFormat7.getLocale();
        java.lang.StringBuffer stringBuffer68 = null;
        java.text.FieldPosition fieldPosition69 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer70 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat7, stringBuffer68, fieldPosition69);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(locale24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(formatArray44);
        org.junit.Assert.assertArrayEquals(formatArray44, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray50);
        org.junit.Assert.assertArrayEquals(formatArray50, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale51);
        org.junit.Assert.assertNotNull(formatArray57);
        org.junit.Assert.assertArrayEquals(formatArray57, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "th_TH");
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormatsByArgumentIndex();
        extendedMessageFormat4.applyPattern("hi!");
        java.text.Format[] formatArray10 = extendedMessageFormat4.getFormats();
        java.lang.String str11 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray10);
        java.lang.String str12 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray10);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray12 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray13 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray14 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray7 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
        java.lang.Object[] objArray11 = extendedMessageFormat2.parse("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = null;
        extendedMessageFormat2.setLocale(locale6);
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        extendedMessageFormat13.applyPattern("");
        java.util.Locale locale16 = null;
        extendedMessageFormat13.setLocale(locale16);
        java.text.Format[] formatArray18 = extendedMessageFormat13.getFormats();
        java.lang.String str19 = extendedMessageFormat13.toPattern();
        java.text.Format[] formatArray20 = extendedMessageFormat13.getFormats();
        java.lang.String str21 = extendedMessageFormat2.format((java.lang.Object) formatArray20);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormats();
        java.lang.Object[] objArray13 = extendedMessageFormat2.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray15 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] {});
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        java.lang.String str10 = extendedMessageFormat2.format((java.lang.Object) formatArray9);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str13 = extendedMessageFormat2.toPattern();
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat16.applyPattern("");
        java.util.Locale locale19 = extendedMessageFormat16.getLocale();
        java.lang.String str20 = extendedMessageFormat16.toPattern();
        java.lang.String str21 = extendedMessageFormat16.toPattern();
        java.text.Format[] formatArray22 = extendedMessageFormat16.getFormats();
        java.lang.String str23 = extendedMessageFormat2.format((java.lang.Object) formatArray22);
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale26);
        java.util.Locale locale28 = null;
        extendedMessageFormat27.setLocale(locale28);
        java.text.Format[] formatArray30 = extendedMessageFormat27.getFormatsByArgumentIndex();
        extendedMessageFormat27.applyPattern("");
        java.lang.String str33 = extendedMessageFormat27.toPattern();
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        extendedMessageFormat36.applyPattern("");
        java.text.Format[] formatArray39 = extendedMessageFormat36.getFormats();
        java.lang.String str40 = extendedMessageFormat36.toPattern();
        extendedMessageFormat36.applyPattern("");
        java.lang.String str43 = extendedMessageFormat36.toPattern();
        java.text.Format[] formatArray44 = extendedMessageFormat36.getFormats();
        java.text.Format[] formatArray45 = extendedMessageFormat36.getFormatsByArgumentIndex();
        java.util.Locale locale46 = extendedMessageFormat36.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat49.applyPattern("");
        java.text.Format[] formatArray52 = extendedMessageFormat49.getFormats();
        java.lang.String str53 = extendedMessageFormat49.toPattern();
        java.util.Locale locale54 = extendedMessageFormat49.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale54);
        extendedMessageFormat36.setLocale(locale54);
        extendedMessageFormat27.setLocale(locale54);
        java.util.Locale locale58 = extendedMessageFormat27.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat59 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale58);
        extendedMessageFormat2.setLocale(locale58);
        java.lang.String str61 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale64 = extendedMessageFormat2.getLocale();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str67 = extendedMessageFormat2.toPattern();
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(formatArray44);
        org.junit.Assert.assertArrayEquals(formatArray44, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray45);
        org.junit.Assert.assertArrayEquals(formatArray45, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale46);
        org.junit.Assert.assertNotNull(formatArray52);
        org.junit.Assert.assertArrayEquals(formatArray52, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.lang.String str11 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray15 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray16 = extendedMessageFormat2.getFormats();
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        extendedMessageFormat19.applyPattern("");
        java.text.Format[] formatArray22 = extendedMessageFormat19.getFormatsByArgumentIndex();
        extendedMessageFormat19.applyPattern("");
        java.text.Format[] formatArray25 = extendedMessageFormat19.getFormatsByArgumentIndex();
        extendedMessageFormat19.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray31 = extendedMessageFormat29.parse("hi!");
        java.util.Locale locale32 = null;
        extendedMessageFormat29.setLocale(locale32);
        java.text.Format[] formatArray34 = extendedMessageFormat29.getFormats();
        java.lang.Object[] objArray36 = extendedMessageFormat29.parse("hi!");
        java.text.Format[] formatArray37 = extendedMessageFormat29.getFormats();
        java.lang.String str38 = extendedMessageFormat19.format((java.lang.Object) formatArray37);
        java.util.Locale locale40 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale40);
        java.lang.String str42 = extendedMessageFormat41.toPattern();
        java.text.Format[] formatArray43 = extendedMessageFormat41.getFormatsByArgumentIndex();
        java.text.Format[] formatArray44 = extendedMessageFormat41.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator45 = extendedMessageFormat19.formatToCharacterIterator((java.lang.Object) formatArray44);
        java.lang.String str46 = extendedMessageFormat19.toPattern();
        java.text.Format[] formatArray47 = extendedMessageFormat19.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertArrayEquals(objArray31, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertArrayEquals(objArray36, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(formatArray43);
        org.junit.Assert.assertArrayEquals(formatArray43, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray44);
        org.junit.Assert.assertArrayEquals(formatArray44, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        java.lang.String str11 = extendedMessageFormat2.toPattern();
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        extendedMessageFormat15.applyPattern("");
        java.util.Locale locale18 = extendedMessageFormat15.getLocale();
        java.text.Format[] formatArray19 = extendedMessageFormat15.getFormats();
        java.text.Format[] formatArray20 = extendedMessageFormat15.getFormats();
        java.text.Format[] formatArray21 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.text.Format[] formatArray22 = extendedMessageFormat15.getFormats();
        java.lang.String str23 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray22);
        java.lang.StringBuffer stringBuffer24 = null;
        java.text.FieldPosition fieldPosition25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer26 = extendedMessageFormat2.format((java.lang.Object) "hi!", stringBuffer24, fieldPosition25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        java.lang.String str10 = extendedMessageFormat2.format((java.lang.Object) formatArray9);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray16 = extendedMessageFormat2.parse("", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat16.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray22 = extendedMessageFormat20.parse("hi!");
        java.lang.String str23 = extendedMessageFormat16.format((java.lang.Object) objArray22);
        java.util.Locale locale24 = extendedMessageFormat16.getLocale();
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale26);
        java.util.Locale locale28 = null;
        extendedMessageFormat27.setLocale(locale28);
        java.text.Format[] formatArray30 = extendedMessageFormat27.getFormatsByArgumentIndex();
        extendedMessageFormat27.applyPattern("");
        java.lang.String str33 = extendedMessageFormat27.toPattern();
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        extendedMessageFormat36.applyPattern("");
        java.text.Format[] formatArray39 = extendedMessageFormat36.getFormats();
        java.lang.String str40 = extendedMessageFormat36.toPattern();
        extendedMessageFormat36.applyPattern("");
        java.lang.String str43 = extendedMessageFormat36.toPattern();
        java.text.Format[] formatArray44 = extendedMessageFormat36.getFormats();
        java.text.Format[] formatArray45 = extendedMessageFormat36.getFormatsByArgumentIndex();
        java.util.Locale locale46 = extendedMessageFormat36.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat49.applyPattern("");
        java.text.Format[] formatArray52 = extendedMessageFormat49.getFormats();
        java.lang.String str53 = extendedMessageFormat49.toPattern();
        java.util.Locale locale54 = extendedMessageFormat49.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale54);
        extendedMessageFormat36.setLocale(locale54);
        extendedMessageFormat27.setLocale(locale54);
        extendedMessageFormat16.setLocale(locale54);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat59 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale54);
        extendedMessageFormat2.setLocale(locale54);
        java.text.Format[] formatArray61 = extendedMessageFormat2.getFormats();
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(locale24);
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(formatArray44);
        org.junit.Assert.assertArrayEquals(formatArray44, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray45);
        org.junit.Assert.assertArrayEquals(formatArray45, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale46);
        org.junit.Assert.assertNotNull(formatArray52);
        org.junit.Assert.assertArrayEquals(formatArray52, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray61);
        org.junit.Assert.assertArrayEquals(formatArray61, new java.text.Format[] {});
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormats();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Locale locale13 = null;
        extendedMessageFormat11.setLocale(locale13);
        java.util.Locale locale15 = extendedMessageFormat11.getLocale();
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale17);
        extendedMessageFormat18.applyPattern("");
        extendedMessageFormat18.applyPattern("");
        extendedMessageFormat18.applyPattern("hi!");
        java.lang.String str25 = extendedMessageFormat18.toPattern();
        java.lang.String str26 = extendedMessageFormat18.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat30.applyPattern("");
        java.text.Format[] formatArray33 = extendedMessageFormat30.getFormats();
        java.lang.String str34 = extendedMessageFormat30.toPattern();
        java.util.Locale locale35 = extendedMessageFormat30.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale35);
        java.util.Locale locale39 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale39);
        extendedMessageFormat40.applyPattern("");
        java.text.Format[] formatArray43 = extendedMessageFormat40.getFormats();
        java.lang.String str44 = extendedMessageFormat40.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat47.applyPattern("");
        java.text.Format[] formatArray50 = extendedMessageFormat47.getFormats();
        java.lang.String str51 = extendedMessageFormat47.toPattern();
        java.util.Locale locale52 = extendedMessageFormat47.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat53 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale52);
        extendedMessageFormat40.setLocale(locale52);
        extendedMessageFormat37.setLocale(locale52);
        extendedMessageFormat18.setLocale(locale52);
        extendedMessageFormat11.setLocale(locale52);
        extendedMessageFormat3.setLocale(locale52);
        java.util.Locale locale59 = extendedMessageFormat3.getLocale();
        java.util.Locale locale61 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat62 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale61);
        java.util.Locale locale64 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat65 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale64);
        extendedMessageFormat65.applyPattern("");
        java.util.Locale locale68 = extendedMessageFormat65.getLocale();
        java.text.Format[] formatArray69 = extendedMessageFormat65.getFormats();
        java.lang.String str70 = extendedMessageFormat62.format((java.lang.Object) formatArray69);
        extendedMessageFormat62.applyPattern("");
        java.lang.String str73 = extendedMessageFormat62.toPattern();
        java.lang.String str74 = extendedMessageFormat62.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat78 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat81 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat81.applyPattern("");
        java.text.Format[] formatArray84 = extendedMessageFormat81.getFormats();
        java.lang.String str85 = extendedMessageFormat81.toPattern();
        java.util.Locale locale86 = extendedMessageFormat81.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat87 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale86);
        extendedMessageFormat78.setLocale(locale86);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat89 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale86);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat90 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale86);
        extendedMessageFormat62.setLocale(locale86);
        extendedMessageFormat3.setLocale(locale86);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat93 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale86);
        java.util.Locale locale94 = extendedMessageFormat93.getLocale();
        java.text.ParsePosition parsePosition96 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray97 = extendedMessageFormat93.parse("hi!", parsePosition96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray43);
        org.junit.Assert.assertArrayEquals(formatArray43, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(formatArray50);
        org.junit.Assert.assertArrayEquals(formatArray50, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "th_TH");
        org.junit.Assert.assertNull(locale68);
        org.junit.Assert.assertNotNull(formatArray69);
        org.junit.Assert.assertArrayEquals(formatArray69, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(formatArray84);
        org.junit.Assert.assertArrayEquals(formatArray84, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale94);
        org.junit.Assert.assertEquals(locale94.toString(), "th_TH");
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str11 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        java.lang.String str10 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray12 = extendedMessageFormat3.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        java.lang.String str18 = extendedMessageFormat14.toPattern();
        java.util.Locale locale19 = extendedMessageFormat14.getLocale();
        extendedMessageFormat3.setLocale(locale19);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale19);
        extendedMessageFormat21.applyPattern("");
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale25);
        java.util.Locale locale27 = extendedMessageFormat26.getLocale();
        extendedMessageFormat26.applyPattern("hi!");
        java.util.Locale locale31 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale31);
        extendedMessageFormat32.applyPattern("");
        java.text.Format[] formatArray35 = extendedMessageFormat32.getFormats();
        java.text.Format[] formatArray36 = extendedMessageFormat32.getFormats();
        java.util.Locale locale37 = null;
        extendedMessageFormat32.setLocale(locale37);
        extendedMessageFormat32.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat44.applyPattern("");
        java.text.Format[] formatArray47 = extendedMessageFormat44.getFormats();
        java.lang.String str48 = extendedMessageFormat44.toPattern();
        java.util.Locale locale49 = extendedMessageFormat44.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale49);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat51 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale49);
        java.util.Locale locale53 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat54 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale53);
        extendedMessageFormat54.applyPattern("");
        java.text.Format[] formatArray57 = extendedMessageFormat54.getFormats();
        java.lang.String str58 = extendedMessageFormat54.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat61.applyPattern("");
        java.text.Format[] formatArray64 = extendedMessageFormat61.getFormats();
        java.lang.String str65 = extendedMessageFormat61.toPattern();
        java.util.Locale locale66 = extendedMessageFormat61.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat67 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale66);
        extendedMessageFormat54.setLocale(locale66);
        extendedMessageFormat51.setLocale(locale66);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat73 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat73.applyPattern("");
        java.text.Format[] formatArray76 = extendedMessageFormat73.getFormats();
        java.lang.String str77 = extendedMessageFormat73.toPattern();
        java.util.Locale locale78 = extendedMessageFormat73.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat79 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale78);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat80 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale78);
        extendedMessageFormat51.setLocale(locale78);
        extendedMessageFormat32.setLocale(locale78);
        extendedMessageFormat26.setLocale(locale78);
        extendedMessageFormat21.setLocale(locale78);
        java.text.ParsePosition parsePosition86 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray87 = extendedMessageFormat21.parse("hi!", parsePosition86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray57);
        org.junit.Assert.assertArrayEquals(formatArray57, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(formatArray64);
        org.junit.Assert.assertArrayEquals(formatArray64, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray76);
        org.junit.Assert.assertArrayEquals(formatArray76, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "th_TH");
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.util.Locale locale7 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat12.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator16 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) formatArray15);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat20.applyPattern("");
        java.text.Format[] formatArray23 = extendedMessageFormat20.getFormats();
        java.lang.String str24 = extendedMessageFormat20.toPattern();
        java.util.Locale locale25 = extendedMessageFormat20.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale25);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale25);
        java.text.Format[] formatArray28 = extendedMessageFormat27.getFormatsByArgumentIndex();
        java.lang.String str29 = extendedMessageFormat27.toPattern();
        java.text.Format[] formatArray30 = extendedMessageFormat27.getFormatsByArgumentIndex();
        java.lang.String str31 = extendedMessageFormat1.format((java.lang.Object) formatArray30);
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale34 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray35 = extendedMessageFormat1.getFormats();
        java.lang.String str36 = extendedMessageFormat1.toPattern();
        java.text.ParsePosition parsePosition38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray39 = extendedMessageFormat1.parse("hi!", parsePosition38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator16);
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(locale34);
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.util.Locale locale5 = null;
        extendedMessageFormat1.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat11.applyPattern("");
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale14);
        extendedMessageFormat1.setLocale(locale14);
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        extendedMessageFormat22.applyPattern("");
        extendedMessageFormat22.applyPattern("");
        java.text.Format[] formatArray27 = extendedMessageFormat22.getFormatsByArgumentIndex();
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        extendedMessageFormat30.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray36 = extendedMessageFormat34.parse("hi!");
        java.lang.String str37 = extendedMessageFormat30.format((java.lang.Object) objArray36);
        java.text.Format[] formatArray38 = extendedMessageFormat30.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat42.applyPattern("");
        java.text.Format[] formatArray45 = extendedMessageFormat42.getFormats();
        java.lang.String str46 = extendedMessageFormat42.toPattern();
        java.util.Locale locale47 = extendedMessageFormat42.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale47);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale47);
        extendedMessageFormat30.setLocale(locale47);
        extendedMessageFormat22.setLocale(locale47);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat53 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat53.applyPattern("");
        java.text.Format[] formatArray56 = extendedMessageFormat53.getFormats();
        java.lang.String str57 = extendedMessageFormat53.toPattern();
        java.util.Locale locale58 = extendedMessageFormat53.getLocale();
        extendedMessageFormat22.setLocale(locale58);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale58);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale58);
        extendedMessageFormat61.applyPattern("hi!");
        boolean boolean64 = extendedMessageFormat1.equals((java.lang.Object) extendedMessageFormat61);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertArrayEquals(objArray36, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray45);
        org.junit.Assert.assertArrayEquals(formatArray45, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray56);
        org.junit.Assert.assertArrayEquals(formatArray56, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        extendedMessageFormat12.applyPattern("hi!");
        java.lang.Object[] objArray17 = extendedMessageFormat12.parse("hi!");
        java.text.Format[] formatArray18 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.lang.String str19 = extendedMessageFormat12.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (byte) 100, (java.text.Format) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = extendedMessageFormat2.parseObject("hi!", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat12.getFormatsByArgumentIndex();
        extendedMessageFormat12.applyPattern("");
        java.text.Format[] formatArray18 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.text.Format[] formatArray19 = extendedMessageFormat12.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat23.applyPattern("");
        java.text.Format[] formatArray26 = extendedMessageFormat23.getFormats();
        java.lang.String str27 = extendedMessageFormat23.toPattern();
        java.util.Locale locale28 = extendedMessageFormat23.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale28);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale28);
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale32);
        extendedMessageFormat33.applyPattern("");
        java.text.Format[] formatArray36 = extendedMessageFormat33.getFormats();
        java.lang.String str37 = extendedMessageFormat33.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat40.applyPattern("");
        java.text.Format[] formatArray43 = extendedMessageFormat40.getFormats();
        java.lang.String str44 = extendedMessageFormat40.toPattern();
        java.util.Locale locale45 = extendedMessageFormat40.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale45);
        extendedMessageFormat33.setLocale(locale45);
        extendedMessageFormat30.setLocale(locale45);
        extendedMessageFormat12.setLocale(locale45);
        java.text.Format[] formatArray50 = extendedMessageFormat12.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator51 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) formatArray50);
        java.lang.String str52 = extendedMessageFormat2.toPattern();
        java.util.Locale locale54 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale54);
        java.util.Locale locale56 = extendedMessageFormat55.getLocale();
        java.lang.String str57 = extendedMessageFormat55.toPattern();
        java.lang.String str58 = extendedMessageFormat55.toPattern();
        java.util.Locale locale60 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale60);
        java.util.Locale locale62 = extendedMessageFormat61.getLocale();
        java.text.Format[] formatArray63 = extendedMessageFormat61.getFormatsByArgumentIndex();
        java.text.Format[] formatArray64 = extendedMessageFormat61.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator65 = extendedMessageFormat55.formatToCharacterIterator((java.lang.Object) formatArray64);
        java.lang.String str66 = extendedMessageFormat2.format((java.lang.Object) formatArray64);
        java.lang.String str67 = extendedMessageFormat2.toPattern();
        java.lang.String str68 = extendedMessageFormat2.toPattern();
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(formatArray43);
        org.junit.Assert.assertArrayEquals(formatArray43, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray50);
        org.junit.Assert.assertArrayEquals(formatArray50, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(locale56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNull(locale62);
        org.junit.Assert.assertNotNull(formatArray63);
        org.junit.Assert.assertArrayEquals(formatArray63, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray64);
        org.junit.Assert.assertArrayEquals(formatArray64, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = null;
        extendedMessageFormat10.setLocale(locale13);
        java.text.Format[] formatArray15 = extendedMessageFormat10.getFormats();
        java.lang.String str16 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray17 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.lang.String str18 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray17);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        extendedMessageFormat14.applyPattern("");
        java.util.Locale locale17 = null;
        extendedMessageFormat14.setLocale(locale17);
        java.util.Locale locale19 = null;
        extendedMessageFormat14.setLocale(locale19);
        extendedMessageFormat14.applyPattern("hi!");
        java.text.Format[] formatArray23 = extendedMessageFormat14.getFormats();
        java.text.Format[] formatArray24 = extendedMessageFormat14.getFormats();
        java.text.Format[] formatArray25 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.lang.String str26 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray25);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormats();
        java.lang.String str9 = extendedMessageFormat5.toPattern();
        extendedMessageFormat5.applyPattern("");
        java.lang.String str12 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat5.getFormats();
        java.text.Format[] formatArray14 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.util.Locale locale15 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat20.applyPattern("");
        java.text.Format[] formatArray23 = extendedMessageFormat20.getFormats();
        java.lang.String str24 = extendedMessageFormat20.toPattern();
        java.util.Locale locale25 = extendedMessageFormat20.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale25);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale25);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale25);
        extendedMessageFormat5.setLocale(locale25);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale25);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale25);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale25);
        java.text.Format[] formatArray33 = extendedMessageFormat32.getFormats();
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        java.lang.String str10 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray12 = extendedMessageFormat3.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        java.lang.String str18 = extendedMessageFormat14.toPattern();
        java.util.Locale locale19 = extendedMessageFormat14.getLocale();
        extendedMessageFormat3.setLocale(locale19);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale19);
        java.lang.String str22 = extendedMessageFormat21.toPattern();
        extendedMessageFormat21.applyPattern("hi!");
        java.lang.String str25 = extendedMessageFormat21.toPattern();
        extendedMessageFormat21.applyPattern("hi!");
        java.lang.String str28 = extendedMessageFormat21.toPattern();
        java.lang.String str29 = extendedMessageFormat21.toPattern();
        java.text.Format[] formatArray30 = extendedMessageFormat21.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray34 = extendedMessageFormat32.parse("hi!");
        java.util.Locale locale35 = null;
        extendedMessageFormat32.setLocale(locale35);
        java.text.Format[] formatArray37 = extendedMessageFormat32.getFormats();
        java.lang.Object[] objArray39 = extendedMessageFormat32.parse("hi!");
        java.util.Locale locale40 = extendedMessageFormat32.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat44.applyPattern("");
        java.util.Locale locale47 = extendedMessageFormat44.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale47);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale47);
        java.util.Locale locale50 = extendedMessageFormat49.getLocale();
        extendedMessageFormat32.setLocale(locale50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = extendedMessageFormat21.format((java.lang.Object) locale50);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertArrayEquals(objArray34, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertArrayEquals(objArray39, new java.lang.Object[] {});
        org.junit.Assert.assertNull(locale40);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "th_TH");
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        java.lang.String str10 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray12 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        extendedMessageFormat15.applyPattern("");
        extendedMessageFormat15.applyPattern("");
        extendedMessageFormat15.applyPattern("hi!");
        java.lang.String str22 = extendedMessageFormat15.toPattern();
        java.lang.String str23 = extendedMessageFormat15.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat27.applyPattern("");
        java.text.Format[] formatArray30 = extendedMessageFormat27.getFormats();
        java.lang.String str31 = extendedMessageFormat27.toPattern();
        java.util.Locale locale32 = extendedMessageFormat27.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale32);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale32);
        java.util.Locale locale36 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale36);
        extendedMessageFormat37.applyPattern("");
        java.text.Format[] formatArray40 = extendedMessageFormat37.getFormats();
        java.lang.String str41 = extendedMessageFormat37.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat44.applyPattern("");
        java.text.Format[] formatArray47 = extendedMessageFormat44.getFormats();
        java.lang.String str48 = extendedMessageFormat44.toPattern();
        java.util.Locale locale49 = extendedMessageFormat44.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale49);
        extendedMessageFormat37.setLocale(locale49);
        extendedMessageFormat34.setLocale(locale49);
        extendedMessageFormat15.setLocale(locale49);
        extendedMessageFormat3.setLocale(locale49);
        java.util.Locale locale55 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat56 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale55);
        java.text.Format[] formatArray57 = extendedMessageFormat56.getFormats();
        extendedMessageFormat56.applyPattern("hi!");
        java.util.Locale locale60 = extendedMessageFormat56.getLocale();
        java.util.Locale locale61 = extendedMessageFormat56.getLocale();
        java.text.Format[] formatArray62 = extendedMessageFormat56.getFormatsByArgumentIndex();
        java.util.Locale locale64 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat65 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale64);
        extendedMessageFormat65.applyPattern("");
        java.util.Locale locale68 = extendedMessageFormat65.getLocale();
        java.lang.String str69 = extendedMessageFormat65.toPattern();
        java.util.Locale locale70 = extendedMessageFormat65.getLocale();
        java.text.Format[] formatArray71 = extendedMessageFormat65.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat56.setFormatsByArgumentIndex(formatArray71);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray40);
        org.junit.Assert.assertArrayEquals(formatArray40, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray57);
        org.junit.Assert.assertArrayEquals(formatArray57, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray62);
        org.junit.Assert.assertArrayEquals(formatArray62, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNull(locale70);
        org.junit.Assert.assertNotNull(formatArray71);
        org.junit.Assert.assertArrayEquals(formatArray71, new java.text.Format[] {});
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) objArray8);
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        java.util.Locale locale14 = null;
        extendedMessageFormat13.setLocale(locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormatsByArgumentIndex();
        extendedMessageFormat13.applyPattern("");
        java.lang.String str19 = extendedMessageFormat13.toPattern();
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        extendedMessageFormat22.applyPattern("");
        java.text.Format[] formatArray25 = extendedMessageFormat22.getFormats();
        java.lang.String str26 = extendedMessageFormat22.toPattern();
        extendedMessageFormat22.applyPattern("");
        java.lang.String str29 = extendedMessageFormat22.toPattern();
        java.text.Format[] formatArray30 = extendedMessageFormat22.getFormats();
        java.text.Format[] formatArray31 = extendedMessageFormat22.getFormatsByArgumentIndex();
        java.util.Locale locale32 = extendedMessageFormat22.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat35.applyPattern("");
        java.text.Format[] formatArray38 = extendedMessageFormat35.getFormats();
        java.lang.String str39 = extendedMessageFormat35.toPattern();
        java.util.Locale locale40 = extendedMessageFormat35.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale40);
        extendedMessageFormat22.setLocale(locale40);
        extendedMessageFormat13.setLocale(locale40);
        extendedMessageFormat2.setLocale(locale40);
        java.util.Locale locale46 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale46);
        extendedMessageFormat47.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat51 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray53 = extendedMessageFormat51.parse("hi!");
        java.lang.String str54 = extendedMessageFormat47.format((java.lang.Object) objArray53);
        java.text.Format[] formatArray55 = extendedMessageFormat47.getFormatsByArgumentIndex();
        java.util.Locale locale56 = extendedMessageFormat47.getLocale();
        java.text.Format[] formatArray57 = extendedMessageFormat47.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer58 = null;
        java.text.FieldPosition fieldPosition59 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer60 = extendedMessageFormat2.format((java.lang.Object[]) formatArray57, stringBuffer58, fieldPosition59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale32);
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertArrayEquals(objArray53, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(formatArray55);
        org.junit.Assert.assertArrayEquals(formatArray55, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale56);
        org.junit.Assert.assertNotNull(formatArray57);
        org.junit.Assert.assertArrayEquals(formatArray57, new java.text.Format[] {});
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        extendedMessageFormat4.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        java.lang.String str8 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat4.getFormats();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.util.Locale locale14 = null;
        extendedMessageFormat12.setLocale(locale14);
        java.util.Locale locale16 = extendedMessageFormat12.getLocale();
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        extendedMessageFormat19.applyPattern("");
        extendedMessageFormat19.applyPattern("");
        extendedMessageFormat19.applyPattern("hi!");
        java.lang.String str26 = extendedMessageFormat19.toPattern();
        java.lang.String str27 = extendedMessageFormat19.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat31.applyPattern("");
        java.text.Format[] formatArray34 = extendedMessageFormat31.getFormats();
        java.lang.String str35 = extendedMessageFormat31.toPattern();
        java.util.Locale locale36 = extendedMessageFormat31.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale36);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale36);
        java.util.Locale locale40 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale40);
        extendedMessageFormat41.applyPattern("");
        java.text.Format[] formatArray44 = extendedMessageFormat41.getFormats();
        java.lang.String str45 = extendedMessageFormat41.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat48.applyPattern("");
        java.text.Format[] formatArray51 = extendedMessageFormat48.getFormats();
        java.lang.String str52 = extendedMessageFormat48.toPattern();
        java.util.Locale locale53 = extendedMessageFormat48.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat54 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale53);
        extendedMessageFormat41.setLocale(locale53);
        extendedMessageFormat38.setLocale(locale53);
        extendedMessageFormat19.setLocale(locale53);
        extendedMessageFormat12.setLocale(locale53);
        extendedMessageFormat4.setLocale(locale53);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale53);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale53);
        java.util.Locale locale63 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat64 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale63);
        java.util.Locale locale65 = null;
        extendedMessageFormat64.setLocale(locale65);
        java.text.Format[] formatArray67 = extendedMessageFormat64.getFormatsByArgumentIndex();
        java.text.Format[] formatArray68 = extendedMessageFormat64.getFormatsByArgumentIndex();
        boolean boolean69 = extendedMessageFormat61.equals((java.lang.Object) extendedMessageFormat64);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray44);
        org.junit.Assert.assertArrayEquals(formatArray44, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(formatArray51);
        org.junit.Assert.assertArrayEquals(formatArray51, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray67);
        org.junit.Assert.assertArrayEquals(formatArray67, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray68);
        org.junit.Assert.assertArrayEquals(formatArray68, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        extendedMessageFormat7.applyPattern("");
        java.text.Format[] formatArray10 = extendedMessageFormat7.getFormatsByArgumentIndex();
        extendedMessageFormat7.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat7.getFormatsByArgumentIndex();
        extendedMessageFormat7.applyPattern("hi!");
        java.lang.Object[] objArray17 = extendedMessageFormat7.parse("hi!");
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale19);
        extendedMessageFormat20.applyPattern("");
        java.text.Format[] formatArray23 = extendedMessageFormat20.getFormats();
        java.lang.String str24 = extendedMessageFormat20.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat27.applyPattern("");
        java.text.Format[] formatArray30 = extendedMessageFormat27.getFormats();
        java.lang.String str31 = extendedMessageFormat27.toPattern();
        java.util.Locale locale32 = extendedMessageFormat27.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale32);
        extendedMessageFormat20.setLocale(locale32);
        extendedMessageFormat7.setLocale(locale32);
        extendedMessageFormat2.setLocale(locale32);
        java.util.Locale locale38 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale38);
        extendedMessageFormat39.applyPattern("");
        java.lang.String str42 = extendedMessageFormat39.toPattern();
        java.util.Locale locale43 = extendedMessageFormat39.getLocale();
        java.util.Locale locale44 = extendedMessageFormat39.getLocale();
        java.lang.String str45 = extendedMessageFormat39.toPattern();
        java.util.Locale locale49 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale49);
        extendedMessageFormat50.applyPattern("");
        java.text.Format[] formatArray53 = extendedMessageFormat50.getFormatsByArgumentIndex();
        extendedMessageFormat50.applyPattern("");
        java.text.Format[] formatArray56 = extendedMessageFormat50.getFormatsByArgumentIndex();
        java.text.Format[] formatArray57 = extendedMessageFormat50.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat61.applyPattern("");
        java.text.Format[] formatArray64 = extendedMessageFormat61.getFormats();
        java.lang.String str65 = extendedMessageFormat61.toPattern();
        java.util.Locale locale66 = extendedMessageFormat61.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat67 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale66);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat68 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale66);
        java.util.Locale locale70 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat71 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale70);
        extendedMessageFormat71.applyPattern("");
        java.text.Format[] formatArray74 = extendedMessageFormat71.getFormats();
        java.lang.String str75 = extendedMessageFormat71.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat78 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat78.applyPattern("");
        java.text.Format[] formatArray81 = extendedMessageFormat78.getFormats();
        java.lang.String str82 = extendedMessageFormat78.toPattern();
        java.util.Locale locale83 = extendedMessageFormat78.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat84 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale83);
        extendedMessageFormat71.setLocale(locale83);
        extendedMessageFormat68.setLocale(locale83);
        extendedMessageFormat50.setLocale(locale83);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat88 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale83);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat89 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale83);
        extendedMessageFormat39.setLocale(locale83);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat92 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat92.applyPattern("");
        java.text.Format[] formatArray95 = extendedMessageFormat92.getFormats();
        java.util.Locale locale96 = null;
        extendedMessageFormat92.setLocale(locale96);
        java.lang.String str98 = extendedMessageFormat39.format((java.lang.Object) locale96);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator99 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) locale96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatToCharacterIterator must be passed non-null object");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(locale43);
        org.junit.Assert.assertNull(locale44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(formatArray53);
        org.junit.Assert.assertArrayEquals(formatArray53, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray56);
        org.junit.Assert.assertArrayEquals(formatArray56, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray57);
        org.junit.Assert.assertArrayEquals(formatArray57, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray64);
        org.junit.Assert.assertArrayEquals(formatArray64, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray74);
        org.junit.Assert.assertArrayEquals(formatArray74, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(formatArray81);
        org.junit.Assert.assertArrayEquals(formatArray81, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray95);
        org.junit.Assert.assertArrayEquals(formatArray95, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = null;
        extendedMessageFormat2.setLocale(locale6);
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.text.Format[] formatArray15 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.lang.String str16 = extendedMessageFormat13.toPattern();
        java.text.Format[] formatArray17 = extendedMessageFormat13.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator18 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) formatArray17);
        java.util.Locale locale19 = extendedMessageFormat2.getLocale();
        java.lang.String str20 = extendedMessageFormat2.toPattern();
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale22);
        extendedMessageFormat23.applyPattern("");
        extendedMessageFormat23.applyPattern("");
        java.text.Format[] formatArray28 = extendedMessageFormat23.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass29 = formatArray28.getClass();
        java.lang.StringBuffer stringBuffer30 = null;
        java.text.FieldPosition fieldPosition31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer32 = extendedMessageFormat2.format((java.lang.Object) formatArray28, stringBuffer30, fieldPosition31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator18);
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        java.lang.String str10 = extendedMessageFormat2.format((java.lang.Object) formatArray9);
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormats();
        java.lang.String str13 = extendedMessageFormat9.toPattern();
        java.util.Locale locale14 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale14);
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        java.lang.String str11 = extendedMessageFormat2.toPattern();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormatsByArgumentIndex();
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray20 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.text.Format[] formatArray21 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.text.Format[] formatArray22 = extendedMessageFormat14.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator23 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) formatArray22);
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale26);
        extendedMessageFormat27.applyPattern("");
        extendedMessageFormat27.applyPattern("");
        extendedMessageFormat27.applyPattern("hi!");
        java.lang.String str34 = extendedMessageFormat27.toPattern();
        java.lang.String str35 = extendedMessageFormat27.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat39.applyPattern("");
        java.text.Format[] formatArray42 = extendedMessageFormat39.getFormats();
        java.lang.String str43 = extendedMessageFormat39.toPattern();
        java.util.Locale locale44 = extendedMessageFormat39.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale44);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale44);
        java.util.Locale locale48 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale48);
        extendedMessageFormat49.applyPattern("");
        java.text.Format[] formatArray52 = extendedMessageFormat49.getFormats();
        java.lang.String str53 = extendedMessageFormat49.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat56 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat56.applyPattern("");
        java.text.Format[] formatArray59 = extendedMessageFormat56.getFormats();
        java.lang.String str60 = extendedMessageFormat56.toPattern();
        java.util.Locale locale61 = extendedMessageFormat56.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat62 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale61);
        extendedMessageFormat49.setLocale(locale61);
        extendedMessageFormat46.setLocale(locale61);
        extendedMessageFormat27.setLocale(locale61);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat66 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale61);
        java.lang.String str67 = extendedMessageFormat66.toPattern();
        java.util.Locale locale68 = extendedMessageFormat66.getLocale();
        java.lang.Object[] objArray70 = extendedMessageFormat66.parse("hi!");
        java.util.Locale locale71 = extendedMessageFormat66.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator72 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat66);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator23);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(formatArray42);
        org.junit.Assert.assertArrayEquals(formatArray42, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray52);
        org.junit.Assert.assertArrayEquals(formatArray52, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(formatArray59);
        org.junit.Assert.assertArrayEquals(formatArray59, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertArrayEquals(objArray70, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "th_TH");
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        java.util.Locale locale13 = null;
        extendedMessageFormat12.setLocale(locale13);
        extendedMessageFormat12.applyPattern("hi!");
        java.lang.String str17 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray18 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale24);
        extendedMessageFormat25.applyPattern("");
        java.util.Locale locale28 = extendedMessageFormat25.getLocale();
        java.text.Format[] formatArray29 = extendedMessageFormat25.getFormats();
        java.lang.String str30 = extendedMessageFormat22.format((java.lang.Object) formatArray29);
        extendedMessageFormat22.applyPattern("");
        java.util.Locale locale37 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale37);
        extendedMessageFormat38.applyPattern("");
        java.text.Format[] formatArray41 = extendedMessageFormat38.getFormats();
        java.text.Format[] formatArray42 = extendedMessageFormat38.getFormats();
        java.util.Locale locale43 = null;
        extendedMessageFormat38.setLocale(locale43);
        extendedMessageFormat38.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat50.applyPattern("");
        java.text.Format[] formatArray53 = extendedMessageFormat50.getFormats();
        java.lang.String str54 = extendedMessageFormat50.toPattern();
        java.util.Locale locale55 = extendedMessageFormat50.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat56 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale55);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat57 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale55);
        java.util.Locale locale59 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale59);
        extendedMessageFormat60.applyPattern("");
        java.text.Format[] formatArray63 = extendedMessageFormat60.getFormats();
        java.lang.String str64 = extendedMessageFormat60.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat67 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat67.applyPattern("");
        java.text.Format[] formatArray70 = extendedMessageFormat67.getFormats();
        java.lang.String str71 = extendedMessageFormat67.toPattern();
        java.util.Locale locale72 = extendedMessageFormat67.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat73 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale72);
        extendedMessageFormat60.setLocale(locale72);
        extendedMessageFormat57.setLocale(locale72);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat79 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat79.applyPattern("");
        java.text.Format[] formatArray82 = extendedMessageFormat79.getFormats();
        java.lang.String str83 = extendedMessageFormat79.toPattern();
        java.util.Locale locale84 = extendedMessageFormat79.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat85 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale84);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat86 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale84);
        extendedMessageFormat57.setLocale(locale84);
        extendedMessageFormat38.setLocale(locale84);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat89 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale84);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat90 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale84);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat91 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale84);
        extendedMessageFormat22.setLocale(locale84);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat93 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale84);
        extendedMessageFormat12.setLocale(locale84);
        extendedMessageFormat2.setLocale(locale84);
        java.text.Format[] formatArray96 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray98 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray42);
        org.junit.Assert.assertArrayEquals(formatArray42, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray53);
        org.junit.Assert.assertArrayEquals(formatArray53, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray63);
        org.junit.Assert.assertArrayEquals(formatArray63, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(formatArray70);
        org.junit.Assert.assertArrayEquals(formatArray70, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray82);
        org.junit.Assert.assertArrayEquals(formatArray82, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray96);
        org.junit.Assert.assertArrayEquals(formatArray96, new java.text.Format[] {});
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str9 = extendedMessageFormat1.toPattern();
        java.lang.String str10 = extendedMessageFormat1.toPattern();
        java.util.Locale locale11 = extendedMessageFormat1.getLocale();
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(locale11);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.lang.String str8 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray12 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray13 = extendedMessageFormat3.getFormats();
        java.lang.String str14 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray13);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale3 = null;
        extendedMessageFormat1.setLocale(locale3);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat8.applyPattern("");
        java.text.Format[] formatArray11 = extendedMessageFormat8.getFormats();
        java.lang.String str12 = extendedMessageFormat8.toPattern();
        java.util.Locale locale13 = extendedMessageFormat8.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale13);
        extendedMessageFormat1.setLocale(locale13);
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        extendedMessageFormat19.applyPattern("");
        java.text.Format[] formatArray22 = extendedMessageFormat19.getFormatsByArgumentIndex();
        extendedMessageFormat19.applyPattern("");
        java.text.Format[] formatArray25 = extendedMessageFormat19.getFormatsByArgumentIndex();
        extendedMessageFormat19.applyPattern("hi!");
        java.lang.Object[] objArray29 = extendedMessageFormat19.parse("hi!");
        java.text.Format[] formatArray30 = extendedMessageFormat19.getFormats();
        java.lang.String str31 = extendedMessageFormat1.format((java.lang.Object) formatArray30);
        java.text.Format[] formatArray32 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale37 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale37);
        extendedMessageFormat38.applyPattern("");
        java.text.Format[] formatArray41 = extendedMessageFormat38.getFormats();
        java.lang.String str42 = extendedMessageFormat38.toPattern();
        extendedMessageFormat38.applyPattern("");
        java.lang.String str45 = extendedMessageFormat38.toPattern();
        java.text.Format[] formatArray46 = extendedMessageFormat38.getFormats();
        java.text.Format[] formatArray47 = extendedMessageFormat38.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat49.applyPattern("");
        java.text.Format[] formatArray52 = extendedMessageFormat49.getFormats();
        java.lang.String str53 = extendedMessageFormat49.toPattern();
        java.util.Locale locale54 = extendedMessageFormat49.getLocale();
        extendedMessageFormat38.setLocale(locale54);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat56 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale54);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat57 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale54);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat58 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale54);
        java.text.Format[] formatArray59 = extendedMessageFormat58.getFormats();
        java.lang.StringBuffer stringBuffer60 = null;
        java.text.FieldPosition fieldPosition61 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer62 = extendedMessageFormat1.format((java.lang.Object[]) formatArray59, stringBuffer60, fieldPosition61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertArrayEquals(objArray29, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(formatArray46);
        org.junit.Assert.assertArrayEquals(formatArray46, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray52);
        org.junit.Assert.assertArrayEquals(formatArray52, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray59);
        org.junit.Assert.assertArrayEquals(formatArray59, new java.text.Format[] {});
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        extendedMessageFormat8.applyPattern("");
        java.text.Format[] formatArray11 = extendedMessageFormat8.getFormats();
        java.lang.String str12 = extendedMessageFormat8.toPattern();
        extendedMessageFormat8.applyPattern("");
        java.lang.String str15 = extendedMessageFormat8.toPattern();
        java.text.Format[] formatArray16 = extendedMessageFormat8.getFormats();
        java.text.Format[] formatArray17 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale19);
        extendedMessageFormat20.applyPattern("");
        extendedMessageFormat20.applyPattern("");
        extendedMessageFormat20.applyPattern("hi!");
        java.lang.String str27 = extendedMessageFormat20.toPattern();
        java.lang.String str28 = extendedMessageFormat20.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat32.applyPattern("");
        java.text.Format[] formatArray35 = extendedMessageFormat32.getFormats();
        java.lang.String str36 = extendedMessageFormat32.toPattern();
        java.util.Locale locale37 = extendedMessageFormat32.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale37);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale37);
        java.util.Locale locale41 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale41);
        extendedMessageFormat42.applyPattern("");
        java.text.Format[] formatArray45 = extendedMessageFormat42.getFormats();
        java.lang.String str46 = extendedMessageFormat42.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat49.applyPattern("");
        java.text.Format[] formatArray52 = extendedMessageFormat49.getFormats();
        java.lang.String str53 = extendedMessageFormat49.toPattern();
        java.util.Locale locale54 = extendedMessageFormat49.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale54);
        extendedMessageFormat42.setLocale(locale54);
        extendedMessageFormat39.setLocale(locale54);
        extendedMessageFormat20.setLocale(locale54);
        extendedMessageFormat8.setLocale(locale54);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale54);
        java.util.Locale locale63 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat64 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale63);
        extendedMessageFormat64.applyPattern("");
        java.text.Format[] formatArray67 = extendedMessageFormat64.getFormats();
        java.lang.String str68 = extendedMessageFormat64.toPattern();
        java.util.Locale locale69 = extendedMessageFormat64.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat71 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale72 = extendedMessageFormat71.getLocale();
        extendedMessageFormat64.setLocale(locale72);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat74 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale72);
        extendedMessageFormat60.setLocale(locale72);
        extendedMessageFormat2.setLocale(locale72);
        java.util.Locale locale77 = extendedMessageFormat2.getLocale();
        java.lang.String str78 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.ParsePosition parsePosition82 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray83 = extendedMessageFormat2.parse("", parsePosition82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray45);
        org.junit.Assert.assertArrayEquals(formatArray45, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(formatArray52);
        org.junit.Assert.assertArrayEquals(formatArray52, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray67);
        org.junit.Assert.assertArrayEquals(formatArray67, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNull(locale69);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.Object[] objArray8 = extendedMessageFormat1.parse("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormats();
        java.lang.Object[] objArray11 = extendedMessageFormat1.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat17.applyPattern("");
        java.text.Format[] formatArray20 = extendedMessageFormat17.getFormats();
        java.lang.String str21 = extendedMessageFormat17.toPattern();
        java.util.Locale locale22 = extendedMessageFormat17.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale22);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale22);
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale26);
        extendedMessageFormat27.applyPattern("");
        java.text.Format[] formatArray30 = extendedMessageFormat27.getFormats();
        java.lang.String str31 = extendedMessageFormat27.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat34.applyPattern("");
        java.text.Format[] formatArray37 = extendedMessageFormat34.getFormats();
        java.lang.String str38 = extendedMessageFormat34.toPattern();
        java.util.Locale locale39 = extendedMessageFormat34.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale39);
        extendedMessageFormat27.setLocale(locale39);
        extendedMessageFormat24.setLocale(locale39);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat46.applyPattern("");
        java.text.Format[] formatArray49 = extendedMessageFormat46.getFormats();
        java.lang.String str50 = extendedMessageFormat46.toPattern();
        java.util.Locale locale51 = extendedMessageFormat46.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale51);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat53 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale51);
        extendedMessageFormat24.setLocale(locale51);
        java.text.Format[] formatArray55 = extendedMessageFormat24.getFormatsByArgumentIndex();
        java.util.Locale locale56 = extendedMessageFormat24.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat57 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale56);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat58 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale56);
        java.lang.String str59 = extendedMessageFormat58.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = extendedMessageFormat1.format((java.lang.Object) extendedMessageFormat58);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray55);
        org.junit.Assert.assertArrayEquals(formatArray55, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormats();
        java.lang.String str9 = extendedMessageFormat1.toPattern();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        extendedMessageFormat13.applyPattern("");
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormatsByArgumentIndex();
        extendedMessageFormat13.applyPattern("");
        java.lang.String str19 = extendedMessageFormat13.toPattern();
        java.text.Format[] formatArray20 = extendedMessageFormat13.getFormats();
        java.text.Format[] formatArray21 = extendedMessageFormat13.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat26.applyPattern("");
        java.text.Format[] formatArray29 = extendedMessageFormat26.getFormats();
        java.lang.String str30 = extendedMessageFormat26.toPattern();
        java.util.Locale locale31 = extendedMessageFormat26.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale31);
        extendedMessageFormat23.setLocale(locale31);
        extendedMessageFormat13.setLocale(locale31);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale31);
        java.text.Format[] formatArray36 = extendedMessageFormat35.getFormatsByArgumentIndex();
        java.util.Locale locale37 = extendedMessageFormat35.getLocale();
        java.util.Locale locale39 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale39);
        extendedMessageFormat40.applyPattern("");
        extendedMessageFormat40.applyPattern("");
        extendedMessageFormat40.applyPattern("hi!");
        java.lang.String str47 = extendedMessageFormat40.toPattern();
        java.lang.String str48 = extendedMessageFormat40.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat52.applyPattern("");
        java.text.Format[] formatArray55 = extendedMessageFormat52.getFormats();
        java.lang.String str56 = extendedMessageFormat52.toPattern();
        java.util.Locale locale57 = extendedMessageFormat52.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat58 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale57);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat59 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale57);
        java.util.Locale locale61 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat62 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale61);
        extendedMessageFormat62.applyPattern("");
        java.text.Format[] formatArray65 = extendedMessageFormat62.getFormats();
        java.lang.String str66 = extendedMessageFormat62.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat69 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat69.applyPattern("");
        java.text.Format[] formatArray72 = extendedMessageFormat69.getFormats();
        java.lang.String str73 = extendedMessageFormat69.toPattern();
        java.util.Locale locale74 = extendedMessageFormat69.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat75 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale74);
        extendedMessageFormat62.setLocale(locale74);
        extendedMessageFormat59.setLocale(locale74);
        extendedMessageFormat40.setLocale(locale74);
        extendedMessageFormat35.setLocale(locale74);
        extendedMessageFormat35.applyPattern("hi!");
        java.util.Locale locale83 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat84 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale83);
        java.util.Locale locale85 = null;
        extendedMessageFormat84.setLocale(locale85);
        java.text.Format[] formatArray87 = extendedMessageFormat84.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator88 = extendedMessageFormat35.formatToCharacterIterator((java.lang.Object) formatArray87);
        java.util.Locale locale89 = extendedMessageFormat35.getLocale();
        java.lang.StringBuffer stringBuffer90 = null;
        java.text.FieldPosition fieldPosition91 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer92 = extendedMessageFormat1.format((java.lang.Object) extendedMessageFormat35, stringBuffer90, fieldPosition91);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(formatArray55);
        org.junit.Assert.assertArrayEquals(formatArray55, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray65);
        org.junit.Assert.assertArrayEquals(formatArray65, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(formatArray72);
        org.junit.Assert.assertArrayEquals(formatArray72, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray87);
        org.junit.Assert.assertArrayEquals(formatArray87, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator88);
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "th_TH");
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.lang.String str10 = extendedMessageFormat3.format((java.lang.Object) objArray9);
        java.lang.String str11 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat3.getFormats();
        java.lang.String str13 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray12);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale12 = extendedMessageFormat2.getLocale();
        java.util.Locale locale13 = extendedMessageFormat2.getLocale();
        java.lang.String str14 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray15 = extendedMessageFormat2.getFormats();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat4.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormats();
        java.lang.String str8 = extendedMessageFormat4.toPattern();
        java.util.Locale locale9 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat1.setLocale(locale9);
        java.util.Locale locale12 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = extendedMessageFormat1.parseObject("", parsePosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
        java.lang.Object[] objArray11 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray12 = extendedMessageFormat2.getFormats();
        java.util.Locale locale13 = extendedMessageFormat2.getLocale();
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale13);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Locale locale13 = extendedMessageFormat11.getLocale();
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat16.applyPattern("");
        java.text.Format[] formatArray19 = extendedMessageFormat16.getFormatsByArgumentIndex();
        extendedMessageFormat16.applyPattern("");
        java.text.Format[] formatArray22 = extendedMessageFormat16.getFormatsByArgumentIndex();
        extendedMessageFormat16.applyPattern("hi!");
        java.lang.Object[] objArray26 = extendedMessageFormat16.parse("hi!");
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale28);
        extendedMessageFormat29.applyPattern("");
        java.text.Format[] formatArray32 = extendedMessageFormat29.getFormats();
        java.lang.String str33 = extendedMessageFormat29.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat36.applyPattern("");
        java.text.Format[] formatArray39 = extendedMessageFormat36.getFormats();
        java.lang.String str40 = extendedMessageFormat36.toPattern();
        java.util.Locale locale41 = extendedMessageFormat36.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale41);
        extendedMessageFormat29.setLocale(locale41);
        extendedMessageFormat16.setLocale(locale41);
        extendedMessageFormat11.setLocale(locale41);
        extendedMessageFormat1.setLocale(locale41);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat48.applyPattern("");
        java.util.Locale locale51 = extendedMessageFormat48.getLocale();
        extendedMessageFormat1.setLocale(locale51);
        java.lang.String str53 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat56 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray58 = extendedMessageFormat56.parse("hi!");
        java.lang.Object[] objArray60 = extendedMessageFormat56.parse("hi!");
        extendedMessageFormat56.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat(1, (java.text.Format) extendedMessageFormat56);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertArrayEquals(objArray58, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertArrayEquals(objArray60, new java.lang.Object[] {});
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(locale10);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = null;
        extendedMessageFormat2.setLocale(locale8);
        extendedMessageFormat2.applyPattern("hi!");
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray14 = extendedMessageFormat2.getFormats();
        java.lang.String str15 = extendedMessageFormat2.toPattern();
        java.util.Locale locale16 = extendedMessageFormat2.getLocale();
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(locale16);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        extendedMessageFormat15.applyPattern("");
        java.text.Format[] formatArray18 = extendedMessageFormat15.getFormatsByArgumentIndex();
        extendedMessageFormat15.applyPattern("");
        java.text.Format[] formatArray21 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.text.Format[] formatArray22 = extendedMessageFormat15.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat26.applyPattern("");
        java.text.Format[] formatArray29 = extendedMessageFormat26.getFormats();
        java.lang.String str30 = extendedMessageFormat26.toPattern();
        java.util.Locale locale31 = extendedMessageFormat26.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale31);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale31);
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        extendedMessageFormat36.applyPattern("");
        java.text.Format[] formatArray39 = extendedMessageFormat36.getFormats();
        java.lang.String str40 = extendedMessageFormat36.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat43.applyPattern("");
        java.text.Format[] formatArray46 = extendedMessageFormat43.getFormats();
        java.lang.String str47 = extendedMessageFormat43.toPattern();
        java.util.Locale locale48 = extendedMessageFormat43.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale48);
        extendedMessageFormat36.setLocale(locale48);
        extendedMessageFormat33.setLocale(locale48);
        extendedMessageFormat15.setLocale(locale48);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat53 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale48);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat54 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale48);
        extendedMessageFormat2.setLocale(locale48);
        java.text.Format[] formatArray56 = extendedMessageFormat2.getFormats();
        java.lang.String str57 = extendedMessageFormat2.toPattern();
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(formatArray46);
        org.junit.Assert.assertArrayEquals(formatArray46, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray56);
        org.junit.Assert.assertArrayEquals(formatArray56, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat15.applyPattern("");
        java.text.Format[] formatArray18 = extendedMessageFormat15.getFormats();
        java.lang.String str19 = extendedMessageFormat15.toPattern();
        java.util.Locale locale20 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale20);
        extendedMessageFormat12.setLocale(locale20);
        extendedMessageFormat2.setLocale(locale20);
        java.lang.String str24 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray25 = extendedMessageFormat2.getFormats();
        java.lang.String str26 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str29 = extendedMessageFormat28.toPattern();
        java.util.Locale locale30 = null;
        extendedMessageFormat28.setLocale(locale30);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat35.applyPattern("");
        java.text.Format[] formatArray38 = extendedMessageFormat35.getFormats();
        java.lang.String str39 = extendedMessageFormat35.toPattern();
        java.util.Locale locale40 = extendedMessageFormat35.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale40);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale40);
        extendedMessageFormat28.setLocale(locale40);
        java.text.Format[] formatArray44 = extendedMessageFormat28.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer45 = null;
        java.text.FieldPosition fieldPosition46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer47 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat28, stringBuffer45, fieldPosition46);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray44);
        org.junit.Assert.assertArrayEquals(formatArray44, new java.text.Format[] {});
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        extendedMessageFormat4.applyPattern("");
        extendedMessageFormat4.applyPattern("");
        java.text.Format[] formatArray9 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray18 = extendedMessageFormat16.parse("hi!");
        java.lang.String str19 = extendedMessageFormat12.format((java.lang.Object) objArray18);
        java.text.Format[] formatArray20 = extendedMessageFormat12.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat24.applyPattern("");
        java.text.Format[] formatArray27 = extendedMessageFormat24.getFormats();
        java.lang.String str28 = extendedMessageFormat24.toPattern();
        java.util.Locale locale29 = extendedMessageFormat24.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale29);
        extendedMessageFormat12.setLocale(locale29);
        extendedMessageFormat4.setLocale(locale29);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat35.applyPattern("");
        java.text.Format[] formatArray38 = extendedMessageFormat35.getFormats();
        java.lang.String str39 = extendedMessageFormat35.toPattern();
        java.util.Locale locale40 = extendedMessageFormat35.getLocale();
        extendedMessageFormat4.setLocale(locale40);
        java.text.Format[] formatArray42 = extendedMessageFormat4.getFormats();
        java.util.Locale locale43 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale43);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale43);
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray42);
        org.junit.Assert.assertArrayEquals(formatArray42, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        java.text.Format[] formatArray14 = extendedMessageFormat11.getFormats();
        java.text.Format[] formatArray15 = extendedMessageFormat11.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat21.applyPattern("");
        java.text.Format[] formatArray24 = extendedMessageFormat21.getFormats();
        java.lang.String str25 = extendedMessageFormat21.toPattern();
        java.util.Locale locale26 = extendedMessageFormat21.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale26);
        extendedMessageFormat18.setLocale(locale26);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale26);
        extendedMessageFormat11.setLocale(locale26);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale26);
        java.text.Format[] formatArray32 = extendedMessageFormat31.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer33 = null;
        java.text.FieldPosition fieldPosition34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer35 = extendedMessageFormat2.format((java.lang.Object[]) formatArray32, stringBuffer33, fieldPosition34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        java.lang.String str10 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray12 = extendedMessageFormat3.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        java.lang.String str18 = extendedMessageFormat14.toPattern();
        java.util.Locale locale19 = extendedMessageFormat14.getLocale();
        extendedMessageFormat3.setLocale(locale19);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale19);
        java.lang.String str22 = extendedMessageFormat21.toPattern();
        extendedMessageFormat21.applyPattern("hi!");
        java.util.Locale locale25 = extendedMessageFormat21.getLocale();
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale28);
        extendedMessageFormat29.applyPattern("");
        java.text.Format[] formatArray32 = extendedMessageFormat29.getFormats();
        java.text.Format[] formatArray33 = extendedMessageFormat29.getFormats();
        java.util.Locale locale34 = null;
        extendedMessageFormat29.setLocale(locale34);
        extendedMessageFormat29.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat41.applyPattern("");
        java.text.Format[] formatArray44 = extendedMessageFormat41.getFormats();
        java.lang.String str45 = extendedMessageFormat41.toPattern();
        java.util.Locale locale46 = extendedMessageFormat41.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale46);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale46);
        java.util.Locale locale50 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat51 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale50);
        extendedMessageFormat51.applyPattern("");
        java.text.Format[] formatArray54 = extendedMessageFormat51.getFormats();
        java.lang.String str55 = extendedMessageFormat51.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat58 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat58.applyPattern("");
        java.text.Format[] formatArray61 = extendedMessageFormat58.getFormats();
        java.lang.String str62 = extendedMessageFormat58.toPattern();
        java.util.Locale locale63 = extendedMessageFormat58.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat64 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale63);
        extendedMessageFormat51.setLocale(locale63);
        extendedMessageFormat48.setLocale(locale63);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat70 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat70.applyPattern("");
        java.text.Format[] formatArray73 = extendedMessageFormat70.getFormats();
        java.lang.String str74 = extendedMessageFormat70.toPattern();
        java.util.Locale locale75 = extendedMessageFormat70.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat76 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale75);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat77 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale75);
        extendedMessageFormat48.setLocale(locale75);
        extendedMessageFormat29.setLocale(locale75);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat80 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale75);
        extendedMessageFormat21.setLocale(locale75);
        java.util.Locale locale82 = extendedMessageFormat21.getLocale();
        extendedMessageFormat21.applyPattern("");
        java.util.Locale locale85 = null;
        extendedMessageFormat21.setLocale(locale85);
        java.lang.String str87 = extendedMessageFormat21.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray89 = extendedMessageFormat21.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray44);
        org.junit.Assert.assertArrayEquals(formatArray44, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray54);
        org.junit.Assert.assertArrayEquals(formatArray54, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(formatArray61);
        org.junit.Assert.assertArrayEquals(formatArray61, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray73);
        org.junit.Assert.assertArrayEquals(formatArray73, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormats();
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = extendedMessageFormat2.parse("hi!", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        java.lang.String str18 = extendedMessageFormat14.toPattern();
        extendedMessageFormat14.applyPattern("");
        java.lang.String str21 = extendedMessageFormat14.toPattern();
        java.text.Format[] formatArray22 = extendedMessageFormat14.getFormats();
        java.text.Format[] formatArray23 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale25);
        extendedMessageFormat26.applyPattern("");
        extendedMessageFormat26.applyPattern("");
        extendedMessageFormat26.applyPattern("hi!");
        java.lang.String str33 = extendedMessageFormat26.toPattern();
        java.lang.String str34 = extendedMessageFormat26.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat38.applyPattern("");
        java.text.Format[] formatArray41 = extendedMessageFormat38.getFormats();
        java.lang.String str42 = extendedMessageFormat38.toPattern();
        java.util.Locale locale43 = extendedMessageFormat38.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale43);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale43);
        java.util.Locale locale47 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale47);
        extendedMessageFormat48.applyPattern("");
        java.text.Format[] formatArray51 = extendedMessageFormat48.getFormats();
        java.lang.String str52 = extendedMessageFormat48.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat55.applyPattern("");
        java.text.Format[] formatArray58 = extendedMessageFormat55.getFormats();
        java.lang.String str59 = extendedMessageFormat55.toPattern();
        java.util.Locale locale60 = extendedMessageFormat55.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale60);
        extendedMessageFormat48.setLocale(locale60);
        extendedMessageFormat45.setLocale(locale60);
        extendedMessageFormat26.setLocale(locale60);
        extendedMessageFormat14.setLocale(locale60);
        java.util.Locale locale66 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat67 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale66);
        java.text.Format[] formatArray68 = extendedMessageFormat67.getFormats();
        extendedMessageFormat67.applyPattern("hi!");
        java.util.Locale locale71 = extendedMessageFormat67.getLocale();
        extendedMessageFormat2.setLocale(locale71);
        java.util.Locale locale73 = extendedMessageFormat2.getLocale();
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray51);
        org.junit.Assert.assertArrayEquals(formatArray51, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(formatArray58);
        org.junit.Assert.assertArrayEquals(formatArray58, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray68);
        org.junit.Assert.assertArrayEquals(formatArray68, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "th_TH");
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        java.util.Locale locale4 = null;
        extendedMessageFormat3.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormatsByArgumentIndex();
        extendedMessageFormat3.applyPattern("");
        java.lang.String str9 = extendedMessageFormat3.toPattern();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat12.getFormats();
        java.lang.String str16 = extendedMessageFormat12.toPattern();
        extendedMessageFormat12.applyPattern("");
        java.lang.String str19 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray20 = extendedMessageFormat12.getFormats();
        java.text.Format[] formatArray21 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Locale locale22 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat25.applyPattern("");
        java.text.Format[] formatArray28 = extendedMessageFormat25.getFormats();
        java.lang.String str29 = extendedMessageFormat25.toPattern();
        java.util.Locale locale30 = extendedMessageFormat25.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale30);
        extendedMessageFormat12.setLocale(locale30);
        extendedMessageFormat3.setLocale(locale30);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale30);
        extendedMessageFormat34.applyPattern("hi!");
        java.lang.String str37 = extendedMessageFormat34.toPattern();
        java.lang.StringBuffer stringBuffer39 = null;
        java.text.FieldPosition fieldPosition40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer41 = extendedMessageFormat34.format((java.lang.Object) 'a', stringBuffer39, fieldPosition40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class [Ljava.lang.Object; (java.lang.Character and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat2.format((java.lang.Object) formatArray11);
        java.text.Format[] formatArray13 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale16 = extendedMessageFormat2.getLocale();
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale16);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray12 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        extendedMessageFormat17.applyPattern("");
        java.text.Format[] formatArray20 = extendedMessageFormat17.getFormats();
        java.lang.String str21 = extendedMessageFormat17.toPattern();
        java.util.Locale locale22 = extendedMessageFormat17.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale25 = extendedMessageFormat24.getLocale();
        extendedMessageFormat17.setLocale(locale25);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale25);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (short) 0, (java.text.Format) extendedMessageFormat27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = null;
        extendedMessageFormat2.setLocale(locale8);
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        java.lang.String str11 = extendedMessageFormat2.toPattern();
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        java.lang.String str16 = extendedMessageFormat15.toPattern();
        extendedMessageFormat15.applyPattern("hi!");
        java.util.Locale locale19 = extendedMessageFormat15.getLocale();
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale22);
        extendedMessageFormat23.applyPattern("");
        java.text.Format[] formatArray26 = extendedMessageFormat23.getFormats();
        java.text.Format[] formatArray27 = extendedMessageFormat23.getFormats();
        java.util.Locale locale28 = null;
        extendedMessageFormat23.setLocale(locale28);
        extendedMessageFormat23.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat35.applyPattern("");
        java.text.Format[] formatArray38 = extendedMessageFormat35.getFormats();
        java.lang.String str39 = extendedMessageFormat35.toPattern();
        java.util.Locale locale40 = extendedMessageFormat35.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale40);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale40);
        java.util.Locale locale44 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale44);
        extendedMessageFormat45.applyPattern("");
        java.text.Format[] formatArray48 = extendedMessageFormat45.getFormats();
        java.lang.String str49 = extendedMessageFormat45.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat52.applyPattern("");
        java.text.Format[] formatArray55 = extendedMessageFormat52.getFormats();
        java.lang.String str56 = extendedMessageFormat52.toPattern();
        java.util.Locale locale57 = extendedMessageFormat52.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat58 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale57);
        extendedMessageFormat45.setLocale(locale57);
        extendedMessageFormat42.setLocale(locale57);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat64 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat64.applyPattern("");
        java.text.Format[] formatArray67 = extendedMessageFormat64.getFormats();
        java.lang.String str68 = extendedMessageFormat64.toPattern();
        java.util.Locale locale69 = extendedMessageFormat64.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat70 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale69);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat71 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale69);
        extendedMessageFormat42.setLocale(locale69);
        extendedMessageFormat23.setLocale(locale69);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat74 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale69);
        extendedMessageFormat15.setLocale(locale69);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat76 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale69);
        extendedMessageFormat2.setLocale(locale69);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray48);
        org.junit.Assert.assertArrayEquals(formatArray48, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(formatArray55);
        org.junit.Assert.assertArrayEquals(formatArray55, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray67);
        org.junit.Assert.assertArrayEquals(formatArray67, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "th_TH");
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        extendedMessageFormat15.applyPattern("");
        java.lang.String str18 = extendedMessageFormat15.toPattern();
        java.util.Locale locale19 = extendedMessageFormat15.getLocale();
        java.util.Locale locale20 = extendedMessageFormat15.getLocale();
        java.util.Locale locale21 = null;
        extendedMessageFormat15.setLocale(locale21);
        java.text.Format[] formatArray23 = extendedMessageFormat15.getFormats();
        java.lang.String str24 = extendedMessageFormat2.format((java.lang.Object) formatArray23);
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale28);
        extendedMessageFormat29.applyPattern("");
        java.text.Format[] formatArray32 = extendedMessageFormat29.getFormats();
        java.lang.String str33 = extendedMessageFormat29.toPattern();
        extendedMessageFormat29.applyPattern("");
        java.lang.String str36 = extendedMessageFormat29.toPattern();
        java.text.Format[] formatArray37 = extendedMessageFormat29.getFormats();
        java.text.Format[] formatArray38 = extendedMessageFormat29.getFormatsByArgumentIndex();
        java.util.Locale locale39 = extendedMessageFormat29.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat44.applyPattern("");
        java.text.Format[] formatArray47 = extendedMessageFormat44.getFormats();
        java.lang.String str48 = extendedMessageFormat44.toPattern();
        java.util.Locale locale49 = extendedMessageFormat44.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale49);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat51 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale49);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale49);
        extendedMessageFormat29.setLocale(locale49);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat54 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale49);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale49);
        extendedMessageFormat55.applyPattern("");
        java.lang.String str58 = extendedMessageFormat55.toPattern();
        java.text.Format[] formatArray59 = extendedMessageFormat55.getFormats();
        java.lang.StringBuffer stringBuffer60 = null;
        java.text.FieldPosition fieldPosition61 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer62 = extendedMessageFormat2.format((java.lang.Object[]) formatArray59, stringBuffer60, fieldPosition61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertNull(locale20);
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale39);
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(formatArray59);
        org.junit.Assert.assertArrayEquals(formatArray59, new java.text.Format[] {});
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) objArray8);
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        java.util.Locale locale14 = null;
        extendedMessageFormat13.setLocale(locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormatsByArgumentIndex();
        extendedMessageFormat13.applyPattern("");
        java.lang.String str19 = extendedMessageFormat13.toPattern();
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        extendedMessageFormat22.applyPattern("");
        java.text.Format[] formatArray25 = extendedMessageFormat22.getFormats();
        java.lang.String str26 = extendedMessageFormat22.toPattern();
        extendedMessageFormat22.applyPattern("");
        java.lang.String str29 = extendedMessageFormat22.toPattern();
        java.text.Format[] formatArray30 = extendedMessageFormat22.getFormats();
        java.text.Format[] formatArray31 = extendedMessageFormat22.getFormatsByArgumentIndex();
        java.util.Locale locale32 = extendedMessageFormat22.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat35.applyPattern("");
        java.text.Format[] formatArray38 = extendedMessageFormat35.getFormats();
        java.lang.String str39 = extendedMessageFormat35.toPattern();
        java.util.Locale locale40 = extendedMessageFormat35.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale40);
        extendedMessageFormat22.setLocale(locale40);
        extendedMessageFormat13.setLocale(locale40);
        extendedMessageFormat2.setLocale(locale40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray46 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale32);
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        extendedMessageFormat4.applyPattern("");
        extendedMessageFormat4.applyPattern("");
        java.text.Format[] formatArray9 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray18 = extendedMessageFormat16.parse("hi!");
        java.lang.String str19 = extendedMessageFormat12.format((java.lang.Object) objArray18);
        java.text.Format[] formatArray20 = extendedMessageFormat12.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat24.applyPattern("");
        java.text.Format[] formatArray27 = extendedMessageFormat24.getFormats();
        java.lang.String str28 = extendedMessageFormat24.toPattern();
        java.util.Locale locale29 = extendedMessageFormat24.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale29);
        extendedMessageFormat12.setLocale(locale29);
        extendedMessageFormat4.setLocale(locale29);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat35.applyPattern("");
        java.text.Format[] formatArray38 = extendedMessageFormat35.getFormats();
        java.lang.String str39 = extendedMessageFormat35.toPattern();
        java.util.Locale locale40 = extendedMessageFormat35.getLocale();
        extendedMessageFormat4.setLocale(locale40);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale40);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale40);
        java.util.Locale locale44 = extendedMessageFormat43.getLocale();
        java.lang.String str45 = extendedMessageFormat43.toPattern();
        java.lang.String str46 = extendedMessageFormat43.toPattern();
        java.text.Format[] formatArray47 = extendedMessageFormat43.getFormatsByArgumentIndex();
        extendedMessageFormat43.applyPattern("");
        java.text.Format[] formatArray50 = extendedMessageFormat43.getFormatsByArgumentIndex();
        java.text.Format[] formatArray51 = extendedMessageFormat43.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray53 = extendedMessageFormat43.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray50);
        org.junit.Assert.assertArrayEquals(formatArray50, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray51);
        org.junit.Assert.assertArrayEquals(formatArray51, new java.text.Format[] {});
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.util.Locale locale6 = null;
        extendedMessageFormat2.setLocale(locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormats();
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        extendedMessageFormat15.applyPattern("");
        java.text.Format[] formatArray18 = extendedMessageFormat15.getFormats();
        java.lang.String str19 = extendedMessageFormat15.toPattern();
        extendedMessageFormat15.applyPattern("");
        java.lang.String str22 = extendedMessageFormat15.toPattern();
        java.text.Format[] formatArray23 = extendedMessageFormat15.getFormats();
        java.text.Format[] formatArray24 = extendedMessageFormat15.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat26.applyPattern("");
        java.text.Format[] formatArray29 = extendedMessageFormat26.getFormats();
        java.lang.String str30 = extendedMessageFormat26.toPattern();
        java.util.Locale locale31 = extendedMessageFormat26.getLocale();
        extendedMessageFormat15.setLocale(locale31);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale31);
        extendedMessageFormat2.setLocale(locale31);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale31);
        java.text.ParsePosition parsePosition37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray38 = extendedMessageFormat35.parse("hi!", parsePosition37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        java.text.Format[] formatArray14 = extendedMessageFormat11.getFormats();
        java.lang.String str15 = extendedMessageFormat11.toPattern();
        extendedMessageFormat11.applyPattern("");
        java.lang.String str18 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray19 = extendedMessageFormat11.getFormats();
        java.text.Format[] formatArray20 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale22);
        extendedMessageFormat23.applyPattern("");
        extendedMessageFormat23.applyPattern("");
        extendedMessageFormat23.applyPattern("hi!");
        java.lang.String str30 = extendedMessageFormat23.toPattern();
        java.lang.String str31 = extendedMessageFormat23.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat35.applyPattern("");
        java.text.Format[] formatArray38 = extendedMessageFormat35.getFormats();
        java.lang.String str39 = extendedMessageFormat35.toPattern();
        java.util.Locale locale40 = extendedMessageFormat35.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale40);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale40);
        java.util.Locale locale44 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale44);
        extendedMessageFormat45.applyPattern("");
        java.text.Format[] formatArray48 = extendedMessageFormat45.getFormats();
        java.lang.String str49 = extendedMessageFormat45.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat52.applyPattern("");
        java.text.Format[] formatArray55 = extendedMessageFormat52.getFormats();
        java.lang.String str56 = extendedMessageFormat52.toPattern();
        java.util.Locale locale57 = extendedMessageFormat52.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat58 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale57);
        extendedMessageFormat45.setLocale(locale57);
        extendedMessageFormat42.setLocale(locale57);
        extendedMessageFormat23.setLocale(locale57);
        extendedMessageFormat11.setLocale(locale57);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat63 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale57);
        extendedMessageFormat2.setLocale(locale57);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat65 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale57);
        java.lang.String str66 = extendedMessageFormat65.toPattern();
        java.lang.String str67 = extendedMessageFormat65.toPattern();
        java.lang.String str68 = extendedMessageFormat65.toPattern();
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray48);
        org.junit.Assert.assertArrayEquals(formatArray48, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(formatArray55);
        org.junit.Assert.assertArrayEquals(formatArray55, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.lang.String str9 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat5.getFormats();
        java.lang.String str11 = extendedMessageFormat5.toPattern();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        extendedMessageFormat17.applyPattern("");
        java.text.Format[] formatArray20 = extendedMessageFormat17.getFormats();
        java.lang.String str21 = extendedMessageFormat17.toPattern();
        extendedMessageFormat17.applyPattern("");
        java.lang.String str24 = extendedMessageFormat17.toPattern();
        java.text.Format[] formatArray25 = extendedMessageFormat17.getFormats();
        java.text.Format[] formatArray26 = extendedMessageFormat17.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat28.applyPattern("");
        java.text.Format[] formatArray31 = extendedMessageFormat28.getFormats();
        java.lang.String str32 = extendedMessageFormat28.toPattern();
        java.util.Locale locale33 = extendedMessageFormat28.getLocale();
        extendedMessageFormat17.setLocale(locale33);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale33);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale33);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale33);
        extendedMessageFormat5.setLocale(locale33);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale33);
        java.text.Format[] formatArray40 = extendedMessageFormat39.getFormats();
        java.lang.String str41 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray40);
        java.lang.String str42 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray40);
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray40);
        org.junit.Assert.assertArrayEquals(formatArray40, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        java.lang.String str18 = extendedMessageFormat14.toPattern();
        java.util.Locale locale19 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale19);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale19);
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale23);
        extendedMessageFormat24.applyPattern("");
        java.text.Format[] formatArray27 = extendedMessageFormat24.getFormats();
        java.lang.String str28 = extendedMessageFormat24.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat31.applyPattern("");
        java.text.Format[] formatArray34 = extendedMessageFormat31.getFormats();
        java.lang.String str35 = extendedMessageFormat31.toPattern();
        java.util.Locale locale36 = extendedMessageFormat31.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale36);
        extendedMessageFormat24.setLocale(locale36);
        extendedMessageFormat21.setLocale(locale36);
        extendedMessageFormat2.setLocale(locale36);
        java.lang.String str41 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray43 = extendedMessageFormat2.parse("hi!");
        java.lang.String str44 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray48 = extendedMessageFormat46.parse("hi!");
        java.util.Locale locale49 = null;
        extendedMessageFormat46.setLocale(locale49);
        java.util.Locale locale51 = null;
        extendedMessageFormat46.setLocale(locale51);
        extendedMessageFormat46.applyPattern("hi!");
        java.lang.StringBuffer stringBuffer55 = null;
        java.text.FieldPosition fieldPosition56 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer57 = extendedMessageFormat2.format((java.lang.Object) "hi!", stringBuffer55, fieldPosition56);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertArrayEquals(objArray43, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertArrayEquals(objArray48, new java.lang.Object[] {});
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.lang.String str11 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Class<?> wildcardClass14 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat15.applyPattern("");
        java.text.Format[] formatArray18 = extendedMessageFormat15.getFormats();
        java.lang.String str19 = extendedMessageFormat15.toPattern();
        java.util.Locale locale20 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale20);
        extendedMessageFormat12.setLocale(locale20);
        extendedMessageFormat2.setLocale(locale20);
        java.lang.String str24 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray25 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray28 = extendedMessageFormat2.parse("hi!", parsePosition27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        extendedMessageFormat7.applyPattern("");
        java.text.Format[] formatArray10 = extendedMessageFormat7.getFormatsByArgumentIndex();
        extendedMessageFormat7.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat7.getFormatsByArgumentIndex();
        extendedMessageFormat7.applyPattern("hi!");
        java.lang.Object[] objArray17 = extendedMessageFormat7.parse("hi!");
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale19);
        extendedMessageFormat20.applyPattern("");
        java.text.Format[] formatArray23 = extendedMessageFormat20.getFormats();
        java.lang.String str24 = extendedMessageFormat20.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat27.applyPattern("");
        java.text.Format[] formatArray30 = extendedMessageFormat27.getFormats();
        java.lang.String str31 = extendedMessageFormat27.toPattern();
        java.util.Locale locale32 = extendedMessageFormat27.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale32);
        extendedMessageFormat20.setLocale(locale32);
        extendedMessageFormat7.setLocale(locale32);
        extendedMessageFormat2.setLocale(locale32);
        java.util.Locale locale39 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale39);
        extendedMessageFormat40.applyPattern("");
        java.lang.String str43 = extendedMessageFormat40.toPattern();
        java.util.Locale locale44 = null;
        extendedMessageFormat40.setLocale(locale44);
        java.lang.String str46 = extendedMessageFormat40.toPattern();
        java.lang.String str47 = extendedMessageFormat40.toPattern();
        java.util.Locale locale48 = extendedMessageFormat40.getLocale();
        java.util.Locale locale50 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat51 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale50);
        java.util.Locale locale52 = extendedMessageFormat51.getLocale();
        java.text.Format[] formatArray53 = extendedMessageFormat51.getFormatsByArgumentIndex();
        java.lang.String str54 = extendedMessageFormat51.toPattern();
        java.text.Format[] formatArray55 = extendedMessageFormat51.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator56 = extendedMessageFormat40.formatToCharacterIterator((java.lang.Object) formatArray55);
        java.util.Locale locale57 = extendedMessageFormat40.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) ' ', (java.text.Format) extendedMessageFormat40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNull(locale48);
        org.junit.Assert.assertNull(locale52);
        org.junit.Assert.assertNotNull(formatArray53);
        org.junit.Assert.assertArrayEquals(formatArray53, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(formatArray55);
        org.junit.Assert.assertArrayEquals(formatArray55, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator56);
        org.junit.Assert.assertNull(locale57);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormatsByArgumentIndex();
        extendedMessageFormat5.applyPattern("");
        java.lang.String str11 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat5.getFormats();
        java.text.Format[] formatArray13 = extendedMessageFormat5.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat18.applyPattern("");
        java.text.Format[] formatArray21 = extendedMessageFormat18.getFormats();
        java.lang.String str22 = extendedMessageFormat18.toPattern();
        java.util.Locale locale23 = extendedMessageFormat18.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale23);
        extendedMessageFormat15.setLocale(locale23);
        extendedMessageFormat5.setLocale(locale23);
        java.lang.String str27 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray28 = extendedMessageFormat5.getFormats();
        java.util.Locale locale29 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale29);
        java.text.Format[] formatArray32 = extendedMessageFormat31.getFormats();
        java.util.Locale locale33 = extendedMessageFormat31.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale33);
        java.util.Locale locale36 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale36);
        java.util.Locale locale38 = null;
        extendedMessageFormat37.setLocale(locale38);
        java.text.Format[] formatArray40 = extendedMessageFormat37.getFormatsByArgumentIndex();
        extendedMessageFormat37.applyPattern("");
        java.lang.String str43 = extendedMessageFormat37.toPattern();
        java.text.Format[] formatArray44 = extendedMessageFormat37.getFormatsByArgumentIndex();
        java.lang.String str45 = extendedMessageFormat37.toPattern();
        java.text.Format[] formatArray46 = extendedMessageFormat37.getFormats();
        java.lang.StringBuffer stringBuffer47 = null;
        java.text.FieldPosition fieldPosition48 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer49 = extendedMessageFormat34.format((java.lang.Object) extendedMessageFormat37, stringBuffer47, fieldPosition48);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray40);
        org.junit.Assert.assertArrayEquals(formatArray40, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(formatArray44);
        org.junit.Assert.assertArrayEquals(formatArray44, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(formatArray46);
        org.junit.Assert.assertArrayEquals(formatArray46, new java.text.Format[] {});
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        extendedMessageFormat15.applyPattern("");
        java.lang.String str18 = extendedMessageFormat15.toPattern();
        java.util.Locale locale19 = extendedMessageFormat15.getLocale();
        java.util.Locale locale20 = extendedMessageFormat15.getLocale();
        java.util.Locale locale21 = null;
        extendedMessageFormat15.setLocale(locale21);
        java.text.Format[] formatArray23 = extendedMessageFormat15.getFormats();
        java.lang.String str24 = extendedMessageFormat2.format((java.lang.Object) formatArray23);
        java.util.Locale locale27 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale27);
        extendedMessageFormat28.applyPattern("");
        java.text.Format[] formatArray31 = extendedMessageFormat28.getFormats();
        java.text.Format[] formatArray32 = extendedMessageFormat28.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat38.applyPattern("");
        java.text.Format[] formatArray41 = extendedMessageFormat38.getFormats();
        java.lang.String str42 = extendedMessageFormat38.toPattern();
        java.util.Locale locale43 = extendedMessageFormat38.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale43);
        extendedMessageFormat35.setLocale(locale43);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale43);
        extendedMessageFormat28.setLocale(locale43);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale43);
        extendedMessageFormat48.applyPattern("");
        java.util.Locale locale51 = extendedMessageFormat48.getLocale();
        java.util.Locale locale52 = extendedMessageFormat48.getLocale();
        boolean boolean53 = extendedMessageFormat2.equals((java.lang.Object) locale52);
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertNull(locale20);
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat4.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormats();
        java.lang.String str8 = extendedMessageFormat4.toPattern();
        java.util.Locale locale9 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat1.setLocale(locale9);
        java.util.Locale locale12 = extendedMessageFormat1.getLocale();
        extendedMessageFormat1.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat16.applyPattern("");
        java.util.Locale locale19 = null;
        extendedMessageFormat16.setLocale(locale19);
        java.text.Format[] formatArray21 = extendedMessageFormat16.getFormats();
        java.text.Format[] formatArray22 = extendedMessageFormat16.getFormatsByArgumentIndex();
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale26);
        extendedMessageFormat27.applyPattern("");
        java.text.Format[] formatArray30 = extendedMessageFormat27.getFormats();
        java.text.Format[] formatArray31 = extendedMessageFormat27.getFormats();
        java.util.Locale locale32 = null;
        extendedMessageFormat27.setLocale(locale32);
        extendedMessageFormat27.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat39.applyPattern("");
        java.text.Format[] formatArray42 = extendedMessageFormat39.getFormats();
        java.lang.String str43 = extendedMessageFormat39.toPattern();
        java.util.Locale locale44 = extendedMessageFormat39.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale44);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale44);
        java.util.Locale locale48 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale48);
        extendedMessageFormat49.applyPattern("");
        java.text.Format[] formatArray52 = extendedMessageFormat49.getFormats();
        java.lang.String str53 = extendedMessageFormat49.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat56 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat56.applyPattern("");
        java.text.Format[] formatArray59 = extendedMessageFormat56.getFormats();
        java.lang.String str60 = extendedMessageFormat56.toPattern();
        java.util.Locale locale61 = extendedMessageFormat56.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat62 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale61);
        extendedMessageFormat49.setLocale(locale61);
        extendedMessageFormat46.setLocale(locale61);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat68 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat68.applyPattern("");
        java.text.Format[] formatArray71 = extendedMessageFormat68.getFormats();
        java.lang.String str72 = extendedMessageFormat68.toPattern();
        java.util.Locale locale73 = extendedMessageFormat68.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat74 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale73);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat75 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale73);
        extendedMessageFormat46.setLocale(locale73);
        extendedMessageFormat27.setLocale(locale73);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat78 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale73);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat79 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale73);
        extendedMessageFormat16.setLocale(locale73);
        java.lang.String str81 = extendedMessageFormat16.toPattern();
        java.util.Locale locale82 = extendedMessageFormat16.getLocale();
        extendedMessageFormat1.setLocale(locale82);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat85 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray87 = extendedMessageFormat85.parse("hi!");
        java.util.Locale locale88 = null;
        extendedMessageFormat85.setLocale(locale88);
        java.util.Locale locale90 = null;
        extendedMessageFormat85.setLocale(locale90);
        extendedMessageFormat85.applyPattern("hi!");
        java.text.Format[] formatArray94 = extendedMessageFormat85.getFormatsByArgumentIndex();
        java.text.Format[] formatArray95 = extendedMessageFormat85.getFormatsByArgumentIndex();
        java.lang.String str96 = extendedMessageFormat85.toPattern();
        java.lang.String str97 = extendedMessageFormat85.toPattern();
        java.text.Format[] formatArray98 = extendedMessageFormat85.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray98);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray42);
        org.junit.Assert.assertArrayEquals(formatArray42, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray52);
        org.junit.Assert.assertArrayEquals(formatArray52, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(formatArray59);
        org.junit.Assert.assertArrayEquals(formatArray59, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray71);
        org.junit.Assert.assertArrayEquals(formatArray71, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertArrayEquals(objArray87, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray94);
        org.junit.Assert.assertArrayEquals(formatArray94, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray95);
        org.junit.Assert.assertArrayEquals(formatArray95, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "hi!" + "'", str96, "hi!");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "hi!" + "'", str97, "hi!");
        org.junit.Assert.assertNotNull(formatArray98);
        org.junit.Assert.assertArrayEquals(formatArray98, new java.text.Format[] {});
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale11 = extendedMessageFormat2.getLocale();
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        extendedMessageFormat15.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray21 = extendedMessageFormat19.parse("hi!");
        java.lang.String str22 = extendedMessageFormat15.format((java.lang.Object) objArray21);
        java.lang.String str23 = extendedMessageFormat15.toPattern();
        java.util.Locale locale24 = null;
        extendedMessageFormat15.setLocale(locale24);
        java.util.Locale locale27 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale27);
        extendedMessageFormat28.applyPattern("");
        java.text.Format[] formatArray31 = extendedMessageFormat28.getFormats();
        java.lang.String str32 = extendedMessageFormat28.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat35.applyPattern("");
        java.text.Format[] formatArray38 = extendedMessageFormat35.getFormats();
        java.lang.String str39 = extendedMessageFormat35.toPattern();
        java.util.Locale locale40 = extendedMessageFormat35.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale40);
        extendedMessageFormat28.setLocale(locale40);
        extendedMessageFormat15.setLocale(locale40);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale40);
        extendedMessageFormat2.setLocale(locale40);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale49 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale49);
        extendedMessageFormat50.applyPattern("");
        java.text.Format[] formatArray53 = extendedMessageFormat50.getFormats();
        java.text.Format[] formatArray54 = extendedMessageFormat50.getFormats();
        extendedMessageFormat50.applyPattern("hi!");
        java.util.Locale locale61 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat62 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale61);
        extendedMessageFormat62.applyPattern("");
        java.text.Format[] formatArray65 = extendedMessageFormat62.getFormats();
        java.lang.String str66 = extendedMessageFormat62.toPattern();
        extendedMessageFormat62.applyPattern("");
        java.lang.String str69 = extendedMessageFormat62.toPattern();
        java.text.Format[] formatArray70 = extendedMessageFormat62.getFormats();
        java.text.Format[] formatArray71 = extendedMessageFormat62.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat73 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat73.applyPattern("");
        java.text.Format[] formatArray76 = extendedMessageFormat73.getFormats();
        java.lang.String str77 = extendedMessageFormat73.toPattern();
        java.util.Locale locale78 = extendedMessageFormat73.getLocale();
        extendedMessageFormat62.setLocale(locale78);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat80 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale78);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat81 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale78);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat82 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale78);
        extendedMessageFormat50.setLocale(locale78);
        extendedMessageFormat2.setLocale(locale78);
        java.lang.String str85 = extendedMessageFormat2.toPattern();
        java.util.Locale locale88 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat89 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale88);
        java.util.Locale locale90 = extendedMessageFormat89.getLocale();
        extendedMessageFormat89.applyPattern("hi!");
        java.lang.String str93 = extendedMessageFormat89.toPattern();
        extendedMessageFormat89.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex(0, (java.text.Format) extendedMessageFormat89);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray53);
        org.junit.Assert.assertArrayEquals(formatArray53, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray54);
        org.junit.Assert.assertArrayEquals(formatArray54, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray65);
        org.junit.Assert.assertArrayEquals(formatArray65, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(formatArray70);
        org.junit.Assert.assertArrayEquals(formatArray70, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray71);
        org.junit.Assert.assertArrayEquals(formatArray71, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray76);
        org.junit.Assert.assertArrayEquals(formatArray76, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNull(locale90);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormats();
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        java.lang.String str18 = extendedMessageFormat14.toPattern();
        extendedMessageFormat14.applyPattern("");
        java.lang.String str21 = extendedMessageFormat14.toPattern();
        java.text.Format[] formatArray22 = extendedMessageFormat14.getFormats();
        java.text.Format[] formatArray23 = extendedMessageFormat14.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat25.applyPattern("");
        java.text.Format[] formatArray28 = extendedMessageFormat25.getFormats();
        java.lang.String str29 = extendedMessageFormat25.toPattern();
        java.util.Locale locale30 = extendedMessageFormat25.getLocale();
        extendedMessageFormat14.setLocale(locale30);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale30);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale30);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale30);
        extendedMessageFormat2.setLocale(locale30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray37 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        extendedMessageFormat4.applyPattern("");
        extendedMessageFormat4.applyPattern("");
        extendedMessageFormat4.applyPattern("hi!");
        java.lang.String str11 = extendedMessageFormat4.toPattern();
        java.lang.String str12 = extendedMessageFormat4.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat16.applyPattern("");
        java.text.Format[] formatArray19 = extendedMessageFormat16.getFormats();
        java.lang.String str20 = extendedMessageFormat16.toPattern();
        java.util.Locale locale21 = extendedMessageFormat16.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale21);
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale25);
        extendedMessageFormat26.applyPattern("");
        java.text.Format[] formatArray29 = extendedMessageFormat26.getFormats();
        java.lang.String str30 = extendedMessageFormat26.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat33.applyPattern("");
        java.text.Format[] formatArray36 = extendedMessageFormat33.getFormats();
        java.lang.String str37 = extendedMessageFormat33.toPattern();
        java.util.Locale locale38 = extendedMessageFormat33.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale38);
        extendedMessageFormat26.setLocale(locale38);
        extendedMessageFormat23.setLocale(locale38);
        extendedMessageFormat4.setLocale(locale38);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale38);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale38);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat46.applyPattern("");
        java.text.Format[] formatArray49 = extendedMessageFormat46.getFormats();
        java.util.Locale locale50 = null;
        extendedMessageFormat46.setLocale(locale50);
        java.text.Format[] formatArray52 = extendedMessageFormat46.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat56 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat56.applyPattern("");
        java.util.Locale locale59 = extendedMessageFormat56.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale59);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale59);
        extendedMessageFormat46.setLocale(locale59);
        extendedMessageFormat44.setLocale(locale59);
        java.util.Locale locale64 = extendedMessageFormat44.getLocale();
        java.util.Locale locale66 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat67 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale66);
        extendedMessageFormat67.applyPattern("");
        java.text.Format[] formatArray70 = extendedMessageFormat67.getFormatsByArgumentIndex();
        java.lang.String str71 = extendedMessageFormat67.toPattern();
        java.text.Format[] formatArray72 = extendedMessageFormat67.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat44.setFormatsByArgumentIndex(formatArray72);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray52);
        org.junit.Assert.assertArrayEquals(formatArray52, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray70);
        org.junit.Assert.assertArrayEquals(formatArray70, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(formatArray72);
        org.junit.Assert.assertArrayEquals(formatArray72, new java.text.Format[] {});
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        extendedMessageFormat15.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray21 = extendedMessageFormat19.parse("hi!");
        java.lang.String str22 = extendedMessageFormat15.format((java.lang.Object) objArray21);
        java.util.Locale locale23 = extendedMessageFormat15.getLocale();
        java.text.Format[] formatArray24 = extendedMessageFormat15.getFormats();
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale26);
        extendedMessageFormat27.applyPattern("");
        java.util.Locale locale30 = extendedMessageFormat27.getLocale();
        java.text.Format[] formatArray31 = extendedMessageFormat27.getFormats();
        java.text.Format[] formatArray32 = extendedMessageFormat27.getFormats();
        java.lang.String str33 = extendedMessageFormat27.toPattern();
        java.util.Locale locale34 = null;
        extendedMessageFormat27.setLocale(locale34);
        java.lang.String str36 = extendedMessageFormat15.format((java.lang.Object) locale34);
        java.lang.String str37 = extendedMessageFormat15.toPattern();
        java.util.Locale locale39 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale39);
        extendedMessageFormat40.applyPattern("");
        java.util.Locale locale43 = null;
        extendedMessageFormat40.setLocale(locale43);
        java.util.Locale locale45 = null;
        extendedMessageFormat40.setLocale(locale45);
        java.util.Locale locale47 = null;
        extendedMessageFormat40.setLocale(locale47);
        java.lang.String str49 = extendedMessageFormat40.toPattern();
        extendedMessageFormat40.applyPattern("");
        java.util.Locale locale54 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale54);
        extendedMessageFormat55.applyPattern("");
        java.text.Format[] formatArray58 = extendedMessageFormat55.getFormats();
        java.lang.String str59 = extendedMessageFormat55.toPattern();
        java.util.Locale locale60 = extendedMessageFormat55.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat62 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale63 = extendedMessageFormat62.getLocale();
        extendedMessageFormat55.setLocale(locale63);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat65 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale63);
        extendedMessageFormat40.setLocale(locale63);
        extendedMessageFormat15.setLocale(locale63);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex(0, (java.text.Format) extendedMessageFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(locale23);
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale30);
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(formatArray58);
        org.junit.Assert.assertArrayEquals(formatArray58, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(locale60);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "th_TH");
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = null;
        extendedMessageFormat3.setLocale(locale6);
        java.util.Locale locale8 = extendedMessageFormat3.getLocale();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat12.getFormats();
        java.lang.String str16 = extendedMessageFormat12.toPattern();
        extendedMessageFormat12.applyPattern("");
        java.lang.String str19 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray20 = extendedMessageFormat12.getFormats();
        java.text.Format[] formatArray21 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale23);
        extendedMessageFormat24.applyPattern("");
        extendedMessageFormat24.applyPattern("");
        extendedMessageFormat24.applyPattern("hi!");
        java.lang.String str31 = extendedMessageFormat24.toPattern();
        java.lang.String str32 = extendedMessageFormat24.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat36.applyPattern("");
        java.text.Format[] formatArray39 = extendedMessageFormat36.getFormats();
        java.lang.String str40 = extendedMessageFormat36.toPattern();
        java.util.Locale locale41 = extendedMessageFormat36.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale41);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale41);
        java.util.Locale locale45 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale45);
        extendedMessageFormat46.applyPattern("");
        java.text.Format[] formatArray49 = extendedMessageFormat46.getFormats();
        java.lang.String str50 = extendedMessageFormat46.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat53 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat53.applyPattern("");
        java.text.Format[] formatArray56 = extendedMessageFormat53.getFormats();
        java.lang.String str57 = extendedMessageFormat53.toPattern();
        java.util.Locale locale58 = extendedMessageFormat53.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat59 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale58);
        extendedMessageFormat46.setLocale(locale58);
        extendedMessageFormat43.setLocale(locale58);
        extendedMessageFormat24.setLocale(locale58);
        extendedMessageFormat12.setLocale(locale58);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat64 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale58);
        extendedMessageFormat3.setLocale(locale58);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat66 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale58);
        extendedMessageFormat66.applyPattern("");
        java.text.Format[] formatArray69 = extendedMessageFormat66.getFormats();
        java.util.Locale locale70 = extendedMessageFormat66.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat71 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale70);
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(formatArray56);
        org.junit.Assert.assertArrayEquals(formatArray56, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray69);
        org.junit.Assert.assertArrayEquals(formatArray69, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "th_TH");
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.util.Locale locale14 = extendedMessageFormat12.getLocale();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        extendedMessageFormat17.applyPattern("");
        java.text.Format[] formatArray20 = extendedMessageFormat17.getFormatsByArgumentIndex();
        extendedMessageFormat17.applyPattern("");
        java.text.Format[] formatArray23 = extendedMessageFormat17.getFormatsByArgumentIndex();
        extendedMessageFormat17.applyPattern("hi!");
        java.lang.Object[] objArray27 = extendedMessageFormat17.parse("hi!");
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        extendedMessageFormat30.applyPattern("");
        java.text.Format[] formatArray33 = extendedMessageFormat30.getFormats();
        java.lang.String str34 = extendedMessageFormat30.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat37.applyPattern("");
        java.text.Format[] formatArray40 = extendedMessageFormat37.getFormats();
        java.lang.String str41 = extendedMessageFormat37.toPattern();
        java.util.Locale locale42 = extendedMessageFormat37.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        extendedMessageFormat30.setLocale(locale42);
        extendedMessageFormat17.setLocale(locale42);
        extendedMessageFormat12.setLocale(locale42);
        extendedMessageFormat2.setLocale(locale42);
        java.util.Locale locale48 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat49 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale48);
        java.text.ParsePosition parsePosition51 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = extendedMessageFormat49.parseObject("hi!", parsePosition51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(formatArray40);
        org.junit.Assert.assertArrayEquals(formatArray40, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.lang.String str11 = extendedMessageFormat10.toPattern();
        extendedMessageFormat10.applyPattern("hi!");
        java.lang.Object[] objArray15 = extendedMessageFormat10.parse("hi!");
        java.text.Format[] formatArray16 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator17 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) formatArray16);
        java.text.Format[] formatArray18 = extendedMessageFormat1.getFormats();
        java.lang.Object obj19 = extendedMessageFormat1.clone();
        java.lang.Class<?> wildcardClass20 = extendedMessageFormat1.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator17);
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormats();
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat18.applyPattern("");
        java.text.Format[] formatArray21 = extendedMessageFormat18.getFormats();
        java.lang.String str22 = extendedMessageFormat18.toPattern();
        java.util.Locale locale23 = extendedMessageFormat18.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale23);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale23);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale23);
        java.text.Format[] formatArray27 = extendedMessageFormat26.getFormats();
        extendedMessageFormat26.applyPattern("hi!");
        java.util.Locale locale30 = extendedMessageFormat26.getLocale();
        extendedMessageFormat2.setLocale(locale30);
        java.lang.String str32 = extendedMessageFormat2.toPattern();
        java.util.Locale locale34 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale34);
        extendedMessageFormat35.applyPattern("");
        extendedMessageFormat35.applyPattern("");
        java.text.Format[] formatArray40 = extendedMessageFormat35.getFormatsByArgumentIndex();
        java.util.Locale locale42 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        extendedMessageFormat43.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray49 = extendedMessageFormat47.parse("hi!");
        java.lang.String str50 = extendedMessageFormat43.format((java.lang.Object) objArray49);
        java.text.Format[] formatArray51 = extendedMessageFormat43.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat55.applyPattern("");
        java.text.Format[] formatArray58 = extendedMessageFormat55.getFormats();
        java.lang.String str59 = extendedMessageFormat55.toPattern();
        java.util.Locale locale60 = extendedMessageFormat55.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale60);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat62 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale60);
        extendedMessageFormat43.setLocale(locale60);
        extendedMessageFormat35.setLocale(locale60);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat66 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat66.applyPattern("");
        java.text.Format[] formatArray69 = extendedMessageFormat66.getFormats();
        java.lang.String str70 = extendedMessageFormat66.toPattern();
        java.util.Locale locale71 = extendedMessageFormat66.getLocale();
        extendedMessageFormat35.setLocale(locale71);
        java.text.Format[] formatArray73 = extendedMessageFormat35.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(formatArray40);
        org.junit.Assert.assertArrayEquals(formatArray40, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertArrayEquals(objArray49, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(formatArray51);
        org.junit.Assert.assertArrayEquals(formatArray51, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray58);
        org.junit.Assert.assertArrayEquals(formatArray58, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray69);
        org.junit.Assert.assertArrayEquals(formatArray69, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray73);
        org.junit.Assert.assertArrayEquals(formatArray73, new java.text.Format[] {});
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.util.Locale locale8 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        extendedMessageFormat3.setLocale(locale11);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale11);
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormats();
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        extendedMessageFormat13.applyPattern("");
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormats();
        java.text.Format[] formatArray17 = extendedMessageFormat13.getFormats();
        java.util.Locale locale18 = null;
        extendedMessageFormat13.setLocale(locale18);
        extendedMessageFormat13.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat25.applyPattern("");
        java.text.Format[] formatArray28 = extendedMessageFormat25.getFormats();
        java.lang.String str29 = extendedMessageFormat25.toPattern();
        java.util.Locale locale30 = extendedMessageFormat25.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale30);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale30);
        java.util.Locale locale34 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale34);
        extendedMessageFormat35.applyPattern("");
        java.text.Format[] formatArray38 = extendedMessageFormat35.getFormats();
        java.lang.String str39 = extendedMessageFormat35.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat42.applyPattern("");
        java.text.Format[] formatArray45 = extendedMessageFormat42.getFormats();
        java.lang.String str46 = extendedMessageFormat42.toPattern();
        java.util.Locale locale47 = extendedMessageFormat42.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale47);
        extendedMessageFormat35.setLocale(locale47);
        extendedMessageFormat32.setLocale(locale47);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat54 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat54.applyPattern("");
        java.text.Format[] formatArray57 = extendedMessageFormat54.getFormats();
        java.lang.String str58 = extendedMessageFormat54.toPattern();
        java.util.Locale locale59 = extendedMessageFormat54.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale59);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale59);
        extendedMessageFormat32.setLocale(locale59);
        extendedMessageFormat13.setLocale(locale59);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat64 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale59);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat65 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale59);
        extendedMessageFormat2.setLocale(locale59);
        java.lang.String str67 = extendedMessageFormat2.toPattern();
        java.util.Locale locale68 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat69 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale68);
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(formatArray45);
        org.junit.Assert.assertArrayEquals(formatArray45, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray57);
        org.junit.Assert.assertArrayEquals(formatArray57, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "th_TH");
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        java.lang.String str10 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray12 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale13 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat16.applyPattern("");
        java.text.Format[] formatArray19 = extendedMessageFormat16.getFormats();
        java.lang.String str20 = extendedMessageFormat16.toPattern();
        java.util.Locale locale21 = extendedMessageFormat16.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        extendedMessageFormat3.setLocale(locale21);
        java.util.Locale locale24 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale24);
        java.text.Format[] formatArray26 = extendedMessageFormat25.getFormats();
        java.text.ParsePosition parsePosition28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = extendedMessageFormat25.parseObject("", parsePosition28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.lang.String str15 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray16 = extendedMessageFormat12.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator17 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) formatArray16);
        java.text.Format[] formatArray18 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat21.applyPattern("");
        java.util.Locale locale24 = null;
        extendedMessageFormat21.setLocale(locale24);
        java.util.Locale locale26 = extendedMessageFormat21.getLocale();
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale29);
        extendedMessageFormat30.applyPattern("");
        java.text.Format[] formatArray33 = extendedMessageFormat30.getFormats();
        java.lang.String str34 = extendedMessageFormat30.toPattern();
        extendedMessageFormat30.applyPattern("");
        java.lang.String str37 = extendedMessageFormat30.toPattern();
        java.text.Format[] formatArray38 = extendedMessageFormat30.getFormats();
        java.text.Format[] formatArray39 = extendedMessageFormat30.getFormatsByArgumentIndex();
        java.util.Locale locale41 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale41);
        extendedMessageFormat42.applyPattern("");
        extendedMessageFormat42.applyPattern("");
        extendedMessageFormat42.applyPattern("hi!");
        java.lang.String str49 = extendedMessageFormat42.toPattern();
        java.lang.String str50 = extendedMessageFormat42.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat54 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat54.applyPattern("");
        java.text.Format[] formatArray57 = extendedMessageFormat54.getFormats();
        java.lang.String str58 = extendedMessageFormat54.toPattern();
        java.util.Locale locale59 = extendedMessageFormat54.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale59);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale59);
        java.util.Locale locale63 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat64 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale63);
        extendedMessageFormat64.applyPattern("");
        java.text.Format[] formatArray67 = extendedMessageFormat64.getFormats();
        java.lang.String str68 = extendedMessageFormat64.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat71 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat71.applyPattern("");
        java.text.Format[] formatArray74 = extendedMessageFormat71.getFormats();
        java.lang.String str75 = extendedMessageFormat71.toPattern();
        java.util.Locale locale76 = extendedMessageFormat71.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat77 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale76);
        extendedMessageFormat64.setLocale(locale76);
        extendedMessageFormat61.setLocale(locale76);
        extendedMessageFormat42.setLocale(locale76);
        extendedMessageFormat30.setLocale(locale76);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat82 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale76);
        extendedMessageFormat21.setLocale(locale76);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat84 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale76);
        java.lang.String str85 = extendedMessageFormat84.toPattern();
        java.text.Format[] formatArray86 = extendedMessageFormat84.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer87 = null;
        java.text.FieldPosition fieldPosition88 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer89 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat84, stringBuffer87, fieldPosition88);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator17);
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale26);
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(formatArray57);
        org.junit.Assert.assertArrayEquals(formatArray57, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray67);
        org.junit.Assert.assertArrayEquals(formatArray67, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(formatArray74);
        org.junit.Assert.assertArrayEquals(formatArray74, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(formatArray86);
        org.junit.Assert.assertArrayEquals(formatArray86, new java.text.Format[] {});
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Locale locale13 = extendedMessageFormat11.getLocale();
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat16.applyPattern("");
        java.text.Format[] formatArray19 = extendedMessageFormat16.getFormatsByArgumentIndex();
        extendedMessageFormat16.applyPattern("");
        java.text.Format[] formatArray22 = extendedMessageFormat16.getFormatsByArgumentIndex();
        extendedMessageFormat16.applyPattern("hi!");
        java.lang.Object[] objArray26 = extendedMessageFormat16.parse("hi!");
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale28);
        extendedMessageFormat29.applyPattern("");
        java.text.Format[] formatArray32 = extendedMessageFormat29.getFormats();
        java.lang.String str33 = extendedMessageFormat29.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat36.applyPattern("");
        java.text.Format[] formatArray39 = extendedMessageFormat36.getFormats();
        java.lang.String str40 = extendedMessageFormat36.toPattern();
        java.util.Locale locale41 = extendedMessageFormat36.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale41);
        extendedMessageFormat29.setLocale(locale41);
        extendedMessageFormat16.setLocale(locale41);
        extendedMessageFormat11.setLocale(locale41);
        extendedMessageFormat1.setLocale(locale41);
        java.lang.String str47 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray48 = extendedMessageFormat1.getFormatsByArgumentIndex();
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.Object[] objArray52 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale55 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat56 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale55);
        extendedMessageFormat56.applyPattern("");
        java.lang.String str59 = extendedMessageFormat56.toPattern();
        java.util.Locale locale60 = extendedMessageFormat56.getLocale();
        java.text.Format[] formatArray61 = extendedMessageFormat56.getFormatsByArgumentIndex();
        java.lang.String str62 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray61);
        java.lang.StringBuffer stringBuffer63 = null;
        java.text.FieldPosition fieldPosition64 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer65 = extendedMessageFormat1.format((java.lang.Object) "", stringBuffer63, fieldPosition64);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(formatArray48);
        org.junit.Assert.assertArrayEquals(formatArray48, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertArrayEquals(objArray52, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(locale60);
        org.junit.Assert.assertNotNull(formatArray61);
        org.junit.Assert.assertArrayEquals(formatArray61, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        extendedMessageFormat3.applyPattern("");
        extendedMessageFormat3.applyPattern("hi!");
        java.text.Format[] formatArray10 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str11 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray10);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale11 = extendedMessageFormat2.getLocale();
        java.util.Locale locale12 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = extendedMessageFormat2.parseObject("", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNull(locale12);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat12.getFormatsByArgumentIndex();
        extendedMessageFormat12.applyPattern("");
        java.text.Format[] formatArray18 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.text.Format[] formatArray19 = extendedMessageFormat12.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat23.applyPattern("");
        java.text.Format[] formatArray26 = extendedMessageFormat23.getFormats();
        java.lang.String str27 = extendedMessageFormat23.toPattern();
        java.util.Locale locale28 = extendedMessageFormat23.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale28);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale28);
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale32);
        extendedMessageFormat33.applyPattern("");
        java.text.Format[] formatArray36 = extendedMessageFormat33.getFormats();
        java.lang.String str37 = extendedMessageFormat33.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat40.applyPattern("");
        java.text.Format[] formatArray43 = extendedMessageFormat40.getFormats();
        java.lang.String str44 = extendedMessageFormat40.toPattern();
        java.util.Locale locale45 = extendedMessageFormat40.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale45);
        extendedMessageFormat33.setLocale(locale45);
        extendedMessageFormat30.setLocale(locale45);
        extendedMessageFormat12.setLocale(locale45);
        java.text.Format[] formatArray50 = extendedMessageFormat12.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator51 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) formatArray50);
        java.lang.String str52 = extendedMessageFormat2.toPattern();
        java.util.Locale locale53 = extendedMessageFormat2.getLocale();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale56 = extendedMessageFormat2.getLocale();
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray36);
        org.junit.Assert.assertArrayEquals(formatArray36, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(formatArray43);
        org.junit.Assert.assertArrayEquals(formatArray43, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray50);
        org.junit.Assert.assertArrayEquals(formatArray50, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(locale53);
        org.junit.Assert.assertNull(locale56);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat5.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormats();
        java.lang.String str9 = extendedMessageFormat5.toPattern();
        java.util.Locale locale10 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat2.setLocale(locale10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.text.Format[] formatArray15 = extendedMessageFormat13.getFormats();
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormats();
        java.lang.String str14 = extendedMessageFormat10.toPattern();
        java.util.Locale locale15 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat7.setLocale(locale15);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat2.setLocale(locale15);
        java.text.Format[] formatArray20 = extendedMessageFormat2.getFormats();
        java.lang.String str21 = extendedMessageFormat2.toPattern();
        java.lang.String str22 = extendedMessageFormat2.toPattern();
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale25);
        extendedMessageFormat26.applyPattern("");
        java.util.Locale locale29 = null;
        extendedMessageFormat26.setLocale(locale29);
        java.util.Locale locale31 = null;
        extendedMessageFormat26.setLocale(locale31);
        java.util.Locale locale33 = null;
        extendedMessageFormat26.setLocale(locale33);
        extendedMessageFormat26.applyPattern("");
        java.text.Format[] formatArray37 = extendedMessageFormat26.getFormats();
        java.lang.String str38 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray37);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        java.text.Format[] formatArray14 = extendedMessageFormat11.getFormats();
        java.lang.String str15 = extendedMessageFormat11.toPattern();
        extendedMessageFormat11.applyPattern("");
        java.lang.String str18 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray19 = extendedMessageFormat11.getFormats();
        java.text.Format[] formatArray20 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.util.Locale locale21 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat26.applyPattern("");
        java.text.Format[] formatArray29 = extendedMessageFormat26.getFormats();
        java.lang.String str30 = extendedMessageFormat26.toPattern();
        java.util.Locale locale31 = extendedMessageFormat26.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale31);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale31);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale31);
        extendedMessageFormat11.setLocale(locale31);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale31);
        java.text.Format[] formatArray37 = extendedMessageFormat36.getFormats();
        java.lang.String str38 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray37);
        java.lang.StringBuffer stringBuffer39 = null;
        java.text.FieldPosition fieldPosition40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer41 = extendedMessageFormat2.format((java.lang.Object[]) formatArray37, stringBuffer39, fieldPosition40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale21);
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        extendedMessageFormat3.applyPattern("");
        extendedMessageFormat3.applyPattern("hi!");
        java.text.Format[] formatArray10 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.Format[] formatArray13 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat16.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray22 = extendedMessageFormat20.parse("hi!");
        java.lang.String str23 = extendedMessageFormat16.format((java.lang.Object) objArray22);
        java.util.Locale locale24 = extendedMessageFormat16.getLocale();
        java.lang.String str25 = extendedMessageFormat16.toPattern();
        extendedMessageFormat16.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat31.applyPattern("");
        java.util.Locale locale34 = extendedMessageFormat31.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale34);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale34);
        extendedMessageFormat16.setLocale(locale34);
        extendedMessageFormat3.setLocale(locale34);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale34);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(locale24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat16.applyPattern("");
        java.text.Format[] formatArray19 = extendedMessageFormat16.getFormats();
        java.lang.String str20 = extendedMessageFormat16.toPattern();
        java.util.Locale locale21 = extendedMessageFormat16.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale21);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        java.text.Format[] formatArray25 = extendedMessageFormat24.getFormats();
        java.lang.String str26 = extendedMessageFormat2.format((java.lang.Object) formatArray25);
        java.text.Format[] formatArray27 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale32);
        extendedMessageFormat33.applyPattern("");
        java.util.Locale locale36 = extendedMessageFormat33.getLocale();
        java.lang.String str37 = extendedMessageFormat33.toPattern();
        java.text.Format[] formatArray38 = extendedMessageFormat33.getFormats();
        java.util.Locale locale40 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale40);
        java.util.Locale locale42 = extendedMessageFormat41.getLocale();
        java.util.Locale locale43 = null;
        extendedMessageFormat41.setLocale(locale43);
        java.util.Locale locale45 = extendedMessageFormat41.getLocale();
        java.util.Locale locale47 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale47);
        extendedMessageFormat48.applyPattern("");
        extendedMessageFormat48.applyPattern("");
        extendedMessageFormat48.applyPattern("hi!");
        java.lang.String str55 = extendedMessageFormat48.toPattern();
        java.lang.String str56 = extendedMessageFormat48.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat60 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat60.applyPattern("");
        java.text.Format[] formatArray63 = extendedMessageFormat60.getFormats();
        java.lang.String str64 = extendedMessageFormat60.toPattern();
        java.util.Locale locale65 = extendedMessageFormat60.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat66 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale65);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat67 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale65);
        java.util.Locale locale69 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat70 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale69);
        extendedMessageFormat70.applyPattern("");
        java.text.Format[] formatArray73 = extendedMessageFormat70.getFormats();
        java.lang.String str74 = extendedMessageFormat70.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat77 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat77.applyPattern("");
        java.text.Format[] formatArray80 = extendedMessageFormat77.getFormats();
        java.lang.String str81 = extendedMessageFormat77.toPattern();
        java.util.Locale locale82 = extendedMessageFormat77.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat83 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale82);
        extendedMessageFormat70.setLocale(locale82);
        extendedMessageFormat67.setLocale(locale82);
        extendedMessageFormat48.setLocale(locale82);
        extendedMessageFormat41.setLocale(locale82);
        extendedMessageFormat33.setLocale(locale82);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat89 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale82);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat90 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale82);
        java.util.Locale locale91 = extendedMessageFormat90.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex(100, (java.text.Format) extendedMessageFormat90);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale42);
        org.junit.Assert.assertNull(locale45);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(formatArray63);
        org.junit.Assert.assertArrayEquals(formatArray63, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray73);
        org.junit.Assert.assertArrayEquals(formatArray73, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(formatArray80);
        org.junit.Assert.assertArrayEquals(formatArray80, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "th_TH");
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = extendedMessageFormat2.parse("hi!", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        java.lang.String str15 = extendedMessageFormat14.toPattern();
        java.text.Format[] formatArray16 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.lang.String str17 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray16);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }
}

