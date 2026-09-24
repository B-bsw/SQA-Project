package org.apache.commons.lang.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar9 = null;
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.StringBuffer stringBuffer11 = fastDateFormat8.format(calendar9, stringBuffer10);
        java.util.TimeZone timeZone12 = fastDateFormat8.getTimeZone();
        java.util.TimeZone timeZone14 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone14);
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12, locale16);
        java.util.TimeZone timeZone19 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone19);
        java.util.Locale locale21 = fastDateFormat20.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone12, locale21);
        java.util.TimeZone timeZone24 = null;
        java.util.TimeZone timeZone26 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale29);
        java.util.Locale locale31 = fastDateFormat30.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone26, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone24, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone12, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, locale31);
        java.util.TimeZone timeZone36 = fastDateFormat35.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale40 = fastDateFormat39.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone36, locale40);
        java.util.TimeZone timeZone50 = null;
        java.util.Locale locale51 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone50, locale51);
        java.util.TimeZone timeZone53 = fastDateFormat52.getTimeZone();
        java.util.TimeZone timeZone54 = fastDateFormat52.getTimeZone();
        java.util.TimeZone timeZone58 = null;
        java.util.Locale locale59 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone58, locale59);
        java.util.TimeZone timeZone61 = fastDateFormat60.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getInstance("'0", timeZone61);
        java.util.TimeZone timeZone64 = null;
        java.util.Locale locale65 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone64, locale65);
        java.util.Locale locale67 = fastDateFormat66.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone61, locale67);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, 3, timeZone54, locale67);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone54);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        java.util.TimeZone timeZone75 = fastDateFormat74.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone75);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar81 = null;
        java.lang.StringBuffer stringBuffer82 = null;
        java.lang.StringBuffer stringBuffer83 = fastDateFormat80.format(calendar81, stringBuffer82);
        java.util.TimeZone timeZone84 = fastDateFormat80.getTimeZone();
        java.util.TimeZone timeZone86 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone86);
        java.util.Locale locale88 = fastDateFormat87.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat89 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone84, locale88);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat90 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale88);
        java.util.List list91 = fastDateFormat90.parsePattern();
        java.util.TimeZone timeZone92 = fastDateFormat90.getTimeZone();
        java.util.Locale locale93 = fastDateFormat90.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat94 = org.apache.commons.lang.time.FastDateFormat.getInstance("7", timeZone75, locale93);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat95 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone54, locale93);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat96 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, 0, locale93);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat97 = org.apache.commons.lang.time.FastDateFormat.getInstance("'1/70 07:00", locale93);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat98 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(62, timeZone36, locale93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 62");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNull(stringBuffer11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(timeZone61);
        org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(timeZone75);
        org.junit.Assert.assertEquals(timeZone75.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertNull(stringBuffer83);
        org.junit.Assert.assertNotNull(timeZone84);
        org.junit.Assert.assertEquals(timeZone84.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat89);
        org.junit.Assert.assertNotNull(fastDateFormat90);
        org.junit.Assert.assertNotNull(list91);
        org.junit.Assert.assertNotNull(timeZone92);
        org.junit.Assert.assertEquals(timeZone92.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale93);
        org.junit.Assert.assertEquals(locale93.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat94);
        org.junit.Assert.assertNotNull(fastDateFormat95);
        org.junit.Assert.assertNotNull(fastDateFormat96);
        org.junit.Assert.assertNotNull(fastDateFormat97);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat5.format(calendar6, stringBuffer7);
        java.util.TimeZone timeZone9 = fastDateFormat5.getTimeZone();
        java.util.TimeZone timeZone11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9, locale13);
        java.util.TimeZone timeZone16 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone16);
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone9, locale18);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar27 = null;
        java.lang.StringBuffer stringBuffer28 = null;
        java.lang.StringBuffer stringBuffer29 = fastDateFormat26.format(calendar27, stringBuffer28);
        java.util.TimeZone timeZone30 = fastDateFormat26.getTimeZone();
        java.util.TimeZone timeZone32 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone32);
        java.util.Locale locale34 = fastDateFormat33.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone30, locale34);
        java.util.TimeZone timeZone37 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone37);
        java.util.Locale locale39 = fastDateFormat38.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone30, locale39);
        java.util.TimeZone timeZone42 = null;
        java.util.TimeZone timeZone44 = null;
        java.util.Locale locale47 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale47);
        java.util.Locale locale49 = fastDateFormat48.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone44, locale49);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone42, locale49);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone30, locale49);
        java.util.TimeZone timeZone54 = null;
        java.util.TimeZone timeZone56 = null;
        java.util.TimeZone timeZone58 = null;
        java.util.Locale locale61 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale61);
        java.util.Locale locale63 = fastDateFormat62.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone58, locale63);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone56, locale63);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone54, locale63);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone30, locale63);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar72 = null;
        java.lang.StringBuffer stringBuffer73 = null;
        java.lang.StringBuffer stringBuffer74 = fastDateFormat71.format(calendar72, stringBuffer73);
        java.util.TimeZone timeZone75 = fastDateFormat71.getTimeZone();
        java.util.TimeZone timeZone77 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone77);
        java.util.Locale locale79 = fastDateFormat78.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone75, locale79);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale79);
        java.lang.String str82 = fastDateFormat81.toString();
        int int83 = fastDateFormat81.getMaxLengthEstimate();
        java.util.Locale locale84 = fastDateFormat81.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat85 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z", timeZone30, locale84);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang.time.FastDateFormat.getInstance("7", timeZone9, locale84);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat89 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0);
        boolean boolean90 = fastDateFormat89.getTimeZoneOverridesCalendar();
        java.util.Locale locale91 = fastDateFormat89.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat92 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e21\u0e04. 70", locale91);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat93 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[1/1/70]", timeZone9, locale91);
        // The following exception was thrown during execution in test generation
        try {
            fastDateFormat93.init();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNull(stringBuffer29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNull(stringBuffer74);
        org.junit.Assert.assertNotNull(timeZone75);
        org.junit.Assert.assertEquals(timeZone75.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "FastDateFormat[]" + "'", str82, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat85);
        org.junit.Assert.assertNotNull(fastDateFormat86);
        org.junit.Assert.assertNotNull(fastDateFormat89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat92);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat6.format(calendar7, stringBuffer8);
        java.util.TimeZone timeZone10 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale14);
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone17);
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone10, locale19);
        java.util.TimeZone timeZone22 = null;
        java.util.TimeZone timeZone24 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale27);
        java.util.Locale locale29 = fastDateFormat28.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone24, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone22, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone10, locale29);
        java.util.TimeZone timeZone34 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale37);
        java.util.Locale locale39 = fastDateFormat38.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone34, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone10, locale39);
        java.util.TimeZone timeZone42 = fastDateFormat41.getTimeZone();
        java.util.TimeZone timeZone46 = null;
        java.util.TimeZone timeZone48 = null;
        java.util.Locale locale51 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale51);
        java.util.Locale locale53 = fastDateFormat52.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone48, locale53);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone46, locale53);
        java.util.Locale locale57 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale57);
        java.lang.String str60 = fastDateFormat58.format((java.lang.Object) 1L);
        boolean boolean61 = fastDateFormat55.equals((java.lang.Object) str60);
        int[] intArray65 = new int[] { (short) 0, (short) 0 };
        java.lang.String str66 = fastDateFormat55.parseToken("hi!", intArray65);
        int int67 = fastDateFormat55.getMaxLengthEstimate();
        java.util.Locale locale70 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale70);
        java.util.Locale locale72 = fastDateFormat71.getLocale();
        boolean boolean73 = fastDateFormat55.equals((java.lang.Object) locale72);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z", locale72);
        java.lang.String str76 = fastDateFormat74.format(1L);
        java.util.TimeZone timeZone77 = fastDateFormat74.getTimeZone();
        java.util.TimeZone timeZone79 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone79);
        boolean boolean81 = fastDateFormat80.getTimeZoneOverridesCalendar();
        boolean boolean82 = fastDateFormat80.getTimeZoneOverridesCalendar();
        java.lang.String str83 = fastDateFormat80.getPattern();
        java.util.Locale locale84 = fastDateFormat80.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat85 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone77, locale84);
        java.util.Locale locale86 = fastDateFormat85.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat87 = new org.apache.commons.lang.time.FastDateFormat("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone42, locale86);
        java.util.TimeZone timeZone88 = fastDateFormat87.getTimeZone();
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNull(stringBuffer9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 0, 0 });
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "h" + "'", str66, "h");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 45 + "'", int67 == 45);
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT" + "'", str76, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT");
        org.junit.Assert.assertNotNull(timeZone77);
        org.junit.Assert.assertEquals(timeZone77.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
// flaky "1) test5003(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str83 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z" + "'", str83, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat85);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "th_TH");
        org.junit.Assert.assertNotNull(timeZone88);
        org.junit.Assert.assertEquals(timeZone88.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat5.format(calendar6, stringBuffer7);
        java.util.TimeZone timeZone9 = fastDateFormat5.getTimeZone();
        java.util.TimeZone timeZone11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9, locale13);
        java.util.TimeZone timeZone16 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone16);
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone9, locale18);
        boolean boolean20 = fastDateFormat19.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone21 = fastDateFormat19.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar26 = null;
        java.lang.StringBuffer stringBuffer27 = null;
        java.lang.StringBuffer stringBuffer28 = fastDateFormat25.format(calendar26, stringBuffer27);
        java.util.TimeZone timeZone29 = fastDateFormat25.getTimeZone();
        java.util.TimeZone timeZone31 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone31);
        java.util.Locale locale33 = fastDateFormat32.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone29, locale33);
        java.util.Locale locale37 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale37);
        java.util.Locale locale39 = fastDateFormat38.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone29, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = new org.apache.commons.lang.time.FastDateFormat("7", timeZone21, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(2, locale39);
        java.util.TimeZone timeZone44 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone44, locale45);
        java.util.Calendar calendar47 = null;
        java.lang.StringBuffer stringBuffer48 = null;
        java.lang.StringBuffer stringBuffer49 = fastDateFormat46.format(calendar47, stringBuffer48);
        java.lang.String str51 = fastDateFormat46.format((long) ' ');
        java.util.List list52 = fastDateFormat46.parsePattern();
        java.lang.Object obj53 = fastDateFormat46.clone();
        java.util.Calendar calendar54 = null;
        java.lang.StringBuffer stringBuffer55 = null;
        java.lang.StringBuffer stringBuffer56 = fastDateFormat46.applyRules(calendar54, stringBuffer55);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar63 = null;
        java.lang.StringBuffer stringBuffer64 = null;
        java.lang.StringBuffer stringBuffer65 = fastDateFormat62.format(calendar63, stringBuffer64);
        java.util.TimeZone timeZone66 = fastDateFormat62.getTimeZone();
        java.util.TimeZone timeZone68 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone68);
        java.util.Locale locale70 = fastDateFormat69.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone66, locale70);
        java.util.TimeZone timeZone73 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone73);
        java.util.Locale locale75 = fastDateFormat74.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat76 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone66, locale75);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone66);
        java.util.TimeZone timeZone79 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone79);
        java.util.Locale locale81 = fastDateFormat80.getLocale();
        int int82 = fastDateFormat80.getMaxLengthEstimate();
        java.util.Locale locale83 = fastDateFormat80.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone66, locale83);
        boolean boolean85 = fastDateFormat46.equals((java.lang.Object) fastDateFormat84);
        java.lang.String str86 = fastDateFormat46.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator87 = fastDateFormat42.formatToCharacterIterator((java.lang.Object) str86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNull(stringBuffer28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNull(stringBuffer49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "FastDateFormat[]");
        org.junit.Assert.assertNull(stringBuffer56);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNull(stringBuffer65);
        org.junit.Assert.assertNotNull(timeZone66);
        org.junit.Assert.assertEquals(timeZone66.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar9 = null;
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.StringBuffer stringBuffer11 = fastDateFormat8.format(calendar9, stringBuffer10);
        java.util.TimeZone timeZone12 = fastDateFormat8.getTimeZone();
        java.util.TimeZone timeZone14 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone14);
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12, locale16);
        java.util.TimeZone timeZone19 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone19);
        java.util.Locale locale21 = fastDateFormat20.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone12, locale21);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar28 = null;
        java.lang.StringBuffer stringBuffer29 = null;
        java.lang.StringBuffer stringBuffer30 = fastDateFormat27.format(calendar28, stringBuffer29);
        java.util.TimeZone timeZone31 = fastDateFormat27.getTimeZone();
        java.util.TimeZone timeZone33 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone33);
        java.util.Locale locale35 = fastDateFormat34.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone31, locale35);
        java.util.TimeZone timeZone40 = null;
        java.util.TimeZone timeZone42 = null;
        java.util.TimeZone timeZone44 = null;
        java.util.Locale locale47 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale47);
        java.util.Locale locale49 = fastDateFormat48.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone44, locale49);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone42, locale49);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone40, locale49);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar57 = null;
        java.lang.StringBuffer stringBuffer58 = null;
        java.lang.StringBuffer stringBuffer59 = fastDateFormat56.format(calendar57, stringBuffer58);
        java.util.TimeZone timeZone60 = fastDateFormat56.getTimeZone();
        java.util.TimeZone timeZone62 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone62);
        java.util.Locale locale64 = fastDateFormat63.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone60, locale64);
        java.util.TimeZone timeZone67 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone67);
        java.util.Locale locale69 = fastDateFormat68.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone60, locale69);
        boolean boolean71 = fastDateFormat52.equals((java.lang.Object) locale69);
        java.lang.String str72 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone31, true, 1, locale69);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e21\u0e04. 70", timeZone12, locale69);
        java.util.TimeZone timeZone77 = null;
        java.util.TimeZone timeZone79 = null;
        java.util.Locale locale82 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat83 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale82);
        java.util.Locale locale84 = fastDateFormat83.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat85 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone79, locale84);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone77, locale84);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, locale84);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat88 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale84);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat89 = org.apache.commons.lang.time.FastDateFormat.getInstance("'1/1/70", timeZone12, locale84);
        java.util.TimeZone timeZone92 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat93 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone92);
        java.util.Locale locale94 = fastDateFormat93.getLocale();
        java.util.Locale locale95 = fastDateFormat93.getLocale();
        int int96 = fastDateFormat93.getMaxLengthEstimate();
        java.util.Locale locale97 = fastDateFormat93.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat98 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, locale97);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat99 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70 07:00", timeZone12, locale97);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNull(stringBuffer11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNull(stringBuffer30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNull(stringBuffer59);
        org.junit.Assert.assertNotNull(timeZone60);
        org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Indochina Summer Time" + "'", str72, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat85);
        org.junit.Assert.assertNotNull(fastDateFormat86);
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(fastDateFormat88);
        org.junit.Assert.assertNotNull(fastDateFormat89);
        org.junit.Assert.assertNotNull(fastDateFormat93);
        org.junit.Assert.assertNotNull(locale94);
        org.junit.Assert.assertEquals(locale94.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale95);
        org.junit.Assert.assertEquals(locale95.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(locale97);
        org.junit.Assert.assertEquals(locale97.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat98);
        org.junit.Assert.assertNotNull(fastDateFormat99);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar11 = null;
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.StringBuffer stringBuffer13 = fastDateFormat10.format(calendar11, stringBuffer12);
        java.util.TimeZone timeZone14 = fastDateFormat10.getTimeZone();
        java.util.TimeZone timeZone16 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone16);
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone14, locale18);
        java.util.TimeZone timeZone21 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone21);
        java.util.Locale locale23 = fastDateFormat22.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone14, locale23);
        java.util.TimeZone timeZone26 = null;
        java.util.TimeZone timeZone28 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale31);
        java.util.Locale locale33 = fastDateFormat32.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone28, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone26, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone14, locale33);
        java.util.TimeZone timeZone38 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale41);
        java.util.Locale locale43 = fastDateFormat42.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone38, locale43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone14, locale43);
        java.util.Locale locale46 = fastDateFormat45.getLocale();
        java.util.TimeZone timeZone47 = fastDateFormat45.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone47);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("d MMMM y");
        java.lang.String str51 = fastDateFormat50.toString();
        java.util.Locale locale52 = fastDateFormat50.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = new org.apache.commons.lang.time.FastDateFormat("MM", timeZone47, locale52);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e21\u0e04. 70");
        fastDateFormat55.init();
        int int57 = fastDateFormat55.getMaxLengthEstimate();
        java.util.Locale locale58 = fastDateFormat55.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = new org.apache.commons.lang.time.FastDateFormat("\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70 07:00]", timeZone47, locale58);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(10, (int) (byte) -1, timeZone47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNull(stringBuffer13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "FastDateFormat[d MMMM y]" + "'", str51, "FastDateFormat[d MMMM y]");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat55);
