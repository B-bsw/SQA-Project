package com.fasterxml.jackson.databind.util;

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
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(7, 10, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat9 = stdDateFormat2._formatRFC1123;
        java.util.TimeZone timeZone10 = stdDateFormat2._timezone;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone13 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatPlain;
        java.lang.String str15 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat16 = null;
        stdDateFormat2._formatISO8601_z = dateFormat16;
        java.text.DateFormat dateFormat18 = stdDateFormat2._formatISO8601;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNull(timeZone13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(dateFormat18);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        boolean boolean13 = stdDateFormat2.looksLikeISO8601("");
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatISO8601_z;
        java.util.Locale locale15 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.lang.String str20 = dateFormat18.format((java.lang.Object) 10L);
        dateFormat18.setLenient(true);
        dateFormat18.setLenient(true);
        java.util.Calendar calendar25 = dateFormat18.getCalendar();
        dateFormat16.setCalendar(calendar25);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        dateFormat27.setNumberFormat(numberFormat29);
        dateFormat16.setNumberFormat(numberFormat29);
        stdDateFormat2._formatISO8601_z = dateFormat16;
        java.util.Locale locale33 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat34 = stdDateFormat2._formatRFC1123;
        java.lang.String str35 = stdDateFormat2.toString();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "07:00:00" + "'", str20, "07:00:00");
        org.junit.Assert.assertNotNull(calendar25);
        org.junit.Assert.assertEquals(calendar25.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(numberFormat29);
        org.junit.Assert.assertNull(locale33);
        org.junit.Assert.assertNull(dateFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str35, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.util.TimeZone timeZone7 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat9 = stdDateFormat2._formatRFC1123;
        stdDateFormat2._lenient = false;
        boolean boolean12 = stdDateFormat2.isLenient();
        java.util.TimeZone timeZone13 = stdDateFormat2._timezone;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(timeZone13);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        java.lang.String str26 = stdDateFormat2.toString();
        java.util.TimeZone timeZone27 = stdDateFormat2._timezone;
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        stdDateFormat2._formatPlain = dateFormat28;
        java.lang.String str31 = stdDateFormat2.toString();
        boolean boolean32 = stdDateFormat2.isLenient();
        java.util.Locale locale33 = stdDateFormat2._locale;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str26, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone27);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(numberFormat29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str31, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(locale33);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.util.Locale locale15 = stdDateFormat2._locale;
        java.lang.Boolean boolean16 = stdDateFormat2._lenient;
        boolean boolean18 = stdDateFormat2.looksLikeISO8601("06:59:59");
        stdDateFormat2._lenient = false;
        boolean boolean21 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat22 = stdDateFormat2._formatISO8601_z;
        stdDateFormat2._clearFormats();
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("\u0e21\u0e04\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT");
        stdDateFormat2._lenient = true;
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat2.setLenient(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat2._formatISO8601 = dateFormat11;
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.util.TimeZone timeZone15 = stdDateFormat2._timezone;
        java.util.Locale locale16 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat17 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat18 = stdDateFormat2._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(dateFormat18);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean7 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone8 = stdDateFormat2.getTimeZone();
        stdDateFormat2._clearFormats();
        java.lang.Boolean boolean10 = stdDateFormat2._lenient;
        stdDateFormat2._clearFormats();
        java.util.TimeZone timeZone12 = null;
        java.util.Locale locale13 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale13);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        stdDateFormat14.setNumberFormat(numberFormat16);
        stdDateFormat14._lenient = false;
        stdDateFormat14._lenient = false;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat14._formatPlain = dateFormat24;
        boolean boolean26 = stdDateFormat14.isLenient();
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance(1);
        dateFormat28.setLenient(true);
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str33 = dateFormat31.format((java.lang.Object) 100.0f);
        boolean boolean34 = dateFormat28.equals((java.lang.Object) dateFormat31);
        stdDateFormat14._formatRFC1123 = dateFormat31;
        boolean boolean37 = stdDateFormat14.looksLikeISO8601("");
        java.text.NumberFormat numberFormat38 = stdDateFormat14.getNumberFormat();
        java.text.DateFormat dateFormat39 = stdDateFormat14._formatRFC1123;
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat41 = dateFormat40.getNumberFormat();
        java.util.Calendar calendar42 = dateFormat40.getCalendar();
        boolean boolean43 = stdDateFormat14.equals((java.lang.Object) dateFormat40);
        java.text.DateFormat dateFormat44 = stdDateFormat14._formatISO8601;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = stdDateFormat2.format((java.lang.Object) dateFormat44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(timeZone8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2513-01-01" + "'", str33, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(numberFormat38);
        org.junit.Assert.assertNotNull(dateFormat39);
        org.junit.Assert.assertNotNull(dateFormat40);
        org.junit.Assert.assertNotNull(numberFormat41);
        org.junit.Assert.assertNotNull(calendar42);
// flaky "1) test5008(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar42.toString(), "sun.util.BuddhistCalendar[time=-734417774338,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=45,MILLISECOND=662,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(dateFormat44);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.lang.String str7 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat2._formatISO8601 = dateFormat8;
        java.text.NumberFormat numberFormat10 = stdDateFormat2.getNumberFormat();
        java.text.NumberFormat numberFormat11 = stdDateFormat2.getNumberFormat();
        java.text.NumberFormat numberFormat12 = stdDateFormat2.getNumberFormat();
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatRFC1123;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNull(dateFormat13);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        stdDateFormat2._clearFormats();
        java.util.Locale locale15 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat16 = stdDateFormat2._formatPlain;
        java.util.Locale locale17 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat18 = stdDateFormat2._formatISO8601_z;
        java.lang.Boolean boolean19 = stdDateFormat2._lenient;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNull(dateFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (short) 10, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.lang.String str7 = stdDateFormat2.toString();
        boolean boolean9 = stdDateFormat2.looksLikeISO8601("2513-01-01");
        java.util.Calendar calendar10 = stdDateFormat2.getCalendar();
        java.text.DateFormat dateFormat11 = stdDateFormat2._formatISO8601_z;
        java.lang.String str12 = stdDateFormat2.toString();
        java.util.TimeZone timeZone13 = stdDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = stdDateFormat2.parse("hi!", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(calendar10);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone13);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.text.DateFormat dateFormat11 = stdDateFormat2._formatISO8601_z;
        boolean boolean12 = stdDateFormat2.isLenient();
        java.util.Locale locale13 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatISO8601_z;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNull(dateFormat14);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        stdDateFormat2._clearFormats();
        java.lang.Boolean boolean27 = stdDateFormat2._lenient;
        stdDateFormat2._lenient = false;
        java.util.Locale locale30 = stdDateFormat2._locale;
        java.util.TimeZone timeZone31 = stdDateFormat2._timezone;
        stdDateFormat2._clearFormats();
        stdDateFormat2._lenient = false;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(locale30);
        org.junit.Assert.assertNull(timeZone31);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.lang.String str7 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat2._formatISO8601 = dateFormat8;
        java.text.NumberFormat numberFormat10 = stdDateFormat2.getNumberFormat();
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        java.text.NumberFormat numberFormat12 = stdDateFormat2.getNumberFormat();
        boolean boolean14 = stdDateFormat2.looksLikeISO8601("06:59:59");
        boolean boolean16 = stdDateFormat2.looksLikeISO8601("");
        java.text.DateFormat dateFormat17 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat18 = stdDateFormat2._formatISO8601_z;
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance();
        dateFormat21.setLenient(true);
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance();
        java.lang.String str27 = dateFormat25.format((java.lang.Object) 10L);
        java.util.Calendar calendar28 = dateFormat25.getCalendar();
        dateFormat24.setCalendar(calendar28);
        dateFormat21.setCalendar(calendar28);
        dateFormat19.setCalendar(calendar28);
        stdDateFormat2.setCalendar(calendar28);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "07:00:00" + "'", str27, "07:00:00");
        org.junit.Assert.assertNotNull(calendar28);
        org.junit.Assert.assertEquals(calendar28.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone10 = stdDateFormat2._timezone;
        stdDateFormat2._clearFormats();
        boolean boolean12 = stdDateFormat2.isLenient();
        boolean boolean14 = stdDateFormat2.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.util.TimeZone timeZone15 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat2.setTimeZone(timeZone15);
        java.text.DateFormat dateFormat17 = null;
        stdDateFormat2._formatISO8601_z = dateFormat17;
        java.text.DateFormat dateFormat19 = stdDateFormat2._formatRFC1123;
        java.util.Calendar calendar20 = stdDateFormat2.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = calendar20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(calendar20);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.lang.Boolean boolean10 = stdDateFormat2._lenient;
        java.lang.String str11 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat2._formatISO8601;
        java.util.TimeZone timeZone13 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatISO8601;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNull(timeZone13);
        org.junit.Assert.assertNull(dateFormat14);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        java.util.TimeZone timeZone9 = stdDateFormat2._timezone;
        java.lang.Boolean boolean10 = stdDateFormat2._lenient;
        java.text.DateFormat dateFormat11 = stdDateFormat2._formatRFC1123;
        java.util.TimeZone timeZone12 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601_z;
        stdDateFormat2._clearFormats();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(timeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNull(dateFormat13);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("2513-01-01");
        java.lang.String str11 = stdDateFormat2.toString();
        java.lang.String str12 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatPlain;
        stdDateFormat2._clearFormats();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(dateFormat13);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatPlain;
        boolean boolean8 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        dateFormat11.setLenient(true);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.lang.String str17 = dateFormat15.format((java.lang.Object) 10L);
        java.util.Calendar calendar18 = dateFormat15.getCalendar();
        dateFormat14.setCalendar(calendar18);
        dateFormat11.setCalendar(calendar18);
        dateFormat9.setCalendar(calendar18);
        stdDateFormat2.setCalendar(calendar18);
        java.text.NumberFormat numberFormat23 = stdDateFormat2.getNumberFormat();
        java.util.Locale locale24 = stdDateFormat2._locale;
        java.lang.String str25 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat26 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean27 = stdDateFormat2._lenient;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "07:00:00" + "'", str17, "07:00:00");
        org.junit.Assert.assertNotNull(calendar18);
        org.junit.Assert.assertEquals(calendar18.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat23);
        org.junit.Assert.assertNull(locale24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str25, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertNull(boolean27);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone10 = stdDateFormat2._timezone;
        stdDateFormat2._clearFormats();
        boolean boolean12 = stdDateFormat2.isLenient();
        boolean boolean14 = stdDateFormat2.looksLikeISO8601("\u0e21\u0e04. 2513");
        stdDateFormat2._clearFormats();
        java.text.DateFormat dateFormat16 = stdDateFormat2._formatPlain;
        java.util.Locale locale17 = stdDateFormat2._locale;
        java.util.Locale locale18 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat19 = stdDateFormat2._formatRFC1123;
        java.lang.String str20 = stdDateFormat2.toString();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str20, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.lang.String str7 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat2._formatISO8601 = dateFormat8;
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean12 = dateFormat10.equals((java.lang.Object) 10L);
        java.util.Calendar calendar13 = dateFormat10.getCalendar();
        stdDateFormat2.setCalendar(calendar13);
        java.text.DateFormat dateFormat15 = stdDateFormat2._formatPlain;
        java.text.ParsePosition parsePosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = stdDateFormat2.parseAsRFC1123("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)", parsePosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(calendar13);
// flaky "2) test5023(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNull(dateFormat15);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("2513-01-01");
        java.text.DateFormat dateFormat11 = stdDateFormat2._formatISO8601_z;
        java.util.TimeZone timeZone12 = stdDateFormat2.getTimeZone();
        java.util.Locale locale13 = stdDateFormat2._locale;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNull(locale13);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.lang.String str16 = dateFormat14.format((java.lang.Object) 10L);
        dateFormat14.setLenient(true);
        dateFormat14.setLenient(true);
        java.util.Calendar calendar21 = dateFormat14.getCalendar();
        java.lang.String str23 = dateFormat14.format((java.lang.Object) (short) -1);
        stdDateFormat2._formatISO8601 = dateFormat14;
        java.text.DateFormat dateFormat25 = stdDateFormat2._formatRFC1123;
        boolean boolean26 = stdDateFormat2.isLenient();
        java.util.TimeZone timeZone27 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat28 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance();
        java.lang.String str31 = dateFormat29.format((java.lang.Object) 100.0d);
        java.text.NumberFormat numberFormat32 = dateFormat29.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat32);
        stdDateFormat2._clearFormats();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "07:00:00" + "'", str16, "07:00:00");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "06:59:59" + "'", str23, "06:59:59");
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(timeZone27);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(dateFormat29);
// flaky "3) test5025(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u0e21\u0e04. 2513" + "'", str31, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(numberFormat32);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        java.util.Calendar calendar27 = dateFormat26.getCalendar();
        stdDateFormat2._formatISO8601_z = dateFormat26;
        java.util.Calendar calendar29 = stdDateFormat2.getCalendar();
        boolean boolean30 = stdDateFormat2.isLenient();
        java.util.TimeZone timeZone31 = stdDateFormat2._timezone;
        java.lang.String str32 = stdDateFormat2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date34 = stdDateFormat2.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(calendar27);
// flaky "4) test5026(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar27.toString(), "sun.util.BuddhistCalendar[time=-734417774230,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=45,MILLISECOND=770,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(calendar29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(timeZone31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str32, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        boolean boolean13 = stdDateFormat2.looksLikeISO8601("");
        java.lang.Boolean boolean14 = stdDateFormat2._lenient;
        boolean boolean16 = stdDateFormat2.looksLikeISO8601("yyyy-MM-dd");
        java.util.TimeZone timeZone17 = stdDateFormat2._timezone;
        java.util.TimeZone timeZone18 = null;
        java.util.Locale locale19 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18, locale19);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        stdDateFormat20.setNumberFormat(numberFormat22);
        stdDateFormat20._lenient = false;
        java.text.DateFormat dateFormat26 = stdDateFormat20._formatISO8601_z;
        java.util.Locale locale27 = stdDateFormat20._locale;
        java.text.NumberFormat numberFormat28 = stdDateFormat20.getNumberFormat();
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance();
        dateFormat31.setLenient(true);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getTimeInstance();
        java.lang.String str37 = dateFormat35.format((java.lang.Object) 10L);
        java.util.Calendar calendar38 = dateFormat35.getCalendar();
        dateFormat34.setCalendar(calendar38);
        dateFormat31.setCalendar(calendar38);
        dateFormat29.setCalendar(calendar38);
        stdDateFormat20.setCalendar(calendar38);
        stdDateFormat2.setCalendar(calendar38);
        boolean boolean45 = stdDateFormat2.looksLikeISO8601("1970-01-01");
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getTimeInstance();
        java.lang.String str48 = dateFormat46.format((java.lang.Object) 10L);
        java.util.Calendar calendar49 = dateFormat46.getCalendar();
        java.text.DateFormat dateFormat50 = java.text.DateFormat.getTimeInstance();
        java.lang.String str52 = dateFormat50.format((java.lang.Object) 10L);
        dateFormat50.setLenient(true);
        java.text.DateFormat dateFormat55 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat56 = dateFormat55.getNumberFormat();
        dateFormat50.setNumberFormat(numberFormat56);
        dateFormat46.setNumberFormat(numberFormat56);
        java.util.Calendar calendar59 = dateFormat46.getCalendar();
        java.lang.Class<?> wildcardClass60 = dateFormat46.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = stdDateFormat2.format((java.lang.Object) wildcardClass60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(timeZone17);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(numberFormat30);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "07:00:00" + "'", str37, "07:00:00");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(dateFormat46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "07:00:00" + "'", str48, "07:00:00");
        org.junit.Assert.assertNotNull(calendar49);
        org.junit.Assert.assertEquals(calendar49.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "07:00:00" + "'", str52, "07:00:00");
        org.junit.Assert.assertNotNull(dateFormat55);
        org.junit.Assert.assertNotNull(numberFormat56);
        org.junit.Assert.assertNotNull(calendar59);
        org.junit.Assert.assertEquals(calendar59.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = stdDateFormat2.format(date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        java.text.DateFormat dateFormat26 = stdDateFormat2._formatISO8601;
        java.text.DateFormat dateFormat27 = stdDateFormat2._formatPlain;
        java.util.TimeZone timeZone28 = stdDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass29 = timeZone28.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNull(timeZone28);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.text.DateFormat dateFormat11 = stdDateFormat2._formatISO8601_z;
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean14 = dateFormat12.equals((java.lang.Object) 10L);
        java.util.Calendar calendar15 = dateFormat12.getCalendar();
        stdDateFormat2._formatRFC1123 = dateFormat12;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 1);
        java.util.Calendar calendar19 = dateFormat18.getCalendar();
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean22 = dateFormat20.equals((java.lang.Object) 10L);
        dateFormat20.setLenient(true);
        java.text.NumberFormat numberFormat25 = null;
        dateFormat20.setNumberFormat(numberFormat25);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat28);
        dateFormat18.setNumberFormat(numberFormat28);
        stdDateFormat2._formatISO8601_z = dateFormat18;
        java.util.TimeZone timeZone32 = stdDateFormat2.getTimeZone();
        java.util.TimeZone timeZone33 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone33);
        java.text.DateFormat dateFormat35 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone33);
        stdDateFormat2.setTimeZone(timeZone33);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(calendar15);
// flaky "5) test5030(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(calendar19);
// flaky "1) test5030(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar19.toString(), "sun.util.BuddhistCalendar[time=-734417774203,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=45,MILLISECOND=797,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertNull(timeZone32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(dateFormat35);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        stdDateFormat2._clearFormats();
        stdDateFormat2._clearFormats();
        stdDateFormat2._lenient = false;
        java.util.Calendar calendar18 = stdDateFormat2.getCalendar();
        java.util.TimeZone timeZone19 = stdDateFormat2._timezone;
        java.util.TimeZone timeZone20 = stdDateFormat2._timezone;
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat2.setLenient(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNull(calendar18);
        org.junit.Assert.assertNull(timeZone19);
        org.junit.Assert.assertNull(timeZone20);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.lang.String str16 = dateFormat14.format((java.lang.Object) 10L);
        dateFormat14.setLenient(true);
        dateFormat14.setLenient(true);
        java.util.Calendar calendar21 = dateFormat14.getCalendar();
        java.lang.String str23 = dateFormat14.format((java.lang.Object) (short) -1);
        stdDateFormat2._formatISO8601 = dateFormat14;
        java.text.DateFormat dateFormat25 = stdDateFormat2._formatRFC1123;
        boolean boolean27 = stdDateFormat2.looksLikeISO8601("hi!");
        boolean boolean29 = stdDateFormat2.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)");
        stdDateFormat2._lenient = true;
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getTimeInstance();
        java.lang.String str36 = dateFormat34.format((java.lang.Object) 10L);
        dateFormat34.setLenient(true);
        dateFormat34.setLenient(true);
        java.util.Calendar calendar41 = dateFormat34.getCalendar();
        dateFormat32.setCalendar(calendar41);
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat45 = dateFormat44.getNumberFormat();
        dateFormat43.setNumberFormat(numberFormat45);
        dateFormat32.setNumberFormat(numberFormat45);
        stdDateFormat2.setNumberFormat(numberFormat45);
        java.util.Calendar calendar49 = stdDateFormat2.getCalendar();
        java.util.TimeZone timeZone50 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat51 = stdDateFormat2._formatISO8601_z;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "07:00:00" + "'", str16, "07:00:00");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "06:59:59" + "'", str23, "06:59:59");
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(numberFormat33);
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "07:00:00" + "'", str36, "07:00:00");
        org.junit.Assert.assertNotNull(calendar41);
        org.junit.Assert.assertEquals(calendar41.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat43);
        org.junit.Assert.assertNotNull(dateFormat44);
        org.junit.Assert.assertNotNull(numberFormat45);
        org.junit.Assert.assertNull(calendar49);
        org.junit.Assert.assertNull(timeZone50);
        org.junit.Assert.assertNull(dateFormat51);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        java.text.DateFormat dateFormat24 = stdDateFormat2._formatISO8601_z;
        stdDateFormat2._clearFormats();
        java.text.DateFormat dateFormat26 = stdDateFormat2._formatPlain;
        java.lang.String str27 = stdDateFormat2.toString();
        stdDateFormat2._clearFormats();
        java.util.Calendar calendar29 = stdDateFormat2.getCalendar();
        java.lang.Class<?> wildcardClass30 = stdDateFormat2.getClass();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(dateFormat24);
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str27, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(calendar29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.text.DateFormat dateFormat11 = stdDateFormat2._formatISO8601;
        stdDateFormat2._lenient = true;
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatPlain;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = dateFormat14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat14);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.util.Locale locale15 = stdDateFormat2._locale;
        java.lang.Boolean boolean16 = stdDateFormat2._lenient;
        boolean boolean18 = stdDateFormat2.looksLikeISO8601("06:59:59");
        java.util.Calendar calendar19 = stdDateFormat2.getCalendar();
        java.text.DateFormat dateFormat20 = stdDateFormat2._formatISO8601_z;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(calendar19);
        org.junit.Assert.assertNull(dateFormat20);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        stdDateFormat2._clearFormats();
        java.util.Locale locale15 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat16 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat17 = stdDateFormat2._formatRFC1123;
        boolean boolean19 = stdDateFormat2.looksLikeISO8601("");
        java.text.DateFormat dateFormat20 = stdDateFormat2._formatISO8601;
        java.text.DateFormat dateFormat21 = stdDateFormat2._formatISO8601_z;
        java.text.ParsePosition parsePosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = stdDateFormat2.parseObject("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 2513", parsePosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNull(dateFormat21);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        stdDateFormat2._clearFormats();
        java.util.Locale locale15 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat16 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance(2);
        stdDateFormat2._formatRFC1123 = dateFormat18;
        stdDateFormat2._lenient = true;
        java.text.DateFormat dateFormat22 = stdDateFormat2._formatISO8601_z;
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        java.lang.String str26 = dateFormat23.format((java.lang.Object) 1.0d);
        boolean boolean27 = stdDateFormat2.equals((java.lang.Object) 1.0d);
        java.util.TimeZone timeZone28 = stdDateFormat2._timezone;
        java.text.DateFormat dateFormat29 = stdDateFormat2._formatRFC1123;
        java.util.TimeZone timeZone30 = null;
        java.util.Locale locale31 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone30, locale31);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        stdDateFormat32.setNumberFormat(numberFormat34);
        stdDateFormat32._lenient = false;
        stdDateFormat32._lenient = false;
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat32._formatPlain = dateFormat42;
        boolean boolean44 = stdDateFormat32.isLenient();
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getDateInstance(1);
        dateFormat46.setLenient(true);
        java.text.DateFormat dateFormat49 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str51 = dateFormat49.format((java.lang.Object) 100.0f);
        boolean boolean52 = dateFormat46.equals((java.lang.Object) dateFormat49);
        stdDateFormat32._formatRFC1123 = dateFormat49;
        java.text.DateFormat dateFormat56 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        java.util.Calendar calendar57 = dateFormat56.getCalendar();
        stdDateFormat32._formatISO8601_z = dateFormat56;
        java.util.Calendar calendar59 = stdDateFormat32.getCalendar();
        java.text.NumberFormat numberFormat60 = stdDateFormat32.getNumberFormat();
        java.lang.String str61 = stdDateFormat32.toString();
        java.text.DateFormat dateFormat62 = stdDateFormat32._formatRFC1123;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator63 = stdDateFormat2.formatToCharacterIterator((java.lang.Object) dateFormat62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2513-01-01" + "'", str26, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(timeZone28);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(dateFormat42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dateFormat46);
        org.junit.Assert.assertNotNull(dateFormat49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "2513-01-01" + "'", str51, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(dateFormat56);
        org.junit.Assert.assertNotNull(calendar57);
// flaky "6) test5037(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar57.toString(), "sun.util.BuddhistCalendar[time=-734417774156,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=45,MILLISECOND=844,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(calendar59);
        org.junit.Assert.assertNotNull(numberFormat60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str61, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat62);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat7);
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9);
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9);
        stdDateFormat2.setTimeZone(timeZone9);
        java.lang.Boolean boolean13 = stdDateFormat2._lenient;
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stdDateFormat2.parseObject("\u0e21\u0e04. 2513", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        java.lang.String str26 = stdDateFormat2.toString();
        java.util.Locale locale27 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat28 = stdDateFormat2._formatISO8601;
        java.util.Locale locale29 = stdDateFormat2._locale;
        stdDateFormat2._lenient = true;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str26, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertNull(dateFormat28);
        org.junit.Assert.assertNull(locale29);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        java.lang.String str26 = stdDateFormat2.toString();
        java.util.TimeZone timeZone27 = stdDateFormat2._timezone;
        java.util.Calendar calendar28 = stdDateFormat2.getCalendar();
        java.text.DateFormat dateFormat29 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat30 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean31 = stdDateFormat2._lenient;
        java.lang.String str32 = stdDateFormat2.toString();
        java.lang.String str33 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat35 = dateFormat34.getNumberFormat();
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getTimeInstance();
        java.lang.String str38 = dateFormat36.format((java.lang.Object) 10L);
        dateFormat36.setLenient(true);
        dateFormat36.setLenient(true);
        java.util.Calendar calendar43 = dateFormat36.getCalendar();
        dateFormat34.setCalendar(calendar43);
        dateFormat34.setLenient(false);
        stdDateFormat2._formatPlain = dateFormat34;
        java.util.Calendar calendar48 = stdDateFormat2.getCalendar();
        boolean boolean50 = stdDateFormat2.looksLikeISO8601("");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str26, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone27);
        org.junit.Assert.assertNull(calendar28);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str32, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str33, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "07:00:00" + "'", str38, "07:00:00");
        org.junit.Assert.assertNotNull(calendar43);
        org.junit.Assert.assertEquals(calendar43.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(calendar48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        boolean boolean13 = stdDateFormat2.looksLikeISO8601("");
        java.lang.Boolean boolean14 = stdDateFormat2._lenient;
        java.text.DateFormat dateFormat15 = stdDateFormat2._formatPlain;
        stdDateFormat2._clearFormats();
        java.lang.Boolean boolean17 = stdDateFormat2._lenient;
        boolean boolean18 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat19 = stdDateFormat2._formatISO8601_z;
        java.util.TimeZone timeZone20 = null;
        java.util.Locale locale21 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20, locale21);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        stdDateFormat22.setNumberFormat(numberFormat24);
        stdDateFormat22._lenient = false;
        stdDateFormat22._lenient = false;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat22._formatPlain = dateFormat32;
        boolean boolean34 = stdDateFormat22.isLenient();
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(1);
        dateFormat36.setLenient(true);
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str41 = dateFormat39.format((java.lang.Object) 100.0f);
        boolean boolean42 = dateFormat36.equals((java.lang.Object) dateFormat39);
        stdDateFormat22._formatRFC1123 = dateFormat39;
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        java.util.Calendar calendar47 = dateFormat46.getCalendar();
        stdDateFormat22._formatISO8601_z = dateFormat46;
        java.text.DateFormat dateFormat49 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat50 = dateFormat49.getNumberFormat();
        java.text.DateFormat dateFormat51 = java.text.DateFormat.getTimeInstance();
        java.lang.String str53 = dateFormat51.format((java.lang.Object) 10L);
        dateFormat51.setLenient(true);
        dateFormat51.setLenient(true);
        java.util.Calendar calendar58 = dateFormat51.getCalendar();
        dateFormat49.setCalendar(calendar58);
        stdDateFormat22.setCalendar(calendar58);
        java.text.NumberFormat numberFormat61 = stdDateFormat22.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str62 = dateFormat19.format((java.lang.Object) numberFormat61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(dateFormat39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "2513-01-01" + "'", str41, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateFormat46);
        org.junit.Assert.assertNotNull(calendar47);
// flaky "7) test5041(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar47.toString(), "sun.util.BuddhistCalendar[time=-734417774129,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=45,MILLISECOND=871,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat49);
        org.junit.Assert.assertNotNull(numberFormat50);
        org.junit.Assert.assertNotNull(dateFormat51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "07:00:00" + "'", str53, "07:00:00");
        org.junit.Assert.assertNotNull(calendar58);
        org.junit.Assert.assertEquals(calendar58.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat61);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        java.lang.String str26 = stdDateFormat2.toString();
        java.util.Locale locale27 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat28 = stdDateFormat2._formatISO8601;
        java.util.Locale locale29 = stdDateFormat2._locale;
        java.lang.String str30 = stdDateFormat2.toString();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str26, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertNull(dateFormat28);
        org.junit.Assert.assertNull(locale29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str30, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        stdDateFormat2._clearFormats();
        java.util.Locale locale15 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat16 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat17 = stdDateFormat2._formatPlain;
        java.util.TimeZone timeZone18 = stdDateFormat2.getTimeZone();
        java.util.Locale locale19 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat20 = stdDateFormat2._formatISO8601_z;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(timeZone18);
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertNull(dateFormat20);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        stdDateFormat4.setNumberFormat(numberFormat6);
        dateFormat0.setNumberFormat(numberFormat6);
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateFormat0.format(date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        stdDateFormat2._lenient = false;
        java.lang.Boolean boolean26 = stdDateFormat2._lenient;
        java.text.DateFormat dateFormat27 = stdDateFormat2._formatISO8601;
        java.lang.Boolean boolean28 = stdDateFormat2._lenient;
        java.lang.String str29 = stdDateFormat2.toString();
        stdDateFormat2._clearFormats();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(dateFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str29, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.lang.String str16 = dateFormat14.format((java.lang.Object) 10L);
        dateFormat14.setLenient(true);
        dateFormat14.setLenient(true);
        java.util.Calendar calendar21 = dateFormat14.getCalendar();
        java.lang.String str23 = dateFormat14.format((java.lang.Object) (short) -1);
        stdDateFormat2._formatISO8601 = dateFormat14;
        java.text.DateFormat dateFormat25 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean26 = stdDateFormat2._lenient;
        java.text.DateFormat dateFormat27 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat28 = stdDateFormat2._formatRFC1123;
        java.util.Calendar calendar29 = stdDateFormat2.getCalendar();
        stdDateFormat2._clearFormats();
        java.text.DateFormat dateFormat31 = stdDateFormat2._formatRFC1123;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "07:00:00" + "'", str16, "07:00:00");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "06:59:59" + "'", str23, "06:59:59");
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNull(dateFormat28);
        org.junit.Assert.assertNull(calendar29);
        org.junit.Assert.assertNull(dateFormat31);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        java.text.DateFormat dateFormat11 = stdDateFormat2._formatISO8601;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dateFormat11);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone10 = stdDateFormat2._timezone;
        stdDateFormat2._clearFormats();
        boolean boolean12 = stdDateFormat2.isLenient();
        boolean boolean14 = stdDateFormat2.looksLikeISO8601("\u0e21\u0e04. 2513");
        stdDateFormat2._clearFormats();
        java.text.DateFormat dateFormat16 = stdDateFormat2._formatPlain;
        java.util.Locale locale17 = stdDateFormat2._locale;
        java.util.Locale locale18 = stdDateFormat2._locale;
        boolean boolean19 = stdDateFormat2.isLenient();
        java.text.NumberFormat numberFormat20 = stdDateFormat2.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = stdDateFormat2.parseObject("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 2513");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(numberFormat20);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat9 = stdDateFormat2._formatRFC1123;
        java.util.TimeZone timeZone10 = stdDateFormat2._timezone;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone13 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatPlain;
        java.lang.String str15 = stdDateFormat2.toString();
        java.util.Date date16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = stdDateFormat2.format(date16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNull(timeZone13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.lang.String str16 = dateFormat14.format((java.lang.Object) 10L);
        dateFormat14.setLenient(true);
        dateFormat14.setLenient(true);
        java.util.Calendar calendar21 = dateFormat14.getCalendar();
        java.lang.String str23 = dateFormat14.format((java.lang.Object) (short) -1);
        stdDateFormat2._formatISO8601 = dateFormat14;
        java.text.DateFormat dateFormat25 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean26 = stdDateFormat2._lenient;
        stdDateFormat2._lenient = true;
        java.lang.Boolean boolean29 = stdDateFormat2._lenient;
        java.text.DateFormat dateFormat30 = stdDateFormat2._formatISO8601_z;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "07:00:00" + "'", str16, "07:00:00");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "06:59:59" + "'", str23, "06:59:59");
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(dateFormat30);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        java.text.DateFormat dateFormat26 = stdDateFormat2._formatISO8601_z;
        java.text.DateFormat dateFormat27 = stdDateFormat2._formatISO8601_z;
        boolean boolean29 = stdDateFormat2.looksLikeISO8601("");
        boolean boolean30 = stdDateFormat2.isLenient();
        boolean boolean32 = stdDateFormat2.looksLikeISO8601("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 2513");
        java.text.DateFormat dateFormat33 = stdDateFormat2._formatISO8601_z;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertNull(dateFormat27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(dateFormat33);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat2._formatISO8601 = dateFormat11;
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601_z;
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatPlain;
        java.util.TimeZone timeZone15 = stdDateFormat2.getTimeZone();
        java.text.NumberFormat numberFormat16 = stdDateFormat2.getNumberFormat();
        java.util.TimeZone timeZone17 = null;
        java.util.Locale locale18 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone17, locale18);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        stdDateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat19._lenient = false;
        java.text.DateFormat dateFormat25 = stdDateFormat19._formatISO8601_z;
        boolean boolean27 = stdDateFormat19.looksLikeISO8601("07:00:00");
        java.text.DateFormat dateFormat28 = stdDateFormat19._formatISO8601_z;
        boolean boolean29 = stdDateFormat19.isLenient();
        java.util.Locale locale30 = stdDateFormat19._locale;
        java.util.TimeZone timeZone31 = null;
        java.util.Locale locale32 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone31, locale32);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat35 = dateFormat34.getNumberFormat();
        stdDateFormat33.setNumberFormat(numberFormat35);
        java.lang.String str37 = stdDateFormat33.toString();
        java.lang.String str38 = stdDateFormat33.toString();
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat33._formatISO8601 = dateFormat39;
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean43 = dateFormat41.equals((java.lang.Object) 10L);
        java.util.Calendar calendar44 = dateFormat41.getCalendar();
        stdDateFormat33.setCalendar(calendar44);
        stdDateFormat19.setCalendar(calendar44);
        stdDateFormat2.setCalendar(calendar44);
        java.text.DateFormat dateFormat48 = stdDateFormat2._formatRFC1123;
        stdDateFormat2._clearFormats();
        java.lang.Boolean boolean50 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone51 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.lang.StringBuffer stringBuffer52 = null;
        java.text.FieldPosition fieldPosition53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer54 = stdDateFormat2.format((java.lang.Object) timeZone51, stringBuffer52, fieldPosition53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(dateFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(locale30);
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str37, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str38, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat39);
        org.junit.Assert.assertNotNull(dateFormat41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(calendar44);
// flaky "8) test5052(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNull(dateFormat48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.util.TimeZone timeZone7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat2._timezone = timeZone7;
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat2.withTimeZone(timeZone9);
        java.text.DateFormat dateFormat11 = stdDateFormat10._formatRFC1123;
        java.lang.Class<?> wildcardClass12 = stdDateFormat10.getClass();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(stdDateFormat10);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.util.TimeZone timeZone7 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getTimeInstance((int) (byte) 1);
        stdDateFormat2._formatPlain = dateFormat9;
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = stdDateFormat2.parseAsRFC1123("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone7);
        org.junit.Assert.assertNotNull(dateFormat9);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        java.lang.String str26 = stdDateFormat2.toString();
        java.util.TimeZone timeZone27 = stdDateFormat2._timezone;
        java.util.Calendar calendar28 = stdDateFormat2.getCalendar();
        java.text.DateFormat dateFormat29 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat30 = stdDateFormat2._formatRFC1123;
        java.util.TimeZone timeZone31 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat2._timezone = timeZone31;
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance();
        boolean boolean35 = dateFormat33.equals((java.lang.Object) 100L);
        stdDateFormat2._formatPlain = dateFormat33;
        java.text.DateFormat dateFormat37 = stdDateFormat2._formatRFC1123;
        java.util.Calendar calendar38 = dateFormat37.getCalendar();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str26, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone27);
        org.junit.Assert.assertNull(calendar28);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateFormat37);
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "sun.util.BuddhistCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        java.util.Calendar calendar27 = dateFormat26.getCalendar();
        stdDateFormat2._formatISO8601_z = dateFormat26;
        java.util.Calendar calendar29 = stdDateFormat2.getCalendar();
        boolean boolean30 = stdDateFormat2.isLenient();
        java.util.TimeZone timeZone31 = stdDateFormat2._timezone;
        java.lang.Boolean boolean32 = stdDateFormat2._lenient;
        java.text.DateFormat dateFormat33 = stdDateFormat2._formatRFC1123;
        java.text.ParsePosition parsePosition35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date36 = stdDateFormat2.parse("", parsePosition35);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(calendar27);
// flaky "9) test5056(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar27.toString(), "sun.util.BuddhistCalendar[time=-734417774032,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=45,MILLISECOND=968,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(calendar29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(timeZone31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateFormat33);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.lang.String str16 = dateFormat14.format((java.lang.Object) 10L);
        dateFormat14.setLenient(true);
        dateFormat14.setLenient(true);
        java.util.Calendar calendar21 = dateFormat14.getCalendar();
        java.lang.String str23 = dateFormat14.format((java.lang.Object) (short) -1);
        stdDateFormat2._formatISO8601 = dateFormat14;
        java.text.DateFormat dateFormat25 = stdDateFormat2._formatRFC1123;
        boolean boolean26 = stdDateFormat2.isLenient();
        java.util.TimeZone timeZone27 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat28 = stdDateFormat2._formatRFC1123;
        java.lang.String str29 = stdDateFormat2.toString();
        java.util.Calendar calendar30 = stdDateFormat2.getCalendar();
        java.text.DateFormat dateFormat31 = stdDateFormat2._formatRFC1123;
        java.util.Locale locale32 = stdDateFormat2._locale;
        java.util.Locale locale33 = stdDateFormat2._locale;
        java.util.Calendar calendar34 = null;
        stdDateFormat2.setCalendar(calendar34);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "07:00:00" + "'", str16, "07:00:00");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "06:59:59" + "'", str23, "06:59:59");
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(timeZone27);
        org.junit.Assert.assertNull(dateFormat28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str29, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(calendar30);
        org.junit.Assert.assertNull(dateFormat31);
        org.junit.Assert.assertNull(locale32);
        org.junit.Assert.assertNull(locale33);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat2._formatISO8601 = dateFormat11;
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat2.withLocale(locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.lang.String str7 = stdDateFormat2.toString();
        java.util.Calendar calendar8 = null;
        stdDateFormat2.setCalendar(calendar8);
        stdDateFormat2._clearFormats();
        java.lang.String str11 = stdDateFormat2.toString();
        boolean boolean12 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatPlain;
        stdDateFormat2._clearFormats();
        java.util.Date date15 = null;
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = stdDateFormat2.format(date15, stringBuffer16, fieldPosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(dateFormat13);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean7 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone8 = stdDateFormat2.getTimeZone();
        stdDateFormat2._clearFormats();
        java.lang.Boolean boolean10 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat12 = stdDateFormat2._formatISO8601;
        stdDateFormat2._lenient = true;
        java.text.NumberFormat numberFormat15 = stdDateFormat2.getNumberFormat();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance();
        java.lang.String str18 = dateFormat16.format((java.lang.Object) 100.0d);
        java.text.NumberFormat numberFormat19 = dateFormat16.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = numberFormat15.format((java.lang.Object) dateFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(timeZone8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
// flaky "10) test5060(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u0e21\u0e04. 2513" + "'", str18, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(numberFormat19);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        boolean boolean13 = stdDateFormat2.looksLikeISO8601("");
        stdDateFormat2._clearFormats();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.lang.String str17 = dateFormat15.format((java.lang.Object) 10L);
        dateFormat15.setLenient(true);
        dateFormat15.setLenient(true);
        java.util.Calendar calendar22 = dateFormat15.getCalendar();
        stdDateFormat2._formatISO8601 = dateFormat15;
        java.util.TimeZone timeZone24 = stdDateFormat2.getTimeZone();
        java.util.Calendar calendar25 = null;
        stdDateFormat2.setCalendar(calendar25);
        java.text.ParsePosition parsePosition28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date29 = stdDateFormat2.parse("", parsePosition28);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "07:00:00" + "'", str17, "07:00:00");
        org.junit.Assert.assertNotNull(calendar22);
        org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(timeZone24);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        boolean boolean13 = stdDateFormat2.looksLikeISO8601("");
        java.lang.Boolean boolean14 = stdDateFormat2._lenient;
        boolean boolean16 = stdDateFormat2.looksLikeISO8601("yyyy-MM-dd");
        java.util.TimeZone timeZone17 = stdDateFormat2._timezone;
        java.util.TimeZone timeZone18 = null;
        java.util.Locale locale19 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18, locale19);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        stdDateFormat20.setNumberFormat(numberFormat22);
        stdDateFormat20._lenient = false;
        java.text.DateFormat dateFormat26 = stdDateFormat20._formatISO8601_z;
        java.util.Locale locale27 = stdDateFormat20._locale;
        java.text.NumberFormat numberFormat28 = stdDateFormat20.getNumberFormat();
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance();
        dateFormat31.setLenient(true);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getTimeInstance();
        java.lang.String str37 = dateFormat35.format((java.lang.Object) 10L);
        java.util.Calendar calendar38 = dateFormat35.getCalendar();
        dateFormat34.setCalendar(calendar38);
        dateFormat31.setCalendar(calendar38);
        dateFormat29.setCalendar(calendar38);
        stdDateFormat20.setCalendar(calendar38);
        stdDateFormat2.setCalendar(calendar38);
        boolean boolean45 = stdDateFormat2.looksLikeISO8601("1970-01-01");
        java.text.DateFormat dateFormat46 = stdDateFormat2._formatRFC1123;
        stdDateFormat2._clearFormats();
        java.text.ParsePosition parsePosition49 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date50 = stdDateFormat2.parseAsRFC1123("hi!", parsePosition49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(timeZone17);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(numberFormat30);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "07:00:00" + "'", str37, "07:00:00");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(dateFormat46);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        boolean boolean13 = stdDateFormat2.looksLikeISO8601("");
        stdDateFormat2._clearFormats();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.lang.String str17 = dateFormat15.format((java.lang.Object) 10L);
        dateFormat15.setLenient(true);
        dateFormat15.setLenient(true);
        java.util.Calendar calendar22 = dateFormat15.getCalendar();
        stdDateFormat2._formatISO8601 = dateFormat15;
        java.util.TimeZone timeZone24 = stdDateFormat2.getTimeZone();
        java.util.TimeZone timeZone25 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat26 = stdDateFormat2._formatPlain;
        java.util.Date date27 = null;
        java.lang.StringBuffer stringBuffer28 = null;
        java.text.FieldPosition fieldPosition29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer30 = stdDateFormat2.format(date27, stringBuffer28, fieldPosition29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "07:00:00" + "'", str17, "07:00:00");
        org.junit.Assert.assertNotNull(calendar22);
        org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(timeZone24);
        org.junit.Assert.assertNull(timeZone25);
        org.junit.Assert.assertNull(dateFormat26);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        java.util.TimeZone timeZone9 = stdDateFormat2._timezone;
        java.util.Calendar calendar10 = stdDateFormat2.getCalendar();
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        java.lang.String str12 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateInstance();
        java.lang.Object obj15 = null;
        boolean boolean16 = dateFormat14.equals(obj15);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 1);
        java.util.Calendar calendar19 = dateFormat18.getCalendar();
        dateFormat14.setCalendar(calendar19);
        stdDateFormat2.setCalendar(calendar19);
        java.util.TimeZone timeZone22 = null;
        java.util.Locale locale23 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22, locale23);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        stdDateFormat24.setNumberFormat(numberFormat26);
        java.text.DateFormat dateFormat28 = stdDateFormat24._formatRFC1123;
        java.text.DateFormat dateFormat29 = stdDateFormat24._formatPlain;
        boolean boolean30 = stdDateFormat24.isLenient();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance();
        dateFormat33.setLenient(true);
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getTimeInstance();
        java.lang.String str39 = dateFormat37.format((java.lang.Object) 10L);
        java.util.Calendar calendar40 = dateFormat37.getCalendar();
        dateFormat36.setCalendar(calendar40);
        dateFormat33.setCalendar(calendar40);
        dateFormat31.setCalendar(calendar40);
        stdDateFormat24.setCalendar(calendar40);
        java.text.NumberFormat numberFormat45 = stdDateFormat24.getNumberFormat();
        stdDateFormat2._formatISO8601_z = stdDateFormat24;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(timeZone9);
        org.junit.Assert.assertNull(calendar10);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(calendar19);
// flaky "11) test5064(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar19.toString(), "sun.util.BuddhistCalendar[time=-734417773979,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=46,MILLISECOND=21,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNull(dateFormat28);
        org.junit.Assert.assertNull(dateFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(dateFormat37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "07:00:00" + "'", str39, "07:00:00");
        org.junit.Assert.assertNotNull(calendar40);
        org.junit.Assert.assertEquals(calendar40.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat45);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.lang.String str7 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat2._formatISO8601 = dateFormat8;
        java.text.NumberFormat numberFormat10 = stdDateFormat2.getNumberFormat();
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        stdDateFormat2._lenient = false;
        java.lang.String str14 = stdDateFormat2.toString();
        java.util.TimeZone timeZone15 = stdDateFormat2.getTimeZone();
        java.util.Date date16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = stdDateFormat2.format(date16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone15);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        java.text.DateFormat dateFormat26 = stdDateFormat2._formatISO8601;
        java.text.DateFormat dateFormat27 = stdDateFormat2._formatPlain;
        java.util.TimeZone timeZone28 = stdDateFormat2.getTimeZone();
        java.util.Locale locale29 = stdDateFormat2._locale;
        java.util.TimeZone timeZone30 = stdDateFormat2.getTimeZone();
        java.util.Locale locale31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = stdDateFormat2.withLocale(locale31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNull(timeZone28);
        org.junit.Assert.assertNull(locale29);
        org.junit.Assert.assertNull(timeZone30);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat2._formatISO8601 = dateFormat11;
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.lang.String str15 = stdDateFormat2.toString();
        java.util.TimeZone timeZone16 = stdDateFormat2._timezone;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (short) 0);
        java.text.AttributedCharacterIterator attributedCharacterIterator19 = stdDateFormat2.formatToCharacterIterator((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone16);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(attributedCharacterIterator19);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat2._formatISO8601 = dateFormat11;
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601_z;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.util.Locale locale15 = stdDateFormat2._locale;
        java.util.TimeZone timeZone16 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        java.lang.String str21 = stdDateFormat2.toString();
        java.text.NumberFormat numberFormat22 = stdDateFormat2.getNumberFormat();
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat25 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat26 = stdDateFormat2._formatRFC1123;
        java.text.ParsePosition parsePosition28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = dateFormat26.parseObject("07:00:00", parsePosition28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(timeZone16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str21, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertNotNull(dateFormat26);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        boolean boolean13 = stdDateFormat2.looksLikeISO8601("");
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatISO8601_z;
        java.util.Locale locale15 = stdDateFormat2._locale;
        java.util.Calendar calendar16 = stdDateFormat2.getCalendar();
        java.text.DateFormat dateFormat17 = stdDateFormat2._formatISO8601;
        java.lang.Boolean boolean18 = stdDateFormat2._lenient;
        boolean boolean20 = stdDateFormat2.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.util.TimeZone timeZone21 = stdDateFormat2.getTimeZone();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(calendar16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(timeZone21);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone10 = stdDateFormat2._timezone;
        stdDateFormat2._clearFormats();
        boolean boolean12 = stdDateFormat2.isLenient();
        boolean boolean14 = stdDateFormat2.looksLikeISO8601("\u0e21\u0e04. 2513");
        stdDateFormat2._clearFormats();
        java.text.DateFormat dateFormat16 = stdDateFormat2._formatPlain;
        java.util.Locale locale17 = stdDateFormat2._locale;
        java.util.Locale locale18 = stdDateFormat2._locale;
        boolean boolean19 = stdDateFormat2.isLenient();
        stdDateFormat2._clearFormats();
        java.util.Date date21 = null;
        java.lang.StringBuffer stringBuffer22 = null;
        java.text.FieldPosition fieldPosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = stdDateFormat2.format(date21, stringBuffer22, fieldPosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone10 = stdDateFormat2._timezone;
        stdDateFormat2._clearFormats();
        boolean boolean12 = stdDateFormat2.isLenient();
        boolean boolean14 = stdDateFormat2.looksLikeISO8601("\u0e21\u0e04. 2513");
        stdDateFormat2._clearFormats();
        java.text.DateFormat dateFormat16 = stdDateFormat2._formatPlain;
        stdDateFormat2._lenient = false;
        boolean boolean19 = stdDateFormat2.isLenient();
        stdDateFormat2._lenient = true;
        java.util.TimeZone timeZone22 = stdDateFormat2.getTimeZone();
        java.lang.Object obj23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = stdDateFormat2.format(obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(timeZone22);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.util.TimeZone timeZone7 = stdDateFormat2.getTimeZone();
        java.lang.String str8 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat9 = stdDateFormat2._formatISO8601;
        java.util.TimeZone timeZone10 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat11 = stdDateFormat2._formatISO8601_z;
        java.lang.Boolean boolean12 = stdDateFormat2._lenient;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str8, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        java.lang.String str26 = dateFormat24.format((java.lang.Object) 10L);
        java.util.Calendar calendar27 = dateFormat24.getCalendar();
        java.lang.Object obj29 = dateFormat24.parseObject("07:00:00");
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance();
        java.lang.String str32 = dateFormat30.format((java.lang.Object) 10L);
        java.util.Calendar calendar33 = dateFormat30.getCalendar();
        java.lang.Object obj35 = dateFormat30.parseObject("07:00:00");
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean38 = dateFormat36.equals((java.lang.Object) 10L);
        java.util.Calendar calendar39 = dateFormat36.getCalendar();
        dateFormat30.setCalendar(calendar39);
        dateFormat24.setCalendar(calendar39);
        stdDateFormat2.setCalendar(calendar39);
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat44 = dateFormat43.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat44);
        java.util.TimeZone timeZone46 = stdDateFormat2.getTimeZone();
        java.util.Locale locale47 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat48 = stdDateFormat2.withLocale(locale47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "07:00:00" + "'", str26, "07:00:00");
        org.junit.Assert.assertNotNull(calendar27);
        org.junit.Assert.assertEquals(calendar27.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "07:00:00" + "'", str32, "07:00:00");
        org.junit.Assert.assertNotNull(calendar33);
        org.junit.Assert.assertEquals(calendar33.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(calendar39);
// flaky "12) test5073(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateFormat43);
        org.junit.Assert.assertNotNull(numberFormat44);
        org.junit.Assert.assertNull(timeZone46);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.text.DateFormat dateFormat11 = stdDateFormat2._formatISO8601_z;
        stdDateFormat2._clearFormats();
        java.util.Calendar calendar13 = stdDateFormat2.getCalendar();
        java.lang.String str14 = stdDateFormat2.toString();
        java.text.NumberFormat numberFormat15 = stdDateFormat2.getNumberFormat();
        java.text.DateFormat dateFormat16 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat17 = stdDateFormat2._formatISO8601;
        java.text.DateFormat dateFormat18 = stdDateFormat2._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(calendar13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(dateFormat18);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        java.lang.String str26 = stdDateFormat2.toString();
        java.util.Locale locale27 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat28 = stdDateFormat2._formatISO8601;
        java.text.DateFormat dateFormat29 = null;
        stdDateFormat2._formatISO8601_z = dateFormat29;
        stdDateFormat2._lenient = false;
        stdDateFormat2._clearFormats();
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat36 = stdDateFormat2._formatISO8601_z;
        stdDateFormat2._lenient = false;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str26, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertNull(dateFormat28);
        org.junit.Assert.assertNull(dateFormat36);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatISO8601_z;
        java.util.TimeZone timeZone8 = stdDateFormat2.getTimeZone();
        java.util.TimeZone timeZone9 = null;
        stdDateFormat2._timezone = timeZone9;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(timeZone8);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat26 = stdDateFormat2._formatPlain;
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        dateFormat26.setLenient(false);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(numberFormat27);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        java.util.TimeZone timeZone9 = stdDateFormat2._timezone;
        java.util.Calendar calendar10 = stdDateFormat2.getCalendar();
        java.text.NumberFormat numberFormat11 = stdDateFormat2.getNumberFormat();
        java.text.DateFormat dateFormat12 = stdDateFormat2._formatPlain;
        java.util.TimeZone timeZone13 = stdDateFormat2.getTimeZone();
        java.text.NumberFormat numberFormat14 = stdDateFormat2.getNumberFormat();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(timeZone9);
        org.junit.Assert.assertNull(calendar10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNull(timeZone13);
        org.junit.Assert.assertNotNull(numberFormat14);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(10, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat2._formatISO8601 = dateFormat11;
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601;
        boolean boolean15 = stdDateFormat2.looksLikeISO8601("1970-01-01");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = stdDateFormat2.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        java.util.Calendar calendar27 = dateFormat26.getCalendar();
        stdDateFormat2._formatISO8601_z = dateFormat26;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateTimeInstance(2, 1);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getTimeInstance();
        java.lang.String str34 = dateFormat32.format((java.lang.Object) 10L);
        dateFormat32.setLenient(true);
        dateFormat32.setLenient(true);
        java.util.Calendar calendar39 = dateFormat32.getCalendar();
        dateFormat31.setCalendar(calendar39);
        stdDateFormat2.setCalendar(calendar39);
        java.lang.String str42 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat43 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean44 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone45 = null;
        java.util.Locale locale46 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat47 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone45, locale46);
        java.text.DateFormat dateFormat48 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat49 = dateFormat48.getNumberFormat();
        stdDateFormat47.setNumberFormat(numberFormat49);
        java.text.DateFormat dateFormat51 = stdDateFormat47._formatRFC1123;
        java.text.DateFormat dateFormat52 = stdDateFormat47._formatRFC1123;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator53 = stdDateFormat2.formatToCharacterIterator((java.lang.Object) dateFormat52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(calendar27);
// flaky "13) test5081(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar27.toString(), "sun.util.BuddhistCalendar[time=-734417773862,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=46,MILLISECOND=138,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "07:00:00" + "'", str34, "07:00:00");
        org.junit.Assert.assertNotNull(calendar39);
        org.junit.Assert.assertEquals(calendar39.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str42, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dateFormat48);
        org.junit.Assert.assertNotNull(numberFormat49);
        org.junit.Assert.assertNull(dateFormat51);
        org.junit.Assert.assertNull(dateFormat52);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat2._formatISO8601 = dateFormat11;
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601_z;
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatPlain;
        java.util.TimeZone timeZone15 = stdDateFormat2.getTimeZone();
        java.util.TimeZone timeZone16 = null;
        java.util.Locale locale17 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16, locale17);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        stdDateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat18._lenient = false;
        stdDateFormat18._lenient = false;
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat18._formatPlain = dateFormat28;
        boolean boolean30 = stdDateFormat18.isLenient();
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance(1);
        dateFormat32.setLenient(true);
        java.text.DateFormat dateFormat35 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str37 = dateFormat35.format((java.lang.Object) 100.0f);
        boolean boolean38 = dateFormat32.equals((java.lang.Object) dateFormat35);
        stdDateFormat18._formatRFC1123 = dateFormat35;
        boolean boolean41 = stdDateFormat18.looksLikeISO8601("");
        java.lang.String str42 = stdDateFormat18.toString();
        java.util.TimeZone timeZone43 = stdDateFormat18._timezone;
        java.util.Calendar calendar44 = stdDateFormat18.getCalendar();
        java.text.DateFormat dateFormat45 = stdDateFormat18._formatRFC1123;
        java.text.DateFormat dateFormat46 = stdDateFormat18._formatRFC1123;
        java.util.TimeZone timeZone47 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat18._timezone = timeZone47;
        java.text.DateFormat dateFormat49 = stdDateFormat18._formatISO8601;
        java.text.DateFormat dateFormat50 = stdDateFormat18._formatPlain;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator51 = stdDateFormat2.formatToCharacterIterator((java.lang.Object) dateFormat50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2513-01-01" + "'", str37, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str42, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone43);
        org.junit.Assert.assertNull(calendar44);
        org.junit.Assert.assertNotNull(dateFormat45);
        org.junit.Assert.assertNotNull(dateFormat46);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNull(dateFormat49);
        org.junit.Assert.assertNotNull(dateFormat50);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.lang.String str16 = dateFormat14.format((java.lang.Object) 10L);
        dateFormat14.setLenient(true);
        dateFormat14.setLenient(true);
        java.util.Calendar calendar21 = dateFormat14.getCalendar();
        java.lang.String str23 = dateFormat14.format((java.lang.Object) (short) -1);
        stdDateFormat2._formatISO8601 = dateFormat14;
        java.text.DateFormat dateFormat25 = stdDateFormat2._formatRFC1123;
        boolean boolean26 = stdDateFormat2.isLenient();
        java.util.TimeZone timeZone27 = stdDateFormat2.getTimeZone();
        java.util.Locale locale28 = stdDateFormat2._locale;
        java.lang.Boolean boolean29 = stdDateFormat2._lenient;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "07:00:00" + "'", str16, "07:00:00");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "06:59:59" + "'", str23, "06:59:59");
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(timeZone27);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.lang.String str7 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat2._formatISO8601 = dateFormat8;
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean12 = dateFormat10.equals((java.lang.Object) 10L);
        java.util.Calendar calendar13 = dateFormat10.getCalendar();
        stdDateFormat2.setCalendar(calendar13);
        java.lang.String str15 = stdDateFormat2.toString();
        java.text.NumberFormat numberFormat16 = stdDateFormat2.getNumberFormat();
        boolean boolean18 = stdDateFormat2.looksLikeISO8601("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 2513");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(calendar13);
// flaky "14) test5084(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        boolean boolean13 = stdDateFormat2.looksLikeISO8601("");
        java.lang.Boolean boolean14 = stdDateFormat2._lenient;
        boolean boolean15 = stdDateFormat2.isLenient();
        boolean boolean17 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone18 = stdDateFormat2.getTimeZone();
        java.util.TimeZone timeZone19 = stdDateFormat2.getTimeZone();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(timeZone18);
        org.junit.Assert.assertNull(timeZone19);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat2._formatISO8601 = dateFormat11;
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601;
        stdDateFormat2._clearFormats();
        java.util.Calendar calendar15 = stdDateFormat2.getCalendar();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNull(calendar15);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.lang.String str7 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat2._formatISO8601 = dateFormat8;
        java.text.NumberFormat numberFormat10 = stdDateFormat2.getNumberFormat();
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        stdDateFormat2._lenient = false;
        java.lang.String str14 = stdDateFormat2.toString();
        java.util.TimeZone timeZone15 = stdDateFormat2.getTimeZone();
        java.lang.String str16 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat17 = stdDateFormat2._formatISO8601;
        java.lang.Boolean boolean18 = stdDateFormat2._lenient;
        boolean boolean19 = stdDateFormat2.isLenient();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str16, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat2._formatISO8601 = dateFormat11;
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601_z;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateInstance();
        java.lang.String str16 = dateFormat14.format((java.lang.Object) 100.0d);
        java.text.NumberFormat numberFormat17 = dateFormat14.getNumberFormat();
        java.util.Calendar calendar18 = dateFormat14.getCalendar();
        stdDateFormat2._formatISO8601_z = dateFormat14;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        java.lang.String str23 = dateFormat21.format((java.lang.Object) 10L);
        java.util.Calendar calendar24 = dateFormat21.getCalendar();
        dateFormat20.setCalendar(calendar24);
        java.util.Calendar calendar26 = dateFormat20.getCalendar();
        stdDateFormat2._formatRFC1123 = dateFormat20;
        java.util.Calendar calendar28 = stdDateFormat2.getCalendar();
        java.util.TimeZone timeZone29 = null;
        java.util.Locale locale30 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone29, locale30);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        stdDateFormat31.setNumberFormat(numberFormat33);
        stdDateFormat31._lenient = false;
        stdDateFormat31._lenient = false;
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat31._formatPlain = dateFormat41;
        boolean boolean43 = stdDateFormat31.isLenient();
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateInstance(1);
        dateFormat45.setLenient(true);
        java.text.DateFormat dateFormat48 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str50 = dateFormat48.format((java.lang.Object) 100.0f);
        boolean boolean51 = dateFormat45.equals((java.lang.Object) dateFormat48);
        stdDateFormat31._formatRFC1123 = dateFormat48;
        boolean boolean54 = stdDateFormat31.looksLikeISO8601("");
        java.lang.String str55 = stdDateFormat31.toString();
        java.util.TimeZone timeZone56 = stdDateFormat31._timezone;
        java.text.DateFormat dateFormat57 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat58 = dateFormat57.getNumberFormat();
        stdDateFormat31._formatPlain = dateFormat57;
        java.text.DateFormat dateFormat60 = stdDateFormat31._formatPlain;
        java.lang.Boolean boolean61 = stdDateFormat31._lenient;
        java.lang.String str62 = stdDateFormat31.toString();
        java.util.Date date64 = stdDateFormat31.parse("2513-01-01");
        java.lang.StringBuffer stringBuffer65 = null;
        java.text.FieldPosition fieldPosition66 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer67 = stdDateFormat2.format(date64, stringBuffer65, fieldPosition66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
// flaky "15) test5088(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u0e21\u0e04. 2513" + "'", str16, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(calendar18);
        org.junit.Assert.assertEquals(calendar18.toString(), "sun.util.BuddhistCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "07:00:00" + "'", str23, "07:00:00");
        org.junit.Assert.assertNotNull(calendar24);
        org.junit.Assert.assertEquals(calendar24.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar26);
        org.junit.Assert.assertEquals(calendar26.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(calendar28);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(numberFormat33);
        org.junit.Assert.assertNotNull(dateFormat41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateFormat45);
        org.junit.Assert.assertNotNull(dateFormat48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "2513-01-01" + "'", str50, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str55, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone56);
        org.junit.Assert.assertNotNull(dateFormat57);
        org.junit.Assert.assertNotNull(numberFormat58);
        org.junit.Assert.assertNotNull(dateFormat60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str62, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getTimeInstance();
        java.lang.String str9 = dateFormat7.format((java.lang.Object) 10L);
        dateFormat7.setLenient(true);
        dateFormat7.setLenient(true);
        stdDateFormat2._formatISO8601 = dateFormat7;
        java.text.DateFormat dateFormat15 = stdDateFormat2._formatISO8601;
        java.lang.String str16 = stdDateFormat2.toString();
        stdDateFormat2._lenient = true;
        java.util.TimeZone timeZone19 = null;
        java.util.Locale locale20 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19, locale20);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        stdDateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat21._lenient = false;
        stdDateFormat21._lenient = false;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat21._formatPlain = dateFormat31;
        boolean boolean33 = stdDateFormat21.isLenient();
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateInstance(1);
        dateFormat35.setLenient(true);
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str40 = dateFormat38.format((java.lang.Object) 100.0f);
        boolean boolean41 = dateFormat35.equals((java.lang.Object) dateFormat38);
        stdDateFormat21._formatRFC1123 = dateFormat38;
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        java.util.Calendar calendar46 = dateFormat45.getCalendar();
        stdDateFormat21._formatISO8601_z = dateFormat45;
        java.text.DateFormat dateFormat48 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat49 = dateFormat48.getNumberFormat();
        java.text.DateFormat dateFormat50 = java.text.DateFormat.getTimeInstance();
        java.lang.String str52 = dateFormat50.format((java.lang.Object) 10L);
        dateFormat50.setLenient(true);
        dateFormat50.setLenient(true);
        java.util.Calendar calendar57 = dateFormat50.getCalendar();
        dateFormat48.setCalendar(calendar57);
        stdDateFormat21.setCalendar(calendar57);
        java.text.DateFormat dateFormat60 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat61 = dateFormat60.getNumberFormat();
        java.text.NumberFormat numberFormat62 = dateFormat60.getNumberFormat();
        stdDateFormat21.setNumberFormat(numberFormat62);
        java.text.DateFormat dateFormat64 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        dateFormat64.setLenient(true);
        java.lang.String str68 = dateFormat64.format((java.lang.Object) 100.0d);
        java.util.Calendar calendar69 = dateFormat64.getCalendar();
        stdDateFormat21.setCalendar(calendar69);
        stdDateFormat2.setCalendar(calendar69);
        java.util.TimeZone timeZone72 = null;
        java.util.Locale locale73 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat74 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone72, locale73);
        java.text.DateFormat dateFormat75 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat76 = dateFormat75.getNumberFormat();
        stdDateFormat74.setNumberFormat(numberFormat76);
        stdDateFormat74._lenient = false;
        java.text.DateFormat dateFormat80 = stdDateFormat74._formatISO8601_z;
        boolean boolean82 = stdDateFormat74.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone83 = stdDateFormat74.getTimeZone();
        boolean boolean85 = stdDateFormat74.looksLikeISO8601("");
        java.text.DateFormat dateFormat86 = stdDateFormat74._formatISO8601_z;
        java.text.DateFormat dateFormat87 = stdDateFormat74._formatPlain;
        java.text.DateFormat dateFormat88 = java.text.DateFormat.getTimeInstance();
        java.lang.String str90 = dateFormat88.format((java.lang.Object) 10L);
        boolean boolean92 = dateFormat88.equals((java.lang.Object) 0);
        java.util.Calendar calendar93 = dateFormat88.getCalendar();
        stdDateFormat74.setCalendar(calendar93);
        java.lang.Boolean boolean95 = stdDateFormat74._lenient;
        java.text.NumberFormat numberFormat96 = stdDateFormat74.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat96);
        boolean boolean99 = stdDateFormat2.looksLikeISO8601("\u0e21\u0e04\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "07:00:00" + "'", str9, "07:00:00");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str16, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(numberFormat23);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertNotNull(dateFormat38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2513-01-01" + "'", str40, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateFormat45);
        org.junit.Assert.assertNotNull(calendar46);
// flaky "16) test5089(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar46.toString(), "sun.util.BuddhistCalendar[time=-734417773797,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=46,MILLISECOND=203,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat48);
        org.junit.Assert.assertNotNull(numberFormat49);
        org.junit.Assert.assertNotNull(dateFormat50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "07:00:00" + "'", str52, "07:00:00");
        org.junit.Assert.assertNotNull(calendar57);
        org.junit.Assert.assertEquals(calendar57.toString(), "sun.util.BuddhistCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat60);
        org.junit.Assert.assertNotNull(numberFormat61);
        org.junit.Assert.assertNotNull(numberFormat62);
        org.junit.Assert.assertNotNull(dateFormat64);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "2513-01-01" + "'", str68, "2513-01-01");
        org.junit.Assert.assertNotNull(calendar69);
        org.junit.Assert.assertEquals(calendar69.toString(), "sun.util.BuddhistCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat75);
        org.junit.Assert.assertNotNull(numberFormat76);
        org.junit.Assert.assertNull(dateFormat80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(timeZone83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(dateFormat86);
        org.junit.Assert.assertNull(dateFormat87);
        org.junit.Assert.assertNotNull(dateFormat88);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "07:00:00" + "'", str90, "07:00:00");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(calendar93);
        org.junit.Assert.assertEquals(calendar93.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(numberFormat96);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.util.TimeZone timeZone7 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat9 = stdDateFormat2._formatRFC1123;
        stdDateFormat2._lenient = false;
        boolean boolean13 = stdDateFormat2.equals((java.lang.Object) (byte) 10);
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatRFC1123;
        java.util.TimeZone timeZone15 = stdDateFormat2._timezone;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(timeZone15);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatISO8601_z;
        stdDateFormat2._lenient = true;
        java.util.TimeZone timeZone10 = null;
        java.util.Locale locale11 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale11);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        stdDateFormat12.setNumberFormat(numberFormat14);
        java.lang.String str16 = stdDateFormat12.toString();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.lang.String str19 = dateFormat17.format((java.lang.Object) 10L);
        dateFormat17.setLenient(true);
        dateFormat17.setLenient(true);
        stdDateFormat12._formatISO8601 = dateFormat17;
        java.text.DateFormat dateFormat25 = stdDateFormat12._formatISO8601;
        java.lang.String str26 = stdDateFormat12.toString();
        stdDateFormat12._lenient = true;
        java.util.TimeZone timeZone29 = null;
        java.util.Locale locale30 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone29, locale30);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        stdDateFormat31.setNumberFormat(numberFormat33);
        stdDateFormat31._lenient = false;
        stdDateFormat31._lenient = false;
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat31._formatPlain = dateFormat41;
        boolean boolean43 = stdDateFormat31.isLenient();
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateInstance(1);
        dateFormat45.setLenient(true);
        java.text.DateFormat dateFormat48 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str50 = dateFormat48.format((java.lang.Object) 100.0f);
        boolean boolean51 = dateFormat45.equals((java.lang.Object) dateFormat48);
        stdDateFormat31._formatRFC1123 = dateFormat48;
        java.text.DateFormat dateFormat55 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        java.util.Calendar calendar56 = dateFormat55.getCalendar();
        stdDateFormat31._formatISO8601_z = dateFormat55;
        java.text.DateFormat dateFormat58 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat59 = dateFormat58.getNumberFormat();
        java.text.DateFormat dateFormat60 = java.text.DateFormat.getTimeInstance();
        java.lang.String str62 = dateFormat60.format((java.lang.Object) 10L);
        dateFormat60.setLenient(true);
        dateFormat60.setLenient(true);
        java.util.Calendar calendar67 = dateFormat60.getCalendar();
        dateFormat58.setCalendar(calendar67);
        stdDateFormat31.setCalendar(calendar67);
        java.text.DateFormat dateFormat70 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat71 = dateFormat70.getNumberFormat();
        java.text.NumberFormat numberFormat72 = dateFormat70.getNumberFormat();
        stdDateFormat31.setNumberFormat(numberFormat72);
        java.text.DateFormat dateFormat74 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        dateFormat74.setLenient(true);
        java.lang.String str78 = dateFormat74.format((java.lang.Object) 100.0d);
        java.util.Calendar calendar79 = dateFormat74.getCalendar();
        stdDateFormat31.setCalendar(calendar79);
        stdDateFormat12.setCalendar(calendar79);
        java.lang.String str82 = stdDateFormat12.toString();
        java.util.TimeZone timeZone83 = stdDateFormat12._timezone;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str84 = stdDateFormat2.format((java.lang.Object) timeZone83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str16, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "07:00:00" + "'", str19, "07:00:00");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str26, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(numberFormat33);
        org.junit.Assert.assertNotNull(dateFormat41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateFormat45);
        org.junit.Assert.assertNotNull(dateFormat48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "2513-01-01" + "'", str50, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(dateFormat55);
        org.junit.Assert.assertNotNull(calendar56);
// flaky "17) test5091(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar56.toString(), "sun.util.BuddhistCalendar[time=-734417773780,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=46,MILLISECOND=220,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat58);
        org.junit.Assert.assertNotNull(numberFormat59);
        org.junit.Assert.assertNotNull(dateFormat60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "07:00:00" + "'", str62, "07:00:00");
        org.junit.Assert.assertNotNull(calendar67);
        org.junit.Assert.assertEquals(calendar67.toString(), "sun.util.BuddhistCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat70);
        org.junit.Assert.assertNotNull(numberFormat71);
        org.junit.Assert.assertNotNull(numberFormat72);
        org.junit.Assert.assertNotNull(dateFormat74);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "2513-01-01" + "'", str78, "2513-01-01");
        org.junit.Assert.assertNotNull(calendar79);
        org.junit.Assert.assertEquals(calendar79.toString(), "sun.util.BuddhistCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str82, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone83);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.text.DateFormat dateFormat11 = stdDateFormat2._formatISO8601_z;
        java.lang.Boolean boolean12 = stdDateFormat2._lenient;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat15;
        java.text.DateFormat dateFormat17 = stdDateFormat2._formatRFC1123;
        java.util.TimeZone timeZone18 = stdDateFormat2.getTimeZone();
        java.lang.Boolean boolean19 = stdDateFormat2._lenient;
        stdDateFormat2._lenient = false;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(timeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        java.util.Calendar calendar9 = stdDateFormat2.getCalendar();
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        stdDateFormat2._formatISO8601_z = dateFormat10;
        java.util.Calendar calendar12 = stdDateFormat2.getCalendar();
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = stdDateFormat2.parseAsRFC1123("", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(calendar9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNull(calendar12);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat2._formatISO8601 = dateFormat11;
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.util.TimeZone timeZone15 = stdDateFormat2._timezone;
        java.text.NumberFormat numberFormat16 = stdDateFormat2.getNumberFormat();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertNotNull(numberFormat16);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        boolean boolean13 = stdDateFormat2.looksLikeISO8601("");
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatISO8601_z;
        stdDateFormat2._clearFormats();
        java.util.TimeZone timeZone16 = stdDateFormat2._timezone;
        java.text.DateFormat dateFormat17 = stdDateFormat2._formatISO8601;
        java.util.TimeZone timeZone18 = stdDateFormat2._timezone;
        java.text.DateFormat dateFormat19 = stdDateFormat2._formatISO8601;
        java.util.TimeZone timeZone20 = null;
        java.util.Locale locale21 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20, locale21);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        stdDateFormat22.setNumberFormat(numberFormat24);
        stdDateFormat22._lenient = false;
        stdDateFormat22._lenient = false;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat22._formatPlain = dateFormat32;
        boolean boolean34 = stdDateFormat22.isLenient();
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(1);
        dateFormat36.setLenient(true);
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str41 = dateFormat39.format((java.lang.Object) 100.0f);
        boolean boolean42 = dateFormat36.equals((java.lang.Object) dateFormat39);
        stdDateFormat22._formatRFC1123 = dateFormat39;
        boolean boolean45 = stdDateFormat22.looksLikeISO8601("");
        java.lang.String str46 = stdDateFormat22.toString();
        java.util.TimeZone timeZone47 = stdDateFormat22._timezone;
        java.text.DateFormat dateFormat48 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat49 = dateFormat48.getNumberFormat();
        stdDateFormat22._formatPlain = dateFormat48;
        java.text.DateFormat dateFormat51 = stdDateFormat22._formatPlain;
        java.lang.Boolean boolean52 = stdDateFormat22._lenient;
        java.lang.String str53 = stdDateFormat22.toString();
        java.util.Date date55 = stdDateFormat22.parse("2513-01-01");
        java.lang.StringBuffer stringBuffer56 = null;
        java.text.FieldPosition fieldPosition57 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer58 = stdDateFormat2.format(date55, stringBuffer56, fieldPosition57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(timeZone16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(timeZone18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(dateFormat39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "2513-01-01" + "'", str41, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str46, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone47);
        org.junit.Assert.assertNotNull(dateFormat48);
        org.junit.Assert.assertNotNull(numberFormat49);
        org.junit.Assert.assertNotNull(dateFormat51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str53, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        stdDateFormat2._clearFormats();
        java.lang.Boolean boolean27 = stdDateFormat2._lenient;
        stdDateFormat2._lenient = false;
        java.util.Locale locale30 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat31 = stdDateFormat2._formatPlain;
        java.util.Locale locale32 = stdDateFormat2._locale;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(locale30);
        org.junit.Assert.assertNull(dateFormat31);
        org.junit.Assert.assertNull(locale32);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.util.TimeZone timeZone7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat2._timezone = timeZone7;
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat2.withTimeZone(timeZone9);
        java.text.DateFormat dateFormat11 = stdDateFormat10._formatRFC1123;
        stdDateFormat10._clearFormats();
        java.util.TimeZone timeZone13 = stdDateFormat10._timezone;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
// flaky "18) test5097(com.fasterxml.jackson.databind.util.RegressionTest10)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(stdDateFormat10);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        java.text.DateFormat dateFormat24 = stdDateFormat2._formatISO8601_z;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date26 = stdDateFormat2.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(dateFormat24);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("2513-01-01");
        java.lang.String str11 = stdDateFormat2.toString();
        boolean boolean12 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601_z;
        java.util.Locale locale14 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat15 = stdDateFormat2._formatRFC1123;
        java.text.ParsePosition parsePosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = stdDateFormat2.parseAsISO8601("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 2513", parsePosition17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNull(dateFormat15);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.lang.String str7 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat2._formatISO8601 = dateFormat8;
        java.text.NumberFormat numberFormat10 = stdDateFormat2.getNumberFormat();
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        java.text.NumberFormat numberFormat12 = stdDateFormat2.getNumberFormat();
        boolean boolean14 = stdDateFormat2.looksLikeISO8601("06:59:59");
        boolean boolean16 = stdDateFormat2.looksLikeISO8601("");
        java.text.DateFormat dateFormat17 = stdDateFormat2._formatPlain;
        boolean boolean19 = stdDateFormat2.looksLikeISO8601("\u0e21\u0e04\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT");
        java.util.Calendar calendar20 = stdDateFormat2.getCalendar();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(calendar20);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        stdDateFormat2._clearFormats();
        boolean boolean12 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601_z;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stdDateFormat2.parseObject("1970-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateFormat13);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.text.DateFormat dateFormat11 = stdDateFormat2._formatISO8601_z;
        boolean boolean12 = stdDateFormat2.isLenient();
        java.util.Locale locale13 = stdDateFormat2._locale;
        java.util.TimeZone timeZone14 = null;
        java.util.Locale locale15 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14, locale15);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        stdDateFormat16.setNumberFormat(numberFormat18);
        java.lang.String str20 = stdDateFormat16.toString();
        java.lang.String str21 = stdDateFormat16.toString();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat16._formatISO8601 = dateFormat22;
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean26 = dateFormat24.equals((java.lang.Object) 10L);
        java.util.Calendar calendar27 = dateFormat24.getCalendar();
        stdDateFormat16.setCalendar(calendar27);
        stdDateFormat2.setCalendar(calendar27);
        stdDateFormat2._lenient = true;
        boolean boolean32 = stdDateFormat2.isLenient();
        java.lang.Boolean boolean33 = stdDateFormat2._lenient;
        java.text.DateFormat dateFormat34 = stdDateFormat2._formatRFC1123;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str20, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str21, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(calendar27);
// flaky "19) test5102(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(dateFormat34);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        java.lang.String str26 = stdDateFormat2.toString();
        java.util.Locale locale27 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat28 = stdDateFormat2._formatISO8601;
        java.text.DateFormat dateFormat29 = null;
        stdDateFormat2._formatISO8601_z = dateFormat29;
        java.text.DateFormat dateFormat31 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat32 = stdDateFormat2._formatPlain;
        stdDateFormat2._clearFormats();
        java.lang.Boolean boolean34 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone35 = stdDateFormat2.getTimeZone();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str26, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertNull(dateFormat28);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(timeZone35);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        stdDateFormat2._clearFormats();
        java.text.DateFormat dateFormat27 = stdDateFormat2._formatRFC1123;
        boolean boolean29 = stdDateFormat2.looksLikeISO8601("yyyy-MM-dd");
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean32 = dateFormat30.equals((java.lang.Object) 10L);
        dateFormat30.setLenient(true);
        java.text.NumberFormat numberFormat35 = null;
        dateFormat30.setNumberFormat(numberFormat35);
        stdDateFormat2._formatRFC1123 = dateFormat30;
        java.lang.String str38 = stdDateFormat2.toString();
        java.util.Calendar calendar39 = stdDateFormat2.getCalendar();
        java.text.ParsePosition parsePosition41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date42 = stdDateFormat2.parse("2513-01-01", parsePosition41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(dateFormat27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str38, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(calendar39);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        java.util.Calendar calendar27 = dateFormat26.getCalendar();
        stdDateFormat2._formatISO8601_z = dateFormat26;
        java.util.Calendar calendar29 = stdDateFormat2.getCalendar();
        java.text.NumberFormat numberFormat30 = stdDateFormat2.getNumberFormat();
        java.lang.String str31 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat32 = stdDateFormat2._formatRFC1123;
        boolean boolean34 = stdDateFormat2.looksLikeISO8601("1970-01-01");
        java.text.DateFormat dateFormat35 = stdDateFormat2._formatISO8601_z;
        java.util.Calendar calendar36 = stdDateFormat2.getCalendar();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(calendar27);
// flaky "20) test5105(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar27.toString(), "sun.util.BuddhistCalendar[time=-734417773680,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=46,MILLISECOND=320,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(calendar29);
        org.junit.Assert.assertNotNull(numberFormat30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str31, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertNull(calendar36);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        stdDateFormat2._clearFormats();
        java.lang.Boolean boolean15 = stdDateFormat2._lenient;
        java.lang.Boolean boolean16 = stdDateFormat2._lenient;
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat2.withLocale(locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.lang.String str16 = dateFormat14.format((java.lang.Object) 10L);
        dateFormat14.setLenient(true);
        dateFormat14.setLenient(true);
        java.util.Calendar calendar21 = dateFormat14.getCalendar();
        java.lang.String str23 = dateFormat14.format((java.lang.Object) (short) -1);
        stdDateFormat2._formatISO8601 = dateFormat14;
        java.text.DateFormat dateFormat25 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean26 = stdDateFormat2._lenient;
        stdDateFormat2._lenient = true;
        java.lang.String str29 = stdDateFormat2.toString();
        java.lang.String str30 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat31 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat32 = stdDateFormat2._formatISO8601;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "07:00:00" + "'", str16, "07:00:00");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "06:59:59" + "'", str23, "06:59:59");
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str29, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str30, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.lang.String str11 = stdDateFormat2.toString();
        java.util.Calendar calendar12 = stdDateFormat2.getCalendar();
        stdDateFormat2._clearFormats();
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatISO8601;
        java.text.DateFormat dateFormat15 = stdDateFormat2._formatRFC1123;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = stdDateFormat2.parse("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(calendar12);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        java.text.DateFormat dateFormat24 = stdDateFormat2._formatISO8601_z;
        stdDateFormat2._clearFormats();
        java.text.DateFormat dateFormat26 = stdDateFormat2._formatPlain;
        java.lang.String str27 = stdDateFormat2.toString();
        stdDateFormat2._clearFormats();
        java.util.TimeZone timeZone29 = stdDateFormat2._timezone;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(dateFormat24);
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str27, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone29);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(4, (int) 'a', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat2.withLocale(locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        boolean boolean26 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat27 = stdDateFormat2._formatISO8601_z;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone30 = stdDateFormat2.getTimeZone();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(dateFormat27);
        org.junit.Assert.assertNull(timeZone30);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(100, 17, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.util.TimeZone timeZone7 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat9 = stdDateFormat2._formatRFC1123;
        stdDateFormat2._lenient = false;
        boolean boolean12 = stdDateFormat2.isLenient();
        java.util.Locale locale13 = stdDateFormat2._locale;
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = stdDateFormat2.parse("", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(locale13);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone10 = stdDateFormat2._timezone;
        stdDateFormat2._clearFormats();
        boolean boolean12 = stdDateFormat2.isLenient();
        boolean boolean14 = stdDateFormat2.looksLikeISO8601("\u0e21\u0e04. 2513");
        boolean boolean15 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = stdDateFormat2._formatPlain;
        boolean boolean18 = stdDateFormat2.looksLikeISO8601("yyyy-MM-dd");
        java.text.DateFormat dateFormat19 = stdDateFormat2._formatISO8601_z;
        java.text.DateFormat dateFormat20 = stdDateFormat2._formatRFC1123;
        java.text.NumberFormat numberFormat21 = stdDateFormat2.getNumberFormat();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNotNull(numberFormat21);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.lang.String str16 = dateFormat14.format((java.lang.Object) 10L);
        dateFormat14.setLenient(true);
        dateFormat14.setLenient(true);
        java.util.Calendar calendar21 = dateFormat14.getCalendar();
        java.lang.String str23 = dateFormat14.format((java.lang.Object) (short) -1);
        stdDateFormat2._formatISO8601 = dateFormat14;
        java.text.DateFormat dateFormat25 = stdDateFormat2._formatRFC1123;
        boolean boolean27 = stdDateFormat2.looksLikeISO8601("hi!");
        boolean boolean29 = stdDateFormat2.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)");
        stdDateFormat2._lenient = true;
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getTimeInstance();
        java.lang.String str36 = dateFormat34.format((java.lang.Object) 10L);
        dateFormat34.setLenient(true);
        dateFormat34.setLenient(true);
        java.util.Calendar calendar41 = dateFormat34.getCalendar();
        dateFormat32.setCalendar(calendar41);
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat45 = dateFormat44.getNumberFormat();
        dateFormat43.setNumberFormat(numberFormat45);
        dateFormat32.setNumberFormat(numberFormat45);
        stdDateFormat2.setNumberFormat(numberFormat45);
        java.util.Calendar calendar49 = stdDateFormat2.getCalendar();
        java.util.TimeZone timeZone50 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat51 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat52 = null;
        stdDateFormat2._formatISO8601 = dateFormat52;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "07:00:00" + "'", str16, "07:00:00");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "06:59:59" + "'", str23, "06:59:59");
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(numberFormat33);
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "07:00:00" + "'", str36, "07:00:00");
        org.junit.Assert.assertNotNull(calendar41);
        org.junit.Assert.assertEquals(calendar41.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat43);
        org.junit.Assert.assertNotNull(dateFormat44);
        org.junit.Assert.assertNotNull(numberFormat45);
        org.junit.Assert.assertNull(calendar49);
        org.junit.Assert.assertNull(timeZone50);
        org.junit.Assert.assertNull(dateFormat51);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        boolean boolean13 = stdDateFormat2.looksLikeISO8601("");
        java.lang.Boolean boolean14 = stdDateFormat2._lenient;
        boolean boolean16 = stdDateFormat2.looksLikeISO8601("yyyy-MM-dd");
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance((int) (short) 0);
        stdDateFormat2._formatISO8601_z = dateFormat18;
        java.text.ParsePosition parsePosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = dateFormat18.parseObject("yyyy-MM-dd", parsePosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateFormat18);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat2._formatISO8601 = dateFormat11;
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601_z;
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatPlain;
        java.util.TimeZone timeZone15 = stdDateFormat2.getTimeZone();
        java.text.NumberFormat numberFormat16 = stdDateFormat2.getNumberFormat();
        java.util.TimeZone timeZone17 = null;
        java.util.Locale locale18 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone17, locale18);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        stdDateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat19._lenient = false;
        java.text.DateFormat dateFormat25 = stdDateFormat19._formatISO8601_z;
        boolean boolean27 = stdDateFormat19.looksLikeISO8601("07:00:00");
        java.text.DateFormat dateFormat28 = stdDateFormat19._formatISO8601_z;
        boolean boolean29 = stdDateFormat19.isLenient();
        java.util.Locale locale30 = stdDateFormat19._locale;
        java.util.TimeZone timeZone31 = null;
        java.util.Locale locale32 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone31, locale32);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat35 = dateFormat34.getNumberFormat();
        stdDateFormat33.setNumberFormat(numberFormat35);
        java.lang.String str37 = stdDateFormat33.toString();
        java.lang.String str38 = stdDateFormat33.toString();
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat33._formatISO8601 = dateFormat39;
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean43 = dateFormat41.equals((java.lang.Object) 10L);
        java.util.Calendar calendar44 = dateFormat41.getCalendar();
        stdDateFormat33.setCalendar(calendar44);
        stdDateFormat19.setCalendar(calendar44);
        stdDateFormat2.setCalendar(calendar44);
        java.text.DateFormat dateFormat48 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat49 = stdDateFormat2._formatPlain;
        stdDateFormat2._lenient = true;
        java.text.DateFormat dateFormat52 = stdDateFormat2._formatISO8601;
        java.util.TimeZone timeZone53 = stdDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition55 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = stdDateFormat2.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(dateFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(locale30);
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str37, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str38, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat39);
        org.junit.Assert.assertNotNull(dateFormat41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(calendar44);
// flaky "21) test5118(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNull(dateFormat48);
        org.junit.Assert.assertNull(dateFormat49);
        org.junit.Assert.assertNotNull(dateFormat52);
        org.junit.Assert.assertNull(timeZone53);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone10 = stdDateFormat2._timezone;
        stdDateFormat2._clearFormats();
        boolean boolean12 = stdDateFormat2.isLenient();
        boolean boolean14 = stdDateFormat2.looksLikeISO8601("\u0e21\u0e04. 2513");
        stdDateFormat2._clearFormats();
        java.util.Locale locale16 = stdDateFormat2._locale;
        java.lang.Class<?> wildcardClass17 = stdDateFormat2.getClass();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        java.lang.String str26 = stdDateFormat2.toString();
        java.util.TimeZone timeZone27 = stdDateFormat2._timezone;
        java.util.Calendar calendar28 = stdDateFormat2.getCalendar();
        java.text.DateFormat dateFormat29 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat30 = stdDateFormat2._formatRFC1123;
        java.lang.String str31 = stdDateFormat2.toString();
        java.util.Calendar calendar32 = stdDateFormat2.getCalendar();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str26, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone27);
        org.junit.Assert.assertNull(calendar28);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str31, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(calendar32);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone8 = stdDateFormat2._timezone;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("yyyy-MM-dd");
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getTimeInstance();
        java.lang.String str13 = dateFormat11.format((java.lang.Object) 10L);
        boolean boolean15 = dateFormat11.equals((java.lang.Object) 0);
        java.util.Calendar calendar16 = dateFormat11.getCalendar();
        stdDateFormat2.setCalendar(calendar16);
        java.util.Calendar calendar18 = stdDateFormat2.getCalendar();
        stdDateFormat2._lenient = true;
        java.lang.Class<?> wildcardClass21 = stdDateFormat2.getClass();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "07:00:00" + "'", str13, "07:00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(calendar16);
        org.junit.Assert.assertEquals(calendar16.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar18);
        org.junit.Assert.assertEquals(calendar18.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.lang.String str7 = stdDateFormat2.toString();
        java.util.Calendar calendar8 = null;
        stdDateFormat2.setCalendar(calendar8);
        java.text.DateFormat dateFormat10 = stdDateFormat2._formatPlain;
        java.lang.Boolean boolean11 = stdDateFormat2._lenient;
        boolean boolean13 = stdDateFormat2.looksLikeISO8601("1970-01-01");
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = stdDateFormat2.parseAsRFC1123("2513-01-01", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        boolean boolean13 = stdDateFormat2.looksLikeISO8601("");
        java.util.Locale locale14 = stdDateFormat2._locale;
        boolean boolean15 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = stdDateFormat2._formatRFC1123;
        boolean boolean18 = stdDateFormat2.looksLikeISO8601("yyyy-MM-dd");
        java.lang.String str19 = stdDateFormat2.toString();
        java.lang.Boolean boolean20 = stdDateFormat2._lenient;
        java.lang.Object obj21 = null;
        boolean boolean22 = stdDateFormat2.equals(obj21);
        java.text.DateFormat dateFormat23 = stdDateFormat2._formatISO8601;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str19, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(dateFormat23);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.text.DateFormat dateFormat11 = stdDateFormat2._formatRFC1123;
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat2.withLocale(locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dateFormat11);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        java.text.NumberFormat numberFormat26 = stdDateFormat2.getNumberFormat();
        java.text.DateFormat dateFormat27 = stdDateFormat2._formatRFC1123;
        boolean boolean28 = stdDateFormat2.isLenient();
        java.util.TimeZone timeZone29 = stdDateFormat2.getTimeZone();
        java.util.TimeZone timeZone30 = stdDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date33 = stdDateFormat2.parse("", parsePosition32);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(timeZone29);
        org.junit.Assert.assertNull(timeZone30);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatPlain;
        boolean boolean8 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat9 = stdDateFormat2._formatISO8601;
        java.util.Calendar calendar10 = stdDateFormat2.getCalendar();
        java.util.TimeZone timeZone11 = null;
        java.util.Locale locale12 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone11, locale12);
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        stdDateFormat13.setNumberFormat(numberFormat15);
        stdDateFormat13._lenient = false;
        stdDateFormat13._lenient = false;
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat13._formatPlain = dateFormat23;
        boolean boolean25 = stdDateFormat13.isLenient();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance(1);
        dateFormat27.setLenient(true);
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str32 = dateFormat30.format((java.lang.Object) 100.0f);
        boolean boolean33 = dateFormat27.equals((java.lang.Object) dateFormat30);
        stdDateFormat13._formatRFC1123 = dateFormat30;
        boolean boolean36 = stdDateFormat13.looksLikeISO8601("");
        java.lang.String str37 = stdDateFormat13.toString();
        java.util.TimeZone timeZone38 = stdDateFormat13._timezone;
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat40 = dateFormat39.getNumberFormat();
        stdDateFormat13._formatPlain = dateFormat39;
        java.text.DateFormat dateFormat42 = stdDateFormat13._formatPlain;
        java.lang.Boolean boolean43 = stdDateFormat13._lenient;
        java.lang.String str44 = stdDateFormat13.toString();
        java.util.Date date46 = stdDateFormat13.parse("2513-01-01");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = stdDateFormat2.format(date46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(calendar10);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2513-01-01" + "'", str32, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str37, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone38);
        org.junit.Assert.assertNotNull(dateFormat39);
        org.junit.Assert.assertNotNull(numberFormat40);
        org.junit.Assert.assertNotNull(dateFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str44, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.text.DateFormat dateFormat11 = stdDateFormat2._formatISO8601_z;
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean14 = dateFormat12.equals((java.lang.Object) 10L);
        java.util.Calendar calendar15 = dateFormat12.getCalendar();
        stdDateFormat2._formatRFC1123 = dateFormat12;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 1);
        java.util.Calendar calendar19 = dateFormat18.getCalendar();
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean22 = dateFormat20.equals((java.lang.Object) 10L);
        dateFormat20.setLenient(true);
        java.text.NumberFormat numberFormat25 = null;
        dateFormat20.setNumberFormat(numberFormat25);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat28);
        dateFormat18.setNumberFormat(numberFormat28);
        stdDateFormat2._formatISO8601_z = dateFormat18;
        stdDateFormat2._clearFormats();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(calendar15);
// flaky "22) test5127(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(calendar19);
// flaky "2) test5127(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar19.toString(), "sun.util.BuddhistCalendar[time=-734417773542,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=46,MILLISECOND=458,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean7 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone8 = stdDateFormat2.getTimeZone();
        java.util.TimeZone timeZone9 = stdDateFormat2._timezone;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, 1);
        stdDateFormat2._formatISO8601 = dateFormat12;
        java.lang.Boolean boolean14 = stdDateFormat2._lenient;
        java.text.DateFormat dateFormat15 = stdDateFormat2._formatRFC1123;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(timeZone8);
        org.junit.Assert.assertNull(timeZone9);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(dateFormat15);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        java.lang.String str11 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601_z;
        java.util.TimeZone timeZone14 = stdDateFormat2._timezone;
        java.util.TimeZone timeZone15 = null;
        java.util.Locale locale16 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15, locale16);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        stdDateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat17._lenient = false;
        stdDateFormat17._lenient = false;
        java.util.TimeZone timeZone25 = stdDateFormat17._timezone;
        stdDateFormat17._clearFormats();
        boolean boolean27 = stdDateFormat17.isLenient();
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance();
        java.lang.String str30 = dateFormat28.format((java.lang.Object) 10L);
        java.util.Calendar calendar31 = dateFormat28.getCalendar();
        java.lang.Object obj33 = dateFormat28.parseObject("07:00:00");
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean36 = dateFormat34.equals((java.lang.Object) 10L);
        java.util.Calendar calendar37 = dateFormat34.getCalendar();
        dateFormat28.setCalendar(calendar37);
        stdDateFormat17.setCalendar(calendar37);
        stdDateFormat2.setCalendar(calendar37);
        java.util.TimeZone timeZone41 = null;
        java.util.Locale locale42 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat43 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone41, locale42);
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat45 = dateFormat44.getNumberFormat();
        stdDateFormat43.setNumberFormat(numberFormat45);
        java.text.DateFormat dateFormat47 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat48 = dateFormat47.getNumberFormat();
        stdDateFormat43.setNumberFormat(numberFormat48);
        java.util.TimeZone timeZone50 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat51 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone50);
        java.text.DateFormat dateFormat52 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone50);
        stdDateFormat43.setTimeZone(timeZone50);
        java.util.Locale locale54 = stdDateFormat43._locale;
        stdDateFormat43._clearFormats();
        java.util.TimeZone timeZone56 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat57 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone56);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat58 = stdDateFormat43.withTimeZone(timeZone56);
        java.util.TimeZone timeZone59 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat60 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone59);
        stdDateFormat43.setTimeZone(timeZone59);
        java.util.Calendar calendar62 = stdDateFormat43.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator63 = stdDateFormat2.formatToCharacterIterator((java.lang.Object) stdDateFormat43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNull(timeZone14);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNull(timeZone25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "07:00:00" + "'", str30, "07:00:00");
        org.junit.Assert.assertNotNull(calendar31);
        org.junit.Assert.assertEquals(calendar31.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(calendar37);
// flaky "23) test5129(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar37.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateFormat44);
        org.junit.Assert.assertNotNull(numberFormat45);
        org.junit.Assert.assertNotNull(dateFormat47);
        org.junit.Assert.assertNotNull(numberFormat48);
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat51);
        org.junit.Assert.assertNotNull(dateFormat52);
        org.junit.Assert.assertNull(locale54);
        org.junit.Assert.assertNotNull(timeZone56);
        org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat57);
        org.junit.Assert.assertNotNull(stdDateFormat58);
        org.junit.Assert.assertNotNull(timeZone59);
        org.junit.Assert.assertEquals(timeZone59.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat60);
        org.junit.Assert.assertNull(calendar62);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatPlain;
        boolean boolean8 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat9 = stdDateFormat2._formatISO8601;
        java.util.Calendar calendar10 = stdDateFormat2.getCalendar();
        boolean boolean11 = stdDateFormat2.isLenient();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(calendar10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.util.Locale locale15 = stdDateFormat2._locale;
        java.util.TimeZone timeZone16 = stdDateFormat2._timezone;
        java.lang.Boolean boolean17 = stdDateFormat2._lenient;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(timeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.lang.String str16 = dateFormat14.format((java.lang.Object) 10L);
        dateFormat14.setLenient(true);
        dateFormat14.setLenient(true);
        java.util.Calendar calendar21 = dateFormat14.getCalendar();
        java.lang.String str23 = dateFormat14.format((java.lang.Object) (short) -1);
        stdDateFormat2._formatISO8601 = dateFormat14;
        java.text.DateFormat dateFormat25 = stdDateFormat2._formatRFC1123;
        boolean boolean26 = stdDateFormat2.isLenient();
        java.util.TimeZone timeZone27 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat28 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean29 = stdDateFormat2._lenient;
        boolean boolean31 = stdDateFormat2.looksLikeISO8601("hi!");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "07:00:00" + "'", str16, "07:00:00");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "06:59:59" + "'", str23, "06:59:59");
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(timeZone27);
        org.junit.Assert.assertNull(dateFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat2._formatISO8601 = dateFormat11;
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601_z;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.util.Locale locale15 = stdDateFormat2._locale;
        java.util.TimeZone timeZone16 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        java.lang.String str21 = stdDateFormat2.toString();
        java.text.NumberFormat numberFormat22 = stdDateFormat2.getNumberFormat();
        stdDateFormat2._lenient = false;
        boolean boolean25 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat26 = stdDateFormat2._formatISO8601_z;
        java.lang.Boolean boolean27 = stdDateFormat2._lenient;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(timeZone16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str21, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.lang.Boolean boolean10 = stdDateFormat2._lenient;
        java.lang.String str11 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat2._formatISO8601;
        java.lang.String str13 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateInstance();
        java.util.Calendar calendar15 = dateFormat14.getCalendar();
        dateFormat14.setLenient(false);
        stdDateFormat2._formatISO8601 = dateFormat14;
        java.lang.Boolean boolean19 = stdDateFormat2._lenient;
        java.text.DateFormat dateFormat20 = stdDateFormat2._formatISO8601;
        java.text.ParsePosition parsePosition22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date24 = stdDateFormat2.parseAsISO8601("", parsePosition22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(calendar15);
// flaky "24) test5134(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar15.toString(), "sun.util.BuddhistCalendar[time=-734417773495,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=46,MILLISECOND=505,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateFormat20);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.util.TimeZone timeZone7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat2._timezone = timeZone7;
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat2.withTimeZone(timeZone9);
        java.util.TimeZone timeZone11 = null;
        java.util.Locale locale12 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone11, locale12);
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        stdDateFormat13.setNumberFormat(numberFormat15);
        stdDateFormat13._lenient = false;
        stdDateFormat13._lenient = false;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat13._formatISO8601 = dateFormat22;
        java.text.DateFormat dateFormat24 = stdDateFormat13._formatISO8601_z;
        java.text.DateFormat dateFormat25 = stdDateFormat13._formatPlain;
        java.util.TimeZone timeZone26 = stdDateFormat13.getTimeZone();
        java.text.NumberFormat numberFormat27 = stdDateFormat13.getNumberFormat();
        java.util.TimeZone timeZone28 = null;
        java.util.Locale locale29 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone28, locale29);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        stdDateFormat30.setNumberFormat(numberFormat32);
        stdDateFormat30._lenient = false;
        java.text.DateFormat dateFormat36 = stdDateFormat30._formatISO8601_z;
        boolean boolean38 = stdDateFormat30.looksLikeISO8601("07:00:00");
        java.text.DateFormat dateFormat39 = stdDateFormat30._formatISO8601_z;
        boolean boolean40 = stdDateFormat30.isLenient();
        java.util.Locale locale41 = stdDateFormat30._locale;
        java.util.TimeZone timeZone42 = null;
        java.util.Locale locale43 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat44 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone42, locale43);
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat46 = dateFormat45.getNumberFormat();
        stdDateFormat44.setNumberFormat(numberFormat46);
        java.lang.String str48 = stdDateFormat44.toString();
        java.lang.String str49 = stdDateFormat44.toString();
        java.text.DateFormat dateFormat50 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat44._formatISO8601 = dateFormat50;
        java.text.DateFormat dateFormat52 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean54 = dateFormat52.equals((java.lang.Object) 10L);
        java.util.Calendar calendar55 = dateFormat52.getCalendar();
        stdDateFormat44.setCalendar(calendar55);
        stdDateFormat30.setCalendar(calendar55);
        stdDateFormat13.setCalendar(calendar55);
        stdDateFormat2.setCalendar(calendar55);
        java.lang.String str60 = stdDateFormat2.toString();
        boolean boolean61 = stdDateFormat2.isLenient();
        boolean boolean62 = stdDateFormat2.isLenient();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(stdDateFormat10);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNull(dateFormat24);
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertNull(timeZone26);
        org.junit.Assert.assertNotNull(numberFormat27);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNull(dateFormat36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(dateFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(locale41);
        org.junit.Assert.assertNotNull(dateFormat45);
        org.junit.Assert.assertNotNull(numberFormat46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str48, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str49, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat50);
        org.junit.Assert.assertNotNull(dateFormat52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(calendar55);
// flaky "25) test5135(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar55.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)" + "'", str60, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(8, 16, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean7 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone8 = stdDateFormat2.getTimeZone();
        stdDateFormat2._clearFormats();
        java.lang.Boolean boolean10 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat12 = stdDateFormat2._formatISO8601;
        stdDateFormat2._lenient = true;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        java.util.Calendar calendar18 = dateFormat17.getCalendar();
        stdDateFormat2.setCalendar(calendar18);
        java.lang.Class<?> wildcardClass20 = stdDateFormat2.getClass();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(timeZone8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(calendar18);
// flaky "26) test5137(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar18.toString(), "sun.util.BuddhistCalendar[time=-734417773475,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=46,MILLISECOND=525,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone10 = stdDateFormat2._timezone;
        stdDateFormat2._clearFormats();
        boolean boolean12 = stdDateFormat2.isLenient();
        boolean boolean14 = stdDateFormat2.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.util.Locale locale15 = stdDateFormat2._locale;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(locale15);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.lang.String str7 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat2._formatISO8601 = dateFormat8;
        java.text.DateFormat dateFormat10 = stdDateFormat2._formatPlain;
        stdDateFormat2._clearFormats();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNull(dateFormat10);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        stdDateFormat2._clearFormats();
        java.lang.Boolean boolean27 = stdDateFormat2._lenient;
        java.util.Locale locale28 = stdDateFormat2._locale;
        boolean boolean30 = stdDateFormat2.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        stdDateFormat2._clearFormats();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(4, (int) (short) 0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat2._formatISO8601 = dateFormat11;
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601_z;
        java.lang.String str14 = stdDateFormat2.toString();
        java.lang.Boolean boolean15 = stdDateFormat2._lenient;
        boolean boolean16 = stdDateFormat2.isLenient();
        java.util.Calendar calendar17 = null;
        stdDateFormat2.setCalendar(calendar17);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        java.lang.String str26 = dateFormat24.format((java.lang.Object) 10L);
        java.util.Calendar calendar27 = dateFormat24.getCalendar();
        java.lang.Object obj29 = dateFormat24.parseObject("07:00:00");
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance();
        java.lang.String str32 = dateFormat30.format((java.lang.Object) 10L);
        java.util.Calendar calendar33 = dateFormat30.getCalendar();
        java.lang.Object obj35 = dateFormat30.parseObject("07:00:00");
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean38 = dateFormat36.equals((java.lang.Object) 10L);
        java.util.Calendar calendar39 = dateFormat36.getCalendar();
        dateFormat30.setCalendar(calendar39);
        dateFormat24.setCalendar(calendar39);
        stdDateFormat2.setCalendar(calendar39);
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat44 = dateFormat43.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat44);
        java.util.TimeZone timeZone46 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat47 = java.text.DateFormat.getTimeInstance();
        java.lang.String str49 = dateFormat47.format((java.lang.Object) 10L);
        dateFormat47.setLenient(true);
        dateFormat47.setLenient(true);
        java.util.Calendar calendar54 = dateFormat47.getCalendar();
        stdDateFormat2.setCalendar(calendar54);
        java.util.TimeZone timeZone56 = null;
        java.util.Locale locale57 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat58 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone56, locale57);
        java.text.DateFormat dateFormat59 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat60 = dateFormat59.getNumberFormat();
        stdDateFormat58.setNumberFormat(numberFormat60);
        stdDateFormat58._lenient = false;
        stdDateFormat58._lenient = false;
        java.text.DateFormat dateFormat68 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat58._formatPlain = dateFormat68;
        boolean boolean70 = stdDateFormat58.isLenient();
        java.text.DateFormat dateFormat72 = java.text.DateFormat.getDateInstance(1);
        dateFormat72.setLenient(true);
        java.text.DateFormat dateFormat75 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str77 = dateFormat75.format((java.lang.Object) 100.0f);
        boolean boolean78 = dateFormat72.equals((java.lang.Object) dateFormat75);
        stdDateFormat58._formatRFC1123 = dateFormat75;
        boolean boolean81 = stdDateFormat58.looksLikeISO8601("");
        java.lang.String str82 = stdDateFormat58.toString();
        java.util.TimeZone timeZone83 = stdDateFormat58._timezone;
        java.text.DateFormat dateFormat84 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat85 = dateFormat84.getNumberFormat();
        stdDateFormat58._formatPlain = dateFormat84;
        java.text.DateFormat dateFormat87 = stdDateFormat58._formatPlain;
        java.lang.Boolean boolean88 = stdDateFormat58._lenient;
        java.lang.String str89 = stdDateFormat58.toString();
        java.util.Date date91 = stdDateFormat58.parse("2513-01-01");
        java.lang.StringBuffer stringBuffer92 = null;
        java.text.FieldPosition fieldPosition93 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer94 = stdDateFormat2.format(date91, stringBuffer92, fieldPosition93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "07:00:00" + "'", str26, "07:00:00");
        org.junit.Assert.assertNotNull(calendar27);
        org.junit.Assert.assertEquals(calendar27.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "07:00:00" + "'", str32, "07:00:00");
        org.junit.Assert.assertNotNull(calendar33);
        org.junit.Assert.assertEquals(calendar33.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(calendar39);
// flaky "27) test5143(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateFormat43);
        org.junit.Assert.assertNotNull(numberFormat44);
        org.junit.Assert.assertNull(timeZone46);
        org.junit.Assert.assertNotNull(dateFormat47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "07:00:00" + "'", str49, "07:00:00");
        org.junit.Assert.assertNotNull(calendar54);
        org.junit.Assert.assertEquals(calendar54.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat59);
        org.junit.Assert.assertNotNull(numberFormat60);
        org.junit.Assert.assertNotNull(dateFormat68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(dateFormat72);
        org.junit.Assert.assertNotNull(dateFormat75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "2513-01-01" + "'", str77, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str82, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone83);
        org.junit.Assert.assertNotNull(dateFormat84);
        org.junit.Assert.assertNotNull(numberFormat85);
        org.junit.Assert.assertNotNull(dateFormat87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str89, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(date91);
        org.junit.Assert.assertEquals(date91.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        boolean boolean13 = stdDateFormat2.looksLikeISO8601("");
        java.lang.String str14 = stdDateFormat2.toString();
        boolean boolean16 = stdDateFormat2.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance(1);
        dateFormat18.setLenient(true);
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str23 = dateFormat21.format((java.lang.Object) 100.0f);
        boolean boolean24 = dateFormat18.equals((java.lang.Object) dateFormat21);
        stdDateFormat2._formatRFC1123 = dateFormat18;
        boolean boolean26 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat27 = stdDateFormat2._formatISO8601_z;
        java.text.DateFormat dateFormat28 = null;
        stdDateFormat2._formatISO8601_z = dateFormat28;
        java.text.DateFormat dateFormat30 = stdDateFormat2._formatPlain;
        java.util.Locale locale31 = stdDateFormat2._locale;
        stdDateFormat2._clearFormats();
        boolean boolean34 = stdDateFormat2.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.text.DateFormat dateFormat35 = stdDateFormat2._formatPlain;
        boolean boolean36 = stdDateFormat2.isLenient();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2513-01-01" + "'", str23, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(dateFormat27);
        org.junit.Assert.assertNull(dateFormat30);
        org.junit.Assert.assertNull(locale31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(dateFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.util.Locale locale15 = stdDateFormat2._locale;
        boolean boolean16 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat17 = stdDateFormat2._formatRFC1123;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(dateFormat17);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.util.TimeZone timeZone7 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getTimeInstance((int) (byte) 1);
        stdDateFormat2._formatPlain = dateFormat9;
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = stdDateFormat2.parse("\u0e21\u0e04. 2513", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone7);
        org.junit.Assert.assertNotNull(dateFormat9);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        java.text.DateFormat dateFormat26 = stdDateFormat2._formatISO8601_z;
        java.text.DateFormat dateFormat27 = stdDateFormat2._formatISO8601_z;
        java.util.TimeZone timeZone28 = stdDateFormat2.getTimeZone();
        boolean boolean29 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat30 = stdDateFormat2._formatISO8601;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertNull(dateFormat27);
        org.junit.Assert.assertNull(timeZone28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(dateFormat30);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone10 = stdDateFormat2._timezone;
        stdDateFormat2._clearFormats();
        boolean boolean12 = stdDateFormat2.isLenient();
        boolean boolean14 = stdDateFormat2.looksLikeISO8601("\u0e21\u0e04. 2513");
        boolean boolean15 = stdDateFormat2.isLenient();
        java.util.TimeZone timeZone16 = null;
        java.util.Locale locale17 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16, locale17);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        stdDateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat18._lenient = false;
        stdDateFormat18._lenient = false;
        java.util.TimeZone timeZone26 = stdDateFormat18._timezone;
        stdDateFormat18._clearFormats();
        boolean boolean28 = stdDateFormat18.isLenient();
        boolean boolean30 = stdDateFormat18.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.util.TimeZone timeZone31 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat18.setTimeZone(timeZone31);
        java.text.DateFormat dateFormat33 = null;
        stdDateFormat18._formatISO8601_z = dateFormat33;
        java.text.DateFormat dateFormat35 = stdDateFormat18._formatRFC1123;
        java.util.TimeZone timeZone36 = null;
        java.util.Locale locale37 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone36, locale37);
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat40 = dateFormat39.getNumberFormat();
        stdDateFormat38.setNumberFormat(numberFormat40);
        stdDateFormat38._lenient = false;
        java.text.DateFormat dateFormat44 = stdDateFormat38._formatISO8601_z;
        boolean boolean46 = stdDateFormat38.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone47 = stdDateFormat38.getTimeZone();
        boolean boolean49 = stdDateFormat38.looksLikeISO8601("");
        java.util.Locale locale50 = stdDateFormat38._locale;
        boolean boolean52 = stdDateFormat38.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.DateFormat dateFormat53 = java.text.DateFormat.getTimeInstance();
        java.lang.String str55 = dateFormat53.format((java.lang.Object) 10L);
        java.util.Calendar calendar56 = dateFormat53.getCalendar();
        java.text.DateFormat dateFormat57 = java.text.DateFormat.getTimeInstance();
        java.lang.String str59 = dateFormat57.format((java.lang.Object) 10L);
        dateFormat57.setLenient(true);
        java.text.DateFormat dateFormat62 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat63 = dateFormat62.getNumberFormat();
        dateFormat57.setNumberFormat(numberFormat63);
        dateFormat53.setNumberFormat(numberFormat63);
        java.util.Calendar calendar66 = dateFormat53.getCalendar();
        stdDateFormat38.setCalendar(calendar66);
        java.text.DateFormat dateFormat68 = stdDateFormat38._formatRFC1123;
        java.text.DateFormat dateFormat70 = java.text.DateFormat.getTimeInstance((int) (byte) 1);
        java.util.Calendar calendar71 = dateFormat70.getCalendar();
        stdDateFormat38.setCalendar(calendar71);
        stdDateFormat18.setCalendar(calendar71);
        stdDateFormat2.setCalendar(calendar71);
        java.text.NumberFormat numberFormat75 = stdDateFormat2.getNumberFormat();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertNull(timeZone26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNull(dateFormat35);
        org.junit.Assert.assertNotNull(dateFormat39);
        org.junit.Assert.assertNotNull(numberFormat40);
        org.junit.Assert.assertNull(dateFormat44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(timeZone47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(locale50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(dateFormat53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "07:00:00" + "'", str55, "07:00:00");
        org.junit.Assert.assertNotNull(calendar56);
        org.junit.Assert.assertEquals(calendar56.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "07:00:00" + "'", str59, "07:00:00");
        org.junit.Assert.assertNotNull(dateFormat62);
        org.junit.Assert.assertNotNull(numberFormat63);
        org.junit.Assert.assertNotNull(calendar66);
        org.junit.Assert.assertEquals(calendar66.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(dateFormat68);
        org.junit.Assert.assertNotNull(dateFormat70);
        org.junit.Assert.assertNotNull(calendar71);
// flaky "28) test5148(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar71.toString(), "sun.util.BuddhistCalendar[time=-734417773404,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=46,MILLISECOND=596,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat75);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat7);
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9);
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9);
        stdDateFormat2.setTimeZone(timeZone9);
        java.util.Locale locale13 = stdDateFormat2._locale;
        stdDateFormat2._clearFormats();
        java.util.TimeZone timeZone15 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone15);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = stdDateFormat2.withTimeZone(timeZone15);
        java.util.TimeZone timeZone18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone18);
        stdDateFormat2.setTimeZone(timeZone18);
        stdDateFormat2._clearFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date23 = stdDateFormat2.parse("\u0e21\u0e04\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(stdDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat19);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat2._formatISO8601 = dateFormat11;
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601_z;
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatPlain;
        java.util.TimeZone timeZone15 = stdDateFormat2.getTimeZone();
        java.text.NumberFormat numberFormat16 = stdDateFormat2.getNumberFormat();
        java.util.TimeZone timeZone17 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat18 = stdDateFormat2._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNull(timeZone17);
        org.junit.Assert.assertNull(dateFormat18);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        stdDateFormat2._clearFormats();
        java.util.Locale locale15 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat16 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat17 = stdDateFormat2._formatISO8601;
        java.text.DateFormat dateFormat18 = stdDateFormat2._formatISO8601;
        java.lang.Boolean boolean19 = stdDateFormat2._lenient;
        java.text.DateFormat dateFormat20 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat21 = stdDateFormat2._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(dateFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNull(dateFormat21);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        stdDateFormat2._clearFormats();
        java.util.TimeZone timeZone9 = stdDateFormat2._timezone;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(timeZone9);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        java.lang.String str26 = dateFormat24.format((java.lang.Object) 10L);
        java.util.Calendar calendar27 = dateFormat24.getCalendar();
        java.lang.Object obj29 = dateFormat24.parseObject("07:00:00");
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance();
        java.lang.String str32 = dateFormat30.format((java.lang.Object) 10L);
        java.util.Calendar calendar33 = dateFormat30.getCalendar();
        java.lang.Object obj35 = dateFormat30.parseObject("07:00:00");
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean38 = dateFormat36.equals((java.lang.Object) 10L);
        java.util.Calendar calendar39 = dateFormat36.getCalendar();
        dateFormat30.setCalendar(calendar39);
        dateFormat24.setCalendar(calendar39);
        stdDateFormat2.setCalendar(calendar39);
        java.util.Locale locale43 = stdDateFormat2._locale;
        boolean boolean45 = stdDateFormat2.looksLikeISO8601("hi!");
        stdDateFormat2._lenient = false;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "07:00:00" + "'", str26, "07:00:00");
        org.junit.Assert.assertNotNull(calendar27);
        org.junit.Assert.assertEquals(calendar27.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "07:00:00" + "'", str32, "07:00:00");
        org.junit.Assert.assertNotNull(calendar33);
        org.junit.Assert.assertEquals(calendar33.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(calendar39);
// flaky "29) test5153(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNull(locale43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat2._formatISO8601 = dateFormat11;
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601_z;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.util.Locale locale15 = stdDateFormat2._locale;
        java.util.TimeZone timeZone16 = stdDateFormat2.getTimeZone();
        java.util.TimeZone timeZone17 = stdDateFormat2._timezone;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(timeZone16);
        org.junit.Assert.assertNull(timeZone17);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        java.lang.String str11 = stdDateFormat2.toString();
        stdDateFormat2._clearFormats();
        boolean boolean13 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatISO8601;
        java.text.DateFormat dateFormat15 = stdDateFormat2._formatISO8601_z;
        java.lang.Boolean boolean16 = stdDateFormat2._lenient;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        stdDateFormat2._clearFormats();
        stdDateFormat2._clearFormats();
        stdDateFormat2._lenient = false;
        boolean boolean18 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat19 = stdDateFormat2._formatISO8601_z;
        java.text.DateFormat dateFormat20 = stdDateFormat2._formatRFC1123;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(dateFormat20);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat2._formatISO8601 = dateFormat11;
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601_z;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.util.Locale locale15 = stdDateFormat2._locale;
        java.util.Locale locale16 = stdDateFormat2._locale;
        boolean boolean17 = stdDateFormat2.isLenient();
        stdDateFormat2._clearFormats();
        java.util.Locale locale19 = stdDateFormat2._locale;
        java.lang.Boolean boolean20 = stdDateFormat2._lenient;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance();
        java.lang.String str4 = dateFormat2.format((java.lang.Object) 10L);
        dateFormat2.setLenient(true);
        dateFormat2.setLenient(true);
        java.util.Calendar calendar9 = dateFormat2.getCalendar();
        dateFormat0.setCalendar(calendar9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        dateFormat11.setNumberFormat(numberFormat13);
        dateFormat0.setNumberFormat(numberFormat13);
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.lang.String str20 = dateFormat18.format((java.lang.Object) 10L);
        dateFormat18.setLenient(true);
        dateFormat18.setLenient(true);
        java.util.Calendar calendar25 = dateFormat18.getCalendar();
        dateFormat16.setCalendar(calendar25);
        dateFormat0.setCalendar(calendar25);
        java.util.TimeZone timeZone28 = null;
        java.util.Locale locale29 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone28, locale29);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        stdDateFormat30.setNumberFormat(numberFormat32);
        stdDateFormat30._lenient = false;
        stdDateFormat30._lenient = false;
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat30._formatPlain = dateFormat40;
        boolean boolean42 = stdDateFormat30.isLenient();
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getDateInstance(1);
        dateFormat44.setLenient(true);
        java.text.DateFormat dateFormat47 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str49 = dateFormat47.format((java.lang.Object) 100.0f);
        boolean boolean50 = dateFormat44.equals((java.lang.Object) dateFormat47);
        stdDateFormat30._formatRFC1123 = dateFormat47;
        java.text.DateFormat dateFormat54 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        java.util.Calendar calendar55 = dateFormat54.getCalendar();
        stdDateFormat30._formatISO8601_z = dateFormat54;
        java.text.DateFormat dateFormat57 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat58 = dateFormat57.getNumberFormat();
        java.text.DateFormat dateFormat59 = java.text.DateFormat.getTimeInstance();
        java.lang.String str61 = dateFormat59.format((java.lang.Object) 10L);
        dateFormat59.setLenient(true);
        dateFormat59.setLenient(true);
        java.util.Calendar calendar66 = dateFormat59.getCalendar();
        dateFormat57.setCalendar(calendar66);
        stdDateFormat30.setCalendar(calendar66);
        java.text.NumberFormat numberFormat69 = stdDateFormat30.getNumberFormat();
        boolean boolean71 = stdDateFormat30.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator72 = dateFormat0.formatToCharacterIterator((java.lang.Object) "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "07:00:00" + "'", str4, "07:00:00");
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "07:00:00" + "'", str20, "07:00:00");
        org.junit.Assert.assertNotNull(calendar25);
        org.junit.Assert.assertEquals(calendar25.toString(), "sun.util.BuddhistCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNotNull(dateFormat40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateFormat44);
        org.junit.Assert.assertNotNull(dateFormat47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "2513-01-01" + "'", str49, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateFormat54);
        org.junit.Assert.assertNotNull(calendar55);
// flaky "30) test5158(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar55.toString(), "sun.util.BuddhistCalendar[time=-734417773338,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=46,MILLISECOND=662,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat57);
        org.junit.Assert.assertNotNull(numberFormat58);
        org.junit.Assert.assertNotNull(dateFormat59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "07:00:00" + "'", str61, "07:00:00");
        org.junit.Assert.assertNotNull(calendar66);
        org.junit.Assert.assertEquals(calendar66.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.util.Locale locale7 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateInstance(1);
        dateFormat9.setLenient(true);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str14 = dateFormat12.format((java.lang.Object) 100.0f);
        boolean boolean15 = dateFormat9.equals((java.lang.Object) dateFormat12);
        stdDateFormat2._formatRFC1123 = dateFormat9;
        boolean boolean18 = stdDateFormat2.looksLikeISO8601("\u0e21\u0e04. 2513");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date20 = stdDateFormat2.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2513-01-01" + "'", str14, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat2._formatISO8601 = dateFormat11;
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601_z;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.util.Locale locale15 = stdDateFormat2._locale;
        java.util.TimeZone timeZone16 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        java.lang.String str21 = stdDateFormat2.toString();
        java.util.Locale locale22 = stdDateFormat2._locale;
        boolean boolean24 = stdDateFormat2.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(timeZone16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str21, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.util.TimeZone timeZone11 = null;
        java.util.Locale locale12 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone11, locale12);
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        stdDateFormat13.setNumberFormat(numberFormat15);
        stdDateFormat13._lenient = false;
        stdDateFormat13._lenient = false;
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat13._formatPlain = dateFormat23;
        boolean boolean25 = stdDateFormat13.isLenient();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance(1);
        dateFormat27.setLenient(true);
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str32 = dateFormat30.format((java.lang.Object) 100.0f);
        boolean boolean33 = dateFormat27.equals((java.lang.Object) dateFormat30);
        stdDateFormat13._formatRFC1123 = dateFormat30;
        boolean boolean36 = stdDateFormat13.looksLikeISO8601("");
        java.lang.String str37 = stdDateFormat13.toString();
        java.util.TimeZone timeZone38 = stdDateFormat13._timezone;
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat40 = dateFormat39.getNumberFormat();
        stdDateFormat13._formatPlain = dateFormat39;
        java.text.DateFormat dateFormat42 = stdDateFormat13._formatPlain;
        java.lang.Boolean boolean43 = stdDateFormat13._lenient;
        java.lang.String str44 = stdDateFormat13.toString();
        java.util.Date date46 = stdDateFormat13.parse("2513-01-01");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = stdDateFormat2.format(date46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2513-01-01" + "'", str32, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str37, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone38);
        org.junit.Assert.assertNotNull(dateFormat39);
        org.junit.Assert.assertNotNull(numberFormat40);
        org.junit.Assert.assertNotNull(dateFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str44, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.lang.String str7 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat2._formatISO8601 = dateFormat8;
        java.text.NumberFormat numberFormat10 = stdDateFormat2.getNumberFormat();
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        stdDateFormat2._lenient = false;
        java.lang.String str14 = stdDateFormat2.toString();
        java.util.TimeZone timeZone15 = stdDateFormat2.getTimeZone();
        java.lang.String str16 = stdDateFormat2.toString();
        java.util.TimeZone timeZone17 = stdDateFormat2._timezone;
        java.lang.Class<?> wildcardClass18 = stdDateFormat2.getClass();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str16, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        stdDateFormat2._lenient = false;
        java.util.Locale locale26 = stdDateFormat2._locale;
        java.util.TimeZone timeZone27 = stdDateFormat2._timezone;
        java.util.TimeZone timeZone28 = stdDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = stdDateFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(locale26);
        org.junit.Assert.assertNull(timeZone27);
        org.junit.Assert.assertNull(timeZone28);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        java.lang.String str26 = stdDateFormat2.toString();
        java.util.Locale locale27 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat28 = stdDateFormat2._formatISO8601;
        java.text.DateFormat dateFormat29 = null;
        stdDateFormat2._formatISO8601_z = dateFormat29;
        stdDateFormat2._lenient = false;
        stdDateFormat2._clearFormats();
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone36 = null;
        java.util.Locale locale37 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone36, locale37);
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat40 = dateFormat39.getNumberFormat();
        stdDateFormat38.setNumberFormat(numberFormat40);
        stdDateFormat38._lenient = false;
        stdDateFormat38._lenient = false;
        java.util.TimeZone timeZone46 = stdDateFormat38._timezone;
        boolean boolean47 = stdDateFormat38.isLenient();
        java.text.DateFormat dateFormat48 = stdDateFormat38._formatISO8601_z;
        boolean boolean49 = stdDateFormat38.isLenient();
        java.util.TimeZone timeZone50 = stdDateFormat38._timezone;
        stdDateFormat38._lenient = true;
        java.text.NumberFormat numberFormat53 = stdDateFormat38.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = stdDateFormat2.format((java.lang.Object) numberFormat53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str26, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertNull(dateFormat28);
        org.junit.Assert.assertNotNull(dateFormat39);
        org.junit.Assert.assertNotNull(numberFormat40);
        org.junit.Assert.assertNull(timeZone46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(dateFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(timeZone50);
        org.junit.Assert.assertNotNull(numberFormat53);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        java.util.Calendar calendar12 = stdDateFormat2.getCalendar();
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        java.util.Calendar calendar17 = dateFormat16.getCalendar();
        java.text.NumberFormat numberFormat18 = dateFormat16.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat18);
        java.text.NumberFormat numberFormat20 = stdDateFormat2.getNumberFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat21.setLenient(true);
        java.text.AttributedCharacterIterator attributedCharacterIterator26 = dateFormat21.formatToCharacterIterator((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator27 = numberFormat20.formatToCharacterIterator((java.lang.Object) dateFormat21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNull(calendar12);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "31) test5165(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar17.toString(), "sun.util.BuddhistCalendar[time=-734417773290,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=46,MILLISECOND=710,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNotNull(attributedCharacterIterator26);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean7 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone8 = stdDateFormat2.getTimeZone();
        stdDateFormat2._clearFormats();
        java.lang.Boolean boolean10 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat12 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatRFC1123;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(timeZone8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNull(dateFormat13);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat9 = stdDateFormat2._formatRFC1123;
        java.util.TimeZone timeZone10 = stdDateFormat2._timezone;
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat15 = null;
        stdDateFormat2._formatRFC1123 = dateFormat15;
        java.text.DateFormat dateFormat17 = stdDateFormat2._formatISO8601_z;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNull(dateFormat17);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean7 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone8 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat9 = stdDateFormat2._formatPlain;
        boolean boolean10 = stdDateFormat2.isLenient();
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance();
        java.lang.String str15 = dateFormat13.format((java.lang.Object) 100.0d);
        stdDateFormat2._formatRFC1123 = dateFormat13;
        boolean boolean17 = stdDateFormat2.isLenient();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(timeZone8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateFormat13);
// flaky "32) test5168(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u0e21\u0e04. 2513" + "'", str15, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        stdDateFormat2._clearFormats();
        java.lang.Boolean boolean27 = stdDateFormat2._lenient;
        stdDateFormat2._lenient = false;
        java.util.Locale locale30 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat31 = stdDateFormat2._formatPlain;
        boolean boolean32 = stdDateFormat2.isLenient();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(locale30);
        org.junit.Assert.assertNull(dateFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        boolean boolean13 = stdDateFormat2.looksLikeISO8601("");
        java.util.Locale locale14 = stdDateFormat2._locale;
        boolean boolean15 = stdDateFormat2.isLenient();
        java.util.TimeZone timeZone16 = stdDateFormat2.getTimeZone();
        java.text.NumberFormat numberFormat17 = stdDateFormat2.getNumberFormat();
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean20 = dateFormat18.equals((java.lang.Object) 10L);
        java.util.Calendar calendar21 = dateFormat18.getCalendar();
        stdDateFormat2.setCalendar(calendar21);
        java.text.DateFormat dateFormat23 = stdDateFormat2._formatPlain;
        java.text.ParsePosition parsePosition25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = stdDateFormat2.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition25, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(timeZone16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(calendar21);
// flaky "33) test5170(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNull(dateFormat23);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) 1);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator5 = dateFormat3.formatToCharacterIterator((java.lang.Object) 10.0f);
        java.util.TimeZone timeZone6 = null;
        java.util.Locale locale7 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6, locale7);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        stdDateFormat8.setNumberFormat(numberFormat10);
        stdDateFormat8._lenient = false;
        java.text.DateFormat dateFormat14 = stdDateFormat8._formatISO8601_z;
        boolean boolean16 = stdDateFormat8.looksLikeISO8601("07:00:00");
        java.text.DateFormat dateFormat17 = stdDateFormat8._formatISO8601_z;
        boolean boolean18 = stdDateFormat8.isLenient();
        java.util.Locale locale19 = stdDateFormat8._locale;
        java.text.DateFormat dateFormat20 = stdDateFormat8._formatPlain;
        boolean boolean21 = dateFormat3.equals((java.lang.Object) stdDateFormat8);
        java.text.NumberFormat numberFormat22 = stdDateFormat8.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat22);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "34) test5171(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734417773252,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=46,MILLISECOND=748,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(attributedCharacterIterator5);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(numberFormat22);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(100, (int) (byte) 1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        java.util.Calendar calendar12 = stdDateFormat2.getCalendar();
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601;
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatISO8601;
        java.util.TimeZone timeZone15 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.lang.String str18 = dateFormat16.format((java.lang.Object) 10L);
        dateFormat16.setLenient(true);
        dateFormat16.setLenient(true);
        java.util.Calendar calendar23 = dateFormat16.getCalendar();
        stdDateFormat2.setCalendar(calendar23);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNull(calendar12);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "07:00:00" + "'", str18, "07:00:00");
        org.junit.Assert.assertNotNull(calendar23);
        org.junit.Assert.assertEquals(calendar23.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone10 = stdDateFormat2._timezone;
        stdDateFormat2._clearFormats();
        boolean boolean12 = stdDateFormat2.isLenient();
        boolean boolean14 = stdDateFormat2.looksLikeISO8601("\u0e21\u0e04. 2513");
        stdDateFormat2._clearFormats();
        java.text.DateFormat dateFormat16 = stdDateFormat2._formatPlain;
        java.util.Locale locale17 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat18 = stdDateFormat2._formatPlain;
        java.lang.Boolean boolean19 = stdDateFormat2._lenient;
        java.lang.String str20 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat21 = stdDateFormat2._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNull(dateFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str20, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(dateFormat21);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.util.TimeZone timeZone7 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat9 = stdDateFormat2._formatRFC1123;
        stdDateFormat2._lenient = false;
        boolean boolean12 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601;
        java.text.NumberFormat numberFormat14 = stdDateFormat2.getNumberFormat();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNotNull(numberFormat14);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        stdDateFormat2._clearFormats();
        java.util.Locale locale15 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat16 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat17 = stdDateFormat2._formatPlain;
        java.util.TimeZone timeZone18 = null;
        java.util.Locale locale19 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18, locale19);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        stdDateFormat20.setNumberFormat(numberFormat22);
        java.lang.String str24 = stdDateFormat20.toString();
        java.lang.String str25 = stdDateFormat20.toString();
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat20._formatISO8601 = dateFormat26;
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean30 = dateFormat28.equals((java.lang.Object) 10L);
        java.util.Calendar calendar31 = dateFormat28.getCalendar();
        stdDateFormat20.setCalendar(calendar31);
        stdDateFormat2.setCalendar(calendar31);
        java.util.TimeZone timeZone34 = null;
        java.util.Locale locale35 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone34, locale35);
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat38 = dateFormat37.getNumberFormat();
        stdDateFormat36.setNumberFormat(numberFormat38);
        stdDateFormat36._lenient = false;
        java.text.DateFormat dateFormat42 = stdDateFormat36._formatISO8601_z;
        boolean boolean44 = stdDateFormat36.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone45 = stdDateFormat36.getTimeZone();
        boolean boolean47 = stdDateFormat36.looksLikeISO8601("");
        java.text.DateFormat dateFormat48 = stdDateFormat36._formatISO8601_z;
        java.util.Locale locale49 = stdDateFormat36._locale;
        java.text.DateFormat dateFormat50 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat51 = dateFormat50.getNumberFormat();
        java.text.DateFormat dateFormat52 = java.text.DateFormat.getTimeInstance();
        java.lang.String str54 = dateFormat52.format((java.lang.Object) 10L);
        dateFormat52.setLenient(true);
        dateFormat52.setLenient(true);
        java.util.Calendar calendar59 = dateFormat52.getCalendar();
        dateFormat50.setCalendar(calendar59);
        java.text.DateFormat dateFormat61 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat62 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat63 = dateFormat62.getNumberFormat();
        dateFormat61.setNumberFormat(numberFormat63);
        dateFormat50.setNumberFormat(numberFormat63);
        stdDateFormat36._formatISO8601_z = dateFormat50;
        java.text.DateFormat dateFormat67 = stdDateFormat36._formatISO8601;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str68 = stdDateFormat2.format((java.lang.Object) dateFormat67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str24, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str25, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(calendar31);
// flaky "35) test5176(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar31.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateFormat37);
        org.junit.Assert.assertNotNull(numberFormat38);
        org.junit.Assert.assertNull(dateFormat42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(timeZone45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(dateFormat48);
        org.junit.Assert.assertNull(locale49);
        org.junit.Assert.assertNotNull(dateFormat50);
        org.junit.Assert.assertNotNull(numberFormat51);
        org.junit.Assert.assertNotNull(dateFormat52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "07:00:00" + "'", str54, "07:00:00");
        org.junit.Assert.assertNotNull(calendar59);
        org.junit.Assert.assertEquals(calendar59.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat61);
        org.junit.Assert.assertNotNull(dateFormat62);
        org.junit.Assert.assertNotNull(numberFormat63);
        org.junit.Assert.assertNull(dateFormat67);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatPlain;
        boolean boolean8 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        dateFormat11.setLenient(true);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.lang.String str17 = dateFormat15.format((java.lang.Object) 10L);
        java.util.Calendar calendar18 = dateFormat15.getCalendar();
        dateFormat14.setCalendar(calendar18);
        dateFormat11.setCalendar(calendar18);
        dateFormat9.setCalendar(calendar18);
        stdDateFormat2.setCalendar(calendar18);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance();
        java.lang.String str27 = dateFormat25.format((java.lang.Object) 100.0d);
        java.text.NumberFormat numberFormat28 = dateFormat25.getNumberFormat();
        java.text.AttributedCharacterIterator attributedCharacterIterator30 = dateFormat25.formatToCharacterIterator((java.lang.Object) 1970L);
        java.lang.Object obj32 = null; // flaky "36) test5177(com.fasterxml.jackson.databind.util.RegressionTest10)": dateFormat25.parseObject("\u0e21\u0e04. 2513");
        java.lang.StringBuffer stringBuffer33 = null;
        java.text.FieldPosition fieldPosition34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer35 = stdDateFormat2.format((java.lang.Object) dateFormat25, stringBuffer33, fieldPosition34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "07:00:00" + "'", str17, "07:00:00");
        org.junit.Assert.assertNotNull(calendar18);
        org.junit.Assert.assertEquals(calendar18.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat25);
// flaky "3) test5177(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u0e21\u0e04. 2513" + "'", str27, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertNotNull(attributedCharacterIterator30);
// flaky "1) test5177(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertNotNull(obj32);
// flaky "1) test5177(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(obj32.toString(), "Thu Jan 01 00:00:00 ICT 1970");
// flaky "1) test5177(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "Thu Jan 01 00:00:00 ICT 1970");
// flaky "1) test5177(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.util.TimeZone timeZone7 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatRFC1123;
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat2.setTimeZone(timeZone9);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone9);
// flaky "37) test5178(com.fasterxml.jackson.databind.util.RegressionTest10)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone10 = stdDateFormat2._timezone;
        stdDateFormat2._clearFormats();
        java.util.TimeZone timeZone12 = stdDateFormat2._timezone;
        java.util.Locale locale13 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNull(dateFormat14);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat7);
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9);
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9);
        stdDateFormat2.setTimeZone(timeZone9);
        java.util.Locale locale13 = stdDateFormat2._locale;
        stdDateFormat2._clearFormats();
        java.util.Calendar calendar15 = stdDateFormat2.getCalendar();
        java.util.TimeZone timeZone16 = stdDateFormat2._timezone;
        java.util.TimeZone timeZone17 = stdDateFormat2._timezone;
        java.text.ParsePosition parsePosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date20 = stdDateFormat2.parseAsRFC1123("yyyy-MM-dd", parsePosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNull(calendar15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.util.TimeZone timeZone7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat2._timezone = timeZone7;
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat2.withTimeZone(timeZone9);
        java.util.Calendar calendar11 = stdDateFormat10.getCalendar();
        java.util.TimeZone timeZone12 = stdDateFormat10._timezone;
        java.lang.Object obj13 = null;
        boolean boolean14 = stdDateFormat10.equals(obj13);
        java.text.DateFormat dateFormat15 = stdDateFormat10._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(stdDateFormat10);
        org.junit.Assert.assertNull(calendar11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateFormat15);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        java.util.Calendar calendar27 = dateFormat26.getCalendar();
        stdDateFormat2._formatISO8601_z = dateFormat26;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateTimeInstance(2, 1);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getTimeInstance();
        java.lang.String str34 = dateFormat32.format((java.lang.Object) 10L);
        dateFormat32.setLenient(true);
        dateFormat32.setLenient(true);
        java.util.Calendar calendar39 = dateFormat32.getCalendar();
        dateFormat31.setCalendar(calendar39);
        stdDateFormat2.setCalendar(calendar39);
        java.text.DateFormat dateFormat42 = stdDateFormat2._formatPlain;
        java.util.TimeZone timeZone43 = stdDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date46 = stdDateFormat2.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)", parsePosition45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(calendar27);
// flaky "38) test5182(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar27.toString(), "sun.util.BuddhistCalendar[time=-734417773183,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=46,MILLISECOND=817,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "07:00:00" + "'", str34, "07:00:00");
        org.junit.Assert.assertNotNull(calendar39);
        org.junit.Assert.assertEquals(calendar39.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat42);
        org.junit.Assert.assertNull(timeZone43);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean7 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone8 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat9 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat10 = stdDateFormat2._formatISO8601;
        java.lang.Boolean boolean11 = stdDateFormat2._lenient;
        java.util.Calendar calendar12 = stdDateFormat2.getCalendar();
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = stdDateFormat2.parse("06:59:59", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(timeZone8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(calendar12);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean7 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone8 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat9 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat10 = stdDateFormat2._formatISO8601;
        java.lang.Boolean boolean11 = stdDateFormat2._lenient;
        java.util.Locale locale12 = stdDateFormat2._locale;
        java.lang.String str13 = stdDateFormat2.toString();
        java.lang.Class<?> wildcardClass14 = stdDateFormat2.getClass();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(timeZone8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean7 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone8 = stdDateFormat2.getTimeZone();
        stdDateFormat2._clearFormats();
        java.lang.Boolean boolean10 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat12 = stdDateFormat2._formatISO8601;
        stdDateFormat2._lenient = true;
        java.text.DateFormat dateFormat15 = stdDateFormat2._formatRFC1123;
        boolean boolean17 = stdDateFormat2.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone18 = null;
        java.util.Locale locale19 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18, locale19);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        stdDateFormat20.setNumberFormat(numberFormat22);
        stdDateFormat20._lenient = false;
        stdDateFormat20._lenient = false;
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat20._formatPlain = dateFormat30;
        boolean boolean32 = stdDateFormat20.isLenient();
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance(1);
        dateFormat34.setLenient(true);
        java.text.DateFormat dateFormat37 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str39 = dateFormat37.format((java.lang.Object) 100.0f);
        boolean boolean40 = dateFormat34.equals((java.lang.Object) dateFormat37);
        stdDateFormat20._formatRFC1123 = dateFormat37;
        boolean boolean43 = stdDateFormat20.looksLikeISO8601("");
        java.text.NumberFormat numberFormat44 = stdDateFormat20.getNumberFormat();
        java.text.DateFormat dateFormat45 = stdDateFormat20._formatRFC1123;
        boolean boolean46 = stdDateFormat20.isLenient();
        java.text.DateFormat dateFormat47 = stdDateFormat20._formatISO8601;
        java.lang.StringBuffer stringBuffer48 = null;
        java.text.FieldPosition fieldPosition49 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer50 = stdDateFormat2.format((java.lang.Object) stdDateFormat20, stringBuffer48, fieldPosition49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(timeZone8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(dateFormat37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2513-01-01" + "'", str39, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(numberFormat44);
        org.junit.Assert.assertNotNull(dateFormat45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(dateFormat47);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("2513-01-01");
        java.lang.String str11 = stdDateFormat2.toString();
        java.lang.String str12 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatPlain;
        boolean boolean14 = stdDateFormat2.isLenient();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        boolean boolean13 = stdDateFormat2.looksLikeISO8601("");
        java.lang.Boolean boolean14 = stdDateFormat2._lenient;
        java.text.DateFormat dateFormat15 = stdDateFormat2._formatPlain;
        boolean boolean17 = stdDateFormat2.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        boolean boolean19 = stdDateFormat2.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.util.Locale locale20 = stdDateFormat2._locale;
        boolean boolean21 = stdDateFormat2.isLenient();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(locale20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.lang.String str16 = dateFormat14.format((java.lang.Object) 10L);
        dateFormat14.setLenient(true);
        dateFormat14.setLenient(true);
        java.util.Calendar calendar21 = dateFormat14.getCalendar();
        java.lang.String str23 = dateFormat14.format((java.lang.Object) (short) -1);
        stdDateFormat2._formatISO8601 = dateFormat14;
        java.text.DateFormat dateFormat25 = stdDateFormat2._formatRFC1123;
        boolean boolean26 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat27 = stdDateFormat2._formatPlain;
        java.text.NumberFormat numberFormat28 = stdDateFormat2.getNumberFormat();
        java.lang.Boolean boolean29 = stdDateFormat2._lenient;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "07:00:00" + "'", str16, "07:00:00");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "06:59:59" + "'", str23, "06:59:59");
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        java.text.DateFormat dateFormat26 = stdDateFormat2._formatISO8601_z;
        java.util.Calendar calendar27 = stdDateFormat2.getCalendar();
        boolean boolean28 = stdDateFormat2.isLenient();
        java.util.TimeZone timeZone29 = null;
        java.util.Locale locale30 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone29, locale30);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        stdDateFormat31.setNumberFormat(numberFormat33);
        stdDateFormat31._lenient = false;
        stdDateFormat31._lenient = false;
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat31._formatPlain = dateFormat41;
        boolean boolean43 = stdDateFormat31.isLenient();
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateInstance(1);
        dateFormat45.setLenient(true);
        java.text.DateFormat dateFormat48 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str50 = dateFormat48.format((java.lang.Object) 100.0f);
        boolean boolean51 = dateFormat45.equals((java.lang.Object) dateFormat48);
        stdDateFormat31._formatRFC1123 = dateFormat48;
        boolean boolean54 = stdDateFormat31.looksLikeISO8601("");
        java.lang.String str55 = stdDateFormat31.toString();
        java.util.TimeZone timeZone56 = stdDateFormat31._timezone;
        java.text.DateFormat dateFormat57 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat58 = dateFormat57.getNumberFormat();
        stdDateFormat31._formatPlain = dateFormat57;
        java.text.DateFormat dateFormat60 = stdDateFormat31._formatPlain;
        java.lang.Boolean boolean61 = stdDateFormat31._lenient;
        java.lang.String str62 = stdDateFormat31.toString();
        java.util.Date date64 = stdDateFormat31.parse("2513-01-01");
        java.lang.StringBuffer stringBuffer65 = null;
        java.text.FieldPosition fieldPosition66 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer67 = stdDateFormat2.format(date64, stringBuffer65, fieldPosition66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertNull(calendar27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(numberFormat33);
        org.junit.Assert.assertNotNull(dateFormat41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateFormat45);
        org.junit.Assert.assertNotNull(dateFormat48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "2513-01-01" + "'", str50, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str55, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone56);
        org.junit.Assert.assertNotNull(dateFormat57);
        org.junit.Assert.assertNotNull(numberFormat58);
        org.junit.Assert.assertNotNull(dateFormat60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str62, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        stdDateFormat2._clearFormats();
        java.lang.Boolean boolean15 = stdDateFormat2._lenient;
        java.lang.Boolean boolean16 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone17 = stdDateFormat2._timezone;
        java.util.TimeZone timeZone18 = null;
        java.util.Locale locale19 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18, locale19);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        stdDateFormat20.setNumberFormat(numberFormat22);
        stdDateFormat20._lenient = false;
        stdDateFormat20._lenient = false;
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat20._formatPlain = dateFormat30;
        boolean boolean32 = stdDateFormat20.isLenient();
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance(1);
        dateFormat34.setLenient(true);
        java.text.DateFormat dateFormat37 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str39 = dateFormat37.format((java.lang.Object) 100.0f);
        boolean boolean40 = dateFormat34.equals((java.lang.Object) dateFormat37);
        stdDateFormat20._formatRFC1123 = dateFormat37;
        boolean boolean43 = stdDateFormat20.looksLikeISO8601("");
        java.lang.String str44 = stdDateFormat20.toString();
        java.util.TimeZone timeZone45 = stdDateFormat20._timezone;
        java.text.DateFormat dateFormat46 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat47 = dateFormat46.getNumberFormat();
        stdDateFormat20._formatPlain = dateFormat46;
        java.text.DateFormat dateFormat49 = stdDateFormat20._formatPlain;
        java.lang.Boolean boolean50 = stdDateFormat20._lenient;
        java.lang.String str51 = stdDateFormat20.toString();
        java.util.Date date53 = stdDateFormat20.parse("2513-01-01");
        java.lang.StringBuffer stringBuffer54 = null;
        java.text.FieldPosition fieldPosition55 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer56 = stdDateFormat2.format(date53, stringBuffer54, fieldPosition55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(timeZone17);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(dateFormat37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2513-01-01" + "'", str39, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str44, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone45);
        org.junit.Assert.assertNotNull(dateFormat46);
        org.junit.Assert.assertNotNull(numberFormat47);
        org.junit.Assert.assertNotNull(dateFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str51, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getTimeInstance();
        java.lang.String str9 = dateFormat7.format((java.lang.Object) 10L);
        java.util.Calendar calendar10 = dateFormat7.getCalendar();
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getTimeInstance();
        java.lang.String str13 = dateFormat11.format((java.lang.Object) 10L);
        dateFormat11.setLenient(true);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat11.setNumberFormat(numberFormat17);
        dateFormat7.setNumberFormat(numberFormat17);
        java.util.Calendar calendar20 = dateFormat7.getCalendar();
        stdDateFormat2._formatRFC1123 = dateFormat7;
        java.util.TimeZone timeZone22 = stdDateFormat2.getTimeZone();
        java.util.TimeZone timeZone23 = stdDateFormat2.getTimeZone();
        java.util.Locale locale24 = stdDateFormat2._locale;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "07:00:00" + "'", str9, "07:00:00");
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "07:00:00" + "'", str13, "07:00:00");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(timeZone22);
        org.junit.Assert.assertNull(timeZone23);
        org.junit.Assert.assertNull(locale24);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        stdDateFormat2._lenient = false;
        java.util.Locale locale26 = stdDateFormat2._locale;
        java.util.TimeZone timeZone27 = stdDateFormat2._timezone;
        java.text.DateFormat dateFormat28 = stdDateFormat2._formatRFC1123;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat31 = stdDateFormat2._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(locale26);
        org.junit.Assert.assertNull(timeZone27);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(dateFormat31);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.util.Locale locale15 = stdDateFormat2._locale;
        java.lang.Boolean boolean16 = stdDateFormat2._lenient;
        boolean boolean18 = stdDateFormat2.looksLikeISO8601("06:59:59");
        stdDateFormat2._lenient = false;
        java.text.NumberFormat numberFormat21 = stdDateFormat2.getNumberFormat();
        java.text.DateFormat dateFormat22 = stdDateFormat2._formatISO8601;
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat2.setLenient(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertNull(dateFormat22);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean7 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone8 = stdDateFormat2.getTimeZone();
        stdDateFormat2._clearFormats();
        java.lang.Boolean boolean10 = stdDateFormat2._lenient;
        stdDateFormat2._clearFormats();
        java.lang.Boolean boolean12 = stdDateFormat2._lenient;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(timeZone8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        stdDateFormat2._clearFormats();
        java.util.Locale locale15 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateTimeInstance(2, 1);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 10L);
        dateFormat19.setLenient(true);
        dateFormat19.setLenient(true);
        java.util.Calendar calendar26 = dateFormat19.getCalendar();
        dateFormat18.setCalendar(calendar26);
        stdDateFormat2.setCalendar(calendar26);
        java.text.DateFormat dateFormat29 = stdDateFormat2._formatRFC1123;
        java.lang.String str30 = stdDateFormat2.toString();
        java.text.NumberFormat numberFormat31 = stdDateFormat2.getNumberFormat();
        java.lang.Object obj33 = numberFormat31.parseObject("06:59:59");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "07:00:00" + "'", str21, "07:00:00");
        org.junit.Assert.assertNotNull(calendar26);
        org.junit.Assert.assertEquals(calendar26.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(dateFormat29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str30, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(numberFormat31);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 6L + "'", obj33, 6L);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.Date date2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateFormat0.format(date2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "39) test5196(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertNull(calendar1);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.text.DateFormat dateFormat11 = stdDateFormat2._formatISO8601_z;
        java.lang.Boolean boolean12 = stdDateFormat2._lenient;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat15;
        java.text.DateFormat dateFormat17 = stdDateFormat2._formatRFC1123;
        java.lang.String str18 = stdDateFormat2.toString();
        java.util.TimeZone timeZone19 = stdDateFormat2.getTimeZone();
        java.lang.String str20 = stdDateFormat2.toString();
        java.lang.Class<?> wildcardClass21 = stdDateFormat2.getClass();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str18, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str20, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.util.TimeZone timeZone7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat2._timezone = timeZone7;
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat2.withTimeZone(timeZone9);
        stdDateFormat10._lenient = true;
        java.lang.String str13 = stdDateFormat10.toString();
        java.util.TimeZone timeZone14 = stdDateFormat10._timezone;
        java.util.TimeZone timeZone15 = stdDateFormat10.getTimeZone();
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone15, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(stdDateFormat10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        boolean boolean13 = stdDateFormat2.looksLikeISO8601("");
        java.lang.String str14 = stdDateFormat2.toString();
        boolean boolean16 = stdDateFormat2.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance(1);
        dateFormat18.setLenient(true);
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str23 = dateFormat21.format((java.lang.Object) 100.0f);
        boolean boolean24 = dateFormat18.equals((java.lang.Object) dateFormat21);
        stdDateFormat2._formatRFC1123 = dateFormat18;
        boolean boolean26 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat27 = stdDateFormat2._formatISO8601_z;
        java.text.DateFormat dateFormat28 = stdDateFormat2._formatISO8601_z;
        java.lang.Boolean boolean29 = stdDateFormat2._lenient;
        java.text.DateFormat dateFormat30 = stdDateFormat2._formatISO8601_z;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2513-01-01" + "'", str23, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(dateFormat27);
        org.junit.Assert.assertNull(dateFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(dateFormat30);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getTimeInstance();
        java.lang.String str9 = dateFormat7.format((java.lang.Object) 10L);
        dateFormat7.setLenient(true);
        dateFormat7.setLenient(true);
        stdDateFormat2._formatISO8601 = dateFormat7;
        java.text.DateFormat dateFormat15 = stdDateFormat2._formatISO8601;
        java.lang.String str16 = stdDateFormat2.toString();
        stdDateFormat2._lenient = true;
        stdDateFormat2._clearFormats();
        java.text.DateFormat dateFormat20 = stdDateFormat2._formatPlain;
        boolean boolean22 = stdDateFormat2.looksLikeISO8601("");
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone25 = stdDateFormat2.getTimeZone();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "07:00:00" + "'", str9, "07:00:00");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str16, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(timeZone25);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (byte) 1);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.lang.Class<?> wildcardClass3 = dateFormat1.getClass();
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "40) test5201(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734417773060,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=46,MILLISECOND=940,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        java.util.Calendar calendar27 = dateFormat26.getCalendar();
        stdDateFormat2._formatISO8601_z = dateFormat26;
        java.util.Calendar calendar29 = stdDateFormat2.getCalendar();
        java.util.TimeZone timeZone30 = stdDateFormat2._timezone;
        java.text.DateFormat dateFormat31 = stdDateFormat2._formatISO8601;
        java.text.DateFormat dateFormat32 = stdDateFormat2._formatPlain;
        boolean boolean33 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat34 = stdDateFormat2._formatISO8601;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(calendar27);
// flaky "41) test5202(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar27.toString(), "sun.util.BuddhistCalendar[time=-734417773054,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=46,MILLISECOND=946,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(calendar29);
        org.junit.Assert.assertNull(timeZone30);
        org.junit.Assert.assertNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(dateFormat34);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        java.text.DateFormat dateFormat26 = stdDateFormat2._formatISO8601_z;
        java.text.DateFormat dateFormat27 = stdDateFormat2._formatISO8601_z;
        java.text.NumberFormat numberFormat28 = stdDateFormat2.getNumberFormat();
        java.util.TimeZone timeZone29 = null;
        java.util.Locale locale30 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone29, locale30);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        stdDateFormat31.setNumberFormat(numberFormat33);
        stdDateFormat31._lenient = false;
        stdDateFormat31._lenient = false;
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat31._formatPlain = dateFormat41;
        boolean boolean43 = stdDateFormat31.isLenient();
        java.util.Locale locale44 = stdDateFormat31._locale;
        boolean boolean45 = stdDateFormat31.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = numberFormat28.format((java.lang.Object) boolean45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertNull(dateFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(numberFormat33);
        org.junit.Assert.assertNotNull(dateFormat41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(locale44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        boolean boolean13 = stdDateFormat2.looksLikeISO8601("");
        java.lang.Boolean boolean14 = stdDateFormat2._lenient;
        boolean boolean15 = stdDateFormat2.isLenient();
        java.util.Locale locale16 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        java.lang.Object obj22 = numberFormat19.parseObject("1970-01-01");
        stdDateFormat2.setNumberFormat(numberFormat19);
        java.text.DateFormat dateFormat24 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat25 = stdDateFormat2._formatISO8601_z;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1970L + "'", obj22, 1970L);
        org.junit.Assert.assertNull(dateFormat24);
        org.junit.Assert.assertNull(dateFormat25);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        java.util.TimeZone timeZone9 = stdDateFormat2._timezone;
        java.lang.Boolean boolean10 = stdDateFormat2._lenient;
        stdDateFormat2._lenient = true;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = stdDateFormat2.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(timeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        java.lang.String str26 = stdDateFormat2.toString();
        java.util.TimeZone timeZone27 = stdDateFormat2._timezone;
        java.lang.Boolean boolean28 = stdDateFormat2._lenient;
        boolean boolean29 = stdDateFormat2.isLenient();
        java.util.TimeZone timeZone30 = stdDateFormat2._timezone;
        java.text.DateFormat dateFormat31 = stdDateFormat2._formatISO8601_z;
        boolean boolean33 = stdDateFormat2.looksLikeISO8601("2513-01-01");
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat35 = dateFormat34.getNumberFormat();
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getTimeInstance();
        java.lang.String str38 = dateFormat36.format((java.lang.Object) 10L);
        dateFormat36.setLenient(true);
        dateFormat36.setLenient(true);
        java.util.Calendar calendar43 = dateFormat36.getCalendar();
        dateFormat34.setCalendar(calendar43);
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat47 = dateFormat46.getNumberFormat();
        dateFormat45.setNumberFormat(numberFormat47);
        dateFormat34.setNumberFormat(numberFormat47);
        java.text.DateFormat dateFormat50 = java.text.DateFormat.getTimeInstance();
        boolean boolean51 = dateFormat34.equals((java.lang.Object) dateFormat50);
        java.text.DateFormat dateFormat52 = java.text.DateFormat.getTimeInstance();
        java.lang.String str54 = dateFormat52.format((java.lang.Object) 10L);
        boolean boolean56 = dateFormat52.equals((java.lang.Object) 0);
        java.util.Calendar calendar57 = dateFormat52.getCalendar();
        dateFormat50.setCalendar(calendar57);
        stdDateFormat2._formatISO8601 = dateFormat50;
        java.text.DateFormat dateFormat60 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        dateFormat60.setLenient(true);
        java.text.NumberFormat numberFormat63 = dateFormat60.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat63);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str26, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(timeZone30);
        org.junit.Assert.assertNull(dateFormat31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "07:00:00" + "'", str38, "07:00:00");
        org.junit.Assert.assertNotNull(calendar43);
        org.junit.Assert.assertEquals(calendar43.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat45);
        org.junit.Assert.assertNotNull(dateFormat46);
        org.junit.Assert.assertNotNull(numberFormat47);
        org.junit.Assert.assertNotNull(dateFormat50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(dateFormat52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "07:00:00" + "'", str54, "07:00:00");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(calendar57);
        org.junit.Assert.assertEquals(calendar57.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat60);
        org.junit.Assert.assertNotNull(numberFormat63);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        java.util.Locale locale11 = stdDateFormat2._locale;
        java.lang.String str12 = stdDateFormat2.toString();
        java.util.Calendar calendar13 = stdDateFormat2.getCalendar();
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatISO8601_z;
        java.util.TimeZone timeZone15 = stdDateFormat2._timezone;
        java.util.TimeZone timeZone16 = null;
        java.util.Locale locale17 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16, locale17);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        stdDateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat18._lenient = false;
        java.text.DateFormat dateFormat24 = stdDateFormat18._formatISO8601_z;
        boolean boolean26 = stdDateFormat18.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone27 = stdDateFormat18.getTimeZone();
        boolean boolean29 = stdDateFormat18.looksLikeISO8601("");
        java.lang.Boolean boolean30 = stdDateFormat18._lenient;
        boolean boolean32 = stdDateFormat18.looksLikeISO8601("yyyy-MM-dd");
        java.util.TimeZone timeZone33 = stdDateFormat18._timezone;
        java.util.TimeZone timeZone34 = null;
        java.util.Locale locale35 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone34, locale35);
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat38 = dateFormat37.getNumberFormat();
        stdDateFormat36.setNumberFormat(numberFormat38);
        stdDateFormat36._lenient = false;
        java.text.DateFormat dateFormat42 = stdDateFormat36._formatISO8601_z;
        java.util.Locale locale43 = stdDateFormat36._locale;
        java.text.NumberFormat numberFormat44 = stdDateFormat36.getNumberFormat();
        java.text.DateFormat dateFormat45 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat46 = dateFormat45.getNumberFormat();
        java.text.DateFormat dateFormat47 = java.text.DateFormat.getDateInstance();
        dateFormat47.setLenient(true);
        java.text.DateFormat dateFormat50 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.DateFormat dateFormat51 = java.text.DateFormat.getTimeInstance();
        java.lang.String str53 = dateFormat51.format((java.lang.Object) 10L);
        java.util.Calendar calendar54 = dateFormat51.getCalendar();
        dateFormat50.setCalendar(calendar54);
        dateFormat47.setCalendar(calendar54);
        dateFormat45.setCalendar(calendar54);
        stdDateFormat36.setCalendar(calendar54);
        stdDateFormat18.setCalendar(calendar54);
        stdDateFormat2.setCalendar(calendar54);
        java.lang.Class<?> wildcardClass61 = stdDateFormat2.getClass();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(calendar13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertNull(dateFormat24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(timeZone27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(timeZone33);
        org.junit.Assert.assertNotNull(dateFormat37);
        org.junit.Assert.assertNotNull(numberFormat38);
        org.junit.Assert.assertNull(dateFormat42);
        org.junit.Assert.assertNull(locale43);
        org.junit.Assert.assertNotNull(numberFormat44);
        org.junit.Assert.assertNotNull(dateFormat45);
        org.junit.Assert.assertNotNull(numberFormat46);
        org.junit.Assert.assertNotNull(dateFormat47);
        org.junit.Assert.assertNotNull(dateFormat50);
        org.junit.Assert.assertNotNull(dateFormat51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "07:00:00" + "'", str53, "07:00:00");
        org.junit.Assert.assertNotNull(calendar54);
        org.junit.Assert.assertEquals(calendar54.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        java.lang.String str26 = dateFormat24.format((java.lang.Object) 10L);
        java.util.Calendar calendar27 = dateFormat24.getCalendar();
        java.lang.Object obj29 = dateFormat24.parseObject("07:00:00");
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance();
        java.lang.String str32 = dateFormat30.format((java.lang.Object) 10L);
        java.util.Calendar calendar33 = dateFormat30.getCalendar();
        java.lang.Object obj35 = dateFormat30.parseObject("07:00:00");
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean38 = dateFormat36.equals((java.lang.Object) 10L);
        java.util.Calendar calendar39 = dateFormat36.getCalendar();
        dateFormat30.setCalendar(calendar39);
        dateFormat24.setCalendar(calendar39);
        stdDateFormat2.setCalendar(calendar39);
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone45 = stdDateFormat2._timezone;
        java.util.Locale locale46 = stdDateFormat2._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date48 = stdDateFormat2.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "07:00:00" + "'", str26, "07:00:00");
        org.junit.Assert.assertNotNull(calendar27);
        org.junit.Assert.assertEquals(calendar27.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "07:00:00" + "'", str32, "07:00:00");
        org.junit.Assert.assertNotNull(calendar33);
        org.junit.Assert.assertEquals(calendar33.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(calendar39);
// flaky "42) test5208(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNull(timeZone45);
        org.junit.Assert.assertNull(locale46);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean7 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone8 = stdDateFormat2.getTimeZone();
        stdDateFormat2._clearFormats();
        java.lang.Boolean boolean10 = stdDateFormat2._lenient;
        stdDateFormat2._lenient = true;
        java.text.NumberFormat numberFormat13 = stdDateFormat2.getNumberFormat();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(timeZone8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNotNull(numberFormat13);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.lang.String str7 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat2._formatISO8601 = dateFormat8;
        java.text.NumberFormat numberFormat10 = stdDateFormat2.getNumberFormat();
        stdDateFormat2._clearFormats();
        java.util.TimeZone timeZone12 = stdDateFormat2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stdDateFormat2.parseObject("\u0e21\u0e04. 2513");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNull(timeZone12);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone8 = stdDateFormat2._timezone;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("yyyy-MM-dd");
        java.util.Calendar calendar11 = stdDateFormat2.getCalendar();
        java.util.Calendar calendar12 = stdDateFormat2.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = stdDateFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(calendar11);
        org.junit.Assert.assertNull(calendar12);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.lang.String str16 = dateFormat14.format((java.lang.Object) 10L);
        dateFormat14.setLenient(true);
        dateFormat14.setLenient(true);
        java.util.Calendar calendar21 = dateFormat14.getCalendar();
        java.lang.String str23 = dateFormat14.format((java.lang.Object) (short) -1);
        stdDateFormat2._formatISO8601 = dateFormat14;
        java.text.DateFormat dateFormat25 = stdDateFormat2._formatRFC1123;
        boolean boolean26 = stdDateFormat2.isLenient();
        java.util.TimeZone timeZone27 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat28 = stdDateFormat2._formatRFC1123;
        java.lang.String str29 = stdDateFormat2.toString();
        java.util.Calendar calendar30 = stdDateFormat2.getCalendar();
        java.text.NumberFormat numberFormat31 = stdDateFormat2.getNumberFormat();
        java.lang.String str32 = stdDateFormat2.toString();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "07:00:00" + "'", str16, "07:00:00");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "06:59:59" + "'", str23, "06:59:59");
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(timeZone27);
        org.junit.Assert.assertNull(dateFormat28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str29, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(calendar30);
        org.junit.Assert.assertNotNull(numberFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str32, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone10 = stdDateFormat2._timezone;
        stdDateFormat2._clearFormats();
        boolean boolean12 = stdDateFormat2.isLenient();
        java.lang.Boolean boolean13 = stdDateFormat2._lenient;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = stdDateFormat2.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        java.util.Calendar calendar27 = dateFormat26.getCalendar();
        stdDateFormat2._formatISO8601_z = dateFormat26;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateTimeInstance(2, 1);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getTimeInstance();
        java.lang.String str34 = dateFormat32.format((java.lang.Object) 10L);
        dateFormat32.setLenient(true);
        dateFormat32.setLenient(true);
        java.util.Calendar calendar39 = dateFormat32.getCalendar();
        dateFormat31.setCalendar(calendar39);
        stdDateFormat2.setCalendar(calendar39);
        java.lang.String str42 = stdDateFormat2.toString();
        stdDateFormat2._clearFormats();
        boolean boolean45 = stdDateFormat2.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(calendar27);
// flaky "43) test5214(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar27.toString(), "sun.util.BuddhistCalendar[time=-734417772970,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=47,MILLISECOND=30,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "07:00:00" + "'", str34, "07:00:00");
        org.junit.Assert.assertNotNull(calendar39);
        org.junit.Assert.assertEquals(calendar39.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str42, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.lang.Boolean boolean10 = stdDateFormat2._lenient;
        boolean boolean11 = stdDateFormat2.isLenient();
        java.lang.Boolean boolean12 = stdDateFormat2._lenient;
        java.lang.String str13 = stdDateFormat2.toString();
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = stdDateFormat2.format((java.lang.Object) 15, stringBuffer15, fieldPosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        java.util.TimeZone timeZone9 = stdDateFormat2._timezone;
        java.text.DateFormat dateFormat10 = stdDateFormat2._formatISO8601;
        java.lang.Boolean boolean11 = stdDateFormat2._lenient;
        boolean boolean12 = stdDateFormat2.isLenient();
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stdDateFormat2.parseObject("\u0e21\u0e04\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(timeZone9);
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("2513-01-01");
        java.lang.String str11 = stdDateFormat2.toString();
        stdDateFormat2._lenient = true;
        java.lang.Boolean boolean14 = stdDateFormat2._lenient;
        java.text.DateFormat dateFormat15 = stdDateFormat2._formatPlain;
        java.util.TimeZone timeZone16 = null;
        java.util.Locale locale17 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16, locale17);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        stdDateFormat18.setNumberFormat(numberFormat20);
        java.text.DateFormat dateFormat22 = stdDateFormat18._formatRFC1123;
        java.text.DateFormat dateFormat23 = stdDateFormat18._formatPlain;
        java.text.DateFormat dateFormat24 = stdDateFormat18._formatISO8601_z;
        java.lang.Boolean boolean25 = stdDateFormat18._lenient;
        java.text.NumberFormat numberFormat26 = stdDateFormat18.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            dateFormat15.setNumberFormat(numberFormat26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNull(dateFormat24);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNotNull(numberFormat26);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        java.util.Locale locale11 = stdDateFormat2._locale;
        java.lang.String str12 = stdDateFormat2.toString();
        java.util.Calendar calendar13 = stdDateFormat2.getCalendar();
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatISO8601_z;
        java.lang.Boolean boolean15 = stdDateFormat2._lenient;
        java.text.DateFormat dateFormat16 = stdDateFormat2._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(calendar13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNull(dateFormat16);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        boolean boolean11 = stdDateFormat2.isLenient();
        boolean boolean13 = stdDateFormat2.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        java.text.NumberFormat numberFormat14 = stdDateFormat2.getNumberFormat();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(numberFormat14);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.lang.String str7 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat2._formatISO8601 = dateFormat8;
        java.text.NumberFormat numberFormat10 = stdDateFormat2.getNumberFormat();
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        java.text.NumberFormat numberFormat12 = stdDateFormat2.getNumberFormat();
        boolean boolean14 = stdDateFormat2.looksLikeISO8601("06:59:59");
        boolean boolean16 = stdDateFormat2.looksLikeISO8601("");
        stdDateFormat2._lenient = true;
        java.util.TimeZone timeZone19 = null;
        java.util.Locale locale20 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19, locale20);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        stdDateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat21._lenient = false;
        stdDateFormat21._lenient = false;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat21._formatPlain = dateFormat31;
        boolean boolean33 = stdDateFormat21.isLenient();
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateInstance(1);
        dateFormat35.setLenient(true);
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str40 = dateFormat38.format((java.lang.Object) 100.0f);
        boolean boolean41 = dateFormat35.equals((java.lang.Object) dateFormat38);
        stdDateFormat21._formatRFC1123 = dateFormat38;
        boolean boolean44 = stdDateFormat21.looksLikeISO8601("");
        java.lang.String str45 = stdDateFormat21.toString();
        java.util.TimeZone timeZone46 = stdDateFormat21._timezone;
        java.text.DateFormat dateFormat47 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat48 = dateFormat47.getNumberFormat();
        stdDateFormat21._formatPlain = dateFormat47;
        java.text.DateFormat dateFormat50 = stdDateFormat21._formatPlain;
        java.lang.Boolean boolean51 = stdDateFormat21._lenient;
        java.lang.String str52 = stdDateFormat21.toString();
        java.util.Date date54 = stdDateFormat21.parse("2513-01-01");
        java.lang.StringBuffer stringBuffer55 = null;
        java.text.FieldPosition fieldPosition56 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer57 = stdDateFormat2.format(date54, stringBuffer55, fieldPosition56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(numberFormat23);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertNotNull(dateFormat38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2513-01-01" + "'", str40, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str45, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone46);
        org.junit.Assert.assertNotNull(dateFormat47);
        org.junit.Assert.assertNotNull(numberFormat48);
        org.junit.Assert.assertNotNull(dateFormat50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str52, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.lang.String str11 = stdDateFormat2.toString();
        java.util.Locale locale12 = stdDateFormat2._locale;
        java.util.Locale locale13 = stdDateFormat2._locale;
        boolean boolean15 = stdDateFormat2.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat16 = null;
        stdDateFormat2._formatPlain = dateFormat16;
        java.text.NumberFormat numberFormat18 = stdDateFormat2.getNumberFormat();
        boolean boolean19 = stdDateFormat2.isLenient();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        java.util.Calendar calendar27 = dateFormat26.getCalendar();
        stdDateFormat2._formatISO8601_z = dateFormat26;
        java.text.DateFormat dateFormat29 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat30 = stdDateFormat2._formatPlain;
        java.lang.String str31 = stdDateFormat2.toString();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(calendar27);
// flaky "44) test5222(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar27.toString(), "sun.util.BuddhistCalendar[time=-734417772921,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=3,SECOND=47,MILLISECOND=79,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str31, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.util.TimeZone timeZone7 = stdDateFormat2.getTimeZone();
        boolean boolean8 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat9 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat10 = stdDateFormat2._formatISO8601_z;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(dateFormat10);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        stdDateFormat3.setNumberFormat(numberFormat5);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat8 = dateFormat7.getNumberFormat();
        stdDateFormat3.setNumberFormat(numberFormat8);
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone10);
        stdDateFormat3._timezone = timeZone10;
        boolean boolean13 = dateFormat0.equals((java.lang.Object) stdDateFormat3);
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dateFormat14);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.util.TimeZone timeZone7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat2._timezone = timeZone7;
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat2.withTimeZone(timeZone9);
        java.util.Calendar calendar11 = stdDateFormat10.getCalendar();
        java.util.TimeZone timeZone12 = stdDateFormat10._timezone;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
// flaky "45) test5225(com.fasterxml.jackson.databind.util.RegressionTest10)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(stdDateFormat10);
        org.junit.Assert.assertNull(calendar11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.text.DateFormat dateFormat11 = stdDateFormat2._formatISO8601_z;
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean14 = dateFormat12.equals((java.lang.Object) 10L);
        java.util.Calendar calendar15 = dateFormat12.getCalendar();
        stdDateFormat2._formatRFC1123 = dateFormat12;
        java.text.DateFormat dateFormat17 = stdDateFormat2._formatISO8601;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance(0);
        stdDateFormat2._formatISO8601 = dateFormat19;
        java.text.DateFormat dateFormat21 = stdDateFormat2._formatRFC1123;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = stdDateFormat2.parseObject("\u0e21\u0e04. 2513");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(calendar15);
// flaky "46) test5226(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat21);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        java.lang.String str26 = stdDateFormat2.toString();
        java.util.TimeZone timeZone27 = stdDateFormat2._timezone;
        java.lang.Boolean boolean28 = stdDateFormat2._lenient;
        java.text.DateFormat dateFormat29 = stdDateFormat2._formatISO8601;
        java.util.TimeZone timeZone30 = stdDateFormat2.getTimeZone();
        boolean boolean31 = stdDateFormat2.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat2.setLenient(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str26, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(dateFormat29);
        org.junit.Assert.assertNull(timeZone30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean7 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone8 = stdDateFormat2.getTimeZone();
        java.text.DateFormat dateFormat9 = stdDateFormat2._formatPlain;
        boolean boolean10 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 10L);
        dateFormat11.setLenient(true);
        java.text.NumberFormat numberFormat16 = null;
        dateFormat11.setNumberFormat(numberFormat16);
        stdDateFormat2._formatPlain = dateFormat11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = stdDateFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(timeZone8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.text.DateFormat dateFormat11 = stdDateFormat2._formatISO8601_z;
        boolean boolean12 = stdDateFormat2.isLenient();
        java.util.Locale locale13 = stdDateFormat2._locale;
        java.util.TimeZone timeZone14 = null;
        java.util.Locale locale15 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14, locale15);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        stdDateFormat16.setNumberFormat(numberFormat18);
        java.lang.String str20 = stdDateFormat16.toString();
        java.lang.String str21 = stdDateFormat16.toString();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat16._formatISO8601 = dateFormat22;
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean26 = dateFormat24.equals((java.lang.Object) 10L);
        java.util.Calendar calendar27 = dateFormat24.getCalendar();
        stdDateFormat16.setCalendar(calendar27);
        stdDateFormat2.setCalendar(calendar27);
        stdDateFormat2._clearFormats();
        java.util.Calendar calendar31 = stdDateFormat2.getCalendar();
        java.util.TimeZone timeZone32 = null;
        java.util.Locale locale33 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone32, locale33);
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat36 = dateFormat35.getNumberFormat();
        stdDateFormat34.setNumberFormat(numberFormat36);
        stdDateFormat34._lenient = false;
        java.text.DateFormat dateFormat40 = stdDateFormat34._formatISO8601_z;
        boolean boolean42 = stdDateFormat34.looksLikeISO8601("07:00:00");
        stdDateFormat34._clearFormats();
        boolean boolean44 = stdDateFormat34.isLenient();
        java.text.DateFormat dateFormat45 = stdDateFormat34._formatISO8601_z;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = stdDateFormat2.format((java.lang.Object) dateFormat45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str20, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str21, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(calendar27);
// flaky "47) test5229(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar31);
// flaky "4) test5229(com.fasterxml.jackson.databind.util.RegressionTest10)":         org.junit.Assert.assertEquals(calendar31.toString(), "java.util.GregorianCalendar[time=25200000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertNotNull(numberFormat36);
        org.junit.Assert.assertNull(dateFormat40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(dateFormat45);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        boolean boolean25 = stdDateFormat2.looksLikeISO8601("");
        boolean boolean26 = stdDateFormat2.isLenient();
        java.text.NumberFormat numberFormat27 = stdDateFormat2.getNumberFormat();
        java.lang.String str28 = stdDateFormat2.toString();
        boolean boolean29 = stdDateFormat2.isLenient();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(numberFormat27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str28, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 10L);
        dateFormat0.setLenient(true);
        dateFormat0.setLenient(true);
        java.util.Calendar calendar7 = dateFormat0.getCalendar();
        dateFormat0.setLenient(true);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "07:00:00" + "'", str2, "07:00:00");
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone10 = stdDateFormat2._timezone;
        boolean boolean11 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat12 = stdDateFormat2._formatISO8601_z;
        boolean boolean13 = stdDateFormat2.isLenient();
        java.util.TimeZone timeZone14 = stdDateFormat2._timezone;
        stdDateFormat2._lenient = true;
        java.util.Calendar calendar17 = stdDateFormat2.getCalendar();
        java.text.DateFormat dateFormat18 = stdDateFormat2._formatRFC1123;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(timeZone14);
        org.junit.Assert.assertNull(calendar17);
        org.junit.Assert.assertNull(dateFormat18);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        stdDateFormat2._clearFormats();
        java.util.Locale locale15 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat16 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat17 = stdDateFormat2._formatPlain;
        java.util.TimeZone timeZone18 = stdDateFormat2.getTimeZone();
        java.util.TimeZone timeZone19 = stdDateFormat2._timezone;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = timeZone19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(timeZone18);
        org.junit.Assert.assertNull(timeZone19);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(1);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 100.0f);
        boolean boolean22 = dateFormat16.equals((java.lang.Object) dateFormat19);
        stdDateFormat2._formatRFC1123 = dateFormat19;
        java.text.DateFormat dateFormat24 = stdDateFormat2._formatISO8601_z;
        stdDateFormat2._clearFormats();
        java.text.DateFormat dateFormat26 = stdDateFormat2._formatPlain;
        java.lang.String str27 = stdDateFormat2.toString();
        stdDateFormat2._clearFormats();
        java.util.Calendar calendar29 = stdDateFormat2.getCalendar();
        java.util.TimeZone timeZone30 = stdDateFormat2._timezone;
        java.util.Calendar calendar31 = stdDateFormat2.getCalendar();
        java.util.Locale locale32 = stdDateFormat2._locale;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(dateFormat24);
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str27, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(calendar29);
        org.junit.Assert.assertNull(timeZone30);
        org.junit.Assert.assertNull(calendar31);
        org.junit.Assert.assertNull(locale32);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getTimeInstance();
        java.lang.String str9 = dateFormat7.format((java.lang.Object) 10L);
        java.util.Calendar calendar10 = dateFormat7.getCalendar();
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getTimeInstance();
        java.lang.String str13 = dateFormat11.format((java.lang.Object) 10L);
        dateFormat11.setLenient(true);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat11.setNumberFormat(numberFormat17);
        dateFormat7.setNumberFormat(numberFormat17);
        java.util.Calendar calendar20 = dateFormat7.getCalendar();
        stdDateFormat2._formatRFC1123 = dateFormat7;
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = true;
        stdDateFormat2._lenient = true;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "07:00:00" + "'", str9, "07:00:00");
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "07:00:00" + "'", str13, "07:00:00");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone10 = stdDateFormat2._timezone;
        stdDateFormat2._clearFormats();
        java.util.TimeZone timeZone12 = stdDateFormat2._timezone;
        java.text.NumberFormat numberFormat13 = stdDateFormat2.getNumberFormat();
        java.lang.String str14 = stdDateFormat2.toString();
        boolean boolean15 = stdDateFormat2.isLenient();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat2._formatISO8601 = dateFormat11;
        java.text.DateFormat dateFormat13 = stdDateFormat2._formatISO8601_z;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance();
        dateFormat15.setLenient(true);
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 10L);
        java.util.Calendar calendar22 = dateFormat19.getCalendar();
        dateFormat18.setCalendar(calendar22);
        dateFormat15.setCalendar(calendar22);
        stdDateFormat2._formatISO8601_z = dateFormat15;
        java.util.Calendar calendar26 = stdDateFormat2.getCalendar();
        java.text.ParsePosition parsePosition28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = stdDateFormat2.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "07:00:00" + "'", str21, "07:00:00");
        org.junit.Assert.assertNotNull(calendar22);
        org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(calendar26);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone16 = stdDateFormat2._timezone;
        boolean boolean17 = stdDateFormat2.isLenient();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNull(timeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        boolean boolean14 = stdDateFormat2.isLenient();
        java.text.DateFormat dateFormat15 = stdDateFormat2._formatISO8601_z;
        boolean boolean17 = stdDateFormat2.looksLikeISO8601("yyyy-MM-dd");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone11 = stdDateFormat2.getTimeZone();
        boolean boolean13 = stdDateFormat2.looksLikeISO8601("");
        java.lang.String str14 = stdDateFormat2.toString();
        java.lang.String str15 = stdDateFormat2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = stdDateFormat2.parse("1970-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat2._formatPlain = dateFormat12;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.lang.String str16 = dateFormat14.format((java.lang.Object) 10L);
        dateFormat14.setLenient(true);
        dateFormat14.setLenient(true);
        java.util.Calendar calendar21 = dateFormat14.getCalendar();
        java.lang.String str23 = dateFormat14.format((java.lang.Object) (short) -1);
        stdDateFormat2._formatISO8601 = dateFormat14;
        java.text.DateFormat dateFormat25 = stdDateFormat2._formatRFC1123;
        boolean boolean26 = stdDateFormat2.isLenient();
        java.util.TimeZone timeZone27 = stdDateFormat2.getTimeZone();
        java.util.Locale locale28 = stdDateFormat2._locale;
        boolean boolean30 = stdDateFormat2.looksLikeISO8601("hi!");
        java.text.NumberFormat numberFormat31 = stdDateFormat2.getNumberFormat();
        java.util.Calendar calendar32 = stdDateFormat2.getCalendar();
        java.text.DateFormat dateFormat33 = stdDateFormat2._formatRFC1123;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "07:00:00" + "'", str16, "07:00:00");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "06:59:59" + "'", str23, "06:59:59");
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(timeZone27);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(numberFormat31);
        org.junit.Assert.assertNull(calendar32);
        org.junit.Assert.assertNull(dateFormat33);
    }
}
