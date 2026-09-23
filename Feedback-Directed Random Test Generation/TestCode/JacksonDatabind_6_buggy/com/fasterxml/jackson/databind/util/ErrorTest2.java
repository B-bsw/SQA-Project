package com.fasterxml.jackson.databind.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance();
        dateFormat13.setLenient(true);
        boolean boolean16 = dateFormat13.isLenient();
        java.util.Calendar calendar17 = dateFormat13.getCalendar();
        java.util.TimeZone timeZone18 = dateFormat13.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        stdDateFormat19.setNumberFormat(numberFormat22);
        java.lang.String str24 = stdDateFormat19.toString();
        java.text.DateFormat dateFormat25 = stdDateFormat19._formatISO8601;
        java.util.TimeZone timeZone26 = stdDateFormat19._timezone;
        boolean boolean28 = stdDateFormat19.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        stdDateFormat6._formatRFC1123 = stdDateFormat19;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat19.", stdDateFormat6.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat6));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.util.Locale locale12 = stdDateFormat6._locale;
        java.lang.String str13 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        dateFormat14.setLenient(true);
        boolean boolean17 = dateFormat14.isLenient();
        java.util.Calendar calendar18 = dateFormat14.getCalendar();
        java.util.TimeZone timeZone19 = dateFormat14.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        stdDateFormat20.setNumberFormat(numberFormat23);
        java.lang.String str25 = stdDateFormat20.toString();
        java.util.TimeZone timeZone26 = stdDateFormat20._timezone;
        java.text.DateFormat dateFormat27 = stdDateFormat20._formatRFC1123;
        java.text.DateFormat dateFormat28 = stdDateFormat20._formatRFC1123;
        java.text.NumberFormat numberFormat29 = stdDateFormat20.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat20.", stdDateFormat6.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat6));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.Locale locale11 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        dateFormat17.setLenient(true);
        boolean boolean20 = dateFormat17.isLenient();
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        stdDateFormat23.setNumberFormat(numberFormat26);
        java.lang.String str28 = stdDateFormat23.toString();
        java.text.DateFormat dateFormat29 = stdDateFormat23._formatPlain;
        java.util.Locale locale30 = stdDateFormat23._locale;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale30);
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone15, locale30);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance((int) (byte) 1, locale30);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat6.withLocale(locale30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat34 and stdDateFormat23.", stdDateFormat34.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat34));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.Locale locale11 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getTimeInstance();
        dateFormat12.setLenient(true);
        boolean boolean15 = dateFormat12.isLenient();
        java.util.Calendar calendar16 = dateFormat12.getCalendar();
        java.util.TimeZone timeZone17 = dateFormat12.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone17);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        stdDateFormat18.setNumberFormat(numberFormat21);
        java.lang.String str23 = stdDateFormat18.toString();
        java.text.DateFormat dateFormat24 = stdDateFormat18._formatPlain;
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance(1, (int) (byte) 0);
        java.util.Calendar calendar28 = dateFormat27.getCalendar();
        stdDateFormat18.setCalendar(calendar28);
        java.util.TimeZone timeZone30 = stdDateFormat18.getTimeZone();
        stdDateFormat6._formatISO8601 = stdDateFormat18;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat18.", stdDateFormat6.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat6));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.lang.String str16 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        java.util.Locale locale18 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat19 = stdDateFormat6._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat20, stdDateFormat6, and dateFormat0.", !(stdDateFormat20.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat20.equals(dateFormat0));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("1970-01-01T07:00:00.005+0700");
        java.text.NumberFormat numberFormat18 = stdDateFormat6.getNumberFormat();
        java.util.Locale locale19 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        dateFormat20.setLenient(true);
        boolean boolean23 = dateFormat20.isLenient();
        java.util.Calendar calendar24 = dateFormat20.getCalendar();
        java.util.TimeZone timeZone25 = dateFormat20.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone25);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        stdDateFormat26.setNumberFormat(numberFormat29);
        java.util.TimeZone timeZone31 = stdDateFormat26._timezone;
        java.util.Locale locale32 = stdDateFormat26._locale;
        java.lang.String str33 = stdDateFormat26.toString();
        java.util.TimeZone timeZone34 = stdDateFormat26._timezone;
        java.util.Locale locale35 = stdDateFormat26._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = stdDateFormat6.withLocale(locale35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat36 and stdDateFormat26.", stdDateFormat36.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat36));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatRFC1123;
        java.util.Locale locale17 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        dateFormat18.setLenient(true);
        boolean boolean21 = dateFormat18.isLenient();
        java.util.Calendar calendar22 = dateFormat18.getCalendar();
        java.util.TimeZone timeZone23 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        stdDateFormat24.setNumberFormat(numberFormat27);
        java.util.TimeZone timeZone29 = stdDateFormat24._timezone;
        java.text.DateFormat dateFormat30 = stdDateFormat24._formatISO8601_z;
        java.text.DateFormat dateFormat31 = stdDateFormat24._formatISO8601;
        boolean boolean33 = stdDateFormat24.looksLikeISO8601("hi!");
        boolean boolean35 = stdDateFormat24.looksLikeISO8601("2513-01-01T07:00:00.000+0700");
        java.text.NumberFormat numberFormat36 = stdDateFormat24.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601;
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        java.util.Locale locale17 = stdDateFormat6._locale;
        java.util.Calendar calendar18 = stdDateFormat6.getCalendar();
        java.util.TimeZone timeZone19 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat20 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        dateFormat21.setLenient(true);
        boolean boolean24 = dateFormat21.isLenient();
        java.util.Calendar calendar25 = dateFormat21.getCalendar();
        java.util.TimeZone timeZone26 = dateFormat21.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone26);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        stdDateFormat27.setNumberFormat(numberFormat30);
        java.lang.String str32 = stdDateFormat27.toString();
        java.util.TimeZone timeZone33 = stdDateFormat27._timezone;
        java.text.DateFormat dateFormat34 = stdDateFormat27._formatRFC1123;
        java.text.DateFormat dateFormat35 = stdDateFormat27._formatISO8601;
        java.text.DateFormat dateFormat36 = stdDateFormat27._formatPlain;
        java.util.TimeZone timeZone37 = stdDateFormat27._timezone;
        stdDateFormat6._timezone = timeZone37;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat27.", stdDateFormat6.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat6));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatPlain;
        boolean boolean18 = stdDateFormat6.looksLikeISO8601("");
        java.util.Locale locale19 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        stdDateFormat6._formatISO8601_z = dateFormat21;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str27 = dateFormat25.format((java.lang.Object) 100L);
        java.text.NumberFormat numberFormat28 = dateFormat25.getNumberFormat();
        java.util.Calendar calendar29 = dateFormat25.getCalendar();
        dateFormat25.setLenient(true);
        java.util.Calendar calendar32 = dateFormat25.getCalendar();
        stdDateFormat6.setCalendar(calendar32);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat34, stdDateFormat6, and dateFormat0.", !(stdDateFormat34.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat34.equals(dateFormat0));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone6 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance();
        dateFormat10.setLenient(true);
        boolean boolean13 = dateFormat10.isLenient();
        java.util.Calendar calendar14 = dateFormat10.getCalendar();
        java.util.TimeZone timeZone15 = dateFormat10.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        stdDateFormat16.setNumberFormat(numberFormat19);
        java.lang.String str21 = stdDateFormat16.toString();
        java.util.TimeZone timeZone22 = stdDateFormat16._timezone;
        java.util.Locale locale23 = stdDateFormat16._locale;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateTimeInstance(2, (int) (short) 0, locale23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone6, locale23);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        stdDateFormat6._formatPlain = dateFormat12;
        java.lang.String str15 = stdDateFormat6.toString();
        java.util.Calendar calendar16 = stdDateFormat6.getCalendar();
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatPlain;
        boolean boolean19 = stdDateFormat6.looksLikeISO8601("");
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        dateFormat20.setLenient(true);
        boolean boolean23 = dateFormat20.isLenient();
        java.util.Calendar calendar24 = dateFormat20.getCalendar();
        java.util.TimeZone timeZone25 = dateFormat20.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone25);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        stdDateFormat26.setNumberFormat(numberFormat29);
        java.lang.String str31 = stdDateFormat26.toString();
        java.text.DateFormat dateFormat32 = stdDateFormat26._formatPlain;
        java.text.DateFormat dateFormat33 = stdDateFormat26._formatISO8601;
        java.text.DateFormat dateFormat34 = stdDateFormat26._formatISO8601_z;
        java.util.Locale locale35 = stdDateFormat26._locale;
        java.util.Locale locale36 = stdDateFormat26._locale;
        stdDateFormat6._formatPlain = stdDateFormat26;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat26.", stdDateFormat6.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat6));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601_z;
        java.util.Locale locale16 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        dateFormat17.setLenient(true);
        boolean boolean20 = dateFormat17.isLenient();
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        stdDateFormat23.setNumberFormat(numberFormat26);
        java.util.TimeZone timeZone28 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat29 = stdDateFormat23._formatISO8601_z;
        java.text.DateFormat dateFormat30 = stdDateFormat23._formatISO8601_z;
        java.util.TimeZone timeZone31 = stdDateFormat23._timezone;
        java.util.Locale locale32 = stdDateFormat23._locale;
        java.util.Locale locale33 = stdDateFormat23._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat6.withLocale(locale33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat34 and stdDateFormat23.", stdDateFormat34.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat34));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.NumberFormat numberFormat11 = stdDateFormat6.getNumberFormat();
        java.lang.String str12 = stdDateFormat6.toString();
        java.util.TimeZone timeZone13 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        boolean boolean13 = stdDateFormat6.looksLikeISO8601("1/1/13 06:59");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat14, stdDateFormat6, and dateFormat0.", !(stdDateFormat14.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat14.equals(dateFormat0));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone21 = dateFormat20.getTimeZone();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        dateFormat23.setLenient(true);
        boolean boolean26 = dateFormat23.isLenient();
        java.util.Calendar calendar27 = dateFormat23.getCalendar();
        java.util.TimeZone timeZone28 = dateFormat23.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone28);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        stdDateFormat29.setNumberFormat(numberFormat32);
        java.lang.String str34 = stdDateFormat29.toString();
        java.text.DateFormat dateFormat35 = stdDateFormat29._formatPlain;
        java.util.Locale locale36 = stdDateFormat29._locale;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale36);
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone21, locale36);
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateInstance((int) (byte) 1, locale36);
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale36);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat41 = stdDateFormat6.withLocale(locale36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat41 and stdDateFormat29.", stdDateFormat41.equals(stdDateFormat29) == stdDateFormat29.equals(stdDateFormat41));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.NumberFormat numberFormat14 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat6, and dateFormat0.", !(stdDateFormat16.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat16.equals(dateFormat0));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatPlain;
        boolean boolean18 = stdDateFormat6.looksLikeISO8601("");
        java.util.Locale locale19 = stdDateFormat6._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat20, stdDateFormat6, and dateFormat0.", !(stdDateFormat20.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat20.equals(dateFormat0));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.util.TimeZone timeZone13 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatPlain;
        java.lang.String str15 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        dateFormat17.setLenient(true);
        boolean boolean20 = dateFormat17.isLenient();
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        stdDateFormat23.setNumberFormat(numberFormat26);
        java.lang.String str28 = stdDateFormat23.toString();
        java.text.DateFormat dateFormat29 = stdDateFormat23._formatPlain;
        java.text.DateFormat dateFormat30 = stdDateFormat23._formatISO8601_z;
        java.text.NumberFormat numberFormat31 = stdDateFormat23.getNumberFormat();
        java.util.Locale locale32 = stdDateFormat23._locale;
        java.text.DateFormat dateFormat33 = stdDateFormat23._formatISO8601_z;
        java.util.Locale locale34 = stdDateFormat23._locale;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getTimeInstance((int) (short) 0, locale34);
        java.util.TimeZone timeZone36 = dateFormat35.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = stdDateFormat6.withTimeZone(timeZone36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat37 and stdDateFormat23.", stdDateFormat37.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat37));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.NumberFormat numberFormat11 = stdDateFormat6.getNumberFormat();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.util.TimeZone timeZone13 = stdDateFormat6._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone13);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat14, stdDateFormat6, and dateFormat0.", !(stdDateFormat14.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat14.equals(dateFormat0));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.NumberFormat numberFormat14 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601;
        java.util.Calendar calendar16 = stdDateFormat6.getCalendar();
        java.util.Calendar calendar17 = stdDateFormat6.getCalendar();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat18, stdDateFormat6, and dateFormat0.", !(stdDateFormat18.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat18.equals(dateFormat0));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        dateFormat16.setLenient(true);
        boolean boolean19 = dateFormat16.isLenient();
        java.util.Calendar calendar20 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone21 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        stdDateFormat22.setNumberFormat(numberFormat25);
        java.text.NumberFormat numberFormat27 = stdDateFormat22.getNumberFormat();
        java.util.TimeZone timeZone28 = stdDateFormat22._timezone;
        stdDateFormat6._timezone = timeZone28;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        dateFormat16.setLenient(true);
        boolean boolean19 = dateFormat16.isLenient();
        java.util.Calendar calendar20 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone21 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        stdDateFormat22.setNumberFormat(numberFormat25);
        java.lang.String str27 = stdDateFormat22.toString();
        java.text.DateFormat dateFormat28 = stdDateFormat22._formatPlain;
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatISO8601_z;
        java.text.NumberFormat numberFormat30 = stdDateFormat22.getNumberFormat();
        boolean boolean32 = stdDateFormat22.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.util.Calendar calendar33 = stdDateFormat22.getCalendar();
        java.text.DateFormat dateFormat34 = stdDateFormat22._formatPlain;
        java.util.Locale locale35 = stdDateFormat22._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = stdDateFormat6.withLocale(locale35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat36 and stdDateFormat22.", stdDateFormat36.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat36));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601_z;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        dateFormat17.setLenient(true);
        stdDateFormat6._formatISO8601_z = dateFormat17;
        java.util.TimeZone timeZone21 = stdDateFormat6._timezone;
        java.util.Calendar calendar22 = stdDateFormat6.getCalendar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone23 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.lang.String str16 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601_z;
        java.text.NumberFormat numberFormat18 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        dateFormat19.setLenient(true);
        boolean boolean22 = dateFormat19.isLenient();
        java.util.Calendar calendar23 = dateFormat19.getCalendar();
        java.util.TimeZone timeZone24 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        stdDateFormat25.setNumberFormat(numberFormat28);
        java.lang.String str30 = stdDateFormat25.toString();
        java.text.DateFormat dateFormat31 = stdDateFormat25._formatPlain;
        java.text.DateFormat dateFormat32 = stdDateFormat25._formatRFC1123;
        java.text.DateFormat dateFormat33 = stdDateFormat25._formatRFC1123;
        java.util.TimeZone timeZone34 = stdDateFormat25._timezone;
        java.util.Locale locale35 = stdDateFormat25._locale;
        java.text.NumberFormat numberFormat36 = stdDateFormat25.getNumberFormat();
        stdDateFormat6._formatISO8601_z = stdDateFormat25;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat25.", stdDateFormat6.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat6));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        boolean boolean19 = dateFormat16.equals((java.lang.Object) 2);
        stdDateFormat6._formatISO8601_z = dateFormat16;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat22 = stdDateFormat6._formatISO8601;
        java.lang.String str23 = stdDateFormat6.toString();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = stdDateFormat6.clone();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat16.", dateFormat0.equals(dateFormat16) == dateFormat16.equals(dateFormat0));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.util.Locale locale12 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.Locale locale14 = stdDateFormat6._locale;
        java.util.TimeZone timeZone15 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.NumberFormat numberFormat15 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        dateFormat18.setLenient(true);
        boolean boolean21 = dateFormat18.isLenient();
        java.util.Calendar calendar22 = dateFormat18.getCalendar();
        java.util.TimeZone timeZone23 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        stdDateFormat24.setNumberFormat(numberFormat27);
        java.util.TimeZone timeZone29 = stdDateFormat24._timezone;
        java.text.DateFormat dateFormat30 = stdDateFormat24._formatISO8601_z;
        java.text.DateFormat dateFormat31 = stdDateFormat24._formatISO8601;
        boolean boolean33 = stdDateFormat24.looksLikeISO8601("hi!");
        stdDateFormat6._formatRFC1123 = stdDateFormat24;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateTimeInstance(1, (int) (byte) 0);
        java.util.Calendar calendar16 = dateFormat15.getCalendar();
        stdDateFormat6.setCalendar(calendar16);
        boolean boolean18 = stdDateFormat6.isLenient();
        boolean boolean20 = stdDateFormat6.looksLikeISO8601("");
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        dateFormat21.setLenient(true);
        boolean boolean24 = dateFormat21.isLenient();
        java.util.Calendar calendar25 = dateFormat21.getCalendar();
        java.util.TimeZone timeZone26 = dateFormat21.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone26);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        stdDateFormat27.setNumberFormat(numberFormat30);
        java.lang.String str32 = stdDateFormat27.toString();
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        stdDateFormat27._formatPlain = dateFormat33;
        java.lang.String str36 = stdDateFormat27.toString();
        java.text.DateFormat dateFormat37 = stdDateFormat27._formatRFC1123;
        java.util.TimeZone timeZone38 = stdDateFormat27._timezone;
        stdDateFormat6.setTimeZone(timeZone38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat27.", stdDateFormat6.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat6));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601;
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        java.util.Locale locale17 = stdDateFormat6._locale;
        java.util.TimeZone timeZone18 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat19 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        dateFormat20.setLenient(true);
        boolean boolean23 = dateFormat20.isLenient();
        java.util.Calendar calendar24 = dateFormat20.getCalendar();
        java.util.TimeZone timeZone25 = dateFormat20.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone25);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        stdDateFormat26.setNumberFormat(numberFormat29);
        java.util.TimeZone timeZone31 = stdDateFormat26._timezone;
        java.text.DateFormat dateFormat32 = stdDateFormat26._formatISO8601_z;
        java.util.TimeZone timeZone33 = stdDateFormat26._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat6.withTimeZone(timeZone33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat34 and stdDateFormat26.", stdDateFormat34.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat34));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatPlain;
        boolean boolean18 = stdDateFormat6.looksLikeISO8601("");
        java.util.Locale locale19 = stdDateFormat6._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = stdDateFormat6.isLenient();
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("1970-01-01T00:00:00.000+0000");
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        boolean boolean23 = dateFormat18.equals((java.lang.Object) timeZone22);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = stdDateFormat6.withTimeZone(timeZone22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone25 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601;
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        java.util.Locale locale17 = stdDateFormat6._locale;
        java.util.Calendar calendar18 = stdDateFormat6.getCalendar();
        java.util.TimeZone timeZone19 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        dateFormat22.setLenient(true);
        boolean boolean25 = dateFormat22.isLenient();
        java.util.Calendar calendar26 = dateFormat22.getCalendar();
        java.util.TimeZone timeZone27 = dateFormat22.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone27);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        stdDateFormat28.setNumberFormat(numberFormat31);
        java.util.TimeZone timeZone33 = stdDateFormat28._timezone;
        java.util.Locale locale34 = stdDateFormat28._locale;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, locale34);
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone19, locale34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat28.", stdDateFormat6.equals(stdDateFormat28) == stdDateFormat28.equals(stdDateFormat6));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.lang.String str16 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat18 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat19 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat20 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        dateFormat21.setLenient(true);
        boolean boolean24 = dateFormat21.isLenient();
        java.util.Calendar calendar25 = dateFormat21.getCalendar();
        java.util.TimeZone timeZone26 = dateFormat21.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone26);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        stdDateFormat27.setNumberFormat(numberFormat30);
        java.lang.String str32 = stdDateFormat27.toString();
        java.util.TimeZone timeZone33 = stdDateFormat27._timezone;
        java.text.DateFormat dateFormat34 = stdDateFormat27._formatRFC1123;
        java.lang.String str35 = stdDateFormat27.toString();
        java.text.DateFormat dateFormat36 = stdDateFormat27._formatRFC1123;
        java.util.Locale locale37 = stdDateFormat27._locale;
        java.util.Locale locale38 = stdDateFormat27._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = stdDateFormat6.withLocale(locale38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat39 and stdDateFormat27.", stdDateFormat39.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat39));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601_z;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        dateFormat17.setLenient(true);
        stdDateFormat6._formatISO8601_z = dateFormat17;
        java.util.TimeZone timeZone21 = stdDateFormat6._timezone;
        java.util.Calendar calendar22 = stdDateFormat6.getCalendar();
        java.util.Locale locale23 = stdDateFormat6._locale;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat17.", dateFormat0.equals(dateFormat17) == dateFormat17.equals(dateFormat0));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getInstance();
        boolean boolean15 = dateFormat14.isLenient();
        java.util.TimeZone timeZone16 = dateFormat14.getTimeZone();
        java.text.NumberFormat numberFormat17 = dateFormat14.getNumberFormat();
        dateFormat14.setLenient(true);
        java.util.TimeZone timeZone20 = dateFormat14.getTimeZone();
        boolean boolean21 = stdDateFormat6.equals((java.lang.Object) dateFormat14);
        java.text.DateFormat dateFormat22 = stdDateFormat6._formatISO8601_z;
        java.util.Calendar calendar23 = stdDateFormat6.getCalendar();
        java.util.Locale locale24 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance();
        dateFormat25.setLenient(true);
        boolean boolean28 = dateFormat25.isLenient();
        java.util.Calendar calendar29 = dateFormat25.getCalendar();
        java.util.TimeZone timeZone30 = dateFormat25.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone30);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        stdDateFormat31.setNumberFormat(numberFormat34);
        java.lang.String str36 = stdDateFormat31.toString();
        java.util.TimeZone timeZone37 = stdDateFormat31._timezone;
        java.util.TimeZone timeZone38 = stdDateFormat31._timezone;
        java.text.DateFormat dateFormat39 = stdDateFormat31._formatPlain;
        java.util.Locale locale40 = stdDateFormat31._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat41 = stdDateFormat6.withLocale(locale40);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat41 and stdDateFormat31.", stdDateFormat41.equals(stdDateFormat31) == stdDateFormat31.equals(stdDateFormat41));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601;
        java.lang.String str14 = stdDateFormat6.toString();
        java.util.Locale locale15 = stdDateFormat6._locale;
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        dateFormat17.setLenient(true);
        boolean boolean20 = dateFormat17.isLenient();
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        stdDateFormat23.setNumberFormat(numberFormat26);
        java.text.DateFormat dateFormat28 = stdDateFormat23._formatISO8601_z;
        java.text.DateFormat dateFormat29 = stdDateFormat23._formatISO8601_z;
        java.lang.String str30 = stdDateFormat23.toString();
        java.text.DateFormat dateFormat31 = stdDateFormat23._formatISO8601_z;
        java.util.TimeZone timeZone32 = stdDateFormat23._timezone;
        java.util.TimeZone timeZone33 = stdDateFormat23._timezone;
        stdDateFormat6._formatISO8601_z = stdDateFormat23;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateTimeInstance((int) (short) 1, (int) (byte) 0);
        stdDateFormat6._formatISO8601 = dateFormat15;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone19 = dateFormat18.getTimeZone();
        java.util.TimeZone timeZone20 = dateFormat18.getTimeZone();
        stdDateFormat6.setTimeZone(timeZone20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat18, stdDateFormat6, and dateFormat0.", !(stdDateFormat18.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat18.equals(dateFormat0));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.lang.String str14 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("07:00");
        java.util.TimeZone timeZone18 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        dateFormat20.setLenient(true);
        boolean boolean23 = dateFormat20.isLenient();
        java.util.Calendar calendar24 = dateFormat20.getCalendar();
        java.util.TimeZone timeZone25 = dateFormat20.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone25);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        stdDateFormat26.setNumberFormat(numberFormat29);
        java.lang.String str31 = stdDateFormat26.toString();
        java.util.TimeZone timeZone32 = stdDateFormat26._timezone;
        java.text.DateFormat dateFormat33 = stdDateFormat26._formatRFC1123;
        java.text.DateFormat dateFormat34 = stdDateFormat26._formatISO8601;
        java.text.DateFormat dateFormat35 = stdDateFormat26._formatRFC1123;
        java.util.Locale locale36 = stdDateFormat26._locale;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getTimeInstance((int) (short) 0, locale36);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18, locale36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat26.", stdDateFormat6.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat6));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 100L);
        java.util.TimeZone timeZone4 = dateFormat1.getTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone4);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getTimeInstance();
        dateFormat8.setLenient(true);
        boolean boolean11 = dateFormat8.isLenient();
        java.util.Calendar calendar12 = dateFormat8.getCalendar();
        java.util.TimeZone timeZone13 = dateFormat8.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone13);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        stdDateFormat14.setNumberFormat(numberFormat17);
        java.lang.String str19 = stdDateFormat14.toString();
        java.text.DateFormat dateFormat20 = stdDateFormat14._formatPlain;
        java.util.Locale locale21 = stdDateFormat14._locale;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale21);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance(0, locale21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4, locale21);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        stdDateFormat6._formatPlain = dateFormat12;
        java.lang.String str15 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone17 = stdDateFormat6._timezone;
        java.util.Locale locale18 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getInstance();
        boolean boolean20 = dateFormat19.isLenient();
        java.util.TimeZone timeZone21 = dateFormat19.getTimeZone();
        java.text.NumberFormat numberFormat22 = dateFormat19.getNumberFormat();
        dateFormat19.setLenient(true);
        java.util.TimeZone timeZone25 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = stdDateFormat6.withTimeZone(timeZone25);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat27, stdDateFormat6, and dateFormat0.", !(stdDateFormat27.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat27.equals(dateFormat0));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601_z;
        java.text.NumberFormat numberFormat14 = stdDateFormat6.getNumberFormat();
        java.util.Locale locale15 = stdDateFormat6._locale;
        java.lang.String str16 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        dateFormat17.setLenient(true);
        boolean boolean20 = dateFormat17.isLenient();
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        stdDateFormat23.setNumberFormat(numberFormat26);
        java.lang.String str28 = stdDateFormat23.toString();
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        stdDateFormat23._formatPlain = dateFormat29;
        java.lang.String str32 = stdDateFormat23.toString();
        java.util.Locale locale33 = stdDateFormat23._locale;
        boolean boolean35 = stdDateFormat23.looksLikeISO8601("1970-01-01T07:00:00.000+0700");
        stdDateFormat6._formatISO8601 = stdDateFormat23;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatPlain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = stdDateFormat6.isLenient();
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.lang.String str13 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601_z;
        java.util.TimeZone timeZone15 = stdDateFormat6._timezone;
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("07:00");
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        dateFormat18.setLenient(true);
        boolean boolean21 = dateFormat18.isLenient();
        java.util.Calendar calendar22 = dateFormat18.getCalendar();
        java.util.TimeZone timeZone23 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        stdDateFormat24.setNumberFormat(numberFormat27);
        java.lang.String str29 = stdDateFormat24.toString();
        java.util.TimeZone timeZone30 = stdDateFormat24._timezone;
        java.text.DateFormat dateFormat31 = stdDateFormat24._formatRFC1123;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone33 = dateFormat32.getTimeZone();
        stdDateFormat24._timezone = timeZone33;
        stdDateFormat6._formatRFC1123 = stdDateFormat24;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("1/1/13 06:59");
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        java.util.TimeZone timeZone17 = stdDateFormat6._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone17);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat18, stdDateFormat6, and dateFormat0.", !(stdDateFormat18.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat18.equals(dateFormat0));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        dateFormat16.setLenient(true);
        boolean boolean19 = dateFormat16.isLenient();
        java.util.Calendar calendar20 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone21 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        stdDateFormat22.setNumberFormat(numberFormat25);
        java.lang.String str27 = stdDateFormat22.toString();
        java.util.TimeZone timeZone28 = stdDateFormat22._timezone;
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatRFC1123;
        java.util.TimeZone timeZone30 = stdDateFormat22._timezone;
        java.text.DateFormat dateFormat31 = stdDateFormat22._formatPlain;
        java.text.DateFormat dateFormat32 = stdDateFormat22._formatRFC1123;
        java.util.Locale locale33 = stdDateFormat22._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat6.withLocale(locale33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat34 and stdDateFormat22.", stdDateFormat34.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat34));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getInstance();
        boolean boolean6 = dateFormat5.isLenient();
        java.util.TimeZone timeZone7 = dateFormat5.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone7);
        stdDateFormat4._formatPlain = stdDateFormat8;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.NumberFormat numberFormat11 = stdDateFormat6.getNumberFormat();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateTimeInstance((int) (short) 1, (int) (byte) 0);
        stdDateFormat6._formatISO8601 = dateFormat15;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone19 = dateFormat18.getTimeZone();
        java.util.TimeZone timeZone20 = dateFormat18.getTimeZone();
        stdDateFormat6.setTimeZone(timeZone20);
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601;
        java.util.TimeZone timeZone15 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat18 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        dateFormat19.setLenient(true);
        boolean boolean22 = dateFormat19.isLenient();
        java.util.Calendar calendar23 = dateFormat19.getCalendar();
        java.util.TimeZone timeZone24 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        stdDateFormat25.setNumberFormat(numberFormat28);
        java.util.TimeZone timeZone30 = stdDateFormat25._timezone;
        java.text.DateFormat dateFormat31 = stdDateFormat25._formatISO8601_z;
        java.text.DateFormat dateFormat32 = stdDateFormat25._formatISO8601;
        boolean boolean34 = stdDateFormat25.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat35 = stdDateFormat25._formatISO8601;
        java.util.Locale locale36 = stdDateFormat25._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = stdDateFormat6.withLocale(locale36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat37 and stdDateFormat25.", stdDateFormat37.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat37));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("1/1/13 06:59");
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        dateFormat17.setLenient(true);
        boolean boolean20 = dateFormat17.isLenient();
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        stdDateFormat23.setNumberFormat(numberFormat26);
        java.util.TimeZone timeZone28 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat29 = stdDateFormat23._formatISO8601_z;
        java.text.DateFormat dateFormat30 = stdDateFormat23._formatISO8601_z;
        java.util.TimeZone timeZone31 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat32 = stdDateFormat23._formatISO8601;
        java.text.DateFormat dateFormat33 = stdDateFormat23._formatRFC1123;
        java.util.Locale locale34 = stdDateFormat23._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat35 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone16, locale34);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.util.Locale locale13 = stdDateFormat6._locale;
        java.text.NumberFormat numberFormat14 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.util.TimeZone timeZone16 = dateFormat15.getTimeZone();
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16);
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16);
        stdDateFormat6.setTimeZone(timeZone16);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone16);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        dateFormat5.setLenient(true);
        boolean boolean8 = dateFormat5.isLenient();
        java.util.Calendar calendar9 = dateFormat5.getCalendar();
        java.util.TimeZone timeZone10 = dateFormat5.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        stdDateFormat11.setNumberFormat(numberFormat14);
        java.util.TimeZone timeZone16 = stdDateFormat11._timezone;
        java.text.DateFormat dateFormat17 = stdDateFormat11._formatISO8601_z;
        java.text.DateFormat dateFormat18 = stdDateFormat11._formatISO8601;
        java.lang.String str19 = stdDateFormat11.toString();
        java.util.Locale locale20 = stdDateFormat11._locale;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance((int) (short) 1, locale20);
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3, locale20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.lang.String str13 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601_z;
        java.util.TimeZone timeZone15 = stdDateFormat6._timezone;
        java.lang.String str16 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.util.TimeZone timeZone18 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18);
        stdDateFormat6._timezone = timeZone18;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat19.", stdDateFormat6.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat6));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        boolean boolean19 = dateFormat16.equals((java.lang.Object) 2);
        stdDateFormat6._formatISO8601_z = dateFormat16;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone22 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        dateFormat23.setLenient(true);
        boolean boolean26 = dateFormat23.isLenient();
        java.util.Calendar calendar27 = dateFormat23.getCalendar();
        java.util.TimeZone timeZone28 = dateFormat23.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone28);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        stdDateFormat29.setNumberFormat(numberFormat32);
        java.lang.String str34 = stdDateFormat29.toString();
        java.util.TimeZone timeZone35 = stdDateFormat29._timezone;
        java.text.DateFormat dateFormat36 = stdDateFormat29._formatRFC1123;
        java.lang.String str37 = stdDateFormat29.toString();
        java.text.DateFormat dateFormat38 = stdDateFormat29._formatRFC1123;
        java.util.Locale locale39 = stdDateFormat29._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat40 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22, locale39);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat16.", dateFormat0.equals(dateFormat16) == dateFormat16.equals(dateFormat0));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.util.TimeZone timeZone13 = stdDateFormat6._timezone;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat15, stdDateFormat6, and dateFormat0.", !(stdDateFormat15.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat15.equals(dateFormat0));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat14, stdDateFormat6, and dateFormat0.", !(stdDateFormat14.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat14.equals(dateFormat0));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601;
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("1970-01-01T07:00:00.005+0700");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat6, and dateFormat0.", !(stdDateFormat16.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat16.equals(dateFormat0));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.util.Locale locale12 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str17 = dateFormat15.format((java.lang.Object) 100L);
        java.lang.String str19 = dateFormat15.format((java.lang.Object) 3);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        dateFormat21.setLenient(true);
        boolean boolean24 = dateFormat21.isLenient();
        java.util.Calendar calendar25 = dateFormat21.getCalendar();
        java.util.TimeZone timeZone26 = dateFormat21.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone26);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        stdDateFormat27.setNumberFormat(numberFormat30);
        java.lang.String str32 = stdDateFormat27.toString();
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        stdDateFormat27._formatPlain = dateFormat33;
        java.util.Calendar calendar36 = dateFormat33.getCalendar();
        dateFormat20.setCalendar(calendar36);
        boolean boolean38 = dateFormat15.equals((java.lang.Object) calendar36);
        stdDateFormat6.setCalendar(calendar36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat27.", stdDateFormat6.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat6));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.NumberFormat numberFormat11 = stdDateFormat6.getNumberFormat();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        dateFormat15.setLenient(true);
        boolean boolean18 = dateFormat15.isLenient();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        stdDateFormat21.setNumberFormat(numberFormat24);
        java.lang.String str26 = stdDateFormat21.toString();
        java.util.TimeZone timeZone27 = stdDateFormat21._timezone;
        java.util.TimeZone timeZone28 = stdDateFormat21._timezone;
        java.util.Locale locale29 = stdDateFormat21._locale;
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance((int) (short) 1, locale29);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance((int) (short) 0, locale29);
        stdDateFormat6._formatISO8601_z = dateFormat31;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat21.", stdDateFormat6.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat6));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.lang.String str13 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601_z;
        java.util.TimeZone timeZone15 = stdDateFormat6._timezone;
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date18 = stdDateFormat6.parse("1970-01-01T07:00:00.010+0700");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.lang.String str14 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.util.Locale locale16 = stdDateFormat6._locale;
        boolean boolean18 = stdDateFormat6.looksLikeISO8601("yyyy-MM-dd");
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        dateFormat24.setLenient(true);
        boolean boolean27 = dateFormat24.isLenient();
        java.util.Calendar calendar28 = dateFormat24.getCalendar();
        java.util.TimeZone timeZone29 = dateFormat24.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone29);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        stdDateFormat30.setNumberFormat(numberFormat33);
        java.lang.String str35 = stdDateFormat30.toString();
        java.util.TimeZone timeZone36 = stdDateFormat30._timezone;
        java.util.TimeZone timeZone37 = stdDateFormat30._timezone;
        java.util.Locale locale38 = stdDateFormat30._locale;
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateInstance((int) (short) 0, locale38);
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getTimeInstance((int) (short) 1, locale38);
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, 2, locale38);
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateInstance(0, locale38);
        boolean boolean43 = stdDateFormat6.equals((java.lang.Object) dateFormat42);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat30.", stdDateFormat6.equals(stdDateFormat30) == stdDateFormat30.equals(stdDateFormat6));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.util.Locale locale12 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.Locale locale14 = stdDateFormat6._locale;
        java.util.TimeZone timeZone15 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        dateFormat16.setLenient(true);
        boolean boolean19 = dateFormat16.isLenient();
        java.util.Calendar calendar20 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone21 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        stdDateFormat22.setNumberFormat(numberFormat25);
        java.lang.String str27 = stdDateFormat22.toString();
        java.util.TimeZone timeZone28 = stdDateFormat22._timezone;
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatRFC1123;
        java.text.DateFormat dateFormat30 = stdDateFormat22._formatISO8601;
        java.util.TimeZone timeZone31 = stdDateFormat22._timezone;
        stdDateFormat6._formatPlain = stdDateFormat22;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.lang.String str13 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str18 = dateFormat16.format((java.lang.Object) 100L);
        java.text.NumberFormat numberFormat19 = dateFormat16.getNumberFormat();
        java.util.Calendar calendar20 = dateFormat16.getCalendar();
        dateFormat16.setLenient(true);
        stdDateFormat6._formatPlain = dateFormat16;
        java.text.DateFormat dateFormat24 = stdDateFormat6._formatISO8601;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean25 = stdDateFormat6.isLenient();
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.util.Locale locale12 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("1970-01-01T00:00:00.000+0000");
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat18 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        dateFormat19.setLenient(true);
        boolean boolean22 = dateFormat19.isLenient();
        java.util.Calendar calendar23 = dateFormat19.getCalendar();
        java.util.TimeZone timeZone24 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        stdDateFormat25.setNumberFormat(numberFormat28);
        java.lang.String str30 = stdDateFormat25.toString();
        java.text.DateFormat dateFormat31 = stdDateFormat25._formatPlain;
        java.text.DateFormat dateFormat32 = stdDateFormat25._formatISO8601_z;
        java.text.NumberFormat numberFormat33 = stdDateFormat25.getNumberFormat();
        java.util.Locale locale34 = stdDateFormat25._locale;
        java.text.DateFormat dateFormat35 = stdDateFormat25._formatISO8601_z;
        java.util.Locale locale36 = stdDateFormat25._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = stdDateFormat6.withLocale(locale36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat37 and stdDateFormat25.", stdDateFormat37.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat37));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone15 = stdDateFormat6._timezone;
        java.util.Locale locale16 = stdDateFormat6._locale;
        java.text.NumberFormat numberFormat17 = stdDateFormat6.getNumberFormat();
        boolean boolean19 = stdDateFormat6.looksLikeISO8601("07:00:00");
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        dateFormat20.setLenient(true);
        boolean boolean23 = dateFormat20.isLenient();
        java.util.Calendar calendar24 = dateFormat20.getCalendar();
        java.util.TimeZone timeZone25 = dateFormat20.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone25);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        stdDateFormat26.setNumberFormat(numberFormat29);
        java.lang.String str31 = stdDateFormat26.toString();
        java.util.TimeZone timeZone32 = stdDateFormat26._timezone;
        java.util.TimeZone timeZone33 = stdDateFormat26._timezone;
        java.text.DateFormat dateFormat34 = stdDateFormat26._formatPlain;
        java.util.Locale locale35 = stdDateFormat26._locale;
        java.lang.String str36 = stdDateFormat26.toString();
        stdDateFormat6._formatPlain = stdDateFormat26;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat26.", stdDateFormat6.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat6));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatPlain;
        boolean boolean18 = stdDateFormat6.looksLikeISO8601("");
        java.util.Locale locale19 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        stdDateFormat6._formatISO8601_z = dateFormat21;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        dateFormat24.setLenient(true);
        boolean boolean27 = dateFormat24.isLenient();
        java.util.Calendar calendar28 = dateFormat24.getCalendar();
        java.util.TimeZone timeZone29 = dateFormat24.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone29);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        stdDateFormat30.setNumberFormat(numberFormat33);
        java.lang.String str35 = stdDateFormat30.toString();
        java.util.TimeZone timeZone36 = stdDateFormat30._timezone;
        java.text.DateFormat dateFormat37 = stdDateFormat30._formatRFC1123;
        java.text.DateFormat dateFormat38 = stdDateFormat30._formatRFC1123;
        java.text.NumberFormat numberFormat39 = stdDateFormat30.getNumberFormat();
        java.util.TimeZone timeZone40 = stdDateFormat30._timezone;
        stdDateFormat6._timezone = timeZone40;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat30.", stdDateFormat6.equals(stdDateFormat30) == stdDateFormat30.equals(stdDateFormat6));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.NumberFormat numberFormat11 = stdDateFormat6.getNumberFormat();
        java.util.Locale locale12 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone18 = dateFormat17.getTimeZone();
        boolean boolean19 = dateFormat14.equals((java.lang.Object) timeZone18);
        stdDateFormat6._formatRFC1123 = dateFormat14;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat21, stdDateFormat6, and dateFormat0.", !(stdDateFormat21.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat21.equals(dateFormat0));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        java.util.Calendar calendar3 = dateFormat0.getCalendar();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        dateFormat4.setLenient(true);
        boolean boolean7 = dateFormat4.isLenient();
        java.util.Calendar calendar8 = dateFormat4.getCalendar();
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        stdDateFormat10.setNumberFormat(numberFormat13);
        java.lang.String str15 = stdDateFormat10.toString();
        java.text.DateFormat dateFormat16 = stdDateFormat10._formatPlain;
        java.text.DateFormat dateFormat17 = stdDateFormat10._formatRFC1123;
        java.text.NumberFormat numberFormat18 = stdDateFormat10.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat18);
        boolean boolean20 = dateFormat0.isLenient();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str25 = dateFormat23.format((java.lang.Object) 100L);
        java.text.NumberFormat numberFormat26 = dateFormat23.getNumberFormat();
        java.util.Calendar calendar27 = dateFormat23.getCalendar();
        dateFormat21.setCalendar(calendar27);
        dateFormat0.setCalendar(calendar27);
        java.util.TimeZone timeZone30 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance();
        dateFormat33.setLenient(true);
        boolean boolean36 = dateFormat33.isLenient();
        java.util.Calendar calendar37 = dateFormat33.getCalendar();
        java.util.TimeZone timeZone38 = dateFormat33.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone38);
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat42 = dateFormat41.getNumberFormat();
        stdDateFormat39.setNumberFormat(numberFormat42);
        java.lang.String str44 = stdDateFormat39.toString();
        java.util.TimeZone timeZone45 = stdDateFormat39._timezone;
        java.util.TimeZone timeZone46 = stdDateFormat39._timezone;
        java.util.Locale locale47 = stdDateFormat39._locale;
        java.text.DateFormat dateFormat48 = java.text.DateFormat.getDateInstance((int) (short) 0, locale47);
        java.text.DateFormat dateFormat49 = java.text.DateFormat.getTimeInstance((int) (short) 1, locale47);
        boolean boolean50 = dateFormat0.equals((java.lang.Object) dateFormat49);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat10 and stdDateFormat39.", stdDateFormat10.equals(stdDateFormat39) == stdDateFormat39.equals(stdDateFormat10));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601;
        java.util.TimeZone timeZone13 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        dateFormat17.setLenient(true);
        boolean boolean20 = dateFormat17.isLenient();
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        stdDateFormat23.setNumberFormat(numberFormat26);
        java.lang.String str28 = stdDateFormat23.toString();
        java.text.DateFormat dateFormat29 = stdDateFormat23._formatPlain;
        java.util.Locale locale30 = stdDateFormat23._locale;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale30);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance(0, locale30);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale30);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone13, locale30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.NumberFormat numberFormat11 = stdDateFormat6.getNumberFormat();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.NumberFormat numberFormat13 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.lang.String str15 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat6, and dateFormat0.", !(stdDateFormat17.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat17.equals(dateFormat0));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.util.Locale locale13 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.util.Calendar calendar15 = stdDateFormat6.getCalendar();
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        dateFormat18.setLenient(true);
        boolean boolean21 = dateFormat18.isLenient();
        java.util.Calendar calendar22 = dateFormat18.getCalendar();
        java.util.TimeZone timeZone23 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        stdDateFormat24.setNumberFormat(numberFormat27);
        java.lang.String str29 = stdDateFormat24.toString();
        java.util.TimeZone timeZone30 = stdDateFormat24._timezone;
        java.util.Locale locale31 = stdDateFormat24._locale;
        boolean boolean33 = stdDateFormat24.looksLikeISO8601("2513-01-01T07:00:00.000+0700");
        java.util.Locale locale34 = stdDateFormat24._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat6.withLocale(locale34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat35 and stdDateFormat24.", stdDateFormat35.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat35));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        boolean boolean2 = dateFormat0.isLenient();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601;
        java.util.TimeZone timeZone15 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date17 = stdDateFormat6.parse("1970-01-01T07:00:00.010+0700");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        stdDateFormat6._formatPlain = dateFormat12;
        java.lang.String str15 = stdDateFormat6.toString();
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("");
        java.util.TimeZone timeZone18 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(true);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601_z;
        java.text.NumberFormat numberFormat14 = stdDateFormat6.getNumberFormat();
        boolean boolean16 = stdDateFormat6.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = stdDateFormat6.isLenient();
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("1/1/13 06:59");
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601_z;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone17 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.lang.String str16 = stdDateFormat6.toString();
        java.lang.String str17 = stdDateFormat6.toString();
        java.lang.String str18 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat19 = stdDateFormat6._formatISO8601;
        boolean boolean21 = stdDateFormat6.looksLikeISO8601("1970-01-01T07:00:00.010+0700");
        java.util.TimeZone timeZone22 = stdDateFormat6._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat23, stdDateFormat6, and dateFormat0.", !(stdDateFormat23.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat23.equals(dateFormat0));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance();
        dateFormat1.setLenient(true);
        boolean boolean4 = dateFormat1.isLenient();
        java.util.Calendar calendar5 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone6 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        stdDateFormat7.setNumberFormat(numberFormat10);
        java.lang.String str12 = stdDateFormat7.toString();
        java.text.DateFormat dateFormat13 = stdDateFormat7._formatPlain;
        java.text.DateFormat dateFormat14 = stdDateFormat7._formatISO8601_z;
        java.text.NumberFormat numberFormat15 = stdDateFormat7.getNumberFormat();
        java.util.Locale locale16 = stdDateFormat7._locale;
        java.text.DateFormat dateFormat17 = stdDateFormat7._formatISO8601_z;
        java.util.Locale locale18 = stdDateFormat7._locale;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (short) 0, locale18);
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat21, stdDateFormat7, and dateFormat1.", !(stdDateFormat21.equals(stdDateFormat7) && stdDateFormat7.equals(dateFormat1)) || stdDateFormat21.equals(dateFormat1));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        dateFormat5.setLenient(true);
        boolean boolean8 = dateFormat5.isLenient();
        java.util.Calendar calendar9 = dateFormat5.getCalendar();
        java.util.TimeZone timeZone10 = dateFormat5.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        stdDateFormat11.setNumberFormat(numberFormat14);
        java.util.TimeZone timeZone16 = stdDateFormat11._timezone;
        java.text.DateFormat dateFormat17 = stdDateFormat11._formatISO8601_z;
        java.text.DateFormat dateFormat18 = stdDateFormat11._formatISO8601;
        java.lang.String str19 = stdDateFormat11.toString();
        java.util.Locale locale20 = stdDateFormat11._locale;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance((int) (short) 1, locale20);
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3, locale20);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat23, stdDateFormat11, and dateFormat0.", !(stdDateFormat23.equals(stdDateFormat11) && stdDateFormat11.equals(dateFormat0)) || stdDateFormat23.equals(dateFormat0));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601;
        java.util.TimeZone timeZone13 = stdDateFormat6._timezone;
        java.util.Calendar calendar14 = stdDateFormat6.getCalendar();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        dateFormat15.setLenient(true);
        boolean boolean18 = dateFormat15.isLenient();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        stdDateFormat21.setNumberFormat(numberFormat24);
        java.lang.String str26 = stdDateFormat21.toString();
        java.util.TimeZone timeZone27 = stdDateFormat21._timezone;
        java.text.DateFormat dateFormat28 = stdDateFormat21._formatRFC1123;
        java.util.TimeZone timeZone29 = stdDateFormat21._timezone;
        java.text.DateFormat dateFormat30 = stdDateFormat21._formatISO8601;
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        boolean boolean34 = dateFormat31.equals((java.lang.Object) 2);
        stdDateFormat21._formatISO8601_z = dateFormat31;
        java.text.DateFormat dateFormat36 = stdDateFormat21._formatRFC1123;
        stdDateFormat6._formatISO8601 = stdDateFormat21;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat31.", dateFormat0.equals(dateFormat31) == dateFormat31.equals(dateFormat0));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        stdDateFormat6._formatPlain = dateFormat12;
        java.lang.String str15 = stdDateFormat6.toString();
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("");
        java.util.TimeZone timeZone18 = stdDateFormat6._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat19, stdDateFormat6, and dateFormat0.", !(stdDateFormat19.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat19.equals(dateFormat0));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601;
        java.lang.String str14 = stdDateFormat6.toString();
        java.util.Locale locale15 = stdDateFormat6._locale;
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        dateFormat18.setLenient(true);
        boolean boolean21 = dateFormat18.isLenient();
        java.util.Calendar calendar22 = dateFormat18.getCalendar();
        java.util.TimeZone timeZone23 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        stdDateFormat24.setNumberFormat(numberFormat27);
        java.lang.String str29 = stdDateFormat24.toString();
        java.util.TimeZone timeZone30 = stdDateFormat24._timezone;
        java.util.TimeZone timeZone31 = stdDateFormat24._timezone;
        java.util.Locale locale32 = stdDateFormat24._locale;
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance((int) (short) 0, locale32);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16, locale32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        stdDateFormat6._formatPlain = dateFormat12;
        java.util.TimeZone timeZone15 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        dateFormat16.setLenient(true);
        boolean boolean19 = dateFormat16.isLenient();
        java.util.Calendar calendar20 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone21 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        stdDateFormat22.setNumberFormat(numberFormat25);
        java.lang.String str27 = stdDateFormat22.toString();
        java.util.TimeZone timeZone28 = stdDateFormat22._timezone;
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatRFC1123;
        java.util.TimeZone timeZone30 = stdDateFormat22._timezone;
        java.text.DateFormat dateFormat31 = stdDateFormat22._formatPlain;
        boolean boolean33 = stdDateFormat22.looksLikeISO8601("1970-01-01T07:00:00.005+0700");
        stdDateFormat6._formatPlain = stdDateFormat22;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        boolean boolean19 = dateFormat16.equals((java.lang.Object) 2);
        stdDateFormat6._formatISO8601_z = dateFormat16;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance(3);
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        stdDateFormat6._formatPlain = dateFormat23;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat16.", dateFormat0.equals(dateFormat16) == dateFormat16.equals(dateFormat0));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone16 = dateFormat15.getTimeZone();
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16);
        stdDateFormat6.setTimeZone(timeZone16);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        dateFormat19.setLenient(true);
        boolean boolean22 = dateFormat19.isLenient();
        java.util.Calendar calendar23 = dateFormat19.getCalendar();
        java.util.TimeZone timeZone24 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        stdDateFormat25.setNumberFormat(numberFormat28);
        java.lang.String str30 = stdDateFormat25.toString();
        java.util.TimeZone timeZone31 = stdDateFormat25._timezone;
        java.text.DateFormat dateFormat32 = stdDateFormat25._formatRFC1123;
        java.util.Locale locale33 = stdDateFormat25._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16, locale33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat25.", stdDateFormat6.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat6));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601_z;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.util.Locale locale15 = stdDateFormat6._locale;
        java.util.Locale locale16 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        stdDateFormat6._formatPlain = dateFormat17;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat17.", dateFormat0.equals(dateFormat17) == dateFormat17.equals(dateFormat0));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.NumberFormat numberFormat11 = stdDateFormat6.getNumberFormat();
        java.lang.String str12 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601_z;
        java.util.Locale locale14 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        dateFormat15.setLenient(true);
        boolean boolean18 = dateFormat15.isLenient();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        stdDateFormat21.setNumberFormat(numberFormat24);
        java.util.TimeZone timeZone26 = stdDateFormat21._timezone;
        java.text.DateFormat dateFormat27 = stdDateFormat21._formatISO8601_z;
        java.text.DateFormat dateFormat28 = stdDateFormat21._formatISO8601;
        boolean boolean30 = stdDateFormat21.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat31 = stdDateFormat21._formatISO8601;
        java.util.Locale locale32 = stdDateFormat21._locale;
        java.util.TimeZone timeZone33 = stdDateFormat21._timezone;
        java.text.NumberFormat numberFormat34 = stdDateFormat21.getNumberFormat();
        stdDateFormat6._formatISO8601_z = stdDateFormat21;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat21.", stdDateFormat6.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat6));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.lang.String str16 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        java.lang.String str18 = stdDateFormat6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = stdDateFormat6.isLenient();
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601_z;
        java.util.Calendar calendar18 = stdDateFormat6.getCalendar();
        java.util.Locale locale19 = stdDateFormat6._locale;
        java.lang.String str20 = stdDateFormat6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = stdDateFormat6.isLenient();
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        boolean boolean18 = stdDateFormat6.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        dateFormat19.setLenient(true);
        boolean boolean22 = dateFormat19.isLenient();
        java.util.Calendar calendar23 = dateFormat19.getCalendar();
        java.util.TimeZone timeZone24 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        stdDateFormat25.setNumberFormat(numberFormat28);
        java.lang.String str30 = stdDateFormat25.toString();
        java.text.DateFormat dateFormat31 = stdDateFormat25._formatPlain;
        java.text.DateFormat dateFormat32 = stdDateFormat25._formatRFC1123;
        java.text.DateFormat dateFormat33 = stdDateFormat25._formatRFC1123;
        java.text.DateFormat dateFormat34 = stdDateFormat25._formatISO8601_z;
        java.util.TimeZone timeZone35 = stdDateFormat25._timezone;
        stdDateFormat6._timezone = timeZone35;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat25.", stdDateFormat6.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat6));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        stdDateFormat6._formatPlain = dateFormat12;
        java.lang.String str15 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone17 = stdDateFormat6._timezone;
        java.util.Locale locale18 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getInstance();
        boolean boolean20 = dateFormat19.isLenient();
        java.util.TimeZone timeZone21 = dateFormat19.getTimeZone();
        java.text.NumberFormat numberFormat22 = dateFormat19.getNumberFormat();
        dateFormat19.setLenient(true);
        java.util.TimeZone timeZone25 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = stdDateFormat6.withTimeZone(timeZone25);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone25);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat27, stdDateFormat6, and dateFormat0.", !(stdDateFormat27.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat27.equals(dateFormat0));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.NumberFormat numberFormat11 = stdDateFormat6.getNumberFormat();
        java.util.Locale locale12 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        dateFormat14.setLenient(true);
        boolean boolean17 = dateFormat14.isLenient();
        java.util.Calendar calendar18 = dateFormat14.getCalendar();
        java.util.TimeZone timeZone19 = dateFormat14.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        stdDateFormat20.setNumberFormat(numberFormat23);
        java.util.TimeZone timeZone25 = stdDateFormat20._timezone;
        java.util.Locale locale26 = stdDateFormat20._locale;
        java.text.DateFormat dateFormat27 = stdDateFormat20._formatRFC1123;
        boolean boolean29 = stdDateFormat20.looksLikeISO8601("1970-01-01T00:00:00.000+0000");
        java.text.DateFormat dateFormat30 = stdDateFormat20._formatRFC1123;
        stdDateFormat6._formatPlain = stdDateFormat20;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat20.", stdDateFormat6.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat6));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat6, and dateFormat0.", !(stdDateFormat16.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat16.equals(dateFormat0));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.util.Locale locale13 = stdDateFormat6._locale;
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        java.util.Locale locale16 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getInstance();
        boolean boolean19 = dateFormat18.isLenient();
        java.util.TimeZone timeZone20 = dateFormat18.getTimeZone();
        java.text.NumberFormat numberFormat21 = dateFormat18.getNumberFormat();
        dateFormat18.setLenient(true);
        java.util.TimeZone timeZone24 = dateFormat18.getTimeZone();
        stdDateFormat6.setTimeZone(timeZone24);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance();
        dateFormat26.setLenient(true);
        boolean boolean29 = dateFormat26.isLenient();
        java.util.Calendar calendar30 = dateFormat26.getCalendar();
        java.util.TimeZone timeZone31 = dateFormat26.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone31);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat35 = dateFormat34.getNumberFormat();
        stdDateFormat32.setNumberFormat(numberFormat35);
        java.lang.String str37 = stdDateFormat32.toString();
        java.text.DateFormat dateFormat38 = stdDateFormat32._formatPlain;
        java.text.DateFormat dateFormat39 = stdDateFormat32._formatISO8601;
        java.text.DateFormat dateFormat40 = stdDateFormat32._formatISO8601_z;
        java.util.Locale locale41 = stdDateFormat32._locale;
        java.util.Locale locale42 = stdDateFormat32._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat43 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone24, locale42);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601;
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        java.lang.String str17 = stdDateFormat6.toString();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat18, stdDateFormat6, and dateFormat0.", !(stdDateFormat18.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat18.equals(dateFormat0));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.NumberFormat numberFormat11 = stdDateFormat6.getNumberFormat();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.NumberFormat numberFormat13 = stdDateFormat6.getNumberFormat();
        java.text.NumberFormat numberFormat14 = stdDateFormat6.getNumberFormat();
        java.util.TimeZone timeZone15 = stdDateFormat6._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat6, and dateFormat0.", !(stdDateFormat16.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat16.equals(dateFormat0));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.NumberFormat numberFormat11 = stdDateFormat6.getNumberFormat();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.util.TimeZone timeZone13 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatPlain;
        boolean boolean16 = stdDateFormat6.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        dateFormat17.setLenient(true);
        boolean boolean20 = dateFormat17.isLenient();
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        stdDateFormat23.setNumberFormat(numberFormat26);
        java.lang.String str28 = stdDateFormat23.toString();
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        stdDateFormat23._formatPlain = dateFormat29;
        java.text.NumberFormat numberFormat32 = stdDateFormat23.getNumberFormat();
        java.util.Calendar calendar33 = stdDateFormat23.getCalendar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean34 = stdDateFormat6.equals((java.lang.Object) stdDateFormat23);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.util.Locale locale13 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.util.Calendar calendar15 = stdDateFormat6.getCalendar();
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        dateFormat17.setLenient(true);
        boolean boolean20 = dateFormat17.isLenient();
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        stdDateFormat23.setNumberFormat(numberFormat26);
        java.lang.String str28 = stdDateFormat23.toString();
        java.util.TimeZone timeZone29 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat30 = stdDateFormat23._formatRFC1123;
        java.text.DateFormat dateFormat31 = stdDateFormat23._formatISO8601;
        java.text.DateFormat dateFormat32 = stdDateFormat23._formatRFC1123;
        java.util.Locale locale33 = stdDateFormat23._locale;
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16, locale33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601_z;
        java.lang.String str15 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str20 = dateFormat18.format((java.lang.Object) 100L);
        dateFormat18.setLenient(true);
        java.text.NumberFormat numberFormat23 = dateFormat18.getNumberFormat();
        stdDateFormat6._formatISO8601 = dateFormat18;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance();
        dateFormat25.setLenient(true);
        boolean boolean28 = dateFormat25.isLenient();
        java.util.Calendar calendar29 = dateFormat25.getCalendar();
        java.util.TimeZone timeZone30 = dateFormat25.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone30);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        stdDateFormat31.setNumberFormat(numberFormat34);
        java.text.NumberFormat numberFormat36 = stdDateFormat31.getNumberFormat();
        java.lang.String str37 = stdDateFormat31.toString();
        java.util.TimeZone timeZone38 = stdDateFormat31._timezone;
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone38);
        stdDateFormat6.setTimeZone(timeZone38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat31.", stdDateFormat6.equals(stdDateFormat31) == stdDateFormat31.equals(stdDateFormat6));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.util.Locale locale13 = stdDateFormat6._locale;
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        dateFormat16.setLenient(true);
        boolean boolean19 = dateFormat16.isLenient();
        java.util.Calendar calendar20 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone21 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        stdDateFormat22.setNumberFormat(numberFormat25);
        java.lang.String str27 = stdDateFormat22.toString();
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        stdDateFormat22._formatPlain = dateFormat28;
        java.text.NumberFormat numberFormat31 = stdDateFormat22.getNumberFormat();
        java.util.Calendar calendar32 = stdDateFormat22.getCalendar();
        java.text.DateFormat dateFormat33 = stdDateFormat22._formatISO8601;
        java.text.NumberFormat numberFormat34 = stdDateFormat22.getNumberFormat();
        java.util.Locale locale35 = stdDateFormat22._locale;
        java.util.TimeZone timeZone36 = stdDateFormat22._timezone;
        stdDateFormat6._formatRFC1123 = stdDateFormat22;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        boolean boolean5 = dateFormat0.equals((java.lang.Object) timeZone4);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance();
        dateFormat6.setLenient(true);
        boolean boolean9 = dateFormat6.isLenient();
        java.util.Calendar calendar10 = dateFormat6.getCalendar();
        java.util.TimeZone timeZone11 = dateFormat6.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone11);
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        stdDateFormat12.setNumberFormat(numberFormat15);
        java.lang.String str17 = stdDateFormat12.toString();
        java.util.TimeZone timeZone18 = stdDateFormat12._timezone;
        java.text.DateFormat dateFormat19 = stdDateFormat12._formatRFC1123;
        java.text.DateFormat dateFormat20 = stdDateFormat12._formatISO8601;
        java.text.DateFormat dateFormat21 = stdDateFormat12._formatPlain;
        java.util.TimeZone timeZone22 = stdDateFormat12._timezone;
        java.text.DateFormat dateFormat23 = stdDateFormat12._formatISO8601_z;
        java.util.Calendar calendar24 = stdDateFormat12.getCalendar();
        java.util.Locale locale25 = stdDateFormat12._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4, locale25);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat26, stdDateFormat12, and dateFormat0.", !(stdDateFormat26.equals(stdDateFormat12) && stdDateFormat12.equals(dateFormat0)) || stdDateFormat26.equals(dateFormat0));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.util.TimeZone timeZone13 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        dateFormat15.setLenient(true);
        boolean boolean18 = dateFormat15.isLenient();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        stdDateFormat21.setNumberFormat(numberFormat24);
        java.util.TimeZone timeZone26 = stdDateFormat21._timezone;
        java.text.DateFormat dateFormat27 = stdDateFormat21._formatISO8601_z;
        java.text.DateFormat dateFormat28 = stdDateFormat21._formatISO8601_z;
        java.util.TimeZone timeZone29 = stdDateFormat21._timezone;
        java.util.Locale locale30 = stdDateFormat21._locale;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance(1, locale30);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = stdDateFormat6.withLocale(locale30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat32 and stdDateFormat21.", stdDateFormat32.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat32));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.NumberFormat numberFormat14 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601;
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        dateFormat22.setLenient(true);
        boolean boolean25 = dateFormat22.isLenient();
        java.util.Calendar calendar26 = dateFormat22.getCalendar();
        java.util.TimeZone timeZone27 = dateFormat22.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone27);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        stdDateFormat28.setNumberFormat(numberFormat31);
        java.lang.String str33 = stdDateFormat28.toString();
        java.util.TimeZone timeZone34 = stdDateFormat28._timezone;
        java.util.TimeZone timeZone35 = stdDateFormat28._timezone;
        java.util.Locale locale36 = stdDateFormat28._locale;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance((int) (short) 0, locale36);
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getTimeInstance((int) (short) 1, locale36);
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, 2, locale36);
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16, locale36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat28.", stdDateFormat6.equals(stdDateFormat28) == stdDateFormat28.equals(stdDateFormat6));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.lang.String str14 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("07:00");
        java.text.NumberFormat numberFormat18 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        dateFormat20.setLenient(true);
        boolean boolean23 = dateFormat20.isLenient();
        java.util.Calendar calendar24 = dateFormat20.getCalendar();
        java.util.TimeZone timeZone25 = dateFormat20.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone25);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        stdDateFormat26.setNumberFormat(numberFormat29);
        java.text.NumberFormat numberFormat31 = stdDateFormat26.getNumberFormat();
        java.util.Locale locale32 = stdDateFormat26._locale;
        java.text.DateFormat dateFormat33 = stdDateFormat26._formatRFC1123;
        java.text.DateFormat dateFormat34 = stdDateFormat26._formatISO8601;
        java.util.Locale locale35 = stdDateFormat26._locale;
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance((int) (short) 0, locale35);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = stdDateFormat6.withLocale(locale35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat37 and stdDateFormat26.", stdDateFormat37.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat37));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.NumberFormat numberFormat11 = stdDateFormat6.getNumberFormat();
        java.util.Locale locale12 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601;
        java.util.Locale locale15 = stdDateFormat6._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone16 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601;
        java.util.TimeZone timeZone13 = stdDateFormat6._timezone;
        java.text.NumberFormat numberFormat14 = stdDateFormat6.getNumberFormat();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = stdDateFormat6.isLenient();
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.lang.String str13 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str18 = dateFormat16.format((java.lang.Object) 100L);
        java.text.NumberFormat numberFormat19 = dateFormat16.getNumberFormat();
        java.util.Calendar calendar20 = dateFormat16.getCalendar();
        dateFormat16.setLenient(true);
        stdDateFormat6._formatPlain = dateFormat16;
        java.text.DateFormat dateFormat24 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance();
        dateFormat25.setLenient(true);
        boolean boolean28 = dateFormat25.isLenient();
        java.util.Calendar calendar29 = dateFormat25.getCalendar();
        java.util.TimeZone timeZone30 = dateFormat25.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone30);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        stdDateFormat31.setNumberFormat(numberFormat34);
        java.lang.String str36 = stdDateFormat31.toString();
        java.util.TimeZone timeZone37 = stdDateFormat31._timezone;
        java.text.DateFormat dateFormat38 = stdDateFormat31._formatRFC1123;
        java.util.TimeZone timeZone39 = stdDateFormat31._timezone;
        java.text.DateFormat dateFormat40 = stdDateFormat31._formatPlain;
        java.lang.String str41 = stdDateFormat31.toString();
        java.text.DateFormat dateFormat42 = stdDateFormat31._formatISO8601;
        java.util.Locale locale43 = stdDateFormat31._locale;
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getTimeInstance();
        dateFormat44.setLenient(true);
        boolean boolean47 = dateFormat44.isLenient();
        java.util.Calendar calendar48 = dateFormat44.getCalendar();
        stdDateFormat31._formatISO8601 = dateFormat44;
        stdDateFormat6._formatPlain = dateFormat44;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat31.", stdDateFormat6.equals(stdDateFormat31) == stdDateFormat31.equals(stdDateFormat6));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) 1, 1);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        dateFormat4.setLenient(true);
        boolean boolean7 = dateFormat4.isLenient();
        java.util.Calendar calendar8 = dateFormat4.getCalendar();
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        stdDateFormat10.setNumberFormat(numberFormat13);
        java.lang.String str15 = stdDateFormat10.toString();
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        stdDateFormat10._formatPlain = dateFormat16;
        java.lang.String str19 = stdDateFormat10.toString();
        java.util.Calendar calendar20 = stdDateFormat10.getCalendar();
        java.text.DateFormat dateFormat21 = stdDateFormat10._formatPlain;
        java.util.TimeZone timeZone22 = stdDateFormat10._timezone;
        java.util.Locale locale23 = stdDateFormat10._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale23);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat24, stdDateFormat10, and dateFormat2.", !(stdDateFormat24.equals(stdDateFormat10) && stdDateFormat10.equals(dateFormat2)) || stdDateFormat24.equals(dateFormat2));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        stdDateFormat6._formatPlain = dateFormat12;
        java.lang.String str15 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone17 = stdDateFormat6._timezone;
        java.util.Locale locale18 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getInstance();
        boolean boolean20 = dateFormat19.isLenient();
        java.util.TimeZone timeZone21 = dateFormat19.getTimeZone();
        java.text.NumberFormat numberFormat22 = dateFormat19.getNumberFormat();
        dateFormat19.setLenient(true);
        java.util.TimeZone timeZone25 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = stdDateFormat6.withTimeZone(timeZone25);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        dateFormat27.setLenient(true);
        boolean boolean30 = dateFormat27.isLenient();
        java.util.Calendar calendar31 = dateFormat27.getCalendar();
        java.util.TimeZone timeZone32 = dateFormat27.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone32);
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat36 = dateFormat35.getNumberFormat();
        stdDateFormat33.setNumberFormat(numberFormat36);
        java.lang.String str38 = stdDateFormat33.toString();
        java.util.TimeZone timeZone39 = stdDateFormat33._timezone;
        java.text.DateFormat dateFormat40 = stdDateFormat33._formatRFC1123;
        java.lang.String str41 = stdDateFormat33.toString();
        java.text.DateFormat dateFormat42 = stdDateFormat33._formatRFC1123;
        boolean boolean44 = stdDateFormat33.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean45 = stdDateFormat26.equals((java.lang.Object) stdDateFormat33);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.util.Locale locale12 = stdDateFormat6._locale;
        java.lang.String str13 = stdDateFormat6.toString();
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        dateFormat15.setLenient(true);
        boolean boolean18 = dateFormat15.isLenient();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        stdDateFormat21.setNumberFormat(numberFormat24);
        java.lang.String str26 = stdDateFormat21.toString();
        java.util.TimeZone timeZone27 = stdDateFormat21._timezone;
        java.text.DateFormat dateFormat28 = stdDateFormat21._formatRFC1123;
        java.text.DateFormat dateFormat29 = stdDateFormat21._formatRFC1123;
        java.text.NumberFormat numberFormat30 = stdDateFormat21.getNumberFormat();
        java.text.DateFormat dateFormat31 = stdDateFormat21._formatISO8601;
        java.util.Locale locale32 = stdDateFormat21._locale;
        stdDateFormat6._formatRFC1123 = stdDateFormat21;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat21.", stdDateFormat6.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat6));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str19 = dateFormat17.format((java.lang.Object) 100L);
        java.lang.String str21 = dateFormat17.format((java.lang.Object) 3);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        dateFormat23.setLenient(true);
        boolean boolean26 = dateFormat23.isLenient();
        java.util.Calendar calendar27 = dateFormat23.getCalendar();
        java.util.TimeZone timeZone28 = dateFormat23.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone28);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        stdDateFormat29.setNumberFormat(numberFormat32);
        java.lang.String str34 = stdDateFormat29.toString();
        java.text.DateFormat dateFormat35 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat36 = dateFormat35.getNumberFormat();
        stdDateFormat29._formatPlain = dateFormat35;
        java.util.Calendar calendar38 = dateFormat35.getCalendar();
        dateFormat22.setCalendar(calendar38);
        boolean boolean40 = dateFormat17.equals((java.lang.Object) calendar38);
        java.util.TimeZone timeZone41 = dateFormat17.getTimeZone();
        stdDateFormat6._formatISO8601 = dateFormat17;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat29.", stdDateFormat6.equals(stdDateFormat29) == stdDateFormat29.equals(stdDateFormat6));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601_z;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj17 = stdDateFormat6.parseObject("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601_z;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        dateFormat16.setLenient(true);
        boolean boolean19 = dateFormat16.isLenient();
        java.util.Calendar calendar20 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone21 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        stdDateFormat22.setNumberFormat(numberFormat25);
        java.lang.String str27 = stdDateFormat22.toString();
        java.text.DateFormat dateFormat28 = stdDateFormat22._formatPlain;
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatISO8601_z;
        java.text.DateFormat dateFormat30 = stdDateFormat22._formatRFC1123;
        boolean boolean32 = stdDateFormat22.looksLikeISO8601("07:00:00");
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance(3);
        stdDateFormat22._formatISO8601_z = dateFormat34;
        java.util.TimeZone timeZone36 = stdDateFormat22._timezone;
        stdDateFormat6._formatISO8601_z = stdDateFormat22;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601_z;
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone16);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601_z;
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat6, and dateFormat0.", !(stdDateFormat17.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat17.equals(dateFormat0));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601_z;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.NumberFormat numberFormat14 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        java.util.TimeZone timeZone17 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone17);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        java.util.Calendar calendar21 = dateFormat19.getCalendar();
        java.util.TimeZone timeZone22 = dateFormat19.getTimeZone();
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        dateFormat24.setLenient(true);
        boolean boolean27 = dateFormat24.isLenient();
        java.util.Calendar calendar28 = dateFormat24.getCalendar();
        java.util.TimeZone timeZone29 = dateFormat24.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone29);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        stdDateFormat30.setNumberFormat(numberFormat33);
        java.util.TimeZone timeZone35 = stdDateFormat30._timezone;
        java.text.DateFormat dateFormat36 = stdDateFormat30._formatISO8601_z;
        java.text.DateFormat dateFormat37 = stdDateFormat30._formatISO8601;
        java.lang.String str38 = stdDateFormat30.toString();
        java.util.Locale locale39 = stdDateFormat30._locale;
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateInstance((int) (short) 1, locale39);
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone22, locale39);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat42 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone17, locale39);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat30.", stdDateFormat6.equals(stdDateFormat30) == stdDateFormat30.equals(stdDateFormat6));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.lang.String str16 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        java.util.TimeZone timeZone18 = stdDateFormat6._timezone;
        java.util.TimeZone timeZone19 = stdDateFormat6._timezone;
        java.util.TimeZone timeZone20 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        dateFormat21.setLenient(true);
        boolean boolean24 = dateFormat21.isLenient();
        java.util.Calendar calendar25 = dateFormat21.getCalendar();
        java.util.TimeZone timeZone26 = dateFormat21.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone26);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        stdDateFormat27.setNumberFormat(numberFormat30);
        java.util.TimeZone timeZone32 = stdDateFormat27._timezone;
        java.util.TimeZone timeZone33 = stdDateFormat27._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat6.withTimeZone(timeZone33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat34 and stdDateFormat27.", stdDateFormat34.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat34));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = stdDateFormat6.isLenient();
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.lang.String str16 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        java.util.Locale locale18 = stdDateFormat6._locale;
        java.util.TimeZone timeZone19 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        dateFormat23.setLenient(true);
        boolean boolean26 = dateFormat23.isLenient();
        java.util.Calendar calendar27 = dateFormat23.getCalendar();
        java.util.TimeZone timeZone28 = dateFormat23.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone28);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        stdDateFormat29.setNumberFormat(numberFormat32);
        java.lang.String str34 = stdDateFormat29.toString();
        java.text.DateFormat dateFormat35 = stdDateFormat29._formatPlain;
        java.util.Locale locale36 = stdDateFormat29._locale;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale36);
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateInstance(0, locale36);
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateInstance(1, locale36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone19, locale36);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.NumberFormat numberFormat11 = stdDateFormat6.getNumberFormat();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.NumberFormat numberFormat13 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        dateFormat15.setLenient(true);
        boolean boolean18 = dateFormat15.isLenient();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        stdDateFormat21.setNumberFormat(numberFormat24);
        java.util.TimeZone timeZone26 = stdDateFormat21._timezone;
        boolean boolean28 = stdDateFormat21.looksLikeISO8601("1/1/13 06:59");
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone31 = dateFormat30.getTimeZone();
        java.util.TimeZone timeZone32 = dateFormat30.getTimeZone();
        stdDateFormat21._formatISO8601 = dateFormat30;
        stdDateFormat6._formatRFC1123 = stdDateFormat21;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat21.", stdDateFormat6.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat6));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.util.Locale locale12 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("1970-01-01T00:00:00.000+0000");
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatRFC1123;
        java.util.Locale locale17 = stdDateFormat6._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = stdDateFormat6.format((java.lang.Object) 10.0f);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatPlain;
        boolean boolean18 = stdDateFormat6.looksLikeISO8601("");
        java.util.Locale locale19 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        stdDateFormat6._formatISO8601_z = dateFormat21;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str27 = dateFormat25.format((java.lang.Object) 100L);
        java.text.NumberFormat numberFormat28 = dateFormat25.getNumberFormat();
        java.util.Calendar calendar29 = dateFormat25.getCalendar();
        dateFormat25.setLenient(true);
        java.util.Calendar calendar32 = dateFormat25.getCalendar();
        stdDateFormat6.setCalendar(calendar32);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getTimeInstance();
        dateFormat34.setLenient(true);
        boolean boolean37 = dateFormat34.isLenient();
        java.util.Calendar calendar38 = dateFormat34.getCalendar();
        java.util.TimeZone timeZone39 = dateFormat34.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat40 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone39);
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat43 = dateFormat42.getNumberFormat();
        stdDateFormat40.setNumberFormat(numberFormat43);
        java.lang.String str45 = stdDateFormat40.toString();
        java.text.DateFormat dateFormat46 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat47 = dateFormat46.getNumberFormat();
        stdDateFormat40._formatPlain = dateFormat46;
        java.text.NumberFormat numberFormat49 = stdDateFormat40.getNumberFormat();
        java.util.Calendar calendar50 = stdDateFormat40.getCalendar();
        stdDateFormat6._formatPlain = stdDateFormat40;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat40.", stdDateFormat6.equals(stdDateFormat40) == stdDateFormat40.equals(stdDateFormat6));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(3, 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        dateFormat3.setLenient(true);
        boolean boolean6 = dateFormat3.isLenient();
        java.util.Calendar calendar7 = dateFormat3.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat3.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        stdDateFormat9.setNumberFormat(numberFormat12);
        java.lang.String str14 = stdDateFormat9.toString();
        java.util.TimeZone timeZone15 = stdDateFormat9._timezone;
        java.util.TimeZone timeZone16 = stdDateFormat9._timezone;
        java.text.DateFormat dateFormat17 = stdDateFormat9._formatPlain;
        java.util.Locale locale18 = stdDateFormat9._locale;
        boolean boolean19 = dateFormat2.equals((java.lang.Object) stdDateFormat9);
        java.text.DateFormat dateFormat20 = stdDateFormat9._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat9.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat21, stdDateFormat9, and dateFormat2.", !(stdDateFormat21.equals(stdDateFormat9) && stdDateFormat9.equals(dateFormat2)) || stdDateFormat21.equals(dateFormat2));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601_z;
        java.util.Locale locale17 = stdDateFormat6._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = stdDateFormat6.isLenient();
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.lang.String str13 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601_z;
        java.util.TimeZone timeZone15 = stdDateFormat6._timezone;
        java.lang.String str16 = stdDateFormat6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(true);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.util.Locale locale13 = stdDateFormat6._locale;
        java.text.NumberFormat numberFormat14 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.util.TimeZone timeZone16 = dateFormat15.getTimeZone();
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16);
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16);
        stdDateFormat6.setTimeZone(timeZone16);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat21, stdDateFormat6, and dateFormat0.", !(stdDateFormat21.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat21.equals(dateFormat0));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        dateFormat5.setLenient(true);
        boolean boolean8 = dateFormat5.isLenient();
        java.util.Calendar calendar9 = dateFormat5.getCalendar();
        java.util.TimeZone timeZone10 = dateFormat5.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        stdDateFormat11.setNumberFormat(numberFormat14);
        java.lang.String str16 = stdDateFormat11.toString();
        java.text.DateFormat dateFormat17 = stdDateFormat11._formatPlain;
        java.text.DateFormat dateFormat18 = stdDateFormat11._formatISO8601;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getInstance();
        boolean boolean20 = dateFormat19.isLenient();
        java.util.TimeZone timeZone21 = dateFormat19.getTimeZone();
        java.text.NumberFormat numberFormat22 = dateFormat19.getNumberFormat();
        dateFormat19.setLenient(true);
        java.util.TimeZone timeZone25 = dateFormat19.getTimeZone();
        boolean boolean26 = stdDateFormat11.equals((java.lang.Object) dateFormat19);
        java.text.DateFormat dateFormat27 = stdDateFormat11._formatISO8601_z;
        java.util.Calendar calendar28 = stdDateFormat11.getCalendar();
        java.util.Locale locale29 = stdDateFormat11._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        boolean boolean14 = stdDateFormat6.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        dateFormat15.setLenient(true);
        boolean boolean18 = dateFormat15.isLenient();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        stdDateFormat21.setNumberFormat(numberFormat24);
        java.text.NumberFormat numberFormat26 = stdDateFormat21.getNumberFormat();
        java.util.TimeZone timeZone27 = stdDateFormat21._timezone;
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone27);
        stdDateFormat6._timezone = timeZone27;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat21.", stdDateFormat6.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat6));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601_z;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        boolean boolean16 = stdDateFormat6.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatPlain;
        java.util.TimeZone timeZone18 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        dateFormat19.setLenient(true);
        boolean boolean22 = dateFormat19.isLenient();
        java.util.Calendar calendar23 = dateFormat19.getCalendar();
        java.util.TimeZone timeZone24 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        stdDateFormat25.setNumberFormat(numberFormat28);
        java.lang.String str30 = stdDateFormat25.toString();
        java.util.TimeZone timeZone31 = stdDateFormat25._timezone;
        java.util.TimeZone timeZone32 = stdDateFormat25._timezone;
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone32);
        boolean boolean35 = dateFormat33.equals((java.lang.Object) "EEE, dd MMM yyyy HH:mm:ss zzz");
        stdDateFormat6._formatISO8601 = dateFormat33;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat25.", stdDateFormat6.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat6));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        stdDateFormat6._formatPlain = dateFormat12;
        java.lang.String str15 = stdDateFormat6.toString();
        java.util.Locale locale16 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat18 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str22 = dateFormat20.format((java.lang.Object) 100L);
        java.lang.String str24 = dateFormat20.format((java.lang.Object) 3);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance();
        dateFormat26.setLenient(true);
        boolean boolean29 = dateFormat26.isLenient();
        java.util.Calendar calendar30 = dateFormat26.getCalendar();
        java.util.TimeZone timeZone31 = dateFormat26.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone31);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat35 = dateFormat34.getNumberFormat();
        stdDateFormat32.setNumberFormat(numberFormat35);
        java.lang.String str37 = stdDateFormat32.toString();
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat39 = dateFormat38.getNumberFormat();
        stdDateFormat32._formatPlain = dateFormat38;
        java.util.Calendar calendar41 = dateFormat38.getCalendar();
        dateFormat25.setCalendar(calendar41);
        boolean boolean43 = dateFormat20.equals((java.lang.Object) calendar41);
        stdDateFormat6.setCalendar(calendar41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat32.", stdDateFormat6.equals(stdDateFormat32) == stdDateFormat32.equals(stdDateFormat6));
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.NumberFormat numberFormat15 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        java.util.Locale locale17 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        dateFormat18.setLenient(true);
        boolean boolean21 = dateFormat18.isLenient();
        java.util.Calendar calendar22 = dateFormat18.getCalendar();
        java.util.TimeZone timeZone23 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        stdDateFormat24.setNumberFormat(numberFormat27);
        java.lang.String str29 = stdDateFormat24.toString();
        java.util.TimeZone timeZone30 = stdDateFormat24._timezone;
        java.text.DateFormat dateFormat31 = stdDateFormat24._formatRFC1123;
        java.lang.String str32 = stdDateFormat24.toString();
        java.text.DateFormat dateFormat33 = stdDateFormat24._formatRFC1123;
        boolean boolean35 = stdDateFormat24.looksLikeISO8601("07:00");
        java.util.TimeZone timeZone36 = stdDateFormat24._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = stdDateFormat6.withTimeZone(timeZone36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat37 and stdDateFormat24.", stdDateFormat37.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat37));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = stdDateFormat3._formatPlain;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601;
        java.util.TimeZone timeZone13 = stdDateFormat6._timezone;
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        dateFormat16.setLenient(true);
        boolean boolean19 = dateFormat16.isLenient();
        java.util.Calendar calendar20 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone21 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        stdDateFormat22.setNumberFormat(numberFormat25);
        java.text.NumberFormat numberFormat27 = stdDateFormat22.getNumberFormat();
        java.util.Locale locale28 = stdDateFormat22._locale;
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatRFC1123;
        boolean boolean31 = stdDateFormat22.looksLikeISO8601("1/1/13 06:59");
        stdDateFormat6._formatISO8601_z = stdDateFormat22;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        dateFormat22.setLenient(true);
        boolean boolean25 = dateFormat22.isLenient();
        java.util.Calendar calendar26 = dateFormat22.getCalendar();
        java.util.TimeZone timeZone27 = dateFormat22.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone27);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        stdDateFormat28.setNumberFormat(numberFormat31);
        java.lang.String str33 = stdDateFormat28.toString();
        java.text.DateFormat dateFormat34 = stdDateFormat28._formatPlain;
        java.util.Locale locale35 = stdDateFormat28._locale;
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale35);
        java.text.DateFormat dateFormat37 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone20, locale35);
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateInstance((int) (byte) 0, locale35);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = stdDateFormat6.withLocale(locale35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat39 and stdDateFormat28.", stdDateFormat39.equals(stdDateFormat28) == stdDateFormat28.equals(stdDateFormat39));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        stdDateFormat6._formatPlain = dateFormat12;
        java.lang.String str15 = stdDateFormat6.toString();
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("");
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        java.text.NumberFormat numberFormat21 = dateFormat19.getNumberFormat();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        dateFormat22.setLenient(true);
        boolean boolean25 = dateFormat22.isLenient();
        java.util.Calendar calendar26 = dateFormat22.getCalendar();
        java.util.TimeZone timeZone27 = dateFormat22.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone27);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        stdDateFormat28.setNumberFormat(numberFormat31);
        java.lang.String str33 = stdDateFormat28.toString();
        java.text.DateFormat dateFormat34 = stdDateFormat28._formatPlain;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateTimeInstance((int) (short) 1, (int) (byte) 0);
        stdDateFormat28._formatISO8601 = dateFormat37;
        java.text.NumberFormat numberFormat39 = dateFormat37.getNumberFormat();
        java.util.Calendar calendar40 = dateFormat37.getCalendar();
        dateFormat19.setCalendar(calendar40);
        stdDateFormat6._formatISO8601 = dateFormat19;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat28.", stdDateFormat6.equals(stdDateFormat28) == stdDateFormat28.equals(stdDateFormat6));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        stdDateFormat6._formatISO8601_z = dateFormat11;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        dateFormat17.setLenient(true);
        boolean boolean20 = dateFormat17.isLenient();
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        stdDateFormat23.setNumberFormat(numberFormat26);
        java.lang.String str28 = stdDateFormat23.toString();
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        stdDateFormat23._formatPlain = dateFormat29;
        java.text.NumberFormat numberFormat32 = stdDateFormat23.getNumberFormat();
        java.util.Calendar calendar33 = stdDateFormat23.getCalendar();
        java.text.DateFormat dateFormat34 = stdDateFormat23._formatISO8601;
        java.text.NumberFormat numberFormat35 = stdDateFormat23.getNumberFormat();
        java.util.Locale locale36 = stdDateFormat23._locale;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateTimeInstance(2, 0, locale36);
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone14, locale36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatRFC1123;
        java.util.Locale locale17 = stdDateFormat6._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601;
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("hi!");
        java.util.Locale locale16 = stdDateFormat6._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(false);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        dateFormat17.setLenient(true);
        boolean boolean20 = dateFormat17.isLenient();
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        stdDateFormat23.setNumberFormat(numberFormat26);
        java.lang.String str28 = stdDateFormat23.toString();
        java.util.TimeZone timeZone29 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat30 = stdDateFormat23._formatRFC1123;
        java.util.TimeZone timeZone31 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat32 = stdDateFormat23._formatISO8601;
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        boolean boolean36 = dateFormat33.equals((java.lang.Object) 2);
        stdDateFormat23._formatISO8601_z = dateFormat33;
        stdDateFormat6._formatISO8601 = stdDateFormat23;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat33.", dateFormat0.equals(dateFormat33) == dateFormat33.equals(dateFormat0));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.lang.String str16 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        java.util.TimeZone timeZone18 = stdDateFormat6._timezone;
        java.util.TimeZone timeZone19 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        dateFormat22.setLenient(true);
        boolean boolean25 = dateFormat22.isLenient();
        java.util.Calendar calendar26 = dateFormat22.getCalendar();
        java.util.TimeZone timeZone27 = dateFormat22.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone27);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        stdDateFormat28.setNumberFormat(numberFormat31);
        java.lang.String str33 = stdDateFormat28.toString();
        java.util.TimeZone timeZone34 = stdDateFormat28._timezone;
        java.util.TimeZone timeZone35 = stdDateFormat28._timezone;
        java.util.Locale locale36 = stdDateFormat28._locale;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance((int) (short) 1, locale36);
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateInstance((int) (short) 0, locale36);
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone19, locale36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat28.", stdDateFormat6.equals(stdDateFormat28) == stdDateFormat28.equals(stdDateFormat6));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.NumberFormat numberFormat15 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        java.util.Locale locale17 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        dateFormat23.setLenient(true);
        boolean boolean26 = dateFormat23.isLenient();
        java.util.Calendar calendar27 = dateFormat23.getCalendar();
        java.util.TimeZone timeZone28 = dateFormat23.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone28);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        stdDateFormat29.setNumberFormat(numberFormat32);
        java.lang.String str34 = stdDateFormat29.toString();
        java.util.TimeZone timeZone35 = stdDateFormat29._timezone;
        java.util.TimeZone timeZone36 = stdDateFormat29._timezone;
        java.util.Locale locale37 = stdDateFormat29._locale;
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateInstance((int) (short) 0, locale37);
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getTimeInstance((int) (short) 1, locale37);
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, 2, locale37);
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateInstance(0, locale37);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat42 = stdDateFormat6.withLocale(locale37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat42 and stdDateFormat29.", stdDateFormat42.equals(stdDateFormat29) == stdDateFormat29.equals(stdDateFormat42));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.lang.String str16 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat18 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat19 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat20 = stdDateFormat6._formatPlain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj22 = stdDateFormat6.parseObject("1970-01-01T00:00:00.004+0000");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        dateFormat16.setLenient(true);
        boolean boolean19 = dateFormat16.isLenient();
        java.util.Calendar calendar20 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone21 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        stdDateFormat22.setNumberFormat(numberFormat25);
        java.lang.String str27 = stdDateFormat22.toString();
        java.util.TimeZone timeZone28 = stdDateFormat22._timezone;
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatRFC1123;
        java.util.TimeZone timeZone30 = stdDateFormat22._timezone;
        java.text.DateFormat dateFormat31 = stdDateFormat22._formatPlain;
        java.lang.String str32 = stdDateFormat22.toString();
        java.util.Calendar calendar33 = stdDateFormat22.getCalendar();
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str37 = dateFormat35.format((java.lang.Object) 100L);
        java.text.NumberFormat numberFormat38 = dateFormat35.getNumberFormat();
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getTimeInstance(0);
        java.util.Calendar calendar41 = dateFormat40.getCalendar();
        dateFormat35.setCalendar(calendar41);
        java.util.Calendar calendar43 = dateFormat35.getCalendar();
        stdDateFormat22._formatRFC1123 = dateFormat35;
        stdDateFormat6._formatRFC1123 = stdDateFormat22;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601_z;
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date18 = stdDateFormat6.parse("1970-01-01T00:00:00.004+0000");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.NumberFormat numberFormat13 = stdDateFormat6.getNumberFormat();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone14 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatPlain;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone15 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        dateFormat15.setLenient(true);
        boolean boolean18 = dateFormat15.isLenient();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        stdDateFormat21.setNumberFormat(numberFormat24);
        java.util.TimeZone timeZone26 = stdDateFormat21._timezone;
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone26);
        stdDateFormat6._timezone = timeZone26;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat21.", stdDateFormat6.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat6));
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.NumberFormat numberFormat11 = stdDateFormat6.getNumberFormat();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.NumberFormat numberFormat13 = stdDateFormat6.getNumberFormat();
        java.text.NumberFormat numberFormat14 = stdDateFormat6.getNumberFormat();
        java.util.TimeZone timeZone15 = stdDateFormat6._timezone;
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        boolean boolean18 = dateFormat17.isLenient();
        java.util.TimeZone timeZone19 = dateFormat17.getTimeZone();
        java.text.NumberFormat numberFormat20 = dateFormat17.getNumberFormat();
        dateFormat17.setLenient(true);
        java.util.TimeZone timeZone23 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = stdDateFormat6.withTimeZone(timeZone23);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat25 and stdDateFormat24.", stdDateFormat25.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat25));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        dateFormat17.setLenient(true);
        boolean boolean20 = dateFormat17.isLenient();
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        stdDateFormat23.setNumberFormat(numberFormat26);
        java.lang.String str28 = stdDateFormat23.toString();
        java.text.DateFormat dateFormat29 = stdDateFormat23._formatPlain;
        java.text.DateFormat dateFormat30 = stdDateFormat23._formatRFC1123;
        java.text.NumberFormat numberFormat31 = stdDateFormat23.getNumberFormat();
        java.text.DateFormat dateFormat32 = stdDateFormat23._formatISO8601;
        java.util.TimeZone timeZone33 = stdDateFormat23._timezone;
        stdDateFormat6._formatISO8601_z = stdDateFormat23;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        dateFormat3.setLenient(true);
        boolean boolean6 = dateFormat3.isLenient();
        java.util.Calendar calendar7 = dateFormat3.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat3.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        stdDateFormat9.setNumberFormat(numberFormat12);
        java.text.NumberFormat numberFormat14 = stdDateFormat9.getNumberFormat();
        java.util.Locale locale15 = stdDateFormat9._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        stdDateFormat6._formatPlain = dateFormat12;
        java.util.TimeZone timeZone15 = stdDateFormat6._timezone;
        java.text.NumberFormat numberFormat16 = stdDateFormat6.getNumberFormat();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(true);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateTimeInstance((int) (short) 1, (int) (byte) 0);
        stdDateFormat6._formatISO8601 = dateFormat15;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone19 = dateFormat18.getTimeZone();
        java.util.TimeZone timeZone20 = dateFormat18.getTimeZone();
        stdDateFormat6.setTimeZone(timeZone20);
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone20);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat23, stdDateFormat6, and dateFormat0.", !(stdDateFormat23.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat23.equals(dateFormat0));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone17 = stdDateFormat6._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone17);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat18, stdDateFormat6, and dateFormat0.", !(stdDateFormat18.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat18.equals(dateFormat0));
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        dateFormat16.setLenient(true);
        boolean boolean19 = dateFormat16.isLenient();
        java.util.Calendar calendar20 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone21 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        stdDateFormat22.setNumberFormat(numberFormat25);
        java.util.TimeZone timeZone27 = stdDateFormat22._timezone;
        java.util.Locale locale28 = stdDateFormat22._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = stdDateFormat6.withLocale(locale28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat29 and stdDateFormat22.", stdDateFormat29.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat29));
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance();
        dateFormat6.setLenient(true);
        boolean boolean9 = dateFormat6.isLenient();
        java.util.Calendar calendar10 = dateFormat6.getCalendar();
        java.util.TimeZone timeZone11 = dateFormat6.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone11);
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        stdDateFormat12.setNumberFormat(numberFormat15);
        java.util.TimeZone timeZone17 = stdDateFormat12._timezone;
        java.text.DateFormat dateFormat18 = stdDateFormat12._formatISO8601_z;
        java.text.DateFormat dateFormat19 = stdDateFormat12._formatISO8601_z;
        java.util.TimeZone timeZone20 = stdDateFormat12._timezone;
        java.util.Locale locale21 = stdDateFormat12._locale;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3, locale21);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601;
        java.util.TimeZone timeZone15 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getInstance();
        dateFormat18.setLenient(true);
        java.util.TimeZone timeZone21 = dateFormat18.getTimeZone();
        java.util.Calendar calendar22 = dateFormat18.getCalendar();
        java.util.TimeZone timeZone23 = dateFormat18.getTimeZone();
        stdDateFormat6._timezone = timeZone23;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance();
        dateFormat25.setLenient(true);
        boolean boolean28 = dateFormat25.isLenient();
        java.util.Calendar calendar29 = dateFormat25.getCalendar();
        java.util.TimeZone timeZone30 = dateFormat25.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone30);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        stdDateFormat31.setNumberFormat(numberFormat34);
        java.lang.String str36 = stdDateFormat31.toString();
        java.text.DateFormat dateFormat37 = stdDateFormat31._formatPlain;
        java.text.DateFormat dateFormat38 = stdDateFormat31._formatISO8601;
        java.text.DateFormat dateFormat39 = stdDateFormat31._formatISO8601_z;
        java.text.DateFormat dateFormat40 = stdDateFormat31._formatRFC1123;
        boolean boolean42 = stdDateFormat31.looksLikeISO8601("1970-01-01T00:00:00.000+0000");
        java.text.DateFormat dateFormat43 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat44 = dateFormat43.getNumberFormat();
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone47 = dateFormat46.getTimeZone();
        boolean boolean48 = dateFormat43.equals((java.lang.Object) timeZone47);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat49 = stdDateFormat31.withTimeZone(timeZone47);
        java.util.Locale locale50 = stdDateFormat31._locale;
        java.text.DateFormat dateFormat51 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone23, locale50);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat31.", stdDateFormat6.equals(stdDateFormat31) == stdDateFormat31.equals(stdDateFormat6));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat12, stdDateFormat6, and dateFormat0.", !(stdDateFormat12.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat12.equals(dateFormat0));
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        stdDateFormat6._formatPlain = dateFormat12;
        java.lang.String str15 = stdDateFormat6.toString();
        java.util.Calendar calendar16 = stdDateFormat6.getCalendar();
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        dateFormat18.setLenient(true);
        boolean boolean21 = dateFormat18.isLenient();
        java.util.Calendar calendar22 = dateFormat18.getCalendar();
        java.util.TimeZone timeZone23 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        stdDateFormat24.setNumberFormat(numberFormat27);
        java.util.TimeZone timeZone29 = stdDateFormat24._timezone;
        java.text.DateFormat dateFormat30 = stdDateFormat24._formatISO8601_z;
        java.util.TimeZone timeZone31 = stdDateFormat24._timezone;
        stdDateFormat6._timezone = timeZone31;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.util.Locale locale12 = stdDateFormat6._locale;
        java.util.Calendar calendar13 = stdDateFormat6.getCalendar();
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        dateFormat14.setLenient(true);
        boolean boolean17 = dateFormat14.isLenient();
        java.util.Calendar calendar18 = dateFormat14.getCalendar();
        java.util.TimeZone timeZone19 = dateFormat14.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        stdDateFormat20.setNumberFormat(numberFormat23);
        java.lang.String str25 = stdDateFormat20.toString();
        java.text.DateFormat dateFormat26 = stdDateFormat20._formatPlain;
        java.text.DateFormat dateFormat27 = stdDateFormat20._formatISO8601;
        boolean boolean29 = stdDateFormat20.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.util.Locale locale30 = stdDateFormat20._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = stdDateFormat6.withLocale(locale30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat31 and stdDateFormat20.", stdDateFormat31.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat31));
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        dateFormat16.setLenient(true);
        boolean boolean19 = dateFormat16.isLenient();
        java.util.Calendar calendar20 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone21 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        stdDateFormat22.setNumberFormat(numberFormat25);
        java.lang.String str27 = stdDateFormat22.toString();
        java.util.TimeZone timeZone28 = stdDateFormat22._timezone;
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatRFC1123;
        java.text.DateFormat dateFormat30 = stdDateFormat22._formatRFC1123;
        java.text.NumberFormat numberFormat31 = stdDateFormat22.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone6 = dateFormat0.getTimeZone();
        java.util.Calendar calendar7 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance();
        dateFormat10.setLenient(true);
        boolean boolean13 = dateFormat10.isLenient();
        java.util.Calendar calendar14 = dateFormat10.getCalendar();
        java.util.TimeZone timeZone15 = dateFormat10.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        stdDateFormat16.setNumberFormat(numberFormat19);
        java.lang.String str21 = stdDateFormat16.toString();
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        stdDateFormat16._formatPlain = dateFormat22;
        java.text.NumberFormat numberFormat25 = stdDateFormat16.getNumberFormat();
        java.util.Calendar calendar26 = stdDateFormat16.getCalendar();
        java.text.DateFormat dateFormat27 = stdDateFormat16._formatISO8601;
        java.text.NumberFormat numberFormat28 = stdDateFormat16.getNumberFormat();
        java.util.Locale locale29 = stdDateFormat16._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = stdDateFormat9.withLocale(locale29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat30 and stdDateFormat30", stdDateFormat30.equals(stdDateFormat30) ? stdDateFormat30.hashCode() == stdDateFormat30.hashCode() : true);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        dateFormat4.setLenient(true);
        boolean boolean7 = dateFormat4.isLenient();
        java.util.Calendar calendar8 = dateFormat4.getCalendar();
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        stdDateFormat10.setNumberFormat(numberFormat13);
        java.lang.String str15 = stdDateFormat10.toString();
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        stdDateFormat10._formatPlain = dateFormat16;
        java.text.DateFormat dateFormat19 = stdDateFormat10._formatISO8601_z;
        java.util.Locale locale20 = stdDateFormat10._locale;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance(1, locale20);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale20);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat22, stdDateFormat10, and dateFormat0.", !(stdDateFormat22.equals(stdDateFormat10) && stdDateFormat10.equals(dateFormat0)) || stdDateFormat22.equals(dateFormat0));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601_z;
        java.util.Locale locale16 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatPlain;
        java.util.Locale locale18 = stdDateFormat6._locale;
        java.text.NumberFormat numberFormat19 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.util.Calendar calendar21 = dateFormat20.getCalendar();
        java.util.TimeZone timeZone22 = dateFormat20.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = stdDateFormat6.withTimeZone(timeZone22);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat24 and stdDateFormat23.", stdDateFormat24.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat24));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.util.TimeZone timeZone13 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        dateFormat14.setLenient(true);
        boolean boolean17 = dateFormat14.isLenient();
        java.util.Calendar calendar18 = dateFormat14.getCalendar();
        java.util.TimeZone timeZone19 = dateFormat14.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        stdDateFormat20.setNumberFormat(numberFormat23);
        java.lang.String str25 = stdDateFormat20.toString();
        java.util.TimeZone timeZone26 = stdDateFormat20._timezone;
        java.text.DateFormat dateFormat27 = stdDateFormat20._formatRFC1123;
        java.lang.String str28 = stdDateFormat20.toString();
        java.text.DateFormat dateFormat29 = stdDateFormat20._formatRFC1123;
        java.util.Locale locale30 = stdDateFormat20._locale;
        boolean boolean32 = stdDateFormat20.looksLikeISO8601("yyyy-MM-dd");
        java.util.TimeZone timeZone33 = stdDateFormat20._timezone;
        stdDateFormat6._formatPlain = stdDateFormat20;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat20.", stdDateFormat6.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat6));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatPlain;
        java.lang.String str15 = stdDateFormat6.toString();
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        dateFormat18.setLenient(true);
        boolean boolean21 = dateFormat18.isLenient();
        java.util.Calendar calendar22 = dateFormat18.getCalendar();
        java.util.TimeZone timeZone23 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        stdDateFormat24.setNumberFormat(numberFormat27);
        java.lang.String str29 = stdDateFormat24.toString();
        java.util.TimeZone timeZone30 = stdDateFormat24._timezone;
        java.util.Locale locale31 = stdDateFormat24._locale;
        boolean boolean33 = stdDateFormat24.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        java.util.Locale locale34 = stdDateFormat24._locale;
        java.text.DateFormat dateFormat35 = stdDateFormat24._formatPlain;
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getInstance();
        boolean boolean37 = dateFormat36.isLenient();
        java.util.TimeZone timeZone38 = dateFormat36.getTimeZone();
        java.text.NumberFormat numberFormat39 = dateFormat36.getNumberFormat();
        dateFormat36.setLenient(true);
        java.util.TimeZone timeZone42 = dateFormat36.getTimeZone();
        stdDateFormat24.setTimeZone(timeZone42);
        java.util.Locale locale44 = stdDateFormat24._locale;
        java.text.DateFormat dateFormat45 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16, locale44);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = stdDateFormat3._formatPlain;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.NumberFormat numberFormat14 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        dateFormat17.setLenient(true);
        boolean boolean20 = dateFormat17.isLenient();
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        stdDateFormat23.setNumberFormat(numberFormat26);
        java.lang.String str28 = stdDateFormat23.toString();
        java.util.TimeZone timeZone29 = stdDateFormat23._timezone;
        java.util.TimeZone timeZone30 = stdDateFormat23._timezone;
        java.util.Locale locale31 = stdDateFormat23._locale;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance((int) (short) 0, locale31);
        java.util.TimeZone timeZone33 = dateFormat32.getTimeZone();
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone33);
        stdDateFormat6.setTimeZone(timeZone33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601_z;
        java.text.NumberFormat numberFormat14 = stdDateFormat6.getNumberFormat();
        boolean boolean16 = stdDateFormat6.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.util.Calendar calendar17 = stdDateFormat6.getCalendar();
        java.text.DateFormat dateFormat18 = stdDateFormat6._formatPlain;
        java.util.Locale locale19 = stdDateFormat6._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date21 = stdDateFormat6.parse("1970-01-01T07:00:00.000+0700");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.lang.String str16 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat18 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat19 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat20 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        dateFormat21.setLenient(true);
        boolean boolean24 = dateFormat21.isLenient();
        java.util.Calendar calendar25 = dateFormat21.getCalendar();
        java.util.TimeZone timeZone26 = dateFormat21.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone26);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        stdDateFormat27.setNumberFormat(numberFormat30);
        java.lang.String str32 = stdDateFormat27.toString();
        java.util.TimeZone timeZone33 = stdDateFormat27._timezone;
        java.util.Locale locale34 = stdDateFormat27._locale;
        boolean boolean36 = stdDateFormat27.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        java.util.Locale locale37 = stdDateFormat27._locale;
        java.text.DateFormat dateFormat38 = stdDateFormat27._formatPlain;
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getInstance();
        boolean boolean40 = dateFormat39.isLenient();
        java.util.TimeZone timeZone41 = dateFormat39.getTimeZone();
        java.text.NumberFormat numberFormat42 = dateFormat39.getNumberFormat();
        dateFormat39.setLenient(true);
        java.util.TimeZone timeZone45 = dateFormat39.getTimeZone();
        stdDateFormat27.setTimeZone(timeZone45);
        java.text.DateFormat dateFormat48 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone49 = dateFormat48.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat50 = stdDateFormat27.withTimeZone(timeZone49);
        stdDateFormat6._timezone = timeZone49;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat27.", stdDateFormat6.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat6));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601;
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("hi!");
        java.util.Locale locale16 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        dateFormat17.setLenient(true);
        boolean boolean20 = dateFormat17.isLenient();
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        stdDateFormat23.setNumberFormat(numberFormat26);
        java.lang.String str28 = stdDateFormat23.toString();
        java.text.DateFormat dateFormat29 = stdDateFormat23._formatISO8601_z;
        java.text.DateFormat dateFormat30 = stdDateFormat23._formatRFC1123;
        boolean boolean32 = stdDateFormat23.looksLikeISO8601("1/1/13 06:59");
        java.util.TimeZone timeZone33 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getInstance();
        boolean boolean35 = dateFormat34.isLenient();
        java.util.TimeZone timeZone36 = dateFormat34.getTimeZone();
        java.text.NumberFormat numberFormat37 = dateFormat34.getNumberFormat();
        java.text.NumberFormat numberFormat38 = dateFormat34.getNumberFormat();
        stdDateFormat23.setNumberFormat(numberFormat38);
        stdDateFormat6._formatISO8601_z = stdDateFormat23;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatRFC1123;
        java.util.Locale locale17 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat18 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        dateFormat19.setLenient(true);
        boolean boolean22 = dateFormat19.isLenient();
        java.util.Calendar calendar23 = dateFormat19.getCalendar();
        java.util.TimeZone timeZone24 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        stdDateFormat25.setNumberFormat(numberFormat28);
        java.lang.String str30 = stdDateFormat25.toString();
        java.util.TimeZone timeZone31 = stdDateFormat25._timezone;
        java.text.DateFormat dateFormat32 = stdDateFormat25._formatRFC1123;
        java.text.DateFormat dateFormat33 = stdDateFormat25._formatISO8601;
        java.text.DateFormat dateFormat34 = stdDateFormat25._formatRFC1123;
        stdDateFormat6._formatPlain = stdDateFormat25;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat25.", stdDateFormat6.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat6));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4);
        java.lang.String str6 = stdDateFormat5.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat5 and stdDateFormat5", stdDateFormat5.equals(stdDateFormat5) ? stdDateFormat5.hashCode() == stdDateFormat5.hashCode() : true);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 100L);
        java.lang.String str5 = dateFormat1.format((java.lang.Object) 3);
        java.util.TimeZone timeZone6 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6);
        java.lang.Class<?> wildcardClass8 = stdDateFormat7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat7 and stdDateFormat7", stdDateFormat7.equals(stdDateFormat7) ? stdDateFormat7.hashCode() == stdDateFormat7.hashCode() : true);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.lang.String str16 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601_z;
        boolean boolean19 = stdDateFormat6.looksLikeISO8601("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone20 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601;
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        java.util.Locale locale17 = stdDateFormat6._locale;
        java.util.Locale locale18 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        dateFormat19.setLenient(true);
        boolean boolean22 = dateFormat19.isLenient();
        java.util.Calendar calendar23 = dateFormat19.getCalendar();
        java.util.TimeZone timeZone24 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        stdDateFormat25.setNumberFormat(numberFormat28);
        java.lang.String str30 = stdDateFormat25.toString();
        java.text.DateFormat dateFormat31 = stdDateFormat25._formatPlain;
        java.text.DateFormat dateFormat32 = stdDateFormat25._formatRFC1123;
        java.text.DateFormat dateFormat33 = stdDateFormat25._formatISO8601_z;
        java.lang.String str34 = stdDateFormat25.toString();
        java.text.DateFormat dateFormat35 = stdDateFormat25._formatPlain;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str39 = dateFormat37.format((java.lang.Object) 100L);
        dateFormat37.setLenient(true);
        java.text.NumberFormat numberFormat42 = dateFormat37.getNumberFormat();
        stdDateFormat25._formatISO8601 = dateFormat37;
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getInstance();
        boolean boolean45 = dateFormat44.isLenient();
        java.util.TimeZone timeZone46 = dateFormat44.getTimeZone();
        java.text.NumberFormat numberFormat47 = dateFormat44.getNumberFormat();
        java.text.NumberFormat numberFormat48 = dateFormat44.getNumberFormat();
        stdDateFormat25.setNumberFormat(numberFormat48);
        stdDateFormat6.setNumberFormat(numberFormat48);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat25.", stdDateFormat6.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat6));
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.NumberFormat numberFormat11 = stdDateFormat6.getNumberFormat();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.lang.String str13 = stdDateFormat6.toString();
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("1970-01-01T07:00:00.000+0700");
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str19 = dateFormat17.format((java.lang.Object) 100L);
        java.lang.String str21 = dateFormat17.format((java.lang.Object) 3);
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = stdDateFormat6.withTimeZone(timeZone22);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        dateFormat24.setLenient(true);
        boolean boolean27 = dateFormat24.isLenient();
        java.util.Calendar calendar28 = dateFormat24.getCalendar();
        java.util.TimeZone timeZone29 = dateFormat24.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone29);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        stdDateFormat30.setNumberFormat(numberFormat33);
        java.lang.String str35 = stdDateFormat30.toString();
        java.text.DateFormat dateFormat36 = stdDateFormat30._formatPlain;
        java.util.Locale locale37 = stdDateFormat30._locale;
        java.text.DateFormat dateFormat38 = stdDateFormat30._formatRFC1123;
        java.util.Calendar calendar39 = stdDateFormat30.getCalendar();
        java.util.TimeZone timeZone40 = stdDateFormat30._timezone;
        java.util.Locale locale41 = stdDateFormat30._locale;
        stdDateFormat23._formatPlain = stdDateFormat30;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat23 and stdDateFormat30.", stdDateFormat23.equals(stdDateFormat30) == stdDateFormat30.equals(stdDateFormat23));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        boolean boolean13 = stdDateFormat6.looksLikeISO8601("1/1/13 07:00");
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatPlain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone15 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        stdDateFormat6._formatISO8601_z = dateFormat11;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        boolean boolean16 = stdDateFormat6.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        dateFormat17.setLenient(true);
        boolean boolean20 = dateFormat17.isLenient();
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = stdDateFormat6.withTimeZone(timeZone22);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat24 and stdDateFormat23.", stdDateFormat24.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat24));
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601_z;
        java.text.NumberFormat numberFormat14 = stdDateFormat6.getNumberFormat();
        boolean boolean16 = stdDateFormat6.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone17 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.util.TimeZone timeZone5 = stdDateFormat4._timezone;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateTimeInstance(1, (int) (byte) 0);
        java.util.Calendar calendar16 = dateFormat15.getCalendar();
        stdDateFormat6.setCalendar(calendar16);
        java.util.TimeZone timeZone18 = stdDateFormat6.getTimeZone();
        java.text.DateFormat dateFormat19 = stdDateFormat6._formatISO8601;
        boolean boolean20 = stdDateFormat6.isLenient();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        dateFormat21.setLenient(true);
        boolean boolean24 = dateFormat21.isLenient();
        java.util.Calendar calendar25 = dateFormat21.getCalendar();
        java.util.TimeZone timeZone26 = dateFormat21.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone26);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        stdDateFormat27.setNumberFormat(numberFormat30);
        java.util.TimeZone timeZone32 = stdDateFormat27._timezone;
        java.text.DateFormat dateFormat33 = stdDateFormat27._formatISO8601_z;
        java.text.DateFormat dateFormat34 = stdDateFormat27._formatISO8601;
        boolean boolean36 = stdDateFormat27.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat37 = stdDateFormat27._formatISO8601;
        java.lang.String str38 = stdDateFormat27.toString();
        java.lang.String str39 = stdDateFormat27.toString();
        stdDateFormat6._formatISO8601_z = stdDateFormat27;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat27.", stdDateFormat6.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat6));
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        dateFormat4.setLenient(true);
        boolean boolean7 = dateFormat4.isLenient();
        java.util.Calendar calendar8 = dateFormat4.getCalendar();
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        stdDateFormat10.setNumberFormat(numberFormat13);
        java.lang.String str15 = stdDateFormat10.toString();
        java.util.TimeZone timeZone16 = stdDateFormat10._timezone;
        java.util.TimeZone timeZone17 = stdDateFormat10._timezone;
        java.util.Locale locale18 = stdDateFormat10._locale;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance((int) (short) 0, locale18);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance((int) (short) 1, locale18);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, 2, locale18);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        dateFormat22.setLenient(true);
        boolean boolean25 = dateFormat22.isLenient();
        java.util.Calendar calendar26 = dateFormat22.getCalendar();
        java.util.TimeZone timeZone27 = dateFormat22.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone27);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        stdDateFormat28.setNumberFormat(numberFormat31);
        java.lang.String str33 = stdDateFormat28.toString();
        java.util.TimeZone timeZone34 = stdDateFormat28._timezone;
        java.util.TimeZone timeZone35 = stdDateFormat28._timezone;
        java.util.Locale locale36 = stdDateFormat28._locale;
        java.util.Locale locale37 = stdDateFormat28._locale;
        java.text.NumberFormat numberFormat38 = stdDateFormat28.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat10 and stdDateFormat28.", stdDateFormat10.equals(stdDateFormat28) == stdDateFormat28.equals(stdDateFormat10));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.lang.String str16 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        java.lang.String str18 = stdDateFormat6.toString();
        java.util.Calendar calendar19 = stdDateFormat6.getCalendar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj21 = stdDateFormat6.parseObject("1970-01-01T00:00:00.000+0000");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        boolean boolean14 = stdDateFormat6.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.util.Locale locale15 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str20 = dateFormat18.format((java.lang.Object) 100L);
        java.lang.String str22 = dateFormat18.format((java.lang.Object) 3);
        java.util.TimeZone timeZone23 = dateFormat18.getTimeZone();
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone23);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = stdDateFormat6.withTimeZone(timeZone23);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat26, stdDateFormat6, and dateFormat0.", !(stdDateFormat26.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat26.equals(dateFormat0));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        boolean boolean14 = stdDateFormat6.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.util.Locale locale15 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str20 = dateFormat18.format((java.lang.Object) 100L);
        java.lang.String str22 = dateFormat18.format((java.lang.Object) 3);
        java.util.TimeZone timeZone23 = dateFormat18.getTimeZone();
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone23);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = stdDateFormat6.withTimeZone(timeZone23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone23);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        java.text.NumberFormat numberFormat4 = dateFormat2.getNumberFormat();
        java.text.NumberFormat numberFormat5 = dateFormat2.getNumberFormat();
        boolean boolean6 = dateFormat0.equals((java.lang.Object) dateFormat2);
        boolean boolean7 = dateFormat0.isLenient();
        java.util.TimeZone timeZone8 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getTimeInstance();
        dateFormat9.setLenient(true);
        boolean boolean12 = dateFormat9.isLenient();
        java.util.Calendar calendar13 = dateFormat9.getCalendar();
        java.util.TimeZone timeZone14 = dateFormat9.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        stdDateFormat15.setNumberFormat(numberFormat18);
        java.lang.String str20 = stdDateFormat15.toString();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        stdDateFormat15._formatPlain = dateFormat21;
        java.text.NumberFormat numberFormat24 = stdDateFormat15.getNumberFormat();
        java.util.Calendar calendar25 = stdDateFormat15.getCalendar();
        java.text.DateFormat dateFormat26 = stdDateFormat15._formatISO8601;
        java.text.NumberFormat numberFormat27 = stdDateFormat15.getNumberFormat();
        java.util.Locale locale28 = stdDateFormat15._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8, locale28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat2.", dateFormat0.equals(dateFormat2) == dateFormat2.equals(dateFormat0));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.lang.String str13 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601_z;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = stdDateFormat6.isLenient();
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601_z;
        java.lang.String str14 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str19 = dateFormat17.format((java.lang.Object) 100L);
        java.lang.String str21 = dateFormat17.format((java.lang.Object) 3);
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        stdDateFormat6._timezone = timeZone22;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance();
        dateFormat25.setLenient(true);
        boolean boolean28 = dateFormat25.isLenient();
        java.util.Calendar calendar29 = dateFormat25.getCalendar();
        java.util.TimeZone timeZone30 = dateFormat25.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone30);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        stdDateFormat31.setNumberFormat(numberFormat34);
        java.util.TimeZone timeZone36 = stdDateFormat31._timezone;
        java.util.Locale locale37 = stdDateFormat31._locale;
        java.text.DateFormat dateFormat38 = stdDateFormat31._formatRFC1123;
        boolean boolean40 = stdDateFormat31.looksLikeISO8601("1970-01-01T00:00:00.000+0000");
        java.text.DateFormat dateFormat41 = stdDateFormat31._formatRFC1123;
        java.util.Locale locale42 = stdDateFormat31._locale;
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateInstance((int) (short) 1, locale42);
        java.text.DateFormat dateFormat44 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone22, locale42);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat31.", stdDateFormat6.equals(stdDateFormat31) == stdDateFormat31.equals(stdDateFormat6));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601_z;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("1/1/13 07:00");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(true);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("1970-01-01T00:00:00.000+0000");
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        boolean boolean23 = dateFormat18.equals((java.lang.Object) timeZone22);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = stdDateFormat6.withTimeZone(timeZone22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone22);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone8 = dateFormat7.getTimeZone();
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance();
        dateFormat10.setLenient(true);
        boolean boolean13 = dateFormat10.isLenient();
        java.util.Calendar calendar14 = dateFormat10.getCalendar();
        java.util.TimeZone timeZone15 = dateFormat10.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        stdDateFormat16.setNumberFormat(numberFormat19);
        java.lang.String str21 = stdDateFormat16.toString();
        java.text.DateFormat dateFormat22 = stdDateFormat16._formatPlain;
        java.util.Locale locale23 = stdDateFormat16._locale;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale23);
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone8, locale23);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance((int) (byte) 0, locale23);
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3, locale23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.lang.String str14 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.util.Locale locale16 = stdDateFormat6._locale;
        boolean boolean18 = stdDateFormat6.looksLikeISO8601("yyyy-MM-dd");
        java.util.TimeZone timeZone19 = stdDateFormat6._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat20, stdDateFormat6, and dateFormat0.", !(stdDateFormat20.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat20.equals(dateFormat0));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.lang.String str14 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.util.Locale locale16 = stdDateFormat6._locale;
        boolean boolean18 = stdDateFormat6.looksLikeISO8601("yyyy-MM-dd");
        java.util.TimeZone timeZone19 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone20 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("1/1/13 06:59");
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        boolean boolean18 = dateFormat17.isLenient();
        java.util.TimeZone timeZone19 = dateFormat17.getTimeZone();
        java.text.NumberFormat numberFormat20 = dateFormat17.getNumberFormat();
        java.text.NumberFormat numberFormat21 = dateFormat17.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat21);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat23, stdDateFormat6, and dateFormat0.", !(stdDateFormat23.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat23.equals(dateFormat0));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        dateFormat14.setLenient(true);
        boolean boolean17 = dateFormat14.isLenient();
        java.util.Calendar calendar18 = dateFormat14.getCalendar();
        java.util.TimeZone timeZone19 = dateFormat14.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        stdDateFormat20.setNumberFormat(numberFormat23);
        java.lang.String str25 = stdDateFormat20.toString();
        java.util.TimeZone timeZone26 = stdDateFormat20._timezone;
        java.text.DateFormat dateFormat27 = stdDateFormat20._formatRFC1123;
        java.text.DateFormat dateFormat28 = stdDateFormat20._formatISO8601;
        java.text.DateFormat dateFormat29 = stdDateFormat20._formatRFC1123;
        java.util.Locale locale30 = stdDateFormat20._locale;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance((int) (short) 0, locale30);
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone12, locale30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat20.", stdDateFormat6.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat6));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601_z;
        java.lang.String str14 = stdDateFormat6.toString();
        java.util.Calendar calendar15 = stdDateFormat6.getCalendar();
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        dateFormat17.setLenient(true);
        boolean boolean20 = dateFormat17.isLenient();
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        stdDateFormat23.setNumberFormat(numberFormat26);
        java.util.TimeZone timeZone28 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat29 = stdDateFormat23._formatISO8601_z;
        java.text.DateFormat dateFormat30 = stdDateFormat23._formatISO8601_z;
        java.util.TimeZone timeZone31 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat32 = stdDateFormat23._formatISO8601;
        java.text.DateFormat dateFormat33 = stdDateFormat23._formatRFC1123;
        java.util.Locale locale34 = stdDateFormat23._locale;
        stdDateFormat6._formatISO8601 = stdDateFormat23;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 100L);
        java.util.TimeZone timeZone4 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4);
        boolean boolean7 = stdDateFormat5.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat5 and stdDateFormat5", stdDateFormat5.equals(stdDateFormat5) ? stdDateFormat5.hashCode() == stdDateFormat5.hashCode() : true);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat14, stdDateFormat6, and dateFormat0.", !(stdDateFormat14.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat14.equals(dateFormat0));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        dateFormat16.setLenient(true);
        boolean boolean19 = dateFormat16.isLenient();
        java.util.Calendar calendar20 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone21 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        stdDateFormat22.setNumberFormat(numberFormat25);
        java.lang.String str27 = stdDateFormat22.toString();
        java.text.DateFormat dateFormat28 = stdDateFormat22._formatPlain;
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatRFC1123;
        java.text.NumberFormat numberFormat30 = stdDateFormat22.getNumberFormat();
        java.text.DateFormat dateFormat31 = stdDateFormat22._formatISO8601;
        java.util.TimeZone timeZone32 = stdDateFormat22._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = stdDateFormat6.withTimeZone(timeZone32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat33 and stdDateFormat22.", stdDateFormat33.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat33));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        boolean boolean18 = stdDateFormat6.looksLikeISO8601("hi!");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat19, stdDateFormat6, and dateFormat0.", !(stdDateFormat19.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat19.equals(dateFormat0));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.lang.String str13 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone15);
        stdDateFormat6.setTimeZone(timeZone15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(true);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance();
        dateFormat2.setLenient(true);
        boolean boolean5 = dateFormat2.isLenient();
        java.util.Calendar calendar6 = dateFormat2.getCalendar();
        java.util.TimeZone timeZone7 = dateFormat2.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone7);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat11 = dateFormat10.getNumberFormat();
        stdDateFormat8.setNumberFormat(numberFormat11);
        java.lang.String str13 = stdDateFormat8.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat8._formatISO8601_z;
        boolean boolean16 = stdDateFormat8.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.util.Locale locale17 = stdDateFormat8._locale;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateTimeInstance((int) (short) 1, (int) (byte) 0, locale17);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        dateFormat19.setLenient(true);
        boolean boolean22 = dateFormat19.isLenient();
        java.util.Calendar calendar23 = dateFormat19.getCalendar();
        java.util.TimeZone timeZone24 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        stdDateFormat25.setNumberFormat(numberFormat28);
        java.util.TimeZone timeZone30 = stdDateFormat25._timezone;
        boolean boolean31 = dateFormat18.equals((java.lang.Object) stdDateFormat25);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat8 and stdDateFormat25.", stdDateFormat8.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat8));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601_z;
        java.text.NumberFormat numberFormat14 = stdDateFormat6.getNumberFormat();
        java.lang.String str15 = stdDateFormat6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601_z;
        java.lang.String str15 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat6, and dateFormat0.", !(stdDateFormat17.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat17.equals(dateFormat0));
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.NumberFormat numberFormat11 = stdDateFormat6.getNumberFormat();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.NumberFormat numberFormat13 = stdDateFormat6.getNumberFormat();
        java.text.NumberFormat numberFormat14 = stdDateFormat6.getNumberFormat();
        java.util.TimeZone timeZone15 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        stdDateFormat6._formatISO8601_z = dateFormat11;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat15, stdDateFormat6, and dateFormat0.", !(stdDateFormat15.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat15.equals(dateFormat0));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.util.TimeZone timeZone13 = stdDateFormat6._timezone;
        java.util.Calendar calendar14 = stdDateFormat6.getCalendar();
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat6, and dateFormat0.", !(stdDateFormat16.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat16.equals(dateFormat0));
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601_z;
        java.text.NumberFormat numberFormat14 = stdDateFormat6.getNumberFormat();
        boolean boolean16 = stdDateFormat6.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.util.Calendar calendar17 = stdDateFormat6.getCalendar();
        java.text.DateFormat dateFormat18 = stdDateFormat6._formatPlain;
        java.util.Locale locale19 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        dateFormat20.setLenient(true);
        boolean boolean23 = dateFormat20.isLenient();
        java.util.Calendar calendar24 = dateFormat20.getCalendar();
        java.util.TimeZone timeZone25 = dateFormat20.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone25);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        stdDateFormat26.setNumberFormat(numberFormat29);
        java.text.NumberFormat numberFormat31 = stdDateFormat26.getNumberFormat();
        java.util.Locale locale32 = stdDateFormat26._locale;
        java.util.TimeZone timeZone33 = stdDateFormat26._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat6.withTimeZone(timeZone33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat34 and stdDateFormat26.", stdDateFormat34.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat34));
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        dateFormat15.setLenient(true);
        boolean boolean18 = dateFormat15.isLenient();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        stdDateFormat21.setNumberFormat(numberFormat24);
        java.util.TimeZone timeZone26 = stdDateFormat21._timezone;
        java.util.Locale locale27 = stdDateFormat21._locale;
        java.text.DateFormat dateFormat28 = stdDateFormat21._formatRFC1123;
        boolean boolean30 = stdDateFormat21.looksLikeISO8601("1970-01-01T00:00:00.000+0000");
        java.text.DateFormat dateFormat31 = stdDateFormat21._formatRFC1123;
        java.util.Locale locale32 = stdDateFormat21._locale;
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance((int) (short) 1, locale32);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance((int) (byte) 0, locale32);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat6.withLocale(locale32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat35 and stdDateFormat21.", stdDateFormat35.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat35));
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601_z;
        java.util.Locale locale16 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        boolean boolean19 = stdDateFormat6.looksLikeISO8601("1970-01-01T00:00:00.004+0000");
        java.lang.String str20 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        dateFormat21.setLenient(true);
        boolean boolean24 = dateFormat21.isLenient();
        java.util.Calendar calendar25 = dateFormat21.getCalendar();
        java.util.TimeZone timeZone26 = dateFormat21.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone26);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        stdDateFormat27.setNumberFormat(numberFormat30);
        java.util.TimeZone timeZone32 = stdDateFormat27._timezone;
        java.util.Locale locale33 = stdDateFormat27._locale;
        java.lang.String str34 = stdDateFormat27.toString();
        java.text.DateFormat dateFormat35 = stdDateFormat27._formatRFC1123;
        stdDateFormat6._formatISO8601 = stdDateFormat27;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat27.", stdDateFormat6.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat6));
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.text.NumberFormat numberFormat15 = stdDateFormat6.getNumberFormat();
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("1970-01-01T07:00:00.000+0700");
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        dateFormat18.setLenient(true);
        boolean boolean21 = dateFormat18.isLenient();
        java.util.Calendar calendar22 = dateFormat18.getCalendar();
        java.util.TimeZone timeZone23 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        stdDateFormat24.setNumberFormat(numberFormat27);
        java.lang.String str29 = stdDateFormat24.toString();
        java.text.DateFormat dateFormat30 = stdDateFormat24._formatPlain;
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateTimeInstance(1, (int) (byte) 0);
        java.util.Calendar calendar34 = dateFormat33.getCalendar();
        stdDateFormat24.setCalendar(calendar34);
        java.util.TimeZone timeZone36 = stdDateFormat24.getTimeZone();
        stdDateFormat6._timezone = timeZone36;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance();
        dateFormat6.setLenient(true);
        boolean boolean9 = dateFormat6.isLenient();
        java.util.Calendar calendar10 = dateFormat6.getCalendar();
        java.util.TimeZone timeZone11 = dateFormat6.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone11);
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        stdDateFormat12.setNumberFormat(numberFormat15);
        java.util.TimeZone timeZone17 = stdDateFormat12._timezone;
        java.util.Locale locale18 = stdDateFormat12._locale;
        java.text.DateFormat dateFormat19 = stdDateFormat12._formatRFC1123;
        java.util.TimeZone timeZone20 = stdDateFormat12._timezone;
        java.text.DateFormat dateFormat21 = stdDateFormat12._formatPlain;
        java.util.TimeZone timeZone22 = stdDateFormat12._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = stdDateFormat5.equals((java.lang.Object) stdDateFormat12);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.util.Locale locale12 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.Locale locale14 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        dateFormat17.setLenient(true);
        boolean boolean20 = dateFormat17.isLenient();
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        stdDateFormat23.setNumberFormat(numberFormat26);
        java.lang.String str28 = stdDateFormat23.toString();
        java.util.TimeZone timeZone29 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat30 = stdDateFormat23._formatRFC1123;
        java.util.TimeZone timeZone31 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat32 = stdDateFormat23._formatPlain;
        java.lang.String str33 = stdDateFormat23.toString();
        java.text.DateFormat dateFormat34 = stdDateFormat23._formatISO8601;
        java.util.TimeZone timeZone35 = stdDateFormat23._timezone;
        java.util.TimeZone timeZone36 = stdDateFormat23._timezone;
        java.util.Locale locale37 = stdDateFormat23._locale;
        stdDateFormat6._formatISO8601_z = stdDateFormat23;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.lang.String str14 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.util.Locale locale16 = stdDateFormat6._locale;
        boolean boolean18 = stdDateFormat6.looksLikeISO8601("yyyy-MM-dd");
        java.util.Locale locale19 = stdDateFormat6._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(false);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatISO8601;
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = stdDateFormat6.isLenient();
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.util.Locale locale13 = stdDateFormat6._locale;
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        java.util.Locale locale16 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        dateFormat18.setLenient(true);
        boolean boolean21 = dateFormat18.isLenient();
        java.util.Calendar calendar22 = dateFormat18.getCalendar();
        java.util.TimeZone timeZone23 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        stdDateFormat24.setNumberFormat(numberFormat27);
        java.util.TimeZone timeZone29 = stdDateFormat24._timezone;
        java.text.DateFormat dateFormat30 = stdDateFormat24._formatISO8601_z;
        java.util.TimeZone timeZone31 = stdDateFormat24._timezone;
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone31);
        stdDateFormat6.setTimeZone(timeZone31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        boolean boolean13 = stdDateFormat6.looksLikeISO8601("1/1/13 06:59");
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone16 = dateFormat15.getTimeZone();
        java.util.TimeZone timeZone17 = dateFormat15.getTimeZone();
        stdDateFormat6._formatISO8601 = dateFormat15;
        java.util.Calendar calendar19 = stdDateFormat6.getCalendar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone20 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = stdDateFormat6._timezone;
        java.util.Locale locale12 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        dateFormat16.setLenient(true);
        boolean boolean19 = dateFormat16.isLenient();
        java.util.Calendar calendar20 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone21 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        stdDateFormat22.setNumberFormat(numberFormat25);
        java.lang.String str27 = stdDateFormat22.toString();
        java.text.DateFormat dateFormat28 = stdDateFormat22._formatPlain;
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatISO8601_z;
        java.text.DateFormat dateFormat30 = stdDateFormat22._formatPlain;
        java.text.DateFormat dateFormat31 = stdDateFormat22._formatISO8601_z;
        boolean boolean33 = stdDateFormat22.looksLikeISO8601("07:00");
        java.util.TimeZone timeZone34 = stdDateFormat22._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat6.withTimeZone(timeZone34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat35 and stdDateFormat22.", stdDateFormat35.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat35));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        boolean boolean2 = dateFormat0.isLenient();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = stdDateFormat4._formatRFC1123;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        stdDateFormat6._formatPlain = dateFormat12;
        java.text.NumberFormat numberFormat15 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        java.util.TimeZone timeZone17 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        dateFormat20.setLenient(true);
        boolean boolean23 = dateFormat20.isLenient();
        java.util.Calendar calendar24 = dateFormat20.getCalendar();
        java.util.TimeZone timeZone25 = dateFormat20.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone25);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        stdDateFormat26.setNumberFormat(numberFormat29);
        java.lang.String str31 = stdDateFormat26.toString();
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        stdDateFormat26._formatPlain = dateFormat32;
        java.text.NumberFormat numberFormat35 = stdDateFormat26.getNumberFormat();
        java.util.Calendar calendar36 = stdDateFormat26.getCalendar();
        java.text.DateFormat dateFormat37 = stdDateFormat26._formatISO8601;
        java.text.NumberFormat numberFormat38 = stdDateFormat26.getNumberFormat();
        java.util.Locale locale39 = stdDateFormat26._locale;
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateTimeInstance(2, 0, locale39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone17, locale39);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone15 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        dateFormat16.setLenient(true);
        boolean boolean19 = dateFormat16.isLenient();
        java.util.Calendar calendar20 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone21 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        stdDateFormat22.setNumberFormat(numberFormat25);
        java.lang.String str27 = stdDateFormat22.toString();
        java.text.DateFormat dateFormat28 = stdDateFormat22._formatISO8601;
        java.util.TimeZone timeZone29 = stdDateFormat22._timezone;
        boolean boolean31 = stdDateFormat22.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.util.TimeZone timeZone32 = stdDateFormat22._timezone;
        stdDateFormat6._formatISO8601 = stdDateFormat22;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getTimeInstance();
        dateFormat12.setLenient(true);
        boolean boolean15 = dateFormat12.isLenient();
        java.util.Calendar calendar16 = dateFormat12.getCalendar();
        java.util.TimeZone timeZone17 = dateFormat12.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone17);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        stdDateFormat18.setNumberFormat(numberFormat21);
        java.lang.String str23 = stdDateFormat18.toString();
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        stdDateFormat18._formatPlain = dateFormat24;
        java.text.NumberFormat numberFormat27 = stdDateFormat18.getNumberFormat();
        java.text.DateFormat dateFormat28 = stdDateFormat18._formatISO8601;
        java.util.TimeZone timeZone29 = stdDateFormat18._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = stdDateFormat6.withTimeZone(timeZone29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat30 and stdDateFormat18.", stdDateFormat30.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat30));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatISO8601_z;
        java.lang.String str15 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str20 = dateFormat18.format((java.lang.Object) 100L);
        dateFormat18.setLenient(true);
        java.text.NumberFormat numberFormat23 = dateFormat18.getNumberFormat();
        stdDateFormat6._formatISO8601 = dateFormat18;
        java.util.TimeZone timeZone25 = stdDateFormat6._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat26, stdDateFormat6, and dateFormat0.", !(stdDateFormat26.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat26.equals(dateFormat0));
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.util.TimeZone timeZone13 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatPlain;
        java.util.Locale locale15 = stdDateFormat6._locale;
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone16);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("1/1/13 06:59");
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone16);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601_z;
        java.util.Locale locale17 = stdDateFormat6._locale;
        java.lang.String str18 = stdDateFormat6.toString();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat19, stdDateFormat6, and dateFormat0.", !(stdDateFormat19.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat19.equals(dateFormat0));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        stdDateFormat6._formatPlain = dateFormat12;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        dateFormat17.setLenient(true);
        boolean boolean20 = dateFormat17.isLenient();
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        stdDateFormat23.setNumberFormat(numberFormat26);
        java.lang.String str28 = stdDateFormat23.toString();
        java.text.DateFormat dateFormat29 = stdDateFormat23._formatPlain;
        java.text.DateFormat dateFormat30 = stdDateFormat23._formatRFC1123;
        java.text.DateFormat dateFormat31 = stdDateFormat23._formatRFC1123;
        java.util.TimeZone timeZone32 = stdDateFormat23._timezone;
        java.util.Locale locale33 = stdDateFormat23._locale;
        java.text.NumberFormat numberFormat34 = stdDateFormat23.getNumberFormat();
        boolean boolean36 = stdDateFormat23.looksLikeISO8601("07:00:00");
        java.util.Locale locale37 = stdDateFormat23._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = stdDateFormat6.withLocale(locale37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat38 and stdDateFormat23.", stdDateFormat38.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat38));
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.lang.String str16 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        java.util.TimeZone timeZone18 = stdDateFormat6._timezone;
        java.util.TimeZone timeZone19 = stdDateFormat6._timezone;
        java.util.TimeZone timeZone20 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone21 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.TimeZone timeZone12 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone14 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatRFC1123;
        java.util.Locale locale17 = stdDateFormat6._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat18, stdDateFormat6, and dateFormat0.", !(stdDateFormat18.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat18.equals(dateFormat0));
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
    }
}