// flaky "2) test5006(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 9 + "'", int57 == 9);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "th_TH");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat6.format(calendar7, stringBuffer8);
        java.util.TimeZone timeZone10 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale14);
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone17);
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone10, locale19);
        boolean boolean21 = fastDateFormat20.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone22 = fastDateFormat20.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar28 = null;
        java.lang.StringBuffer stringBuffer29 = null;
        java.lang.StringBuffer stringBuffer30 = fastDateFormat27.format(calendar28, stringBuffer29);
        java.util.TimeZone timeZone31 = fastDateFormat27.getTimeZone();
        java.util.TimeZone timeZone33 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone33);
        java.util.Locale locale35 = fastDateFormat34.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone31, locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = new org.apache.commons.lang.time.FastDateFormat("\u0e17\u0e35\u0e48 d MMMM GGGG y", timeZone22, locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale35);
        java.util.TimeZone timeZone41 = fastDateFormat40.getTimeZone();
        java.util.TimeZone timeZone47 = null;
        java.util.Locale locale48 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone47, locale48);
        java.util.TimeZone timeZone50 = fastDateFormat49.getTimeZone();
        java.util.TimeZone timeZone51 = fastDateFormat49.getTimeZone();
        java.util.TimeZone timeZone55 = null;
        java.util.Locale locale56 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone55, locale56);
        java.util.TimeZone timeZone58 = fastDateFormat57.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getInstance("'0", timeZone58);
        java.util.TimeZone timeZone61 = null;
        java.util.Locale locale62 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone61, locale62);
        java.util.Locale locale64 = fastDateFormat63.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone58, locale64);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, 3, timeZone51, locale64);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone51);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        java.util.TimeZone timeZone72 = fastDateFormat71.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone72);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar78 = null;
        java.lang.StringBuffer stringBuffer79 = null;
        java.lang.StringBuffer stringBuffer80 = fastDateFormat77.format(calendar78, stringBuffer79);
        java.util.TimeZone timeZone81 = fastDateFormat77.getTimeZone();
        java.util.TimeZone timeZone83 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone83);
        java.util.Locale locale85 = fastDateFormat84.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone81, locale85);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale85);
        java.util.List list88 = fastDateFormat87.parsePattern();
        java.util.TimeZone timeZone89 = fastDateFormat87.getTimeZone();
        java.util.Locale locale90 = fastDateFormat87.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat91 = org.apache.commons.lang.time.FastDateFormat.getInstance("7", timeZone72, locale90);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat92 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone51, locale90);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat93 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(8, timeZone41, locale90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNull(stringBuffer9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNull(stringBuffer30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(timeZone58);
        org.junit.Assert.assertEquals(timeZone58.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(timeZone72);
        org.junit.Assert.assertEquals(timeZone72.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNull(stringBuffer80);
        org.junit.Assert.assertNotNull(timeZone81);
        org.junit.Assert.assertEquals(timeZone81.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat86);
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(list88);
        org.junit.Assert.assertNotNull(timeZone89);
        org.junit.Assert.assertEquals(timeZone89.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat91);
        org.junit.Assert.assertNotNull(fastDateFormat92);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        java.util.TimeZone timeZone4 = null;
        java.util.TimeZone timeZone6 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale9);
        java.util.Locale locale11 = fastDateFormat10.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone6, locale11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone4, locale11);
        java.util.Locale locale15 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale15);
        java.lang.String str18 = fastDateFormat16.format((java.lang.Object) 1L);
        boolean boolean19 = fastDateFormat13.equals((java.lang.Object) str18);
        java.util.TimeZone timeZone20 = fastDateFormat13.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone20);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) '#', (int) ' ', timeZone22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        java.util.TimeZone timeZone4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone4, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone8 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12, locale13);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("'0", timeZone15);
        java.util.TimeZone timeZone18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone18, locale19);
        java.util.Locale locale21 = fastDateFormat20.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone15, locale21);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, 3, timeZone8, locale21);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone8);
        java.util.TimeZone timeZone27 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone27, locale28);
        java.util.Calendar calendar30 = null;
        java.lang.StringBuffer stringBuffer31 = null;
        java.lang.StringBuffer stringBuffer32 = fastDateFormat29.format(calendar30, stringBuffer31);
        int[] intArray40 = new int[] { (byte) 10, (short) 1, 16, '4', 10, 16 };
        java.lang.String str41 = fastDateFormat29.parseToken("'1/1/70 07:00", intArray40);
        java.lang.String str42 = fastDateFormat24.parseToken("FastDateFormat[FastDateFormat[]]", intArray40);
        java.lang.StringBuffer stringBuffer44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer45 = fastDateFormat24.format((long) '#', stringBuffer44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNull(stringBuffer32);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 13, 1, 16, 52, 10, 16 });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "':00" + "'", str41, "':00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "t" + "'", str42, "t");
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat4.format(calendar5, stringBuffer6);
        java.util.TimeZone timeZone8 = fastDateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8, locale12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar18 = null;
        java.lang.StringBuffer stringBuffer19 = null;
        java.lang.StringBuffer stringBuffer20 = fastDateFormat17.format(calendar18, stringBuffer19);
        java.util.TimeZone timeZone21 = fastDateFormat17.getTimeZone();
        java.util.TimeZone timeZone23 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone23);
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone21, locale25);
        java.util.TimeZone timeZone28 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone28);
        java.util.Locale locale30 = fastDateFormat29.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone21, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone8, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone8);
        java.util.List list34 = fastDateFormat33.parsePattern();
        java.util.Locale locale35 = fastDateFormat33.getLocale();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNull(stringBuffer20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar10 = null;
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.StringBuffer stringBuffer12 = fastDateFormat9.format(calendar10, stringBuffer11);
        java.util.TimeZone timeZone13 = fastDateFormat9.getTimeZone();
        java.util.TimeZone timeZone15 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone15);
        java.util.Locale locale17 = fastDateFormat16.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone13, locale17);
        java.util.TimeZone timeZone20 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone20);
        java.util.Locale locale22 = fastDateFormat21.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone13, locale22);
        java.util.TimeZone timeZone25 = null;
        java.util.TimeZone timeZone27 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale30);
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone27, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone25, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone13, locale32);
        java.util.TimeZone timeZone37 = null;
        java.util.TimeZone timeZone39 = null;
        java.util.TimeZone timeZone41 = null;
        java.util.Locale locale44 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale44);
        java.util.Locale locale46 = fastDateFormat45.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone41, locale46);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone39, locale46);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone37, locale46);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone13, locale46);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar55 = null;
        java.lang.StringBuffer stringBuffer56 = null;
        java.lang.StringBuffer stringBuffer57 = fastDateFormat54.format(calendar55, stringBuffer56);
        java.util.TimeZone timeZone58 = fastDateFormat54.getTimeZone();
        java.util.TimeZone timeZone60 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone60);
        java.util.Locale locale62 = fastDateFormat61.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone58, locale62);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale62);
        java.lang.String str65 = fastDateFormat64.toString();
        int int66 = fastDateFormat64.getMaxLengthEstimate();
        java.util.Locale locale67 = fastDateFormat64.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z", timeZone13, locale67);
        java.util.TimeZone timeZone69 = fastDateFormat68.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, (int) (byte) 1, timeZone69);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(24, timeZone69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 24");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNull(stringBuffer12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNull(stringBuffer57);
        org.junit.Assert.assertNotNull(timeZone58);
        org.junit.Assert.assertEquals(timeZone58.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "FastDateFormat[]" + "'", str65, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(timeZone69);
        org.junit.Assert.assertEquals(timeZone69.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat70);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        java.util.TimeZone timeZone3 = null;
        java.util.TimeZone timeZone5 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale8);
        java.util.Locale locale10 = fastDateFormat9.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5, locale10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone3, locale10);
        java.util.Locale locale14 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale14);
        java.lang.String str17 = fastDateFormat15.format((java.lang.Object) 1L);
        boolean boolean18 = fastDateFormat12.equals((java.lang.Object) str17);
        int[] intArray22 = new int[] { (short) 0, (short) 0 };
        java.lang.String str23 = fastDateFormat12.parseToken("hi!", intArray22);
        int int24 = fastDateFormat12.getMaxLengthEstimate();
        java.util.Locale locale27 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale27);
        java.util.Locale locale29 = fastDateFormat28.getLocale();
        boolean boolean30 = fastDateFormat12.equals((java.lang.Object) locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z", locale29);
        java.lang.String str33 = fastDateFormat31.format(1L);
        java.util.TimeZone timeZone34 = fastDateFormat31.getTimeZone();
        java.util.TimeZone timeZone36 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone36);
        boolean boolean38 = fastDateFormat37.getTimeZoneOverridesCalendar();
        boolean boolean39 = fastDateFormat37.getTimeZoneOverridesCalendar();
        java.lang.String str40 = fastDateFormat37.getPattern();
        java.util.Locale locale41 = fastDateFormat37.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone34, locale41);
        java.util.Locale locale43 = fastDateFormat42.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("07:00");
        java.util.TimeZone timeZone46 = fastDateFormat45.getTimeZone();
        java.util.Calendar calendar47 = null;
        java.lang.String str48 = fastDateFormat45.format(calendar47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = fastDateFormat42.format((java.lang.Object) calendar47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: <null>");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 0, 0 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 45 + "'", int24 == 45);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT" + "'", str33, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT");
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky "3) test5012(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z" + "'", str40, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "07:00" + "'", str48, "07:00");
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        java.util.Locale locale3 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale3);
        java.lang.String str6 = fastDateFormat4.format((java.lang.Object) 1L);
        java.util.Locale locale7 = fastDateFormat4.getLocale();
        java.util.List list8 = fastDateFormat4.parsePattern();
        boolean boolean9 = fastDateFormat4.getTimeZoneOverridesCalendar();
        java.util.Locale locale10 = fastDateFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) ' ', 51, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 51");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone2, locale3);
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat4.format(calendar5, stringBuffer6);
        java.lang.String str9 = fastDateFormat4.format((long) ' ');
        java.util.List list10 = fastDateFormat4.parsePattern();
        int int11 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone12 = fastDateFormat4.getTimeZone();
        java.util.TimeZone timeZone16 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone16);
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        java.util.Locale locale19 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1, locale19);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 100, timeZone12, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        java.util.TimeZone timeZone1 = null;
        java.util.TimeZone timeZone6 = null;
        java.util.TimeZone timeZone8 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale11);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone8, locale13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone6, locale13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, locale13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale13);
        java.util.Calendar calendar18 = null;
        java.lang.StringBuffer stringBuffer19 = null;
        java.lang.StringBuffer stringBuffer20 = fastDateFormat17.applyRules(calendar18, stringBuffer19);
        java.util.List list21 = fastDateFormat17.parsePattern();
        java.util.Locale locale22 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(62, timeZone1, locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 62");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNull(stringBuffer20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat23);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat5.format(calendar6, stringBuffer7);
        java.util.TimeZone timeZone9 = fastDateFormat5.getTimeZone();
        java.util.TimeZone timeZone11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9, locale13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar19 = null;
        java.lang.StringBuffer stringBuffer20 = null;
        java.lang.StringBuffer stringBuffer21 = fastDateFormat18.format(calendar19, stringBuffer20);
        java.util.TimeZone timeZone22 = fastDateFormat18.getTimeZone();
        java.util.TimeZone timeZone24 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone24);
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone22, locale26);
        java.util.TimeZone timeZone29 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone29);
        java.util.Locale locale31 = fastDateFormat30.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone22, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone9, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar38 = null;
        java.lang.StringBuffer stringBuffer39 = null;
        java.lang.StringBuffer stringBuffer40 = fastDateFormat37.format(calendar38, stringBuffer39);
        java.util.TimeZone timeZone41 = fastDateFormat37.getTimeZone();
        java.util.TimeZone timeZone43 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone43);
        java.util.Locale locale45 = fastDateFormat44.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone41, locale45);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar51 = null;
        java.lang.StringBuffer stringBuffer52 = null;
        java.lang.StringBuffer stringBuffer53 = fastDateFormat50.format(calendar51, stringBuffer52);
        java.util.TimeZone timeZone54 = fastDateFormat50.getTimeZone();
        java.util.TimeZone timeZone56 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone56);
        java.util.Locale locale58 = fastDateFormat57.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone54, locale58);
        java.util.TimeZone timeZone61 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone61);
        java.util.Locale locale63 = fastDateFormat62.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone54, locale63);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone41, locale63);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = new org.apache.commons.lang.time.FastDateFormat("EEEE", timeZone9, locale63);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar73 = null;
        java.lang.StringBuffer stringBuffer74 = null;
        java.lang.StringBuffer stringBuffer75 = fastDateFormat72.format(calendar73, stringBuffer74);
        java.util.TimeZone timeZone76 = fastDateFormat72.getTimeZone();
        java.util.TimeZone timeZone78 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone78);
        java.util.Locale locale80 = fastDateFormat79.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone76, locale80);
        java.util.TimeZone timeZone83 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone83);
        java.util.Locale locale85 = fastDateFormat84.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat86 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone76, locale85);
        boolean boolean87 = fastDateFormat86.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone88 = fastDateFormat86.getTimeZone();
        java.util.Locale locale89 = fastDateFormat86.getLocale();
        java.lang.String str90 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone9, true, (int) (short) 1, locale89);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat91 = org.apache.commons.lang.time.FastDateFormat.getInstance("'0", locale89);
        java.util.Date date92 = null;
        java.lang.StringBuffer stringBuffer93 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer94 = fastDateFormat91.format(date92, stringBuffer93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNull(stringBuffer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNull(stringBuffer40);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNull(stringBuffer53);
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNull(stringBuffer75);
        org.junit.Assert.assertNotNull(timeZone76);
        org.junit.Assert.assertEquals(timeZone76.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(timeZone88);
        org.junit.Assert.assertEquals(timeZone88.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Indochina Summer Time" + "'", str90, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat91);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) '#', locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat5);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70 07:00");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar9 = null;
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.StringBuffer stringBuffer11 = fastDateFormat8.format(calendar9, stringBuffer10);
        java.util.TimeZone timeZone12 = fastDateFormat8.getTimeZone();
        java.util.TimeZone timeZone14 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone14);
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12, locale16);
        java.util.Locale locale20 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale20);
        java.util.Locale locale22 = fastDateFormat21.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone12, locale22);
        java.util.TimeZone timeZone25 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone25);
        java.util.Locale locale27 = fastDateFormat26.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = new org.apache.commons.lang.time.FastDateFormat("", timeZone12, locale27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("F", locale27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getInstance("F", locale27);
        java.lang.String str31 = fastDateFormat30.getPattern();
        fastDateFormat30.init();
        java.lang.Object obj33 = fastDateFormat30.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator34 = fastDateFormat1.formatToCharacterIterator((java.lang.Object) fastDateFormat30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNull(stringBuffer11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "F" + "'", str31, "F");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "FastDateFormat[F]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "FastDateFormat[F]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "FastDateFormat[F]");
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone3, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar18 = null;
        java.lang.StringBuffer stringBuffer19 = null;
        java.lang.StringBuffer stringBuffer20 = fastDateFormat17.format(calendar18, stringBuffer19);
        java.util.TimeZone timeZone21 = fastDateFormat17.getTimeZone();
        java.util.TimeZone timeZone23 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone23);
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone21, locale25);
        java.util.TimeZone timeZone28 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone28);
        java.util.Locale locale30 = fastDateFormat29.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone21, locale30);
        java.util.TimeZone timeZone33 = null;
        java.util.TimeZone timeZone35 = null;
        java.util.Locale locale38 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale38);
        java.util.Locale locale40 = fastDateFormat39.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone35, locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone33, locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone21, locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (byte) 1, timeZone21);
        java.util.TimeZone timeZone48 = null;
        java.util.Locale locale49 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone48, locale49);
        java.util.TimeZone timeZone51 = fastDateFormat50.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar57 = null;
        java.lang.StringBuffer stringBuffer58 = null;
        java.lang.StringBuffer stringBuffer59 = fastDateFormat56.format(calendar57, stringBuffer58);
        java.util.TimeZone timeZone60 = fastDateFormat56.getTimeZone();
        java.util.TimeZone timeZone62 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone62);
        java.util.Locale locale64 = fastDateFormat63.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone60, locale64);
        java.lang.String str66 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone51, true, (int) (short) 0, locale64);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone51);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar72 = null;
        java.lang.StringBuffer stringBuffer73 = null;
        java.lang.StringBuffer stringBuffer74 = fastDateFormat71.format(calendar72, stringBuffer73);
        java.util.TimeZone timeZone75 = fastDateFormat71.getTimeZone();
        java.util.TimeZone timeZone77 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone77);
        java.util.Locale locale79 = fastDateFormat78.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone75, locale79);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale79);
        java.lang.String str82 = fastDateFormat81.toString();
        int int83 = fastDateFormat81.getMaxLengthEstimate();
        java.util.Locale locale84 = fastDateFormat81.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat85 = new org.apache.commons.lang.time.FastDateFormat("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT", timeZone51, locale84);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone21, locale84);
        java.lang.String str87 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone6, true, 1, locale84);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat88 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(18, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 18");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNull(stringBuffer20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNull(stringBuffer59);
        org.junit.Assert.assertNotNull(timeZone60);
        org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "ICST" + "'", str66, "ICST");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNull(stringBuffer74);
        org.junit.Assert.assertNotNull(timeZone75);
        org.junit.Assert.assertEquals(timeZone75.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "FastDateFormat[]" + "'", str82, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Indochina Summer Time" + "'", str87, "Indochina Summer Time");
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat5.format(calendar6, stringBuffer7);
        java.util.TimeZone timeZone9 = fastDateFormat5.getTimeZone();
        java.util.TimeZone timeZone11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9, locale13);
        java.util.Locale locale17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale17);
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone9, locale19);
        java.util.TimeZone timeZone22 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone22, locale23);
        java.util.TimeZone timeZone25 = fastDateFormat24.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar31 = null;
        java.lang.StringBuffer stringBuffer32 = null;
        java.lang.StringBuffer stringBuffer33 = fastDateFormat30.format(calendar31, stringBuffer32);
        java.util.TimeZone timeZone34 = fastDateFormat30.getTimeZone();
        java.util.TimeZone timeZone36 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone36);
        java.util.Locale locale38 = fastDateFormat37.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone34, locale38);
        java.lang.String str40 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone25, true, (int) (short) 0, locale38);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getInstance("':00", timeZone9, locale38);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar46 = null;
        java.lang.StringBuffer stringBuffer47 = null;
        java.lang.StringBuffer stringBuffer48 = fastDateFormat45.format(calendar46, stringBuffer47);
        java.util.TimeZone timeZone49 = fastDateFormat45.getTimeZone();
        java.util.TimeZone timeZone51 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone51);
        java.util.Locale locale53 = fastDateFormat52.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone49, locale53);
        java.util.TimeZone timeZone56 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone56);
        java.util.Locale locale58 = fastDateFormat57.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone49, locale58);
        boolean boolean60 = fastDateFormat59.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone61 = fastDateFormat59.getTimeZone();
        java.util.Locale locale62 = fastDateFormat59.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = new org.apache.commons.lang.time.FastDateFormat("1/1/70 07:00", timeZone9, locale62);
        int int64 = fastDateFormat63.getMaxLengthEstimate();
        java.lang.Object obj65 = null;
        java.lang.StringBuffer stringBuffer66 = null;
        java.text.FieldPosition fieldPosition67 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer68 = fastDateFormat63.format(obj65, stringBuffer66, fieldPosition67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: <null>");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNull(stringBuffer33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ICST" + "'", str40, "ICST");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNull(stringBuffer48);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(timeZone61);
        org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.StringBuffer stringBuffer6 = fastDateFormat3.format(calendar4, stringBuffer5);
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone9 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9);
        java.util.Locale locale11 = fastDateFormat10.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone7, locale11);
        java.lang.String str13 = fastDateFormat12.toString();
        java.util.TimeZone timeZone14 = fastDateFormat12.getTimeZone();
        java.lang.Object obj15 = fastDateFormat12.clone();
        java.lang.String str16 = fastDateFormat12.getPattern();
        java.lang.String str18 = fastDateFormat12.format((long) '4');
        java.util.Locale locale19 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("07:00", locale19);
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNull(stringBuffer6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FastDateFormat[]" + "'", str13, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat20);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale1);
        java.util.List list3 = fastDateFormat2.parsePattern();
        java.util.Locale locale4 = fastDateFormat2.getLocale();
        java.util.TimeZone timeZone8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8, locale9);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("'0", timeZone11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar19 = null;
        java.lang.StringBuffer stringBuffer20 = null;
        java.lang.StringBuffer stringBuffer21 = fastDateFormat18.format(calendar19, stringBuffer20);
        java.util.TimeZone timeZone22 = fastDateFormat18.getTimeZone();
        java.util.TimeZone timeZone24 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone24);
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone22, locale26);
        java.util.TimeZone timeZone29 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone29);
        java.util.Locale locale31 = fastDateFormat30.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone22, locale31);
        boolean boolean33 = fastDateFormat32.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone34 = fastDateFormat32.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar39 = null;
        java.lang.StringBuffer stringBuffer40 = null;
        java.lang.StringBuffer stringBuffer41 = fastDateFormat38.format(calendar39, stringBuffer40);
        java.util.TimeZone timeZone42 = fastDateFormat38.getTimeZone();
        java.util.TimeZone timeZone44 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone44);
        java.util.Locale locale46 = fastDateFormat45.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone42, locale46);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale46);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone34, locale46);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar56 = null;
        java.lang.StringBuffer stringBuffer57 = null;
        java.lang.StringBuffer stringBuffer58 = fastDateFormat55.format(calendar56, stringBuffer57);
        java.util.TimeZone timeZone59 = fastDateFormat55.getTimeZone();
        java.util.TimeZone timeZone61 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone61);
        java.util.Locale locale63 = fastDateFormat62.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone59, locale63);
        java.util.TimeZone timeZone66 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone66);
        java.util.Locale locale68 = fastDateFormat67.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone59, locale68);
        java.util.TimeZone timeZone71 = null;
        java.util.TimeZone timeZone73 = null;
        java.util.Locale locale76 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale76);
        java.util.Locale locale78 = fastDateFormat77.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone73, locale78);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone71, locale78);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone59, locale78);
        java.util.TimeZone timeZone83 = null;
        java.util.Locale locale86 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale86);
        java.util.Locale locale88 = fastDateFormat87.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat89 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone83, locale88);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat90 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone59, locale88);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat91 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2, timeZone34, locale88);
        java.util.Locale locale92 = fastDateFormat91.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat93 = org.apache.commons.lang.time.FastDateFormat.getInstance("06:59:59", timeZone11, locale92);
        boolean boolean94 = fastDateFormat2.equals((java.lang.Object) fastDateFormat93);
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNull(stringBuffer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNull(stringBuffer41);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNull(stringBuffer58);
        org.junit.Assert.assertNotNull(timeZone59);
        org.junit.Assert.assertEquals(timeZone59.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat89);
        org.junit.Assert.assertNotNull(fastDateFormat90);
        org.junit.Assert.assertNotNull(fastDateFormat91);
        org.junit.Assert.assertNotNull(locale92);
        org.junit.Assert.assertEquals(locale92.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat7.format(calendar8, stringBuffer9);
        java.util.TimeZone timeZone11 = fastDateFormat7.getTimeZone();
        java.util.TimeZone timeZone13 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone13);
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("h", timeZone2, locale15);
        boolean boolean20 = fastDateFormat19.getTimeZoneOverridesCalendar();
        int int21 = fastDateFormat19.getMaxLengthEstimate();
        java.util.Locale locale22 = fastDateFormat19.getLocale();
        java.lang.Object obj23 = fastDateFormat19.clone();
        java.util.TimeZone timeZone24 = fastDateFormat19.getTimeZone();
        java.util.TimeZone timeZone28 = null;
        java.util.TimeZone timeZone30 = null;
        java.util.Locale locale33 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale33);
        java.util.Locale locale35 = fastDateFormat34.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone30, locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone28, locale35);
        java.util.Locale locale39 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale39);
        java.lang.String str42 = fastDateFormat40.format((java.lang.Object) 1L);
        boolean boolean43 = fastDateFormat37.equals((java.lang.Object) str42);
        java.util.Locale locale44 = fastDateFormat37.getLocale();
        java.util.Locale locale45 = fastDateFormat37.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale45);
        java.lang.String str47 = fastDateFormat46.toString();
        java.util.Locale locale48 = fastDateFormat46.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = new org.apache.commons.lang.time.FastDateFormat("7", timeZone24, locale48);
        java.util.TimeZone timeZone51 = fastDateFormat50.getTimeZone();
        java.util.TimeZone timeZone53 = null;
        java.util.TimeZone timeZone55 = null;
        java.util.Locale locale58 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale58);
        java.util.Locale locale60 = fastDateFormat59.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone55, locale60);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone53, locale60);
        java.util.Locale locale64 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale64);
        java.lang.String str67 = fastDateFormat65.format((java.lang.Object) 1L);
        boolean boolean68 = fastDateFormat62.equals((java.lang.Object) str67);
        int[] intArray72 = new int[] { (short) 0, (short) 0 };
        java.lang.String str73 = fastDateFormat62.parseToken("hi!", intArray72);
        int int74 = fastDateFormat62.getMaxLengthEstimate();
        java.util.Locale locale77 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale77);
        java.util.Locale locale79 = fastDateFormat78.getLocale();
        boolean boolean80 = fastDateFormat62.equals((java.lang.Object) locale79);
        java.util.Locale locale81 = fastDateFormat62.getLocale();
        boolean boolean82 = fastDateFormat50.equals((java.lang.Object) locale81);
        java.lang.Object obj83 = fastDateFormat50.clone();
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "FastDateFormat[h]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "FastDateFormat[h]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "FastDateFormat[h]");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat46);
// flaky "4) test5023(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\u0e17\u0e35\u0e48 d MMMM GGGG y]" + "'", str47, "\u0e17\u0e35\u0e48 d MMMM GGGG y]");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { 0, 0 });
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "h" + "'", str73, "h");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 45 + "'", int74 == 45);
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertEquals(obj83.toString(), "FastDateFormat[7]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj83), "FastDateFormat[7]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj83), "FastDateFormat[7]");
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat6.format(calendar7, stringBuffer8);
        java.util.TimeZone timeZone10 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar20 = null;
        java.lang.StringBuffer stringBuffer21 = null;
        java.lang.StringBuffer stringBuffer22 = fastDateFormat19.format(calendar20, stringBuffer21);
        java.util.TimeZone timeZone23 = fastDateFormat19.getTimeZone();
        java.util.TimeZone timeZone25 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone25);
        java.util.Locale locale27 = fastDateFormat26.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone23, locale27);
        java.util.TimeZone timeZone30 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone30);
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone23, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone10, locale32);
        java.util.TimeZone timeZone35 = fastDateFormat34.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70", timeZone35);
        java.util.Locale locale39 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale39);
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = new org.apache.commons.lang.time.FastDateFormat("", timeZone35, locale41);
        java.util.Locale locale43 = fastDateFormat42.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) '#', locale43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNull(stringBuffer9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNull(stringBuffer22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat6.format(calendar7, stringBuffer8);
        java.util.TimeZone timeZone10 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("h", timeZone1, locale14);
        boolean boolean19 = fastDateFormat18.getTimeZoneOverridesCalendar();
        fastDateFormat18.init();
        java.lang.String str21 = fastDateFormat18.toString();
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNull(stringBuffer9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "FastDateFormat[h]" + "'", str21, "FastDateFormat[h]");
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format((long) (short) 100, stringBuffer4);
        java.lang.String str6 = fastDateFormat2.toString();
        java.util.List list7 = fastDateFormat2.parsePattern();
        java.lang.String str9 = fastDateFormat2.format((long) 18);
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNull(stringBuffer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FastDateFormat[]" + "'", str6, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone2, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar12 = null;
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.StringBuffer stringBuffer14 = fastDateFormat11.format(calendar12, stringBuffer13);
        java.util.TimeZone timeZone15 = fastDateFormat11.getTimeZone();
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone17);
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone15, locale19);
        java.util.TimeZone timeZone22 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone22);
        java.util.Locale locale24 = fastDateFormat23.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone15, locale24);
        java.util.TimeZone timeZone27 = null;
        java.util.TimeZone timeZone29 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale32);
        java.util.Locale locale34 = fastDateFormat33.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone29, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone27, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone15, locale34);
        java.util.TimeZone timeZone39 = null;
        java.util.TimeZone timeZone41 = null;
        java.util.TimeZone timeZone43 = null;
        java.util.Locale locale46 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale46);
        java.util.Locale locale48 = fastDateFormat47.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone43, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone41, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone39, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone15, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getInstance("h", timeZone5, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar58 = null;
        java.lang.StringBuffer stringBuffer59 = null;
        java.lang.StringBuffer stringBuffer60 = fastDateFormat57.format(calendar58, stringBuffer59);
        java.util.TimeZone timeZone61 = fastDateFormat57.getTimeZone();
        java.util.TimeZone timeZone63 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone63);
        java.util.Locale locale65 = fastDateFormat64.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone61, locale65);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale65);
        java.lang.String str68 = fastDateFormat67.toString();
        java.util.Calendar calendar69 = null;
        java.lang.StringBuffer stringBuffer70 = null;
        java.lang.StringBuffer stringBuffer71 = fastDateFormat67.applyRules(calendar69, stringBuffer70);
        boolean boolean72 = fastDateFormat53.equals((java.lang.Object) calendar69);
        java.lang.Object obj73 = fastDateFormat53.clone();
        java.util.TimeZone timeZone75 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone75);
        java.util.Locale locale77 = fastDateFormat76.getLocale();
        int int78 = fastDateFormat76.getMaxLengthEstimate();
        java.util.Locale locale79 = fastDateFormat76.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator80 = fastDateFormat53.formatToCharacterIterator((java.lang.Object) locale79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNull(stringBuffer14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNull(stringBuffer60);
        org.junit.Assert.assertNotNull(timeZone61);
        org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "FastDateFormat[]" + "'", str68, "FastDateFormat[]");
        org.junit.Assert.assertNull(stringBuffer71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertEquals(obj73.toString(), "FastDateFormat[h]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj73), "FastDateFormat[h]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj73), "FastDateFormat[h]");
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "th_TH");
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1, locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.lang.String str8 = fastDateFormat3.format(100L);
        java.lang.String str10 = fastDateFormat3.format(100L);
        java.lang.String str11 = fastDateFormat3.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.util.Calendar calendar4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.StringBuffer stringBuffer6 = fastDateFormat2.applyRules(calendar4, stringBuffer5);
        java.lang.String str8 = fastDateFormat2.format((long) ' ');
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        int int12 = fastDateFormat11.getMaxLengthEstimate();
        java.lang.Object obj13 = fastDateFormat11.clone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar19 = null;
        java.lang.StringBuffer stringBuffer20 = null;
        java.lang.StringBuffer stringBuffer21 = fastDateFormat18.format(calendar19, stringBuffer20);
        java.util.TimeZone timeZone22 = fastDateFormat18.getTimeZone();
        java.util.TimeZone timeZone24 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone24);
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone22, locale26);
        java.util.TimeZone timeZone29 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone29);
        java.util.Locale locale31 = fastDateFormat30.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone22, locale31);
        java.util.TimeZone timeZone35 = null;
        java.util.TimeZone timeZone37 = null;
        java.util.Locale locale40 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale40);
        java.util.Locale locale42 = fastDateFormat41.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone37, locale42);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone35, locale42);
        java.util.Locale locale46 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale46);
        java.lang.String str49 = fastDateFormat47.format((java.lang.Object) 1L);
        boolean boolean50 = fastDateFormat44.equals((java.lang.Object) str49);
        int[] intArray54 = new int[] { (short) 0, (short) 0 };
        java.lang.String str55 = fastDateFormat44.parseToken("hi!", intArray54);
        java.lang.String str56 = fastDateFormat32.parseToken("1/1/70 07:00", intArray54);
        java.lang.String str57 = fastDateFormat11.parseToken("\u0e17\u0e35\u0e48 d MMMM GGGG y]", intArray54);
        java.lang.String str58 = fastDateFormat2.parseToken("FastDateFormat[d/M/yy]", intArray54);
        boolean boolean59 = fastDateFormat2.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNull(stringBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "FastDateFormat[d/M/yy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "FastDateFormat[d/M/yy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "FastDateFormat[d/M/yy]");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNull(stringBuffer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(intArray54);
// flaky "5) test5029(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertArrayEquals(intArray54, new int[] { 12, 0 });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "h" + "'", str55, "h");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "'1/1/70 07:00" + "'", str56, "'1/1/70 07:00");
// flaky "1) test5029(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "a" + "'", str57, "a");
// flaky "1) test5029(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "a" + "'", str58, "a");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        java.util.Locale locale2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale2);
        fastDateFormat3.init();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.lang.String str7 = fastDateFormat3.getPattern();
        java.lang.Object obj8 = fastDateFormat3.clone();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 89 + "'", int5 == 89);
// flaky "6) test5030(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz" + "'", str6, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz");
// flaky "2) test5030(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz" + "'", str7, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz");
        org.junit.Assert.assertNotNull(obj8);
// flaky "2) test5030(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals(obj8.toString(), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
// flaky "1) test5030(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
// flaky "1) test5030(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar10 = null;
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.StringBuffer stringBuffer12 = fastDateFormat9.format(calendar10, stringBuffer11);
        java.util.TimeZone timeZone13 = fastDateFormat9.getTimeZone();
        java.util.TimeZone timeZone15 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone15);
        java.util.Locale locale17 = fastDateFormat16.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone13, locale17);
        java.util.TimeZone timeZone20 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone20);
        java.util.Locale locale22 = fastDateFormat21.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone13, locale22);
        java.util.TimeZone timeZone25 = null;
        java.util.TimeZone timeZone27 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale30);
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone27, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone25, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone13, locale32);
        java.util.TimeZone timeZone37 = null;
        java.util.Locale locale40 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale40);
        java.util.Locale locale42 = fastDateFormat41.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone37, locale42);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone13, locale42);
        java.util.Locale locale45 = fastDateFormat44.getLocale();
        java.util.TimeZone timeZone46 = fastDateFormat44.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone46);
        java.util.Locale locale49 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale49);
        java.lang.String str52 = fastDateFormat50.format((java.lang.Object) 1L);
        java.util.Locale locale53 = fastDateFormat50.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = new org.apache.commons.lang.time.FastDateFormat("1/1/70 07:00", timeZone46, locale53);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2, timeZone46);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3);
        java.util.TimeZone timeZone60 = null;
        java.util.TimeZone timeZone62 = null;
        java.util.Locale locale65 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale65);
        java.util.Locale locale67 = fastDateFormat66.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone62, locale67);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone60, locale67);
        java.util.Locale locale71 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale71);
        java.lang.String str74 = fastDateFormat72.format((java.lang.Object) 1L);
        boolean boolean75 = fastDateFormat69.equals((java.lang.Object) str74);
        java.util.Locale locale76 = fastDateFormat69.getLocale();
        java.util.Locale locale77 = fastDateFormat69.getLocale();
        boolean boolean78 = fastDateFormat58.equals((java.lang.Object) locale77);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale77);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat80 = new org.apache.commons.lang.time.FastDateFormat("", timeZone46, locale77);
        java.util.List list81 = fastDateFormat80.parsePattern();
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNull(stringBuffer12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(list81);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat5.format(calendar6, stringBuffer7);
        java.util.TimeZone timeZone9 = fastDateFormat5.getTimeZone();
        java.util.TimeZone timeZone11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9, locale13);
        java.util.TimeZone timeZone16 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone16);
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone9, locale18);
        java.util.TimeZone timeZone21 = null;
        java.util.TimeZone timeZone23 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale26);
        java.util.Locale locale28 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone23, locale28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone21, locale28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone9, locale28);
        java.util.TimeZone timeZone33 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale36);
        java.util.Locale locale38 = fastDateFormat37.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone33, locale38);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone9, locale38);
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        int int42 = fastDateFormat40.getMaxLengthEstimate();
        int int43 = fastDateFormat40.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 45 + "'", int42 == 45);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 45 + "'", int43 == 45);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat7.format(calendar8, stringBuffer9);
        java.util.TimeZone timeZone11 = fastDateFormat7.getTimeZone();
        java.util.TimeZone timeZone13 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone13);
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11, locale15);
        java.util.TimeZone timeZone18 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone18);
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone11, locale20);
        java.util.TimeZone timeZone23 = null;
        java.util.TimeZone timeZone25 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale28);
        java.util.Locale locale30 = fastDateFormat29.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone25, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone23, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone11, locale30);
        java.util.TimeZone timeZone35 = null;
        java.util.TimeZone timeZone37 = null;
        java.util.TimeZone timeZone39 = null;
        java.util.Locale locale42 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale42);
        java.util.Locale locale44 = fastDateFormat43.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone39, locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone37, locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone35, locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone11, locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48 d MMMM GGGG y", timeZone11);
        java.util.TimeZone timeZone53 = null;
        java.util.Locale locale54 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone53, locale54);
        java.util.Calendar calendar56 = null;
        java.lang.StringBuffer stringBuffer57 = null;
        java.lang.StringBuffer stringBuffer58 = fastDateFormat55.format(calendar56, stringBuffer57);
        boolean boolean59 = fastDateFormat55.getTimeZoneOverridesCalendar();
        java.util.Locale locale60 = fastDateFormat55.getLocale();
        java.lang.String str61 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone11, false, (int) (short) 0, locale60);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(45, timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNull(stringBuffer58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "ICT" + "'", str61, "ICT");
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(12, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar13 = null;
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.StringBuffer stringBuffer15 = fastDateFormat12.format(calendar13, stringBuffer14);
        java.util.TimeZone timeZone16 = fastDateFormat12.getTimeZone();
        java.util.TimeZone timeZone18 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone18);
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone16, locale20);
        java.util.TimeZone timeZone23 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone23);
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone16, locale25);
        java.util.TimeZone timeZone28 = null;
        java.util.TimeZone timeZone30 = null;
        java.util.Locale locale33 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale33);
        java.util.Locale locale35 = fastDateFormat34.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone30, locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone28, locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone16, locale35);
        java.util.Locale locale39 = fastDateFormat38.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, 0, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = new org.apache.commons.lang.time.FastDateFormat("\u0e17\u0e35\u0e48 d MMMM GGGG y", timeZone5, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar46 = null;
        java.lang.StringBuffer stringBuffer47 = null;
        java.lang.StringBuffer stringBuffer48 = fastDateFormat45.format(calendar46, stringBuffer47);
        java.util.TimeZone timeZone49 = fastDateFormat45.getTimeZone();
        java.util.TimeZone timeZone51 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone51);
        java.util.Locale locale53 = fastDateFormat52.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone49, locale53);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar59 = null;
        java.lang.StringBuffer stringBuffer60 = null;
        java.lang.StringBuffer stringBuffer61 = fastDateFormat58.format(calendar59, stringBuffer60);
        java.util.TimeZone timeZone62 = fastDateFormat58.getTimeZone();
        java.util.TimeZone timeZone64 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone64);
        java.util.Locale locale66 = fastDateFormat65.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone62, locale66);
        java.util.TimeZone timeZone69 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone69);
        java.util.Locale locale71 = fastDateFormat70.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat72 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone62, locale71);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone49, locale71);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getInstance("d MMMM y", timeZone5, locale71);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", locale71);
        java.lang.Class<?> wildcardClass76 = locale71.getClass();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNull(stringBuffer15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNull(stringBuffer48);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNull(stringBuffer61);
        org.junit.Assert.assertNotNull(timeZone62);
        org.junit.Assert.assertEquals(timeZone62.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone1);
        boolean boolean3 = fastDateFormat2.getTimeZoneOverridesCalendar();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar10 = null;
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.StringBuffer stringBuffer12 = fastDateFormat9.format(calendar10, stringBuffer11);
        java.util.TimeZone timeZone13 = fastDateFormat9.getTimeZone();
        java.util.TimeZone timeZone15 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone15);
        java.util.Locale locale17 = fastDateFormat16.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone13, locale17);
        java.util.TimeZone timeZone20 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone20);
        java.util.Locale locale22 = fastDateFormat21.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone13, locale22);
        java.util.TimeZone timeZone25 = null;
        java.util.TimeZone timeZone27 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale30);
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone27, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone25, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone13, locale32);
        java.util.TimeZone timeZone37 = null;
        java.util.Locale locale40 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale40);
        java.util.Locale locale42 = fastDateFormat41.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone37, locale42);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone13, locale42);
        java.util.List list45 = fastDateFormat44.parsePattern();
        int int46 = fastDateFormat44.getMaxLengthEstimate();
        boolean boolean47 = fastDateFormat2.equals((java.lang.Object) int46);
        java.lang.String str48 = fastDateFormat2.toString();
        int int49 = fastDateFormat2.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNull(stringBuffer12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 45 + "'", int46 == 45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
// flaky "7) test5036(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z]" + "'", str48, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 34 + "'", int49 == 34);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone3, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar14 = null;
        java.lang.StringBuffer stringBuffer15 = null;
        java.lang.StringBuffer stringBuffer16 = fastDateFormat13.format(calendar14, stringBuffer15);
        java.util.TimeZone timeZone17 = fastDateFormat13.getTimeZone();
        java.util.TimeZone timeZone19 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone19);
        java.util.Locale locale21 = fastDateFormat20.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone17, locale21);
        java.util.TimeZone timeZone24 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone24);
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone17, locale26);
        boolean boolean28 = fastDateFormat27.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone29 = fastDateFormat27.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar34 = null;
        java.lang.StringBuffer stringBuffer35 = null;
        java.lang.StringBuffer stringBuffer36 = fastDateFormat33.format(calendar34, stringBuffer35);
        java.util.TimeZone timeZone37 = fastDateFormat33.getTimeZone();
        java.util.TimeZone timeZone39 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone39);
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone37, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone29, locale41);
        java.util.TimeZone timeZone47 = null;
        java.util.TimeZone timeZone49 = null;
        java.util.Locale locale52 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale52);
        java.util.Locale locale54 = fastDateFormat53.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone49, locale54);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone47, locale54);
        java.util.Locale locale58 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale58);
        java.lang.String str61 = fastDateFormat59.format((java.lang.Object) 1L);
        boolean boolean62 = fastDateFormat56.equals((java.lang.Object) str61);
        int[] intArray66 = new int[] { (short) 0, (short) 0 };
        java.lang.String str67 = fastDateFormat56.parseToken("hi!", intArray66);
        java.lang.String str68 = fastDateFormat44.parseToken("'1/1/70 07:00", intArray66);
        boolean boolean70 = fastDateFormat44.equals((java.lang.Object) 1);
        java.util.Locale locale71 = fastDateFormat44.getLocale();
        java.lang.String str72 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone6, true, 0, locale71);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) '#', 51, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 51");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNull(stringBuffer16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNull(stringBuffer36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 13, 0 });
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "h" + "'", str67, "h");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "'1/1/70 07:00" + "'", str68, "'1/1/70 07:00");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "ICST" + "'", str72, "ICST");
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z");
        java.util.List list2 = fastDateFormat1.parsePattern();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat6.format(calendar7, stringBuffer8);
        java.util.TimeZone timeZone10 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale14);
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone17);
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone10, locale19);
        java.util.TimeZone timeZone22 = null;
        java.util.TimeZone timeZone24 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale27);
        java.util.Locale locale29 = fastDateFormat28.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone24, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone22, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone10, locale29);
        java.util.TimeZone timeZone34 = null;
        java.util.TimeZone timeZone36 = null;
        java.util.TimeZone timeZone38 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale41);
        java.util.Locale locale43 = fastDateFormat42.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone38, locale43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone36, locale43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone34, locale43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone10, locale43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar54 = null;
        java.lang.StringBuffer stringBuffer55 = null;
        java.lang.StringBuffer stringBuffer56 = fastDateFormat53.format(calendar54, stringBuffer55);
        java.util.TimeZone timeZone57 = fastDateFormat53.getTimeZone();
        java.util.TimeZone timeZone59 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone59);
        java.util.Locale locale61 = fastDateFormat60.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone57, locale61);
        java.util.TimeZone timeZone64 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone64);
        java.util.Locale locale66 = fastDateFormat65.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone57, locale66);
        java.util.TimeZone timeZone69 = null;
        java.util.TimeZone timeZone71 = null;
        java.util.Locale locale74 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale74);
        java.util.Locale locale76 = fastDateFormat75.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone71, locale76);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone69, locale76);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone57, locale76);
        java.util.TimeZone timeZone81 = null;
        java.util.Locale locale84 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat85 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale84);
        java.util.Locale locale86 = fastDateFormat85.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone81, locale86);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat88 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone57, locale86);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat89 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale86);
        java.util.TimeZone timeZone90 = fastDateFormat89.getTimeZone();
        java.util.Calendar calendar91 = null;
        java.lang.StringBuffer stringBuffer92 = null;
        java.lang.StringBuffer stringBuffer93 = fastDateFormat89.applyRules(calendar91, stringBuffer92);
        java.util.Locale locale94 = fastDateFormat89.getLocale();
        java.util.Locale locale95 = fastDateFormat89.getLocale();
        java.lang.String str96 = fastDateFormat89.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNull(stringBuffer9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNull(stringBuffer56);
        org.junit.Assert.assertNotNull(timeZone57);
        org.junit.Assert.assertEquals(timeZone57.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(fastDateFormat85);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(fastDateFormat88);
        org.junit.Assert.assertNotNull(fastDateFormat89);
        org.junit.Assert.assertNotNull(timeZone90);
        org.junit.Assert.assertEquals(timeZone90.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(stringBuffer93);
        org.junit.Assert.assertNotNull(locale94);
        org.junit.Assert.assertEquals(locale94.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale95);
        org.junit.Assert.assertEquals(locale95.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale1);
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format((long) 100, stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format((long) 100, stringBuffer4);
        java.lang.String str7 = fastDateFormat2.format((long) 100);
        java.util.Locale locale8 = fastDateFormat2.getLocale();
        fastDateFormat2.init();
        boolean boolean10 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.util.List list11 = fastDateFormat2.parsePattern();
        java.util.Calendar calendar12 = null;
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.StringBuffer stringBuffer14 = fastDateFormat2.applyRules(calendar12, stringBuffer13);
        java.util.Calendar calendar15 = null;
        java.lang.StringBuffer stringBuffer16 = null;
        java.lang.StringBuffer stringBuffer17 = fastDateFormat2.format(calendar15, stringBuffer16);
        java.lang.StringBuffer stringBuffer19 = null;
        java.lang.StringBuffer stringBuffer20 = fastDateFormat2.format((long) (short) 1, stringBuffer19);
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNull(stringBuffer5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(stringBuffer14);
        org.junit.Assert.assertNull(stringBuffer17);
        org.junit.Assert.assertNull(stringBuffer20);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.StringBuffer stringBuffer4 = fastDateFormat1.format(10L, stringBuffer3);
        java.lang.String str6 = fastDateFormat1.format(0L);
        java.lang.Object obj7 = fastDateFormat1.clone();
        java.util.Calendar calendar8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat1.format(calendar8, stringBuffer9);
        java.lang.String str11 = fastDateFormat1.toString();
        fastDateFormat1.init();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNull(stringBuffer4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "FastDateFormat[]");
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FastDateFormat[]" + "'", str11, "FastDateFormat[]");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        java.util.TimeZone timeZone7 = null;
        java.util.TimeZone timeZone9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone9, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone7, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale14);
        java.lang.String str20 = fastDateFormat18.format((long) '#');
        java.util.TimeZone timeZone21 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("a", timeZone21);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar30 = null;
        java.lang.StringBuffer stringBuffer31 = null;
        java.lang.StringBuffer stringBuffer32 = fastDateFormat29.format(calendar30, stringBuffer31);
        java.util.TimeZone timeZone33 = fastDateFormat29.getTimeZone();
        java.util.TimeZone timeZone35 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone35);
        java.util.Locale locale37 = fastDateFormat36.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone33, locale37);
        java.util.TimeZone timeZone40 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone40);
        java.util.Locale locale42 = fastDateFormat41.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone33, locale42);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar53 = null;
        java.lang.StringBuffer stringBuffer54 = null;
        java.lang.StringBuffer stringBuffer55 = fastDateFormat52.format(calendar53, stringBuffer54);
        java.util.TimeZone timeZone56 = fastDateFormat52.getTimeZone();
        java.util.TimeZone timeZone58 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone58);
        java.util.Locale locale60 = fastDateFormat59.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone56, locale60);
        java.util.TimeZone timeZone63 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone63);
        java.util.Locale locale65 = fastDateFormat64.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone56, locale65);
        java.util.TimeZone timeZone68 = null;
        java.util.TimeZone timeZone70 = null;
        java.util.Locale locale73 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale73);
        java.util.Locale locale75 = fastDateFormat74.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone70, locale75);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone68, locale75);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone56, locale75);
        java.util.Locale locale79 = fastDateFormat78.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, 0, locale79);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone33, locale79);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat82 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone21, locale79);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat83 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(8, 1, locale79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNull(stringBuffer32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNull(stringBuffer55);
        org.junit.Assert.assertNotNull(timeZone56);
        org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertNotNull(fastDateFormat82);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        java.util.TimeZone timeZone3 = null;
        java.util.TimeZone timeZone5 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale8);
        java.util.Locale locale10 = fastDateFormat9.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5, locale10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone3, locale10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, locale10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale10);
        java.lang.String str16 = fastDateFormat14.format((long) '#');
        java.lang.String str18 = fastDateFormat14.format((-1L));
        java.lang.String str19 = fastDateFormat14.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar3 = null;
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format(calendar3, stringBuffer4);
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        java.util.TimeZone timeZone8 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8);
        java.util.Locale locale10 = fastDateFormat9.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone6, locale10);
        boolean boolean13 = fastDateFormat11.equals((java.lang.Object) (-1));
        boolean boolean14 = fastDateFormat11.getTimeZoneOverridesCalendar();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar20 = null;
        java.lang.StringBuffer stringBuffer21 = null;
        java.lang.StringBuffer stringBuffer22 = fastDateFormat19.format(calendar20, stringBuffer21);
        java.util.TimeZone timeZone23 = fastDateFormat19.getTimeZone();
        java.util.TimeZone timeZone25 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone25);
        java.util.Locale locale27 = fastDateFormat26.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone23, locale27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale27);
        java.lang.String str31 = fastDateFormat30.getPattern();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar36 = null;
        java.lang.StringBuffer stringBuffer37 = null;
        java.lang.StringBuffer stringBuffer38 = fastDateFormat35.format(calendar36, stringBuffer37);
        java.util.TimeZone timeZone39 = fastDateFormat35.getTimeZone();
        java.util.TimeZone timeZone41 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone41);
        java.util.Locale locale43 = fastDateFormat42.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone39, locale43);
        java.util.TimeZone timeZone46 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone46);
        java.util.Locale locale48 = fastDateFormat47.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone39, locale48);
        java.util.TimeZone timeZone52 = null;
        java.util.TimeZone timeZone54 = null;
        java.util.Locale locale57 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale57);
        java.util.Locale locale59 = fastDateFormat58.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone54, locale59);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone52, locale59);
        java.util.Locale locale63 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale63);
        java.lang.String str66 = fastDateFormat64.format((java.lang.Object) 1L);
        boolean boolean67 = fastDateFormat61.equals((java.lang.Object) str66);
        int[] intArray71 = new int[] { (short) 0, (short) 0 };
        java.lang.String str72 = fastDateFormat61.parseToken("hi!", intArray71);
        java.lang.String str73 = fastDateFormat49.parseToken("1/1/70 07:00", intArray71);
        boolean boolean74 = fastDateFormat30.equals((java.lang.Object) intArray71);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str75 = fastDateFormat11.format((java.lang.Object) intArray71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: [I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNull(stringBuffer5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNull(stringBuffer22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
// flaky "8) test5045(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u0e17\u0e35\u0e48 d MMMM GGGG y" + "'", str31, "\u0e17\u0e35\u0e48 d MMMM GGGG y");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNull(stringBuffer38);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 12, 0 });
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "h" + "'", str72, "h");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "'1/1/70 07:00" + "'", str73, "'1/1/70 07:00");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar12 = null;
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.StringBuffer stringBuffer14 = fastDateFormat11.format(calendar12, stringBuffer13);
        java.util.TimeZone timeZone15 = fastDateFormat11.getTimeZone();
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone17);
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone15, locale19);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale19);
        java.util.List list22 = fastDateFormat21.parsePattern();
        java.util.TimeZone timeZone23 = fastDateFormat21.getTimeZone();
        java.util.Locale locale24 = fastDateFormat21.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("7", timeZone6, locale24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("F", timeZone6);
        java.util.Locale locale30 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale30);
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getInstance("':00", locale32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(62, timeZone6, locale32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 62");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNull(stringBuffer14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat33);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        java.util.TimeZone timeZone5 = null;
        java.util.TimeZone timeZone7 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale10);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone7, locale12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone5, locale12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, locale12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale12);
        java.lang.String str18 = fastDateFormat16.format((long) '#');
        java.util.TimeZone timeZone19 = fastDateFormat16.getTimeZone();
        java.util.TimeZone timeZone21 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("':00", timeZone21);
        java.util.TimeZone timeZone25 = null;
        java.util.TimeZone timeZone27 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale30);
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone27, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone25, locale32);
        java.util.Locale locale36 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale36);
        java.lang.String str39 = fastDateFormat37.format((java.lang.Object) 1L);
        boolean boolean40 = fastDateFormat34.equals((java.lang.Object) str39);
        int[] intArray44 = new int[] { (short) 0, (short) 0 };
        java.lang.String str45 = fastDateFormat34.parseToken("hi!", intArray44);
        java.lang.String str46 = fastDateFormat22.parseToken("\u0e17\u0e35\u0e48 d MMMM GGGG y", intArray44);
        boolean boolean48 = fastDateFormat22.equals((java.lang.Object) 100.0d);
        java.lang.String str50 = fastDateFormat22.format(100L);
        java.util.Locale locale51 = fastDateFormat22.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("h", timeZone19, locale51);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getInstance("0", locale51);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 3, 0 });
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "h" + "'", str45, "h");
// flaky "9) test5047(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "EEEE" + "'", str46, "EEEE");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + ":00" + "'", str50, ":00");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat53);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1, locale2);
        java.util.Calendar calendar4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.StringBuffer stringBuffer6 = fastDateFormat3.format(calendar4, stringBuffer5);
        java.lang.String str8 = fastDateFormat3.format((long) ' ');
        java.util.List list9 = fastDateFormat3.parsePattern();
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.StringBuffer stringBuffer12 = fastDateFormat3.format((long) 1, stringBuffer11);
        java.util.Calendar calendar13 = null;
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.StringBuffer stringBuffer15 = fastDateFormat3.format(calendar13, stringBuffer14);
        java.lang.String str16 = fastDateFormat3.getPattern();
        java.util.Locale locale18 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale18);
        java.lang.String str21 = fastDateFormat19.format((java.lang.Object) 1L);
        java.util.Calendar calendar22 = null;
        java.lang.StringBuffer stringBuffer23 = null;
        java.lang.StringBuffer stringBuffer24 = fastDateFormat19.format(calendar22, stringBuffer23);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator25 = fastDateFormat3.formatToCharacterIterator((java.lang.Object) stringBuffer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: <null>");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNull(stringBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(stringBuffer12);
        org.junit.Assert.assertNull(stringBuffer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(stringBuffer24);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat4.format(calendar5, stringBuffer6);
        java.util.TimeZone timeZone8 = fastDateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8, locale12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar18 = null;
        java.lang.StringBuffer stringBuffer19 = null;
        java.lang.StringBuffer stringBuffer20 = fastDateFormat17.format(calendar18, stringBuffer19);
        java.util.TimeZone timeZone21 = fastDateFormat17.getTimeZone();
        java.util.TimeZone timeZone23 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone23);
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone21, locale25);
        java.util.TimeZone timeZone28 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone28);
        java.util.Locale locale30 = fastDateFormat29.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone21, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone8, locale30);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70", timeZone33);
        java.util.Locale locale35 = fastDateFormat34.getLocale();
        java.util.TimeZone timeZone36 = fastDateFormat34.getTimeZone();
        java.lang.Class<?> wildcardClass37 = fastDateFormat34.getClass();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNull(stringBuffer20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format((long) 100, stringBuffer4);
        java.lang.String str7 = fastDateFormat2.format((long) 100);
        java.util.Locale locale8 = fastDateFormat2.getLocale();
        fastDateFormat2.init();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar16 = null;
        java.lang.StringBuffer stringBuffer17 = null;
        java.lang.StringBuffer stringBuffer18 = fastDateFormat15.format(calendar16, stringBuffer17);
        java.util.TimeZone timeZone19 = fastDateFormat15.getTimeZone();
        java.util.TimeZone timeZone21 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone21);
        java.util.Locale locale23 = fastDateFormat22.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone19, locale23);
        java.util.TimeZone timeZone26 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone26);
        java.util.Locale locale28 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone19, locale28);
        boolean boolean30 = fastDateFormat29.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone31 = fastDateFormat29.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar37 = null;
        java.lang.StringBuffer stringBuffer38 = null;
        java.lang.StringBuffer stringBuffer39 = fastDateFormat36.format(calendar37, stringBuffer38);
        java.util.TimeZone timeZone40 = fastDateFormat36.getTimeZone();
        java.util.TimeZone timeZone42 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone42);
        java.util.Locale locale44 = fastDateFormat43.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone40, locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = new org.apache.commons.lang.time.FastDateFormat("\u0e17\u0e35\u0e48 d MMMM GGGG y", timeZone31, locale44);
        java.util.TimeZone timeZone49 = fastDateFormat48.getTimeZone();
        java.util.TimeZone timeZone51 = null;
        java.util.TimeZone timeZone53 = null;
        java.util.Locale locale56 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale56);
        java.util.Locale locale58 = fastDateFormat57.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone53, locale58);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone51, locale58);
        java.util.Locale locale62 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale62);
        java.lang.String str65 = fastDateFormat63.format((java.lang.Object) 1L);
        boolean boolean66 = fastDateFormat60.equals((java.lang.Object) str65);
        java.util.Locale locale67 = fastDateFormat60.getLocale();
        java.util.Locale locale68 = fastDateFormat60.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getInstance("d MMMM y", timeZone49, locale68);
        boolean boolean70 = fastDateFormat2.equals((java.lang.Object) fastDateFormat69);
        boolean boolean71 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone72 = fastDateFormat2.getTimeZone();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNull(stringBuffer5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNull(stringBuffer18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNull(stringBuffer39);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(timeZone72);
        org.junit.Assert.assertEquals(timeZone72.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) '#', 24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 24");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat6.format(calendar7, stringBuffer8);
        java.util.TimeZone timeZone10 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale14);
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone17);
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone10, locale19);
        java.util.TimeZone timeZone22 = null;
        java.util.TimeZone timeZone24 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale27);
        java.util.Locale locale29 = fastDateFormat28.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone24, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone22, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone10, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, locale29);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        java.util.Locale locale36 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale36);
        java.util.List list38 = fastDateFormat37.parsePattern();
        java.util.Locale locale39 = fastDateFormat37.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("d MMMM y", timeZone34, locale39);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNull(stringBuffer9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat40);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.util.Calendar calendar5 = null;
        java.lang.String str6 = fastDateFormat3.format(calendar5);
        java.lang.String str8 = fastDateFormat3.format(10L);
        java.util.Calendar calendar9 = null;
        java.lang.String str10 = fastDateFormat3.format(calendar9);
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.StringBuffer stringBuffer13 = fastDateFormat3.format((long) '4', stringBuffer12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar22 = null;
        java.lang.StringBuffer stringBuffer23 = null;
        java.lang.StringBuffer stringBuffer24 = fastDateFormat21.format(calendar22, stringBuffer23);
        java.util.TimeZone timeZone25 = fastDateFormat21.getTimeZone();
        java.util.TimeZone timeZone27 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone27);
        java.util.Locale locale29 = fastDateFormat28.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone25, locale29);
        java.util.TimeZone timeZone32 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone32);
        java.util.Locale locale34 = fastDateFormat33.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone25, locale34);
        java.util.TimeZone timeZone37 = null;
        java.util.TimeZone timeZone39 = null;
        java.util.Locale locale42 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale42);
        java.util.Locale locale44 = fastDateFormat43.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone39, locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone37, locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone25, locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (byte) 1, timeZone25);
        java.util.Locale locale49 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35", timeZone25, locale49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = fastDateFormat3.format((java.lang.Object) "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(stringBuffer13);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNull(stringBuffer24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat50);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        java.util.TimeZone timeZone4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone4, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar13 = null;
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.StringBuffer stringBuffer15 = fastDateFormat12.format(calendar13, stringBuffer14);
        java.util.TimeZone timeZone16 = fastDateFormat12.getTimeZone();
        java.util.TimeZone timeZone18 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone18);
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone16, locale20);
        java.lang.String str22 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone7, true, (int) (short) 0, locale20);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar28 = null;
        java.lang.StringBuffer stringBuffer29 = null;
        java.lang.StringBuffer stringBuffer30 = fastDateFormat27.format(calendar28, stringBuffer29);
        java.util.TimeZone timeZone31 = fastDateFormat27.getTimeZone();
        java.util.TimeZone timeZone33 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone33);
        java.util.Locale locale35 = fastDateFormat34.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone31, locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[d/M/yy]", timeZone7, locale35);
        java.util.TimeZone timeZone42 = null;
        java.util.Locale locale43 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone42, locale43);
        java.util.TimeZone timeZone45 = fastDateFormat44.getTimeZone();
        java.util.Locale locale46 = fastDateFormat44.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getInstance("07:00:00", locale46);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(24, 16, timeZone7, locale46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNull(stringBuffer15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ICST" + "'", str22, "ICST");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNull(stringBuffer30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat47);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar9 = null;
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.StringBuffer stringBuffer11 = fastDateFormat8.format(calendar9, stringBuffer10);
        java.util.TimeZone timeZone12 = fastDateFormat8.getTimeZone();
        java.util.TimeZone timeZone14 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone14);
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12, locale16);
        java.util.TimeZone timeZone19 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone19);
        java.util.Locale locale21 = fastDateFormat20.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone12, locale21);
        java.util.TimeZone timeZone24 = null;
        java.util.TimeZone timeZone26 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale29);
        java.util.Locale locale31 = fastDateFormat30.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone26, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone24, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone12, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (byte) 1, timeZone12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar42 = null;
        java.lang.StringBuffer stringBuffer43 = null;
        java.lang.StringBuffer stringBuffer44 = fastDateFormat41.format(calendar42, stringBuffer43);
        java.util.TimeZone timeZone45 = fastDateFormat41.getTimeZone();
        java.util.TimeZone timeZone47 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone47);
        java.util.Locale locale49 = fastDateFormat48.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone45, locale49);
        java.util.TimeZone timeZone52 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone52);
        java.util.Locale locale54 = fastDateFormat53.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone45, locale54);
        java.util.TimeZone timeZone57 = null;
        java.util.Locale locale58 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone57, locale58);
        java.util.Locale locale60 = fastDateFormat59.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = new org.apache.commons.lang.time.FastDateFormat("hi!", timeZone45, locale60);
        java.util.TimeZone timeZone63 = null;
        java.util.TimeZone timeZone65 = null;
        java.util.TimeZone timeZone67 = null;
        java.util.Locale locale70 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale70);
        java.util.Locale locale72 = fastDateFormat71.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone67, locale72);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone65, locale72);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat75 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone63, locale72);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar80 = null;
        java.lang.StringBuffer stringBuffer81 = null;
        java.lang.StringBuffer stringBuffer82 = fastDateFormat79.format(calendar80, stringBuffer81);
        java.util.TimeZone timeZone83 = fastDateFormat79.getTimeZone();
        java.util.TimeZone timeZone85 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone85);
        java.util.Locale locale87 = fastDateFormat86.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat88 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone83, locale87);
        java.util.TimeZone timeZone90 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat91 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone90);
        java.util.Locale locale92 = fastDateFormat91.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat93 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone83, locale92);
        boolean boolean94 = fastDateFormat75.equals((java.lang.Object) locale92);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat95 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone45, locale92);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat96 = org.apache.commons.lang.time.FastDateFormat.getInstance("h", timeZone12, locale92);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat97 = org.apache.commons.lang.time.FastDateFormat.getInstance("h", timeZone12);
        java.lang.String str99 = fastDateFormat97.format((long) 39);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNull(stringBuffer11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNull(stringBuffer44);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNull(stringBuffer82);
        org.junit.Assert.assertNotNull(timeZone83);
        org.junit.Assert.assertEquals(timeZone83.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat86);
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat88);
        org.junit.Assert.assertNotNull(fastDateFormat91);
        org.junit.Assert.assertNotNull(locale92);
        org.junit.Assert.assertEquals(locale92.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(fastDateFormat95);
        org.junit.Assert.assertNotNull(fastDateFormat96);
        org.junit.Assert.assertNotNull(fastDateFormat97);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "7" + "'", str99, "7");
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        int int5 = fastDateFormat3.getMaxLengthEstimate();
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale6);
        int int8 = fastDateFormat7.getMaxLengthEstimate();
        java.lang.Object obj9 = fastDateFormat7.clone();
        java.lang.Class<?> wildcardClass10 = fastDateFormat7.getClass();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat5.format(calendar6, stringBuffer7);
        java.util.TimeZone timeZone9 = fastDateFormat5.getTimeZone();
        java.util.TimeZone timeZone11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9, locale13);
        java.util.TimeZone timeZone16 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone16);
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone9, locale18);
        boolean boolean20 = fastDateFormat19.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone21 = fastDateFormat19.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar26 = null;
        java.lang.StringBuffer stringBuffer27 = null;
        java.lang.StringBuffer stringBuffer28 = fastDateFormat25.format(calendar26, stringBuffer27);
        java.util.TimeZone timeZone29 = fastDateFormat25.getTimeZone();
        java.util.TimeZone timeZone31 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone31);
        java.util.Locale locale33 = fastDateFormat32.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone29, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone21, locale33);
        java.lang.String str37 = fastDateFormat36.toString();
        fastDateFormat36.init();
        java.util.TimeZone timeZone39 = fastDateFormat36.getTimeZone();
        java.util.TimeZone timeZone43 = null;
        java.util.Locale locale44 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone43, locale44);
        java.util.Calendar calendar46 = null;
        java.lang.StringBuffer stringBuffer47 = null;
        java.lang.StringBuffer stringBuffer48 = fastDateFormat45.format(calendar46, stringBuffer47);
        boolean boolean49 = fastDateFormat45.getTimeZoneOverridesCalendar();
        java.util.Locale locale50 = fastDateFormat45.getLocale();
        java.lang.String str51 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone39, false, (int) (short) 1, locale50);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) -1, timeZone39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNull(stringBuffer28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "FastDateFormat[1/1/70 07:00]" + "'", str37, "FastDateFormat[1/1/70 07:00]");
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNull(stringBuffer48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str51, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar3 = null;
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format(calendar3, stringBuffer4);
        java.util.TimeZone timeZone6 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar12 = null;
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.StringBuffer stringBuffer14 = fastDateFormat11.format(calendar12, stringBuffer13);
        java.util.TimeZone timeZone15 = fastDateFormat11.getTimeZone();
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone17);
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone15, locale19);
        java.util.TimeZone timeZone22 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone22);
        java.util.Locale locale24 = fastDateFormat23.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone15, locale24);
        boolean boolean26 = fastDateFormat25.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone27 = fastDateFormat25.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar33 = null;
        java.lang.StringBuffer stringBuffer34 = null;
        java.lang.StringBuffer stringBuffer35 = fastDateFormat32.format(calendar33, stringBuffer34);
        java.util.TimeZone timeZone36 = fastDateFormat32.getTimeZone();
        java.util.TimeZone timeZone38 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone38);
        java.util.Locale locale40 = fastDateFormat39.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone36, locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = new org.apache.commons.lang.time.FastDateFormat("\u0e17\u0e35\u0e48 d MMMM GGGG y", timeZone27, locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = new org.apache.commons.lang.time.FastDateFormat("EEEE", timeZone6, locale40);
        java.util.List list46 = fastDateFormat45.parsePattern();
        java.lang.Object obj47 = fastDateFormat45.clone();
        int int48 = fastDateFormat45.getMaxLengthEstimate();
        java.lang.StringBuffer stringBuffer50 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer51 = fastDateFormat45.format(100L, stringBuffer50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNull(stringBuffer5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNull(stringBuffer14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNull(stringBuffer35);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "FastDateFormat[EEEE]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "FastDateFormat[EEEE]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "FastDateFormat[EEEE]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        java.util.Locale locale3 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar13 = null;
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.StringBuffer stringBuffer15 = fastDateFormat12.format(calendar13, stringBuffer14);
        java.util.TimeZone timeZone16 = fastDateFormat12.getTimeZone();
        java.util.TimeZone timeZone18 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone18);
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone16, locale20);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale20);
        java.util.List list23 = fastDateFormat22.parsePattern();
        java.util.TimeZone timeZone24 = fastDateFormat22.getTimeZone();
        java.util.TimeZone timeZone26 = null;
        java.util.TimeZone timeZone28 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale31);
        java.util.Locale locale33 = fastDateFormat32.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone28, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone26, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, timeZone24, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar43 = null;
        java.lang.StringBuffer stringBuffer44 = null;
        java.lang.StringBuffer stringBuffer45 = fastDateFormat42.format(calendar43, stringBuffer44);
        java.util.TimeZone timeZone46 = fastDateFormat42.getTimeZone();
        java.lang.Object obj47 = fastDateFormat42.clone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar50 = null;
        java.lang.StringBuffer stringBuffer51 = null;
        java.lang.StringBuffer stringBuffer52 = fastDateFormat49.format(calendar50, stringBuffer51);
        java.util.TimeZone timeZone53 = fastDateFormat49.getTimeZone();
        boolean boolean54 = fastDateFormat42.equals((java.lang.Object) timeZone53);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar60 = null;
        java.lang.StringBuffer stringBuffer61 = null;
        java.lang.StringBuffer stringBuffer62 = fastDateFormat59.format(calendar60, stringBuffer61);
        java.util.TimeZone timeZone63 = fastDateFormat59.getTimeZone();
        java.util.TimeZone timeZone65 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone65);
        java.util.Locale locale67 = fastDateFormat66.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone63, locale67);
        java.util.TimeZone timeZone70 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone70);
        java.util.Locale locale72 = fastDateFormat71.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone63, locale72);
        java.util.TimeZone timeZone75 = null;
        java.util.TimeZone timeZone77 = null;
        java.util.Locale locale80 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale80);
        java.util.Locale locale82 = fastDateFormat81.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat83 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone77, locale82);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone75, locale82);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat85 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone63, locale82);
        java.util.Locale locale86 = fastDateFormat85.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone53, locale86);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat88 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale86);
        java.lang.String str89 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone24, false, (int) (short) 0, locale86);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat90 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ", timeZone6, locale86);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat91 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) '4', locale86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNull(stringBuffer15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNull(stringBuffer45);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNull(stringBuffer52);
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNull(stringBuffer62);
        org.junit.Assert.assertNotNull(timeZone63);
        org.junit.Assert.assertEquals(timeZone63.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat83);
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertNotNull(fastDateFormat85);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(fastDateFormat88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "ICT" + "'", str89, "ICT");
        org.junit.Assert.assertNotNull(fastDateFormat90);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar9 = null;
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.StringBuffer stringBuffer11 = fastDateFormat8.format(calendar9, stringBuffer10);
        java.util.TimeZone timeZone12 = fastDateFormat8.getTimeZone();
        java.util.TimeZone timeZone14 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone14);
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12, locale16);
        java.util.TimeZone timeZone19 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone19);
        java.util.Locale locale21 = fastDateFormat20.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone12, locale21);
        java.util.TimeZone timeZone24 = null;
        java.util.TimeZone timeZone26 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale29);
        java.util.Locale locale31 = fastDateFormat30.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone26, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone24, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone12, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone12);
        java.util.Locale locale36 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = new org.apache.commons.lang.time.FastDateFormat("d MMMM y", timeZone12, locale36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar44 = null;
        java.lang.StringBuffer stringBuffer45 = null;
        java.lang.StringBuffer stringBuffer46 = fastDateFormat43.format(calendar44, stringBuffer45);
        java.util.TimeZone timeZone47 = fastDateFormat43.getTimeZone();
        java.util.TimeZone timeZone49 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone49);
        java.util.Locale locale51 = fastDateFormat50.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone47, locale51);
        java.util.TimeZone timeZone54 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone54);
        java.util.Locale locale56 = fastDateFormat55.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone47, locale56);
        java.util.TimeZone timeZone59 = null;
        java.util.TimeZone timeZone61 = null;
        java.util.Locale locale64 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale64);
        java.util.Locale locale66 = fastDateFormat65.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone61, locale66);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone59, locale66);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone47, locale66);
        java.util.TimeZone timeZone71 = null;
        java.util.Locale locale74 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale74);
        java.util.Locale locale76 = fastDateFormat75.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone71, locale76);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone47, locale76);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone12, locale76);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang.time.FastDateFormat.getInstance("MM", timeZone12);
        java.lang.String str82 = fastDateFormat80.format((long) 100);
        java.util.Date date83 = null;
        java.lang.StringBuffer stringBuffer84 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer85 = fastDateFormat80.format(date83, stringBuffer84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNull(stringBuffer11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNull(stringBuffer46);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "01" + "'", str82, "01");
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1);
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale6);
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone3, locale8);
        boolean boolean10 = fastDateFormat1.equals((java.lang.Object) (short) 0);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar16 = null;
        java.lang.StringBuffer stringBuffer17 = null;
        java.lang.StringBuffer stringBuffer18 = fastDateFormat15.format(calendar16, stringBuffer17);
        java.util.TimeZone timeZone19 = fastDateFormat15.getTimeZone();
        java.util.TimeZone timeZone21 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone21);
        java.util.Locale locale23 = fastDateFormat22.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone19, locale23);
        java.lang.String str25 = fastDateFormat24.toString();
        java.util.TimeZone timeZone26 = fastDateFormat24.getTimeZone();
        java.util.TimeZone timeZone29 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone29);
        boolean boolean31 = fastDateFormat30.getTimeZoneOverridesCalendar();
        boolean boolean32 = fastDateFormat30.getTimeZoneOverridesCalendar();
        java.lang.String str33 = fastDateFormat30.getPattern();
        java.util.Locale locale34 = fastDateFormat30.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = new org.apache.commons.lang.time.FastDateFormat("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone26, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar42 = null;
        java.lang.StringBuffer stringBuffer43 = null;
        java.lang.StringBuffer stringBuffer44 = fastDateFormat41.format(calendar42, stringBuffer43);
        java.util.TimeZone timeZone45 = fastDateFormat41.getTimeZone();
        java.util.TimeZone timeZone47 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone47);
        java.util.Locale locale49 = fastDateFormat48.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone45, locale49);
        java.util.TimeZone timeZone52 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone52);
        java.util.Locale locale54 = fastDateFormat53.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone45, locale54);
        boolean boolean56 = fastDateFormat55.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone57 = fastDateFormat55.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar62 = null;
        java.lang.StringBuffer stringBuffer63 = null;
        java.lang.StringBuffer stringBuffer64 = fastDateFormat61.format(calendar62, stringBuffer63);
        java.util.TimeZone timeZone65 = fastDateFormat61.getTimeZone();
        java.util.TimeZone timeZone67 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone67);
        java.util.Locale locale69 = fastDateFormat68.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone65, locale69);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale69);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone57, locale69);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = new org.apache.commons.lang.time.FastDateFormat("m", timeZone26, locale69);
        java.lang.StringBuffer stringBuffer74 = null;
        java.text.FieldPosition fieldPosition75 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer76 = fastDateFormat1.format((java.lang.Object) "m", stringBuffer74, fieldPosition75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNull(stringBuffer18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "FastDateFormat[]" + "'", str25, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky "10) test5061(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z" + "'", str33, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNull(stringBuffer44);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(timeZone57);
        org.junit.Assert.assertEquals(timeZone57.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNull(stringBuffer64);
        org.junit.Assert.assertNotNull(timeZone65);
        org.junit.Assert.assertEquals(timeZone65.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(fastDateFormat72);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        java.util.TimeZone timeZone5 = null;
        java.util.TimeZone timeZone7 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale10);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone7, locale12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone5, locale12);
        java.util.Locale locale16 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale16);
        java.lang.String str19 = fastDateFormat17.format((java.lang.Object) 1L);
        boolean boolean20 = fastDateFormat14.equals((java.lang.Object) str19);
        int[] intArray24 = new int[] { (short) 0, (short) 0 };
        java.lang.String str25 = fastDateFormat14.parseToken("hi!", intArray24);
        int int26 = fastDateFormat14.getMaxLengthEstimate();
        java.util.Locale locale29 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale29);
        java.util.Locale locale31 = fastDateFormat30.getLocale();
        boolean boolean32 = fastDateFormat14.equals((java.lang.Object) locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z", locale31);
        java.lang.String str35 = fastDateFormat33.format(1L);
        java.util.TimeZone timeZone36 = fastDateFormat33.getTimeZone();
        java.util.TimeZone timeZone38 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone38);
        boolean boolean40 = fastDateFormat39.getTimeZoneOverridesCalendar();
        boolean boolean41 = fastDateFormat39.getTimeZoneOverridesCalendar();
        java.lang.String str42 = fastDateFormat39.getPattern();
        java.util.Locale locale43 = fastDateFormat39.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone36, locale43);
        java.util.Locale locale45 = fastDateFormat44.getLocale();
        java.util.Locale locale46 = fastDateFormat44.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 10, 1, locale46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0, 0 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 45 + "'", int26 == 45);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT" + "'", str35, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT");
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
// flaky "11) test5062(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z" + "'", str42, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70");
        java.lang.Object obj2 = fastDateFormat1.clone();
        java.util.Calendar calendar3 = null;
        java.lang.String str4 = fastDateFormat1.format(calendar3);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat1.format((long) '#', stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[1/1/70]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "FastDateFormat[1/1/70]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "FastDateFormat[1/1/70]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/1/70" + "'", str4, "1/1/70");
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar10 = null;
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.StringBuffer stringBuffer12 = fastDateFormat9.format(calendar10, stringBuffer11);
        java.util.TimeZone timeZone13 = fastDateFormat9.getTimeZone();
        java.util.TimeZone timeZone15 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone15);
        java.util.Locale locale17 = fastDateFormat16.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone13, locale17);
        java.util.TimeZone timeZone20 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone20);
        java.util.Locale locale22 = fastDateFormat21.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone13, locale22);
        java.util.TimeZone timeZone25 = null;
        java.util.TimeZone timeZone27 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale30);
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone27, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone25, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone13, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (byte) 1, timeZone13);
        java.util.TimeZone timeZone40 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone40, locale41);
        java.util.TimeZone timeZone43 = fastDateFormat42.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar49 = null;
        java.lang.StringBuffer stringBuffer50 = null;
        java.lang.StringBuffer stringBuffer51 = fastDateFormat48.format(calendar49, stringBuffer50);
        java.util.TimeZone timeZone52 = fastDateFormat48.getTimeZone();
        java.util.TimeZone timeZone54 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone54);
        java.util.Locale locale56 = fastDateFormat55.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone52, locale56);
        java.lang.String str58 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone43, true, (int) (short) 0, locale56);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar64 = null;
        java.lang.StringBuffer stringBuffer65 = null;
        java.lang.StringBuffer stringBuffer66 = fastDateFormat63.format(calendar64, stringBuffer65);
        java.util.TimeZone timeZone67 = fastDateFormat63.getTimeZone();
        java.util.TimeZone timeZone69 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone69);
        java.util.Locale locale71 = fastDateFormat70.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone67, locale71);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale71);
        java.lang.String str74 = fastDateFormat73.toString();
        int int75 = fastDateFormat73.getMaxLengthEstimate();
        java.util.Locale locale76 = fastDateFormat73.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = new org.apache.commons.lang.time.FastDateFormat("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT", timeZone43, locale76);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone13, locale76);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z", timeZone13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang.time.FastDateFormat.getInstance("d MMM y", timeZone13);
        java.lang.String str82 = fastDateFormat80.format((long) 8);
        java.lang.String str83 = fastDateFormat80.getPattern();
        java.util.Calendar calendar84 = null;
        java.lang.StringBuffer stringBuffer85 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer86 = fastDateFormat80.applyRules(calendar84, stringBuffer85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNull(stringBuffer12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNull(stringBuffer51);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "ICST" + "'", str58, "ICST");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNull(stringBuffer66);
        org.junit.Assert.assertNotNull(timeZone67);
        org.junit.Assert.assertEquals(timeZone67.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "FastDateFormat[]" + "'", str74, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(fastDateFormat80);
// flaky "12) test5064(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\u0e21\u0e04. 70" + "'", str82, "\u0e21\u0e04. 70");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "d MMM y" + "'", str83, "d MMM y");
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar13 = null;
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.StringBuffer stringBuffer15 = fastDateFormat12.format(calendar13, stringBuffer14);
        java.util.TimeZone timeZone16 = fastDateFormat12.getTimeZone();
        java.util.TimeZone timeZone18 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone18);
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone16, locale20);
        java.util.TimeZone timeZone23 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone23);
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone16, locale25);
        java.util.TimeZone timeZone28 = null;
        java.util.TimeZone timeZone30 = null;
        java.util.Locale locale33 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale33);
        java.util.Locale locale35 = fastDateFormat34.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone30, locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone28, locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone16, locale35);
        java.util.Locale locale39 = fastDateFormat38.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, 0, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = new org.apache.commons.lang.time.FastDateFormat("\u0e17\u0e35\u0e48 d MMMM GGGG y", timeZone5, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar46 = null;
        java.lang.StringBuffer stringBuffer47 = null;
        java.lang.StringBuffer stringBuffer48 = fastDateFormat45.format(calendar46, stringBuffer47);
        java.util.TimeZone timeZone49 = fastDateFormat45.getTimeZone();
        java.util.TimeZone timeZone51 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone51);
        java.util.Locale locale53 = fastDateFormat52.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone49, locale53);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar59 = null;
        java.lang.StringBuffer stringBuffer60 = null;
        java.lang.StringBuffer stringBuffer61 = fastDateFormat58.format(calendar59, stringBuffer60);
        java.util.TimeZone timeZone62 = fastDateFormat58.getTimeZone();
        java.util.TimeZone timeZone64 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone64);
        java.util.Locale locale66 = fastDateFormat65.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone62, locale66);
        java.util.TimeZone timeZone69 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone69);
        java.util.Locale locale71 = fastDateFormat70.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat72 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone62, locale71);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone49, locale71);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getInstance("d MMMM y", timeZone5, locale71);
        java.util.TimeZone timeZone76 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone76);
        java.lang.StringBuffer stringBuffer79 = null;
        java.lang.StringBuffer stringBuffer80 = fastDateFormat77.format((long) 100, stringBuffer79);
        java.lang.String str82 = fastDateFormat77.format((long) 100);
        java.util.Locale locale83 = fastDateFormat77.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat84 = new org.apache.commons.lang.time.FastDateFormat("d/M/yy", timeZone5, locale83);
        java.util.Date date85 = null;
        java.lang.StringBuffer stringBuffer86 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer87 = fastDateFormat84.format(date85, stringBuffer86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNull(stringBuffer15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNull(stringBuffer48);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNull(stringBuffer61);
        org.junit.Assert.assertNotNull(timeZone62);
        org.junit.Assert.assertEquals(timeZone62.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNull(stringBuffer80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "th_TH");
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.util.Calendar calendar5 = null;
        java.lang.String str6 = fastDateFormat3.format(calendar5);
        java.lang.String str8 = fastDateFormat3.format(10L);
        java.util.Calendar calendar9 = null;
        java.lang.String str10 = fastDateFormat3.format(calendar9);
        java.lang.Object obj11 = fastDateFormat3.clone();
        java.lang.String str12 = fastDateFormat3.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.lang.String str6 = fastDateFormat3.format((long) 10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar11 = null;
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.StringBuffer stringBuffer13 = fastDateFormat10.format(calendar11, stringBuffer12);
        java.util.TimeZone timeZone14 = fastDateFormat10.getTimeZone();
        java.util.TimeZone timeZone16 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone16);
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone14, locale18);
        java.util.Locale locale22 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale22);
        java.util.Locale locale24 = fastDateFormat23.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone14, locale24);
        boolean boolean26 = fastDateFormat3.equals((java.lang.Object) fastDateFormat25);
        int int27 = fastDateFormat3.getMaxLengthEstimate();
        java.lang.StringBuffer stringBuffer29 = null;
        java.lang.StringBuffer stringBuffer30 = fastDateFormat3.format((long) (short) 10, stringBuffer29);
        java.lang.Class<?> wildcardClass31 = fastDateFormat3.getClass();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNull(stringBuffer13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(stringBuffer30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar9 = null;
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.StringBuffer stringBuffer11 = fastDateFormat8.format(calendar9, stringBuffer10);
        java.util.TimeZone timeZone12 = fastDateFormat8.getTimeZone();
        java.util.TimeZone timeZone14 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone14);
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12, locale16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale16);
        java.util.List list19 = fastDateFormat18.parsePattern();
        java.util.TimeZone timeZone20 = fastDateFormat18.getTimeZone();
        java.util.TimeZone timeZone22 = null;
        java.util.TimeZone timeZone24 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale27);
        java.util.Locale locale29 = fastDateFormat28.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone24, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone22, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, timeZone20, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, 2, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar40 = null;
        java.lang.StringBuffer stringBuffer41 = null;
        java.lang.StringBuffer stringBuffer42 = fastDateFormat39.format(calendar40, stringBuffer41);
        java.util.TimeZone timeZone43 = fastDateFormat39.getTimeZone();
        java.util.TimeZone timeZone45 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone45);
        java.util.Locale locale47 = fastDateFormat46.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone43, locale47);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar53 = null;
        java.lang.StringBuffer stringBuffer54 = null;
        java.lang.StringBuffer stringBuffer55 = fastDateFormat52.format(calendar53, stringBuffer54);
        java.util.TimeZone timeZone56 = fastDateFormat52.getTimeZone();
        java.util.TimeZone timeZone58 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone58);
        java.util.Locale locale60 = fastDateFormat59.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone56, locale60);
        java.util.TimeZone timeZone63 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone63);
        java.util.Locale locale65 = fastDateFormat64.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone56, locale65);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone43, locale65);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getInstance("EEEE", timeZone43);
        boolean boolean70 = fastDateFormat33.equals((java.lang.Object) timeZone43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone43);
        java.lang.String str73 = fastDateFormat71.format((long) (short) 1);
        java.lang.StringBuffer stringBuffer75 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer76 = fastDateFormat71.format((long) (-1), stringBuffer75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNull(stringBuffer11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNull(stringBuffer42);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNull(stringBuffer55);
        org.junit.Assert.assertNotNull(timeZone56);
        org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(fastDateFormat71);
// flaky "13) test5068(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70" + "'", str73, "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70");
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat5.format(calendar6, stringBuffer7);
        java.util.TimeZone timeZone9 = fastDateFormat5.getTimeZone();
        java.util.TimeZone timeZone11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9, locale13);
        java.lang.String str15 = fastDateFormat14.toString();
        java.util.TimeZone timeZone16 = fastDateFormat14.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar20 = null;
        java.lang.StringBuffer stringBuffer21 = null;
        java.lang.StringBuffer stringBuffer22 = fastDateFormat19.format(calendar20, stringBuffer21);
        java.util.TimeZone timeZone23 = fastDateFormat19.getTimeZone();
        java.lang.Object obj24 = fastDateFormat19.clone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar27 = null;
        java.lang.StringBuffer stringBuffer28 = null;
        java.lang.StringBuffer stringBuffer29 = fastDateFormat26.format(calendar27, stringBuffer28);
        java.util.TimeZone timeZone30 = fastDateFormat26.getTimeZone();
        boolean boolean31 = fastDateFormat19.equals((java.lang.Object) timeZone30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar37 = null;
        java.lang.StringBuffer stringBuffer38 = null;
        java.lang.StringBuffer stringBuffer39 = fastDateFormat36.format(calendar37, stringBuffer38);
        java.util.TimeZone timeZone40 = fastDateFormat36.getTimeZone();
        java.util.TimeZone timeZone42 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone42);
        java.util.Locale locale44 = fastDateFormat43.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone40, locale44);
        java.util.TimeZone timeZone47 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone47);
        java.util.Locale locale49 = fastDateFormat48.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone40, locale49);
        java.util.TimeZone timeZone52 = null;
        java.util.TimeZone timeZone54 = null;
        java.util.Locale locale57 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale57);
        java.util.Locale locale59 = fastDateFormat58.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone54, locale59);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone52, locale59);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone40, locale59);
        java.util.Locale locale63 = fastDateFormat62.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone30, locale63);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[HH:mm]", timeZone16, locale63);
        java.util.Locale locale68 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale68);
        java.util.Locale locale70 = fastDateFormat69.getLocale();
        java.util.Locale locale71 = fastDateFormat69.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang.time.FastDateFormat.getInstance("EEEE", timeZone16, locale71);
        java.lang.String str74 = fastDateFormat72.format((long) 100);
        java.util.TimeZone timeZone75 = fastDateFormat72.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang.time.FastDateFormat.getInstance("06:59", timeZone75);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "FastDateFormat[]" + "'", str15, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNull(stringBuffer22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNull(stringBuffer29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNull(stringBuffer39);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35" + "'", str74, "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35");
        org.junit.Assert.assertNotNull(timeZone75);
        org.junit.Assert.assertEquals(timeZone75.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat76);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1);
        int int2 = fastDateFormat1.getMaxLengthEstimate();
        java.util.TimeZone timeZone3 = fastDateFormat1.getTimeZone();
        java.util.Date date4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat1.format(date4, stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat7.format(calendar8, stringBuffer9);
        java.util.TimeZone timeZone11 = fastDateFormat7.getTimeZone();
        java.util.TimeZone timeZone13 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone13);
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11, locale15);
        java.util.TimeZone timeZone18 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone18);
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone11, locale20);
        boolean boolean22 = fastDateFormat21.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone23 = fastDateFormat21.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar28 = null;
        java.lang.StringBuffer stringBuffer29 = null;
        java.lang.StringBuffer stringBuffer30 = fastDateFormat27.format(calendar28, stringBuffer29);
        java.util.TimeZone timeZone31 = fastDateFormat27.getTimeZone();
        java.util.TimeZone timeZone33 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone33);
        java.util.Locale locale35 = fastDateFormat34.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone31, locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone23, locale35);
        java.lang.String str39 = fastDateFormat38.toString();
        java.util.Locale locale40 = fastDateFormat38.getLocale();
        java.util.TimeZone timeZone41 = fastDateFormat38.getTimeZone();
        java.util.TimeZone timeZone43 = null;
        java.util.Locale locale44 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone43, locale44);
        java.util.TimeZone timeZone46 = fastDateFormat45.getTimeZone();
        java.util.Locale locale47 = fastDateFormat45.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = new org.apache.commons.lang.time.FastDateFormat(":00", timeZone41, locale47);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 100, 39, timeZone41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNull(stringBuffer30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "FastDateFormat[1/1/70 07:00]" + "'", str39, "FastDateFormat[1/1/70 07:00]");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "th_TH");
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat6.format(calendar7, stringBuffer8);
        java.util.TimeZone timeZone10 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale14);
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone17);
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone10, locale19);
        boolean boolean21 = fastDateFormat20.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone22 = fastDateFormat20.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar27 = null;
        java.lang.StringBuffer stringBuffer28 = null;
        java.lang.StringBuffer stringBuffer29 = fastDateFormat26.format(calendar27, stringBuffer28);
        java.util.TimeZone timeZone30 = fastDateFormat26.getTimeZone();
        java.util.TimeZone timeZone32 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone32);
        java.util.Locale locale34 = fastDateFormat33.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone30, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone22, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1, locale34);
        java.util.TimeZone timeZone40 = fastDateFormat39.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar44 = null;
        java.lang.StringBuffer stringBuffer45 = null;
        java.lang.StringBuffer stringBuffer46 = fastDateFormat43.format(calendar44, stringBuffer45);
        java.util.TimeZone timeZone47 = fastDateFormat43.getTimeZone();
        java.util.TimeZone timeZone49 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone49);
        java.util.Locale locale51 = fastDateFormat50.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone47, locale51);
        java.lang.String str53 = fastDateFormat52.toString();
        java.util.TimeZone timeZone54 = fastDateFormat52.getTimeZone();
        java.lang.Object obj55 = fastDateFormat52.clone();
        boolean boolean56 = fastDateFormat39.equals(obj55);
        fastDateFormat39.init();
        boolean boolean58 = fastDateFormat39.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNull(stringBuffer9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNull(stringBuffer29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNull(stringBuffer46);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "FastDateFormat[]" + "'", str53, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertEquals(obj55.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj55), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj55), "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat7.format(calendar8, stringBuffer9);
        java.util.TimeZone timeZone11 = fastDateFormat7.getTimeZone();
        java.util.TimeZone timeZone13 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone13);
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11, locale15);
        java.util.TimeZone timeZone18 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone18);
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone11, locale20);
        java.util.TimeZone timeZone23 = null;
        java.util.TimeZone timeZone25 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale28);
        java.util.Locale locale30 = fastDateFormat29.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone25, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone23, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone11, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (byte) 1, timeZone11);
        java.util.Locale locale35 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35", timeZone11, locale35);
        java.util.TimeZone timeZone40 = null;
        java.util.Locale locale43 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale43);
        java.util.Locale locale45 = fastDateFormat44.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getInstance(":00", timeZone40, locale45);
        boolean boolean47 = fastDateFormat46.getTimeZoneOverridesCalendar();
        java.lang.Object obj48 = fastDateFormat46.clone();
        java.util.Locale locale49 = fastDateFormat46.getLocale();
        java.lang.String str50 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone11, true, 0, locale49);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "FastDateFormat[:00]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "FastDateFormat[:00]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "FastDateFormat[:00]");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ICST" + "'", str50, "ICST");
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.StringBuffer stringBuffer6 = fastDateFormat3.format(calendar4, stringBuffer5);
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        java.lang.Object obj8 = fastDateFormat3.clone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar11 = null;
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.StringBuffer stringBuffer13 = fastDateFormat10.format(calendar11, stringBuffer12);
        java.util.TimeZone timeZone14 = fastDateFormat10.getTimeZone();
        boolean boolean15 = fastDateFormat3.equals((java.lang.Object) timeZone14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("h", timeZone14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("07:00");
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        java.util.TimeZone timeZone24 = null;
        java.util.TimeZone timeZone26 = null;
        java.util.TimeZone timeZone28 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale31);
        java.util.Locale locale33 = fastDateFormat32.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone28, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone26, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone24, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar41 = null;
        java.lang.StringBuffer stringBuffer42 = null;
        java.lang.StringBuffer stringBuffer43 = fastDateFormat40.format(calendar41, stringBuffer42);
        java.util.TimeZone timeZone44 = fastDateFormat40.getTimeZone();
        java.util.TimeZone timeZone46 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone46);
        java.util.Locale locale48 = fastDateFormat47.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone44, locale48);
        java.util.TimeZone timeZone51 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone51);
        java.util.Locale locale53 = fastDateFormat52.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone44, locale53);
        boolean boolean55 = fastDateFormat36.equals((java.lang.Object) locale53);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = new org.apache.commons.lang.time.FastDateFormat("'1/1/70 07:00", timeZone22, locale53);
        java.util.TimeZone timeZone59 = null;
        java.util.TimeZone timeZone61 = null;
        java.util.Locale locale64 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale64);
        java.util.Locale locale66 = fastDateFormat65.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone61, locale66);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone59, locale66);
        java.util.Locale locale70 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale70);
        java.lang.String str73 = fastDateFormat71.format((java.lang.Object) 1L);
        boolean boolean74 = fastDateFormat68.equals((java.lang.Object) str73);
        int[] intArray78 = new int[] { (short) 0, (short) 0 };
        java.lang.String str79 = fastDateFormat68.parseToken("hi!", intArray78);
        int int80 = fastDateFormat68.getMaxLengthEstimate();
        java.util.Locale locale83 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale83);
        java.util.Locale locale85 = fastDateFormat84.getLocale();
        boolean boolean86 = fastDateFormat68.equals((java.lang.Object) locale85);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z", locale85);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat88 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone22, locale85);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat89 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(2, locale85);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat90 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(8, timeZone14, locale85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNull(stringBuffer6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNull(stringBuffer13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNull(stringBuffer43);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { 0, 0 });
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "h" + "'", str79, "h");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 45 + "'", int80 == 45);
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(fastDateFormat88);
        org.junit.Assert.assertNotNull(fastDateFormat89);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.util.Calendar calendar4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.StringBuffer stringBuffer6 = fastDateFormat2.applyRules(calendar4, stringBuffer5);
        java.util.Locale locale7 = fastDateFormat2.getLocale();
        java.util.TimeZone timeZone8 = fastDateFormat2.getTimeZone();
        java.lang.String str9 = fastDateFormat2.toString();
        java.lang.String str11 = fastDateFormat2.format((long) 2);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar16 = null;
        java.lang.StringBuffer stringBuffer17 = null;
        java.lang.StringBuffer stringBuffer18 = fastDateFormat15.format(calendar16, stringBuffer17);
        java.util.TimeZone timeZone19 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar25 = null;
        java.lang.StringBuffer stringBuffer26 = null;
        java.lang.StringBuffer stringBuffer27 = fastDateFormat24.format(calendar25, stringBuffer26);
        java.util.TimeZone timeZone28 = fastDateFormat24.getTimeZone();
        java.util.TimeZone timeZone30 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone30);
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone28, locale32);
        java.util.TimeZone timeZone35 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone35);
        java.util.Locale locale37 = fastDateFormat36.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone28, locale37);
        boolean boolean39 = fastDateFormat38.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone40 = fastDateFormat38.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar46 = null;
        java.lang.StringBuffer stringBuffer47 = null;
        java.lang.StringBuffer stringBuffer48 = fastDateFormat45.format(calendar46, stringBuffer47);
        java.util.TimeZone timeZone49 = fastDateFormat45.getTimeZone();
        java.util.TimeZone timeZone51 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone51);
        java.util.Locale locale53 = fastDateFormat52.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone49, locale53);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale53);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale53);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = new org.apache.commons.lang.time.FastDateFormat("\u0e17\u0e35\u0e48 d MMMM GGGG y", timeZone40, locale53);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = new org.apache.commons.lang.time.FastDateFormat("EEEE", timeZone19, locale53);
        java.util.Locale locale59 = fastDateFormat58.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar63 = null;
        java.lang.StringBuffer stringBuffer64 = null;
        java.lang.StringBuffer stringBuffer65 = fastDateFormat62.format(calendar63, stringBuffer64);
        java.util.TimeZone timeZone68 = null;
        java.util.TimeZone timeZone70 = null;
        java.util.Locale locale73 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale73);
        java.util.Locale locale75 = fastDateFormat74.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone70, locale75);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone68, locale75);
        java.util.Locale locale79 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale79);
        java.lang.String str82 = fastDateFormat80.format((java.lang.Object) 1L);
        boolean boolean83 = fastDateFormat77.equals((java.lang.Object) str82);
        int[] intArray87 = new int[] { (short) 0, (short) 0 };
        java.lang.String str88 = fastDateFormat77.parseToken("hi!", intArray87);
        java.lang.String str89 = fastDateFormat62.parseToken("FastDateFormat[1/1/70 07:00]", intArray87);
        java.lang.String str90 = fastDateFormat58.parseToken("d MMMM y", intArray87);
        java.lang.String str91 = fastDateFormat2.parseToken("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", intArray87);
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNull(stringBuffer6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FastDateFormat[]" + "'", str9, "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNull(stringBuffer18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNull(stringBuffer27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNull(stringBuffer48);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNull(stringBuffer65);
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(intArray87);
// flaky "14) test5075(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertArrayEquals(intArray87, new int[] { 40, 0 });
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "h" + "'", str88, "h");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "F" + "'", str89, "F");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "d" + "'", str90, "d");
// flaky "3) test5075(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str91 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str91, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        java.util.TimeZone timeZone5 = null;
        java.util.TimeZone timeZone7 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale10);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone7, locale12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone5, locale12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, locale12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale12);
        java.lang.String str18 = fastDateFormat16.format((long) '#');
        java.util.TimeZone timeZone19 = fastDateFormat16.getTimeZone();
        java.util.TimeZone timeZone21 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("':00", timeZone21);
        java.util.TimeZone timeZone25 = null;
        java.util.TimeZone timeZone27 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale30);
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone27, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone25, locale32);
        java.util.Locale locale36 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale36);
        java.lang.String str39 = fastDateFormat37.format((java.lang.Object) 1L);
        boolean boolean40 = fastDateFormat34.equals((java.lang.Object) str39);
        int[] intArray44 = new int[] { (short) 0, (short) 0 };
        java.lang.String str45 = fastDateFormat34.parseToken("hi!", intArray44);
        java.lang.String str46 = fastDateFormat22.parseToken("\u0e17\u0e35\u0e48 d MMMM GGGG y", intArray44);
        boolean boolean48 = fastDateFormat22.equals((java.lang.Object) 100.0d);
        java.lang.String str50 = fastDateFormat22.format(100L);
        java.util.Locale locale51 = fastDateFormat22.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("h", timeZone19, locale51);
        java.util.TimeZone timeZone55 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone55);
        java.util.Locale locale57 = fastDateFormat56.getLocale();
        int int58 = fastDateFormat56.getMaxLengthEstimate();
        java.lang.String str59 = fastDateFormat56.toString();
        java.lang.Object obj60 = fastDateFormat56.clone();
        java.util.Locale locale61 = fastDateFormat56.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z", locale61);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(13, timeZone19, locale61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 3, 0 });
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "h" + "'", str45, "h");
// flaky "15) test5076(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "EEEE" + "'", str46, "EEEE");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + ":00" + "'", str50, ":00");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "FastDateFormat[]" + "'", str59, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat62);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale2 = fastDateFormat1.getLocale();
        java.lang.String str3 = fastDateFormat1.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat7.format(calendar8, stringBuffer9);
        java.util.TimeZone timeZone11 = fastDateFormat7.getTimeZone();
        java.util.TimeZone timeZone13 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone13);
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11, locale15);
        java.util.TimeZone timeZone18 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone18);
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone11, locale20);
        java.util.TimeZone timeZone23 = null;
        java.util.TimeZone timeZone25 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale28);
        java.util.Locale locale30 = fastDateFormat29.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone25, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone23, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone11, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (byte) 1, timeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(5, timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat5.format(calendar6, stringBuffer7);
        java.util.TimeZone timeZone9 = fastDateFormat5.getTimeZone();
        java.util.TimeZone timeZone11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9, locale13);
        java.util.Locale locale17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale17);
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone9, locale19);
        java.util.TimeZone timeZone22 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone22);
        java.util.Locale locale24 = fastDateFormat23.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = new org.apache.commons.lang.time.FastDateFormat("", timeZone9, locale24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(45, timeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("FastDateFormat[d/M/yy HH:mm]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat6.format(calendar7, stringBuffer8);
        java.util.TimeZone timeZone10 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale14);
        java.util.Locale locale18 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale18);
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone10, locale20);
        java.util.TimeZone timeZone23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone23, locale24);
        java.util.TimeZone timeZone26 = fastDateFormat25.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar32 = null;
        java.lang.StringBuffer stringBuffer33 = null;
        java.lang.StringBuffer stringBuffer34 = fastDateFormat31.format(calendar32, stringBuffer33);
        java.util.TimeZone timeZone35 = fastDateFormat31.getTimeZone();
        java.util.TimeZone timeZone37 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone37);
        java.util.Locale locale39 = fastDateFormat38.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone35, locale39);
        java.lang.String str41 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone26, true, (int) (short) 0, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getInstance("':00", timeZone10, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("F", timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone10);
        java.util.TimeZone timeZone47 = null;
        java.util.TimeZone timeZone49 = null;
        java.util.Locale locale52 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale52);
        java.util.Locale locale54 = fastDateFormat53.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone49, locale54);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone47, locale54);
        java.util.Locale locale58 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale58);
        java.lang.String str61 = fastDateFormat59.format((java.lang.Object) 1L);
        boolean boolean62 = fastDateFormat56.equals((java.lang.Object) str61);
        int[] intArray66 = new int[] { (short) 0, (short) 0 };
        java.lang.String str67 = fastDateFormat56.parseToken("hi!", intArray66);
        java.lang.String str68 = fastDateFormat44.parseToken("Indochina Summer Time", intArray66);
        java.lang.String str70 = fastDateFormat44.format((long) (short) 10);
        java.util.Locale locale71 = fastDateFormat44.getLocale();
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNull(stringBuffer9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNull(stringBuffer34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ICST" + "'", str41, "ICST");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 0, 0 });
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "h" + "'", str67, "h");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "I" + "'", str68, "I");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70" + "'", str70, "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "th_TH");
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.StringBuffer stringBuffer6 = fastDateFormat3.format(calendar4, stringBuffer5);
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone9 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9);
        java.util.Locale locale11 = fastDateFormat10.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone7, locale11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale11);
        java.util.List list14 = fastDateFormat13.parsePattern();
        java.util.TimeZone timeZone15 = fastDateFormat13.getTimeZone();
        java.util.Locale locale16 = fastDateFormat13.getLocale();
        java.lang.Object obj17 = fastDateFormat13.clone();
        java.lang.String str18 = fastDateFormat13.getPattern();
        fastDateFormat13.init();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNull(stringBuffer6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        java.util.TimeZone timeZone3 = null;
        java.util.TimeZone timeZone5 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale8);
        java.util.Locale locale10 = fastDateFormat9.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5, locale10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone3, locale10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, locale10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale10);
        int int15 = fastDateFormat14.getMaxLengthEstimate();
        java.util.Locale locale16 = fastDateFormat14.getLocale();
        java.lang.StringBuffer stringBuffer18 = null;
        java.lang.StringBuffer stringBuffer19 = fastDateFormat14.format((long) (short) 0, stringBuffer18);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNull(stringBuffer19);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat4.format(calendar5, stringBuffer6);
        java.util.TimeZone timeZone8 = fastDateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8, locale12);
        java.util.TimeZone timeZone15 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone15);
        java.util.Locale locale17 = fastDateFormat16.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone8, locale17);
        boolean boolean19 = fastDateFormat18.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone20 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar25 = null;
        java.lang.StringBuffer stringBuffer26 = null;
        java.lang.StringBuffer stringBuffer27 = fastDateFormat24.format(calendar25, stringBuffer26);
        java.util.TimeZone timeZone28 = fastDateFormat24.getTimeZone();
        java.util.TimeZone timeZone30 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone30);
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone28, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone20, locale32);
        java.lang.String str36 = fastDateFormat35.toString();
        java.util.TimeZone timeZone37 = fastDateFormat35.getTimeZone();
        java.lang.Object obj38 = fastDateFormat35.clone();
        java.lang.String str40 = fastDateFormat35.format((long) 0);
        java.lang.StringBuffer stringBuffer42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer43 = fastDateFormat35.format((long) 39, stringBuffer42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNull(stringBuffer27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "FastDateFormat[1/1/70 07:00]" + "'", str36, "FastDateFormat[1/1/70 07:00]");
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "FastDateFormat[1/1/70 07:00]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "FastDateFormat[1/1/70 07:00]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "FastDateFormat[1/1/70 07:00]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1/1/70 07:00" + "'", str40, "1/1/70 07:00");
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("h");
        fastDateFormat1.init();
        java.lang.String str3 = fastDateFormat1.toString();
        boolean boolean4 = fastDateFormat1.getTimeZoneOverridesCalendar();
        fastDateFormat1.init();
        java.lang.Object obj6 = fastDateFormat1.clone();
        java.lang.String str8 = fastDateFormat1.format(100L);
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FastDateFormat[h]" + "'", str3, "FastDateFormat[h]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[h]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "FastDateFormat[h]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "FastDateFormat[h]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7" + "'", str8, "7");
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("07:00");
        java.util.TimeZone timeZone2 = fastDateFormat1.getTimeZone();
        java.util.List list3 = fastDateFormat1.parsePattern();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone2);
        boolean boolean4 = fastDateFormat3.getTimeZoneOverridesCalendar();
        boolean boolean5 = fastDateFormat3.getTimeZoneOverridesCalendar();
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale7);
        java.util.List list9 = fastDateFormat8.parsePattern();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "16) test5087(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z" + "'", str6, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70");
        java.lang.Object obj2 = fastDateFormat1.clone();
        java.util.Locale locale3 = fastDateFormat1.getLocale();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[1/1/70]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "FastDateFormat[1/1/70]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "FastDateFormat[1/1/70]");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat7.format(calendar8, stringBuffer9);
        java.util.TimeZone timeZone11 = fastDateFormat7.getTimeZone();
        java.util.TimeZone timeZone13 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone13);
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("h", timeZone2, locale15);
        boolean boolean20 = fastDateFormat19.getTimeZoneOverridesCalendar();
        int int21 = fastDateFormat19.getMaxLengthEstimate();
        java.util.Locale locale22 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getInstance("'1/70 07:00", locale22);
        java.util.Locale locale24 = fastDateFormat23.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.StringBuffer stringBuffer28 = null;
        java.lang.StringBuffer stringBuffer29 = fastDateFormat26.format(10L, stringBuffer28);
        java.lang.String str31 = fastDateFormat26.format(0L);
        java.lang.Object obj32 = fastDateFormat26.clone();
        java.util.Calendar calendar33 = null;
        java.lang.StringBuffer stringBuffer34 = null;
        java.lang.StringBuffer stringBuffer35 = fastDateFormat26.format(calendar33, stringBuffer34);
        java.lang.String str36 = fastDateFormat26.toString();
        java.util.TimeZone timeZone37 = fastDateFormat26.getTimeZone();
        boolean boolean38 = fastDateFormat23.equals((java.lang.Object) fastDateFormat26);
        boolean boolean39 = fastDateFormat23.getTimeZoneOverridesCalendar();
        java.util.Date date40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = fastDateFormat23.format(date40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNull(stringBuffer29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "FastDateFormat[]");
        org.junit.Assert.assertNull(stringBuffer35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "FastDateFormat[]" + "'", str36, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        java.util.TimeZone timeZone7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone7, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.TimeZone timeZone11 = fastDateFormat9.getTimeZone();
        java.util.TimeZone timeZone15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone15, locale16);
        java.util.TimeZone timeZone18 = fastDateFormat17.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("'0", timeZone18);
        java.util.TimeZone timeZone21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone21, locale22);
        java.util.Locale locale24 = fastDateFormat23.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone18, locale24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, 3, timeZone11, locale24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar34 = null;
        java.lang.StringBuffer stringBuffer35 = null;
        java.lang.StringBuffer stringBuffer36 = fastDateFormat33.format(calendar34, stringBuffer35);
        java.util.TimeZone timeZone37 = fastDateFormat33.getTimeZone();
        java.util.TimeZone timeZone39 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone39);
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone37, locale41);
        java.util.TimeZone timeZone44 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone44);
        java.util.Locale locale46 = fastDateFormat45.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone37, locale46);
        java.util.TimeZone timeZone49 = null;
        java.util.Locale locale50 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone49, locale50);
        java.util.Locale locale52 = fastDateFormat51.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = new org.apache.commons.lang.time.FastDateFormat("hi!", timeZone37, locale52);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale52);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11, locale52);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale52);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]", locale52);
// flaky "17) test5090(org.apache.commons.lang.time.RegressionTest10)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNull(stringBuffer36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar10 = null;
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.StringBuffer stringBuffer12 = fastDateFormat9.format(calendar10, stringBuffer11);
        java.util.TimeZone timeZone13 = fastDateFormat9.getTimeZone();
        java.util.TimeZone timeZone15 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone15);
        java.util.Locale locale17 = fastDateFormat16.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone13, locale17);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale17);
        java.util.List list20 = fastDateFormat19.parsePattern();
        java.util.TimeZone timeZone21 = fastDateFormat19.getTimeZone();
        java.util.TimeZone timeZone23 = null;
        java.util.TimeZone timeZone25 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale28);
        java.util.Locale locale30 = fastDateFormat29.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone25, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone23, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, timeZone21, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getInstance("a", timeZone21);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone21);
        java.util.TimeZone timeZone38 = null;
        java.util.TimeZone timeZone40 = null;
        java.util.Locale locale43 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale43);
        java.util.Locale locale45 = fastDateFormat44.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone40, locale45);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone38, locale45);
        java.util.Locale locale49 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale49);
        java.lang.String str52 = fastDateFormat50.format((java.lang.Object) 1L);
        boolean boolean53 = fastDateFormat47.equals((java.lang.Object) str52);
        java.util.Locale locale54 = fastDateFormat47.getLocale();
        java.util.Locale locale55 = fastDateFormat47.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale55);
        java.lang.String str57 = fastDateFormat56.toString();
        java.util.Locale locale58 = fastDateFormat56.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = new org.apache.commons.lang.time.FastDateFormat("06:59:59", timeZone21, locale58);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar64 = null;
        java.lang.StringBuffer stringBuffer65 = null;
        java.lang.StringBuffer stringBuffer66 = fastDateFormat63.format(calendar64, stringBuffer65);
        java.util.TimeZone timeZone67 = fastDateFormat63.getTimeZone();
        java.util.TimeZone timeZone69 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone69);
        java.util.Locale locale71 = fastDateFormat70.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone67, locale71);
        java.util.TimeZone timeZone74 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone74);
        java.util.Locale locale76 = fastDateFormat75.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone67, locale76);
        boolean boolean78 = fastDateFormat77.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone79 = fastDateFormat77.getTimeZone();
        java.util.Locale locale80 = fastDateFormat77.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat81 = new org.apache.commons.lang.time.FastDateFormat("ICST", timeZone21, locale80);
        java.lang.String str82 = fastDateFormat81.toString();
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNull(stringBuffer12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat56);
// flaky "18) test5091(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\u0e17\u0e35\u0e48 d MMMM GGGG y]" + "'", str57, "\u0e17\u0e35\u0e48 d MMMM GGGG y]");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNull(stringBuffer66);
        org.junit.Assert.assertNotNull(timeZone67);
        org.junit.Assert.assertEquals(timeZone67.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(timeZone79);
        org.junit.Assert.assertEquals(timeZone79.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "FastDateFormat[ICST]" + "'", str82, "FastDateFormat[ICST]");
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        java.util.TimeZone timeZone3 = null;
        java.util.TimeZone timeZone5 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale8);
        java.util.Locale locale10 = fastDateFormat9.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5, locale10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone3, locale10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, locale10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale10);
        fastDateFormat14.init();
        java.text.ParsePosition parsePosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = fastDateFormat14.parseObject("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z", parsePosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone2, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar13 = null;
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.StringBuffer stringBuffer15 = fastDateFormat12.format(calendar13, stringBuffer14);
        java.util.TimeZone timeZone16 = fastDateFormat12.getTimeZone();
        java.util.TimeZone timeZone18 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone18);
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone16, locale20);
        java.util.TimeZone timeZone23 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone23);
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone16, locale25);
        boolean boolean27 = fastDateFormat26.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone28 = fastDateFormat26.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar33 = null;
        java.lang.StringBuffer stringBuffer34 = null;
        java.lang.StringBuffer stringBuffer35 = fastDateFormat32.format(calendar33, stringBuffer34);
        java.util.TimeZone timeZone36 = fastDateFormat32.getTimeZone();
        java.util.TimeZone timeZone38 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone38);
        java.util.Locale locale40 = fastDateFormat39.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone36, locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone28, locale40);
        java.util.TimeZone timeZone46 = null;
        java.util.TimeZone timeZone48 = null;
        java.util.Locale locale51 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale51);
        java.util.Locale locale53 = fastDateFormat52.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone48, locale53);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone46, locale53);
        java.util.Locale locale57 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale57);
        java.lang.String str60 = fastDateFormat58.format((java.lang.Object) 1L);
        boolean boolean61 = fastDateFormat55.equals((java.lang.Object) str60);
        int[] intArray65 = new int[] { (short) 0, (short) 0 };
        java.lang.String str66 = fastDateFormat55.parseToken("hi!", intArray65);
        java.lang.String str67 = fastDateFormat43.parseToken("'1/1/70 07:00", intArray65);
        java.lang.String str68 = fastDateFormat6.parseToken("FastDateFormat[1/1/70 07:00]", intArray65);
        boolean boolean69 = fastDateFormat6.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNull(stringBuffer15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNull(stringBuffer35);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 13, 0 });
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "h" + "'", str66, "h");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "'1/1/70 07:00" + "'", str67, "'1/1/70 07:00");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "t" + "'", str68, "t");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat4.format(calendar5, stringBuffer6);
        java.util.TimeZone timeZone8 = fastDateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8, locale12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale12);
        java.util.List list15 = fastDateFormat14.parsePattern();
        java.util.TimeZone timeZone16 = fastDateFormat14.getTimeZone();
        java.util.Locale locale17 = fastDateFormat14.getLocale();
        java.util.Locale locale18 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("d MMMM y HH:mm", locale18);
        int int20 = fastDateFormat19.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 24 + "'", int20 == 24);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        java.util.TimeZone timeZone2 = null;
        java.util.TimeZone timeZone4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale7);
        java.util.Locale locale9 = fastDateFormat8.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone4, locale9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone2, locale9);
        java.util.Locale locale13 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale13);
        java.lang.String str16 = fastDateFormat14.format((java.lang.Object) 1L);
        boolean boolean17 = fastDateFormat11.equals((java.lang.Object) str16);
        java.util.Locale locale18 = fastDateFormat11.getLocale();
        java.util.Locale locale19 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale19);
        java.util.Date date21 = null;
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = fastDateFormat20.format(date21, stringBuffer22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat20);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone3, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        java.util.TimeZone timeZone7 = fastDateFormat5.getTimeZone();
        java.util.TimeZone timeZone11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11, locale12);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("'0", timeZone14);
        java.util.TimeZone timeZone17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone17, locale18);
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone14, locale20);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, 3, timeZone7, locale20);
        java.lang.String str24 = fastDateFormat22.format((long) (short) 1);
        boolean boolean25 = fastDateFormat22.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone28 = null;
        java.util.TimeZone timeZone30 = null;
        java.util.Locale locale33 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale33);
        java.util.Locale locale35 = fastDateFormat34.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone30, locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone28, locale35);
        int int38 = fastDateFormat37.getMaxLengthEstimate();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar42 = null;
        java.lang.StringBuffer stringBuffer43 = null;
        java.lang.StringBuffer stringBuffer44 = fastDateFormat41.format(calendar42, stringBuffer43);
        java.util.TimeZone timeZone47 = null;
        java.util.TimeZone timeZone49 = null;
        java.util.Locale locale52 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale52);
        java.util.Locale locale54 = fastDateFormat53.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone49, locale54);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone47, locale54);
        java.util.Locale locale58 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale58);
        java.lang.String str61 = fastDateFormat59.format((java.lang.Object) 1L);
        boolean boolean62 = fastDateFormat56.equals((java.lang.Object) str61);
        int[] intArray66 = new int[] { (short) 0, (short) 0 };
        java.lang.String str67 = fastDateFormat56.parseToken("hi!", intArray66);
        java.lang.String str68 = fastDateFormat41.parseToken("FastDateFormat[1/1/70 07:00]", intArray66);
        java.lang.String str69 = fastDateFormat37.parseToken("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]", intArray66);
        java.lang.String str70 = fastDateFormat22.parseToken("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", intArray66);
        java.util.Calendar calendar71 = null;
        java.lang.StringBuffer stringBuffer72 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer73 = fastDateFormat22.applyRules(calendar71, stringBuffer72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
// flaky "19) test5096(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70 07:00" + "'", str24, "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70 07:00");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 45 + "'", int38 == 45);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNull(stringBuffer44);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(intArray66);
// flaky "4) test5096(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertArrayEquals(intArray66, new int[] { 39, 0 });
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "h" + "'", str67, "h");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "F" + "'", str68, "F");
// flaky "3) test5096(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "F" + "'", str69, "F");
// flaky "2) test5096(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str70, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        int int6 = fastDateFormat2.getMaxLengthEstimate();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar14 = null;
        java.lang.StringBuffer stringBuffer15 = null;
        java.lang.StringBuffer stringBuffer16 = fastDateFormat13.format(calendar14, stringBuffer15);
        java.util.TimeZone timeZone17 = fastDateFormat13.getTimeZone();
        java.util.TimeZone timeZone19 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone19);
        java.util.Locale locale21 = fastDateFormat20.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone17, locale21);
        java.util.TimeZone timeZone24 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone24);
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone17, locale26);
        java.util.TimeZone timeZone29 = null;
        java.util.TimeZone timeZone31 = null;
        java.util.Locale locale34 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale34);
        java.util.Locale locale36 = fastDateFormat35.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone31, locale36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone29, locale36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone17, locale36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, locale36);
        java.util.TimeZone timeZone41 = fastDateFormat40.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone41);
        boolean boolean43 = fastDateFormat2.equals((java.lang.Object) fastDateFormat42);
        int int44 = fastDateFormat2.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNull(stringBuffer16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        java.util.TimeZone timeZone4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone4, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone8 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(100, 13, timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat9);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat5.format(calendar6, stringBuffer7);
        java.util.TimeZone timeZone9 = fastDateFormat5.getTimeZone();
        java.util.TimeZone timeZone11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9, locale13);
        java.util.TimeZone timeZone16 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone16);
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone9, locale18);
        boolean boolean20 = fastDateFormat19.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone21 = fastDateFormat19.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar27 = null;
        java.lang.StringBuffer stringBuffer28 = null;
        java.lang.StringBuffer stringBuffer29 = fastDateFormat26.format(calendar27, stringBuffer28);
        java.util.TimeZone timeZone30 = fastDateFormat26.getTimeZone();
        java.util.TimeZone timeZone32 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone32);
        java.util.Locale locale34 = fastDateFormat33.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone30, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = new org.apache.commons.lang.time.FastDateFormat("\u0e17\u0e35\u0e48 d MMMM GGGG y", timeZone21, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar45 = null;
        java.lang.StringBuffer stringBuffer46 = null;
        java.lang.StringBuffer stringBuffer47 = fastDateFormat44.format(calendar45, stringBuffer46);
        java.util.TimeZone timeZone48 = fastDateFormat44.getTimeZone();
        java.util.TimeZone timeZone50 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone50);
        java.util.Locale locale52 = fastDateFormat51.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone48, locale52);
        java.util.TimeZone timeZone55 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone55);
        java.util.Locale locale57 = fastDateFormat56.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone48, locale57);
        boolean boolean59 = fastDateFormat58.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone60 = fastDateFormat58.getTimeZone();
        java.util.Locale locale61 = fastDateFormat58.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, (int) (short) 1, locale61);
        java.lang.Object obj63 = fastDateFormat62.clone();
        java.lang.String str64 = fastDateFormat62.getPattern();
        java.util.Locale locale65 = fastDateFormat62.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(9, timeZone21, locale65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNull(stringBuffer29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNull(stringBuffer47);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(timeZone60);
        org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(obj63);
// flaky "20) test5099(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals(obj63.toString(), "\u0e17\u0e35\u0e48\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z]");
// flaky "5) test5099(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj63), "\u0e17\u0e35\u0e48\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z]");
// flaky "4) test5099(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj63), "\u0e17\u0e35\u0e48\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z]");
// flaky "3) test5099(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\u0e17\u0e35\u0e48\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z" + "'", str64, "\u0e17\u0e35\u0e48\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "th_TH");
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("07:00");
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone6 = null;
        java.util.TimeZone timeZone8 = null;
        java.util.TimeZone timeZone10 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale13);
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone10, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone8, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone6, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar23 = null;
        java.lang.StringBuffer stringBuffer24 = null;
        java.lang.StringBuffer stringBuffer25 = fastDateFormat22.format(calendar23, stringBuffer24);
        java.util.TimeZone timeZone26 = fastDateFormat22.getTimeZone();
        java.util.TimeZone timeZone28 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone28);
        java.util.Locale locale30 = fastDateFormat29.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone26, locale30);
        java.util.TimeZone timeZone33 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone33);
        java.util.Locale locale35 = fastDateFormat34.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone26, locale35);
        boolean boolean37 = fastDateFormat18.equals((java.lang.Object) locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = new org.apache.commons.lang.time.FastDateFormat("'1/1/70 07:00", timeZone4, locale35);
        java.util.TimeZone timeZone41 = null;
        java.util.TimeZone timeZone43 = null;
        java.util.Locale locale46 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale46);
        java.util.Locale locale48 = fastDateFormat47.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone43, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone41, locale48);
        java.util.Locale locale52 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale52);
        java.lang.String str55 = fastDateFormat53.format((java.lang.Object) 1L);
        boolean boolean56 = fastDateFormat50.equals((java.lang.Object) str55);
        int[] intArray60 = new int[] { (short) 0, (short) 0 };
        java.lang.String str61 = fastDateFormat50.parseToken("hi!", intArray60);
        int int62 = fastDateFormat50.getMaxLengthEstimate();
        java.util.Locale locale65 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale65);
        java.util.Locale locale67 = fastDateFormat66.getLocale();
        boolean boolean68 = fastDateFormat50.equals((java.lang.Object) locale67);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z", locale67);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone4, locale67);
        java.lang.Object obj71 = fastDateFormat70.clone();
        java.lang.Object obj72 = fastDateFormat70.clone();
        fastDateFormat70.init();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNull(stringBuffer25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 0, 0 });
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "h" + "'", str61, "h");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 45 + "'", int62 == 45);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(obj71);
// flaky "21) test5100(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals(obj71.toString(), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
// flaky "6) test5100(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj71), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
// flaky "5) test5100(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj71), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
        org.junit.Assert.assertNotNull(obj72);
// flaky "4) test5100(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals(obj72.toString(), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
// flaky "2) test5100(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj72), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
// flaky "1) test5100(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj72), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar10 = null;
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.StringBuffer stringBuffer12 = fastDateFormat9.format(calendar10, stringBuffer11);
        java.util.TimeZone timeZone13 = fastDateFormat9.getTimeZone();
        java.util.TimeZone timeZone15 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone15);
        java.util.Locale locale17 = fastDateFormat16.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone13, locale17);
        java.util.TimeZone timeZone20 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone20);
        java.util.Locale locale22 = fastDateFormat21.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone13, locale22);
        boolean boolean24 = fastDateFormat23.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone25 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar30 = null;
        java.lang.StringBuffer stringBuffer31 = null;
        java.lang.StringBuffer stringBuffer32 = fastDateFormat29.format(calendar30, stringBuffer31);
        java.util.TimeZone timeZone33 = fastDateFormat29.getTimeZone();
        java.util.TimeZone timeZone35 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone35);
        java.util.Locale locale37 = fastDateFormat36.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone33, locale37);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale37);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone25, locale37);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, locale37);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1, locale37);
        java.util.TimeZone timeZone43 = fastDateFormat42.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("07:00:00", timeZone43);
        java.util.TimeZone timeZone47 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone47);
        java.util.Locale locale49 = fastDateFormat48.getLocale();
        int int50 = fastDateFormat48.getMaxLengthEstimate();
        java.lang.String str51 = fastDateFormat48.toString();
        java.lang.Object obj52 = fastDateFormat48.clone();
        java.util.Locale locale53 = fastDateFormat48.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z", locale53);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone43, locale53);
        java.util.Locale locale56 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]", timeZone43, locale56);
// flaky "22) test5101(org.apache.commons.lang.time.RegressionTest10)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNull(stringBuffer12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNull(stringBuffer32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "FastDateFormat[]" + "'", str51, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat55);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        java.util.TimeZone timeZone4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone4, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone8 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone10 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar16 = null;
        java.lang.StringBuffer stringBuffer17 = null;
        java.lang.StringBuffer stringBuffer18 = fastDateFormat15.format(calendar16, stringBuffer17);
        java.util.TimeZone timeZone19 = fastDateFormat15.getTimeZone();
        java.util.TimeZone timeZone21 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone21);
        java.util.Locale locale23 = fastDateFormat22.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone19, locale23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("h", timeZone10, locale23);
        boolean boolean28 = fastDateFormat27.getTimeZoneOverridesCalendar();
        int int29 = fastDateFormat27.getMaxLengthEstimate();
        java.util.Locale locale30 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = new org.apache.commons.lang.time.FastDateFormat("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT", timeZone8, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, (int) (short) 1, timeZone8);
        fastDateFormat32.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = fastDateFormat32.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNull(stringBuffer18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat32);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z", locale1);
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat6.format(calendar7, stringBuffer8);
        java.util.TimeZone timeZone10 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("h", timeZone1, locale14);
        boolean boolean19 = fastDateFormat18.getTimeZoneOverridesCalendar();
        int int20 = fastDateFormat18.getMaxLengthEstimate();
        java.util.Locale locale21 = fastDateFormat18.getLocale();
        java.util.Locale locale22 = fastDateFormat18.getLocale();
        java.lang.Object obj23 = fastDateFormat18.clone();
        java.lang.String str24 = fastDateFormat18.getPattern();
        int int25 = fastDateFormat18.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNull(stringBuffer9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "FastDateFormat[h]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "FastDateFormat[h]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "FastDateFormat[h]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format((long) 100, stringBuffer4);
        java.lang.String str7 = fastDateFormat2.format((long) 100);
        java.util.Locale locale8 = fastDateFormat2.getLocale();
        fastDateFormat2.init();
        boolean boolean10 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.util.List list11 = fastDateFormat2.parsePattern();
        java.util.Calendar calendar12 = null;
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.StringBuffer stringBuffer14 = fastDateFormat2.applyRules(calendar12, stringBuffer13);
        java.util.List list15 = fastDateFormat2.parsePattern();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNull(stringBuffer5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(stringBuffer14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat6.format(calendar7, stringBuffer8);
        java.util.TimeZone timeZone10 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("h", timeZone1, locale14);
        boolean boolean19 = fastDateFormat18.getTimeZoneOverridesCalendar();
        int int20 = fastDateFormat18.getMaxLengthEstimate();
        java.util.Locale locale21 = fastDateFormat18.getLocale();
        java.util.Locale locale22 = fastDateFormat18.getLocale();
        java.lang.Object obj23 = fastDateFormat18.clone();
        fastDateFormat18.init();
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNull(stringBuffer9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "FastDateFormat[h]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "FastDateFormat[h]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "FastDateFormat[h]");
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat4.format(calendar5, stringBuffer6);
        java.util.TimeZone timeZone8 = fastDateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8, locale12);
        java.util.TimeZone timeZone15 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone15);
        java.util.Locale locale17 = fastDateFormat16.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone8, locale17);
        boolean boolean19 = fastDateFormat18.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone20 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar25 = null;
        java.lang.StringBuffer stringBuffer26 = null;
        java.lang.StringBuffer stringBuffer27 = fastDateFormat24.format(calendar25, stringBuffer26);
        java.util.TimeZone timeZone28 = fastDateFormat24.getTimeZone();
        java.util.TimeZone timeZone30 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone30);
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone28, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone20, locale32);
        java.lang.String str36 = fastDateFormat35.toString();
        java.util.Locale locale37 = fastDateFormat35.getLocale();
        java.util.List list38 = fastDateFormat35.parsePattern();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNull(stringBuffer27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "FastDateFormat[1/1/70 07:00]" + "'", str36, "FastDateFormat[1/1/70 07:00]");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat6.format(calendar7, stringBuffer8);
        java.util.TimeZone timeZone10 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale14);
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone17);
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone10, locale19);
        java.util.TimeZone timeZone23 = null;
        java.util.TimeZone timeZone25 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale28);
        java.util.Locale locale30 = fastDateFormat29.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone25, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone23, locale30);
        java.util.Locale locale34 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale34);
        java.lang.String str37 = fastDateFormat35.format((java.lang.Object) 1L);
        boolean boolean38 = fastDateFormat32.equals((java.lang.Object) str37);
        int[] intArray42 = new int[] { (short) 0, (short) 0 };
        java.lang.String str43 = fastDateFormat32.parseToken("hi!", intArray42);
        java.lang.String str44 = fastDateFormat20.parseToken("1/1/70 07:00", intArray42);
        java.lang.String str45 = fastDateFormat1.parseToken("'1/1/70 07:00", intArray42);
        java.util.TimeZone timeZone47 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone47);
        java.util.Locale locale49 = fastDateFormat48.getLocale();
        int int50 = fastDateFormat48.getMaxLengthEstimate();
        java.util.List list51 = fastDateFormat48.parsePattern();
        boolean boolean52 = fastDateFormat1.equals((java.lang.Object) fastDateFormat48);
        java.lang.String str54 = fastDateFormat1.format((long) (short) 0);
        java.text.ParsePosition parsePosition56 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = fastDateFormat1.parseObject("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", parsePosition56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNull(stringBuffer9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 13, 0 });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "h" + "'", str43, "h");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "'1/1/70 07:00" + "'", str44, "'1/1/70 07:00");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "'0" + "'", str45, "'0");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1, locale2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        java.lang.String str6 = fastDateFormat3.getPattern();
        java.lang.String str7 = fastDateFormat3.toString();
        int int8 = fastDateFormat3.getMaxLengthEstimate();
        java.lang.Object obj9 = fastDateFormat3.clone();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FastDateFormat[]" + "'", str7, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "FastDateFormat[]");
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat7.format(calendar8, stringBuffer9);
        java.util.TimeZone timeZone11 = fastDateFormat7.getTimeZone();
        java.util.TimeZone timeZone13 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone13);
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11, locale15);
        java.util.TimeZone timeZone18 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone18);
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone11, locale20);
        java.util.TimeZone timeZone23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone23, locale24);
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = new org.apache.commons.lang.time.FastDateFormat("hi!", timeZone11, locale26);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, locale26);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getInstance("FastDateFormat[':00]", locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        java.util.TimeZone timeZone5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone5, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.TimeZone timeZone9 = fastDateFormat7.getTimeZone();
        java.util.TimeZone timeZone10 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("EEEE", timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("d MMMM y", timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("07:00");
        java.util.TimeZone timeZone20 = fastDateFormat19.getTimeZone();
        java.util.TimeZone timeZone22 = null;
        java.util.TimeZone timeZone24 = null;
        java.util.TimeZone timeZone26 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale29);
        java.util.Locale locale31 = fastDateFormat30.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone26, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone24, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone22, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar39 = null;
        java.lang.StringBuffer stringBuffer40 = null;
        java.lang.StringBuffer stringBuffer41 = fastDateFormat38.format(calendar39, stringBuffer40);
        java.util.TimeZone timeZone42 = fastDateFormat38.getTimeZone();
        java.util.TimeZone timeZone44 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone44);
        java.util.Locale locale46 = fastDateFormat45.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone42, locale46);
        java.util.TimeZone timeZone49 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone49);
        java.util.Locale locale51 = fastDateFormat50.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone42, locale51);
        boolean boolean53 = fastDateFormat34.equals((java.lang.Object) locale51);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = new org.apache.commons.lang.time.FastDateFormat("'1/1/70 07:00", timeZone20, locale51);
        java.util.TimeZone timeZone57 = null;
        java.util.TimeZone timeZone59 = null;
        java.util.Locale locale62 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale62);
        java.util.Locale locale64 = fastDateFormat63.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone59, locale64);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone57, locale64);
        java.util.Locale locale68 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale68);
        java.lang.String str71 = fastDateFormat69.format((java.lang.Object) 1L);
        boolean boolean72 = fastDateFormat66.equals((java.lang.Object) str71);
        int[] intArray76 = new int[] { (short) 0, (short) 0 };
        java.lang.String str77 = fastDateFormat66.parseToken("hi!", intArray76);
        int int78 = fastDateFormat66.getMaxLengthEstimate();
        java.util.Locale locale81 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat82 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale81);
        java.util.Locale locale83 = fastDateFormat82.getLocale();
        boolean boolean84 = fastDateFormat66.equals((java.lang.Object) locale83);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat85 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z", locale83);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone20, locale83);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(2, locale83);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator88 = fastDateFormat14.formatToCharacterIterator((java.lang.Object) fastDateFormat87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNull(stringBuffer41);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { 0, 0 });
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "h" + "'", str77, "h");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 45 + "'", int78 == 45);
        org.junit.Assert.assertNotNull(fastDateFormat82);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(fastDateFormat85);
        org.junit.Assert.assertNotNull(fastDateFormat86);
        org.junit.Assert.assertNotNull(fastDateFormat87);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2, timeZone4);
        java.util.TimeZone timeZone8 = null;
        java.util.TimeZone timeZone10 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale13);
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone10, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone8, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone4, locale15);
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        java.util.TimeZone timeZone4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone4, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar16 = null;
        java.lang.StringBuffer stringBuffer17 = null;
        java.lang.StringBuffer stringBuffer18 = fastDateFormat15.format(calendar16, stringBuffer17);
        java.util.TimeZone timeZone19 = fastDateFormat15.getTimeZone();
        java.util.TimeZone timeZone21 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone21);
        java.util.Locale locale23 = fastDateFormat22.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone19, locale23);
        java.util.TimeZone timeZone26 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone26);
        java.util.Locale locale28 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone19, locale28);
        boolean boolean30 = fastDateFormat29.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone31 = fastDateFormat29.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar37 = null;
        java.lang.StringBuffer stringBuffer38 = null;
        java.lang.StringBuffer stringBuffer39 = fastDateFormat36.format(calendar37, stringBuffer38);
        java.util.TimeZone timeZone40 = fastDateFormat36.getTimeZone();
        java.util.TimeZone timeZone42 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone42);
        java.util.Locale locale44 = fastDateFormat43.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone40, locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = new org.apache.commons.lang.time.FastDateFormat("\u0e17\u0e35\u0e48 d MMMM GGGG y", timeZone31, locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getInstance("'1/1/70 07:00", timeZone31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar56 = null;
        java.lang.StringBuffer stringBuffer57 = null;
        java.lang.StringBuffer stringBuffer58 = fastDateFormat55.format(calendar56, stringBuffer57);
        java.util.TimeZone timeZone59 = fastDateFormat55.getTimeZone();
        java.util.TimeZone timeZone61 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone61);
        java.util.Locale locale63 = fastDateFormat62.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone59, locale63);
        java.util.TimeZone timeZone66 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone66);
        java.util.Locale locale68 = fastDateFormat67.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone59, locale68);
        boolean boolean70 = fastDateFormat69.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone71 = fastDateFormat69.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar76 = null;
        java.lang.StringBuffer stringBuffer77 = null;
        java.lang.StringBuffer stringBuffer78 = fastDateFormat75.format(calendar76, stringBuffer77);
        java.util.TimeZone timeZone79 = fastDateFormat75.getTimeZone();
        java.util.TimeZone timeZone81 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat82 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone81);
        java.util.Locale locale83 = fastDateFormat82.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone79, locale83);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat85 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale83);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone71, locale83);
        java.lang.String str87 = fastDateFormat86.toString();
        java.util.Locale locale88 = fastDateFormat86.getLocale();
        java.util.TimeZone timeZone89 = fastDateFormat86.getTimeZone();
        java.util.TimeZone timeZone91 = null;
        java.util.Locale locale92 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat93 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone91, locale92);
        java.util.TimeZone timeZone94 = fastDateFormat93.getTimeZone();
        java.util.Locale locale95 = fastDateFormat93.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat96 = new org.apache.commons.lang.time.FastDateFormat(":00", timeZone89, locale95);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat97 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2, timeZone31, locale95);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat98 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(89, (int) (byte) 0, timeZone7, locale95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 89");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNull(stringBuffer18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNull(stringBuffer39);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNull(stringBuffer58);
        org.junit.Assert.assertNotNull(timeZone59);
        org.junit.Assert.assertEquals(timeZone59.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(timeZone71);
        org.junit.Assert.assertEquals(timeZone71.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertNull(stringBuffer78);
        org.junit.Assert.assertNotNull(timeZone79);
        org.junit.Assert.assertEquals(timeZone79.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat82);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertNotNull(fastDateFormat85);
        org.junit.Assert.assertNotNull(fastDateFormat86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "FastDateFormat[1/1/70 07:00]" + "'", str87, "FastDateFormat[1/1/70 07:00]");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "th_TH");
        org.junit.Assert.assertNotNull(timeZone89);
        org.junit.Assert.assertEquals(timeZone89.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat93);
        org.junit.Assert.assertNotNull(timeZone94);
        org.junit.Assert.assertEquals(timeZone94.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale95);
        org.junit.Assert.assertEquals(locale95.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat97);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone2, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar12 = null;
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.StringBuffer stringBuffer14 = fastDateFormat11.format(calendar12, stringBuffer13);
        java.util.TimeZone timeZone15 = fastDateFormat11.getTimeZone();
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone17);
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone15, locale19);
        java.util.TimeZone timeZone22 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone22);
        java.util.Locale locale24 = fastDateFormat23.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone15, locale24);
        java.util.TimeZone timeZone27 = null;
        java.util.TimeZone timeZone29 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale32);
        java.util.Locale locale34 = fastDateFormat33.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone29, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone27, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone15, locale34);
        java.util.TimeZone timeZone39 = null;
        java.util.TimeZone timeZone41 = null;
        java.util.TimeZone timeZone43 = null;
        java.util.Locale locale46 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale46);
        java.util.Locale locale48 = fastDateFormat47.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone43, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone41, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone39, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone15, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getInstance("h", timeZone5, locale48);
        java.util.Calendar calendar54 = null;
        java.lang.StringBuffer stringBuffer55 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer56 = fastDateFormat53.format(calendar54, stringBuffer55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNull(stringBuffer14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat53);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone3, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar14 = null;
        java.lang.StringBuffer stringBuffer15 = null;
        java.lang.StringBuffer stringBuffer16 = fastDateFormat13.format(calendar14, stringBuffer15);
        java.util.TimeZone timeZone19 = null;
        java.util.TimeZone timeZone21 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale24);
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone21, locale26);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone19, locale26);
        java.util.Locale locale30 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale30);
        java.lang.String str33 = fastDateFormat31.format((java.lang.Object) 1L);
        boolean boolean34 = fastDateFormat28.equals((java.lang.Object) str33);
        int[] intArray38 = new int[] { (short) 0, (short) 0 };
        java.lang.String str39 = fastDateFormat28.parseToken("hi!", intArray38);
        java.lang.String str40 = fastDateFormat13.parseToken("FastDateFormat[1/1/70 07:00]", intArray38);
        java.lang.String str41 = fastDateFormat10.parseToken("'1/1/70", intArray38);
        java.lang.String str42 = fastDateFormat7.parseToken("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", intArray38);
        java.util.Locale locale43 = fastDateFormat7.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale43);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNull(stringBuffer16);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(intArray38);
// flaky "23) test5115(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertArrayEquals(intArray38, new int[] { 40, 0 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "h" + "'", str39, "h");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "F" + "'", str40, "F");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "'1/1/70" + "'", str41, "'1/1/70");
// flaky "7) test5115(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str42, "\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat44);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat7.format(calendar8, stringBuffer9);
        java.util.TimeZone timeZone11 = fastDateFormat7.getTimeZone();
        java.util.TimeZone timeZone13 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone13);
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar21 = null;
        java.lang.StringBuffer stringBuffer22 = null;
        java.lang.StringBuffer stringBuffer23 = fastDateFormat20.format(calendar21, stringBuffer22);
        java.util.TimeZone timeZone24 = fastDateFormat20.getTimeZone();
        java.util.TimeZone timeZone26 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone26);
        java.util.Locale locale28 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone24, locale28);
        java.util.TimeZone timeZone31 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone31);
        java.util.Locale locale33 = fastDateFormat32.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone24, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone11, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getInstance("EEEE", timeZone11);
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) -1, timeZone38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNull(stringBuffer23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat6.format(calendar7, stringBuffer8);
        java.util.TimeZone timeZone10 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale14);
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone17);
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone10, locale19);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone10);
        java.util.TimeZone timeZone24 = null;
        java.util.TimeZone timeZone26 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale29);
        java.util.Locale locale31 = fastDateFormat30.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone26, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone24, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = new org.apache.commons.lang.time.FastDateFormat("'1/70 07:00", timeZone10, locale31);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(13, timeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNull(stringBuffer9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format((long) (short) 100, stringBuffer4);
        java.lang.String str6 = fastDateFormat2.toString();
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat2.applyRules(calendar7, stringBuffer8);
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        java.util.Calendar calendar15 = null;
        java.lang.StringBuffer stringBuffer16 = null;
        java.lang.StringBuffer stringBuffer17 = fastDateFormat13.applyRules(calendar15, stringBuffer16);
        java.lang.String str19 = fastDateFormat13.format((long) ' ');
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        int int23 = fastDateFormat22.getMaxLengthEstimate();
        java.lang.Object obj24 = fastDateFormat22.clone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar30 = null;
        java.lang.StringBuffer stringBuffer31 = null;
        java.lang.StringBuffer stringBuffer32 = fastDateFormat29.format(calendar30, stringBuffer31);
        java.util.TimeZone timeZone33 = fastDateFormat29.getTimeZone();
        java.util.TimeZone timeZone35 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone35);
        java.util.Locale locale37 = fastDateFormat36.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone33, locale37);
        java.util.TimeZone timeZone40 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone40);
        java.util.Locale locale42 = fastDateFormat41.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone33, locale42);
        java.util.TimeZone timeZone46 = null;
        java.util.TimeZone timeZone48 = null;
        java.util.Locale locale51 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale51);
        java.util.Locale locale53 = fastDateFormat52.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone48, locale53);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone46, locale53);
        java.util.Locale locale57 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale57);
        java.lang.String str60 = fastDateFormat58.format((java.lang.Object) 1L);
        boolean boolean61 = fastDateFormat55.equals((java.lang.Object) str60);
        int[] intArray65 = new int[] { (short) 0, (short) 0 };
        java.lang.String str66 = fastDateFormat55.parseToken("hi!", intArray65);
        java.lang.String str67 = fastDateFormat43.parseToken("1/1/70 07:00", intArray65);
        java.lang.String str68 = fastDateFormat22.parseToken("\u0e17\u0e35\u0e48 d MMMM GGGG y]", intArray65);
        java.lang.String str69 = fastDateFormat13.parseToken("FastDateFormat[d/M/yy]", intArray65);
        java.lang.String str70 = fastDateFormat2.parseToken("\u0e17\u0e35\u0e48\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z]", intArray65);
        fastDateFormat2.init();
        fastDateFormat2.init();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNull(stringBuffer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FastDateFormat[]" + "'", str6, "FastDateFormat[]");
        org.junit.Assert.assertNull(stringBuffer9);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNull(stringBuffer17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "FastDateFormat[d/M/yy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "FastDateFormat[d/M/yy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "FastDateFormat[d/M/yy]");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNull(stringBuffer32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(intArray65);
// flaky "24) test5118(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertArrayEquals(intArray65, new int[] { 12, 0 });
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "h" + "'", str66, "h");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "'1/1/70 07:00" + "'", str67, "'1/1/70 07:00");
// flaky "8) test5118(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "a" + "'", str68, "a");
// flaky "6) test5118(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "a" + "'", str69, "a");
// flaky "5) test5118(org.apache.commons.lang.time.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "a" + "'", str70, "a");
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar9 = null;
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.StringBuffer stringBuffer11 = fastDateFormat8.format(calendar9, stringBuffer10);
        java.util.TimeZone timeZone12 = fastDateFormat8.getTimeZone();
        java.util.TimeZone timeZone14 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone14);
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12, locale16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar22 = null;
        java.lang.StringBuffer stringBuffer23 = null;
        java.lang.StringBuffer stringBuffer24 = fastDateFormat21.format(calendar22, stringBuffer23);
        java.util.TimeZone timeZone25 = fastDateFormat21.getTimeZone();
        java.util.TimeZone timeZone27 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone27);
        java.util.Locale locale29 = fastDateFormat28.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone25, locale29);
        java.util.TimeZone timeZone32 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone32);
        java.util.Locale locale34 = fastDateFormat33.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone25, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone12, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar41 = null;
        java.lang.StringBuffer stringBuffer42 = null;
        java.lang.StringBuffer stringBuffer43 = fastDateFormat40.format(calendar41, stringBuffer42);
        java.util.TimeZone timeZone44 = fastDateFormat40.getTimeZone();
        java.util.TimeZone timeZone46 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone46);
        java.util.Locale locale48 = fastDateFormat47.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone44, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar54 = null;
        java.lang.StringBuffer stringBuffer55 = null;
        java.lang.StringBuffer stringBuffer56 = fastDateFormat53.format(calendar54, stringBuffer55);
        java.util.TimeZone timeZone57 = fastDateFormat53.getTimeZone();
        java.util.TimeZone timeZone59 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone59);
        java.util.Locale locale61 = fastDateFormat60.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone57, locale61);
        java.util.TimeZone timeZone64 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone64);
        java.util.Locale locale66 = fastDateFormat65.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone57, locale66);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone44, locale66);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = new org.apache.commons.lang.time.FastDateFormat("EEEE", timeZone12, locale66);
        java.util.TimeZone timeZone71 = null;
        java.util.Locale locale72 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone71, locale72);
        java.util.Locale locale74 = fastDateFormat73.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, 3, timeZone12, locale74);
        java.lang.String str76 = fastDateFormat75.getPattern();
        java.util.Locale locale77 = fastDateFormat75.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, locale77);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, locale77);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNull(stringBuffer11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNull(stringBuffer24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNull(stringBuffer43);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNull(stringBuffer56);
        org.junit.Assert.assertNotNull(timeZone57);
        org.junit.Assert.assertEquals(timeZone57.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "d MMMM y HH:mm" + "'", str76, "d MMMM y HH:mm");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(fastDateFormat79);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        java.util.TimeZone timeZone5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone5, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.TimeZone timeZone9 = fastDateFormat7.getTimeZone();
        java.util.TimeZone timeZone13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone13, locale14);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("'0", timeZone16);
        java.util.TimeZone timeZone19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone19, locale20);
        java.util.Locale locale22 = fastDateFormat21.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone16, locale22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, 3, timeZone9, locale22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar36 = null;
        java.lang.StringBuffer stringBuffer37 = null;
        java.lang.StringBuffer stringBuffer38 = fastDateFormat35.format(calendar36, stringBuffer37);
        java.util.TimeZone timeZone39 = fastDateFormat35.getTimeZone();
        java.util.TimeZone timeZone41 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone41);
        java.util.Locale locale43 = fastDateFormat42.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone39, locale43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale43);
        java.util.List list46 = fastDateFormat45.parsePattern();
        java.util.TimeZone timeZone47 = fastDateFormat45.getTimeZone();
        java.util.Locale locale48 = fastDateFormat45.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getInstance("7", timeZone30, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone9, locale48);
        java.util.List list51 = fastDateFormat50.parsePattern();
        java.lang.Object obj52 = null;
        boolean boolean53 = fastDateFormat50.equals(obj52);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNull(stringBuffer38);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat6.format(calendar7, stringBuffer8);
        java.util.TimeZone timeZone10 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale14);
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone17);
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone10, locale19);
        java.util.TimeZone timeZone22 = null;
        java.util.TimeZone timeZone24 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale27);
        java.util.Locale locale29 = fastDateFormat28.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone24, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone22, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone10, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) 'a', timeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNull(stringBuffer9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1);
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        java.util.Calendar calendar4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.StringBuffer stringBuffer6 = fastDateFormat2.applyRules(calendar4, stringBuffer5);
        java.util.TimeZone timeZone7 = fastDateFormat2.getTimeZone();
        boolean boolean8 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.lang.String str9 = fastDateFormat2.toString();
        java.util.Date date10 = null;
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = fastDateFormat2.format(date10, stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNull(stringBuffer6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FastDateFormat[]" + "'", str9, "FastDateFormat[]");
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar10 = null;
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.StringBuffer stringBuffer12 = fastDateFormat9.format(calendar10, stringBuffer11);
        java.util.TimeZone timeZone13 = fastDateFormat9.getTimeZone();
        java.util.TimeZone timeZone15 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone15);
        java.util.Locale locale17 = fastDateFormat16.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone13, locale17);
        java.util.TimeZone timeZone20 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone20);
        java.util.Locale locale22 = fastDateFormat21.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone13, locale22);
        boolean boolean24 = fastDateFormat23.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone25 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar30 = null;
        java.lang.StringBuffer stringBuffer31 = null;
        java.lang.StringBuffer stringBuffer32 = fastDateFormat29.format(calendar30, stringBuffer31);
        java.util.TimeZone timeZone33 = fastDateFormat29.getTimeZone();
        java.util.TimeZone timeZone35 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone35);
        java.util.Locale locale37 = fastDateFormat36.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone33, locale37);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale37);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone25, locale37);
        java.lang.String str41 = fastDateFormat40.toString();
        fastDateFormat40.init();
        java.util.TimeZone timeZone43 = fastDateFormat40.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar50 = null;
        java.lang.StringBuffer stringBuffer51 = null;
        java.lang.StringBuffer stringBuffer52 = fastDateFormat49.format(calendar50, stringBuffer51);
        java.util.TimeZone timeZone53 = fastDateFormat49.getTimeZone();
        java.util.TimeZone timeZone55 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone55);
        java.util.Locale locale57 = fastDateFormat56.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone53, locale57);
        java.util.TimeZone timeZone60 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone60);
        java.util.Locale locale62 = fastDateFormat61.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone53, locale62);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone53);
        java.util.TimeZone timeZone66 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone66);
        java.util.Locale locale68 = fastDateFormat67.getLocale();
        int int69 = fastDateFormat67.getMaxLengthEstimate();
        java.util.Locale locale70 = fastDateFormat67.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone53, locale70);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat72 = new org.apache.commons.lang.time.FastDateFormat(":00", timeZone43, locale70);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang.time.FastDateFormat.getInstance("h", timeZone43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone43);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(51, (int) (short) 100, timeZone43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNull(stringBuffer12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNull(stringBuffer32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "FastDateFormat[1/1/70 07:00]" + "'", str41, "FastDateFormat[1/1/70 07:00]");
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNull(stringBuffer52);
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat74);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat6.format(calendar7, stringBuffer8);
        java.util.TimeZone timeZone10 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale14);
        java.util.Locale locale18 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale18);
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone10, locale20);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70 07:00", locale20);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getInstance("d MMMM y HH:mm", locale20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(34, locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 34");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNull(stringBuffer9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat6.format(calendar7, stringBuffer8);
        java.util.TimeZone timeZone10 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale14);
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone17);
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone10, locale19);
        java.util.TimeZone timeZone23 = null;
        java.util.TimeZone timeZone25 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale28);
        java.util.Locale locale30 = fastDateFormat29.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone25, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone23, locale30);
        java.util.Locale locale34 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale34);
        java.lang.String str37 = fastDateFormat35.format((java.lang.Object) 1L);
        boolean boolean38 = fastDateFormat32.equals((java.lang.Object) str37);
        int[] intArray42 = new int[] { (short) 0, (short) 0 };
        java.lang.String str43 = fastDateFormat32.parseToken("hi!", intArray42);
        java.lang.String str44 = fastDateFormat20.parseToken("1/1/70 07:00", intArray42);
        java.lang.String str45 = fastDateFormat1.parseToken("'1/1/70 07:00", intArray42);
        java.util.TimeZone timeZone47 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone47);
        java.util.Locale locale49 = fastDateFormat48.getLocale();
        int int50 = fastDateFormat48.getMaxLengthEstimate();
        java.util.List list51 = fastDateFormat48.parsePattern();
        boolean boolean52 = fastDateFormat1.equals((java.lang.Object) fastDateFormat48);
        java.lang.String str54 = fastDateFormat48.format((long) (short) 10);
        java.lang.String str55 = fastDateFormat48.toString();
        java.lang.StringBuffer stringBuffer57 = null;
        java.lang.StringBuffer stringBuffer58 = fastDateFormat48.format((long) (byte) 1, stringBuffer57);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = fastDateFormat48.parseObject("06:59:59");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNull(stringBuffer9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 13, 0 });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "h" + "'", str43, "h");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "'1/1/70 07:00" + "'", str44, "'1/1/70 07:00");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "'0" + "'", str45, "'0");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "FastDateFormat[]" + "'", str55, "FastDateFormat[]");
        org.junit.Assert.assertNull(stringBuffer58);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("a");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fastDateFormat1.parseObject("Indochina Summer Time");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar9 = null;
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.StringBuffer stringBuffer11 = fastDateFormat8.format(calendar9, stringBuffer10);
        java.util.TimeZone timeZone12 = fastDateFormat8.getTimeZone();
        java.util.TimeZone timeZone14 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone14);
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12, locale16);
        java.lang.String str18 = fastDateFormat17.toString();
        java.util.TimeZone timeZone19 = fastDateFormat17.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar23 = null;
        java.lang.StringBuffer stringBuffer24 = null;
        java.lang.StringBuffer stringBuffer25 = fastDateFormat22.format(calendar23, stringBuffer24);
        java.util.TimeZone timeZone26 = fastDateFormat22.getTimeZone();
        java.lang.Object obj27 = fastDateFormat22.clone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar30 = null;
        java.lang.StringBuffer stringBuffer31 = null;
        java.lang.StringBuffer stringBuffer32 = fastDateFormat29.format(calendar30, stringBuffer31);
        java.util.TimeZone timeZone33 = fastDateFormat29.getTimeZone();
        boolean boolean34 = fastDateFormat22.equals((java.lang.Object) timeZone33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar40 = null;
        java.lang.StringBuffer stringBuffer41 = null;
        java.lang.StringBuffer stringBuffer42 = fastDateFormat39.format(calendar40, stringBuffer41);
        java.util.TimeZone timeZone43 = fastDateFormat39.getTimeZone();
        java.util.TimeZone timeZone45 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone45);
        java.util.Locale locale47 = fastDateFormat46.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone43, locale47);
        java.util.TimeZone timeZone50 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone50);
        java.util.Locale locale52 = fastDateFormat51.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[]", timeZone43, locale52);
        java.util.TimeZone timeZone55 = null;
        java.util.TimeZone timeZone57 = null;
        java.util.Locale locale60 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale60);
        java.util.Locale locale62 = fastDateFormat61.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone57, locale62);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone55, locale62);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone43, locale62);
        java.util.Locale locale66 = fastDateFormat65.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone33, locale66);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = new org.apache.commons.lang.time.FastDateFormat("FastDateFormat[HH:mm]", timeZone19, locale66);
        java.util.Locale locale71 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 0, locale71);
        java.util.Locale locale73 = fastDateFormat72.getLocale();
        java.util.Locale locale74 = fastDateFormat72.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang.time.FastDateFormat.getInstance("EEEE", timeZone19, locale74);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(1, 2, timeZone19);
        java.util.TimeZone timeZone78 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone78);
        java.util.Locale locale80 = fastDateFormat79.getLocale();
        java.util.Locale locale81 = fastDateFormat79.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat82 = new org.apache.commons.lang.time.FastDateFormat("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT", timeZone19, locale81);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat83 = org.apache.commons.lang.time.FastDateFormat.getInstance("MM", locale81);
        java.lang.String str84 = fastDateFormat83.toString();
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNull(stringBuffer11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "FastDateFormat[]" + "'", str18, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNull(stringBuffer25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNull(stringBuffer32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNull(stringBuffer42);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "FastDateFormat[MM]" + "'", str84, "FastDateFormat[MM]");
    }
}
