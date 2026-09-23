package com.fasterxml.jackson.databind.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0501");
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
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat22 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat23 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat24 = stdDateFormat6._formatRFC1123;
        java.text.NumberFormat numberFormat25 = stdDateFormat6.getNumberFormat();
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
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat40 = dateFormat39.getNumberFormat();
        boolean boolean42 = dateFormat39.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone43 = dateFormat39.getTimeZone();
        boolean boolean45 = dateFormat39.equals((java.lang.Object) 'a');
        stdDateFormat32._formatRFC1123 = dateFormat39;
        boolean boolean48 = stdDateFormat32.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat49 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        dateFormat49.setLenient(false);
        stdDateFormat32._formatRFC1123 = dateFormat49;
        java.text.DateFormat dateFormat53 = java.text.DateFormat.getTimeInstance();
        dateFormat53.setLenient(true);
        boolean boolean56 = dateFormat53.isLenient();
        java.util.TimeZone timeZone57 = dateFormat53.getTimeZone();
        dateFormat53.setLenient(false);
        stdDateFormat32._formatISO8601_z = dateFormat53;
        java.lang.String str61 = stdDateFormat32.toString();
        java.text.DateFormat dateFormat62 = stdDateFormat32._formatRFC1123;
        java.util.Locale locale63 = stdDateFormat32._locale;
        java.text.DateFormat dateFormat64 = stdDateFormat32._formatISO8601_z;
        boolean boolean65 = stdDateFormat6.equals((java.lang.Object) dateFormat64);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat32.", stdDateFormat6.equals(stdDateFormat32) == stdDateFormat32.equals(stdDateFormat6));
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
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
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        boolean boolean33 = dateFormat30.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone34 = dateFormat30.getTimeZone();
        boolean boolean36 = dateFormat30.equals((java.lang.Object) 'a');
        stdDateFormat23._formatRFC1123 = dateFormat30;
        boolean boolean39 = stdDateFormat23.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        dateFormat40.setLenient(false);
        stdDateFormat23._formatRFC1123 = dateFormat40;
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getTimeInstance();
        dateFormat44.setLenient(true);
        boolean boolean47 = dateFormat44.isLenient();
        java.util.TimeZone timeZone48 = dateFormat44.getTimeZone();
        dateFormat44.setLenient(false);
        stdDateFormat23._formatISO8601_z = dateFormat44;
        java.lang.String str52 = stdDateFormat23.toString();
        java.text.DateFormat dateFormat53 = stdDateFormat23._formatRFC1123;
        java.util.Locale locale54 = stdDateFormat23._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat55 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone16, locale54);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(false);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat22 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat23 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone24 = stdDateFormat6._timezone;
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
        java.util.Locale locale38 = stdDateFormat31._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone24, locale38);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
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
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date17 = stdDateFormat6.parse("1970-01-01T07:00:00.010+0700");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
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
        java.util.Calendar calendar16 = stdDateFormat6.getCalendar();
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        java.util.TimeZone timeZone18 = stdDateFormat6._timezone;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat22 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat23 = stdDateFormat6._formatISO8601;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj25 = stdDateFormat6.parseObject("07:00");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
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
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        boolean boolean33 = dateFormat30.equals((java.lang.Object) 2);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean35 = dateFormat34.isLenient();
        java.util.Calendar calendar36 = dateFormat34.getCalendar();
        dateFormat30.setCalendar(calendar36);
        stdDateFormat23.setCalendar(calendar36);
        stdDateFormat6.setCalendar(calendar36);
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat41 = dateFormat40.getNumberFormat();
        java.text.NumberFormat numberFormat42 = dateFormat40.getNumberFormat();
        java.text.NumberFormat numberFormat43 = dateFormat40.getNumberFormat();
        stdDateFormat6._formatRFC1123 = dateFormat40;
        java.lang.String str45 = stdDateFormat6.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
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
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean15 = dateFormat14.isLenient();
        java.util.Calendar calendar16 = dateFormat14.getCalendar();
        boolean boolean18 = dateFormat14.equals((java.lang.Object) 1.0f);
        dateFormat14.setLenient(true);
        java.util.TimeZone timeZone21 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone21;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone21);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat22 = stdDateFormat6._formatISO8601;
        boolean boolean24 = stdDateFormat6.looksLikeISO8601("1/1/13 06:59");
        java.lang.String str25 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat26 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat27 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.util.TimeZone timeZone29 = dateFormat28.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone29);
        stdDateFormat6._formatISO8601_z = stdDateFormat30;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat28.", dateFormat0.equals(dateFormat28) == dateFormat28.equals(dateFormat0));
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean1 = dateFormat0.isLenient();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        boolean boolean4 = dateFormat0.equals((java.lang.Object) 1.0f);
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone7 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone7);
        boolean boolean10 = stdDateFormat8.looksLikeISO8601("1970-01-01T07:00:00.010+0700");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat8 and stdDateFormat8", stdDateFormat8.equals(stdDateFormat8) ? stdDateFormat8.hashCode() == stdDateFormat8.hashCode() : true);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
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
        java.text.DateFormat dateFormat37 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat38 = dateFormat37.getNumberFormat();
        boolean boolean40 = dateFormat37.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone41 = dateFormat37.getTimeZone();
        boolean boolean43 = dateFormat37.equals((java.lang.Object) 'a');
        stdDateFormat30._formatRFC1123 = dateFormat37;
        boolean boolean46 = stdDateFormat30.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone47 = stdDateFormat30._timezone;
        java.text.DateFormat dateFormat48 = stdDateFormat30._formatRFC1123;
        java.util.TimeZone timeZone49 = stdDateFormat30._timezone;
        stdDateFormat6._timezone = timeZone49;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat30.", stdDateFormat6.equals(stdDateFormat30) == stdDateFormat30.equals(stdDateFormat6));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
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
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        boolean boolean33 = dateFormat30.equals((java.lang.Object) 2);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean35 = dateFormat34.isLenient();
        java.util.Calendar calendar36 = dateFormat34.getCalendar();
        dateFormat30.setCalendar(calendar36);
        stdDateFormat23.setCalendar(calendar36);
        stdDateFormat6.setCalendar(calendar36);
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat41 = dateFormat40.getNumberFormat();
        java.text.NumberFormat numberFormat42 = dateFormat40.getNumberFormat();
        java.text.NumberFormat numberFormat43 = dateFormat40.getNumberFormat();
        stdDateFormat6._formatRFC1123 = dateFormat40;
        java.text.DateFormat dateFormat45 = stdDateFormat6._formatRFC1123;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
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
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean15 = dateFormat14.isLenient();
        java.util.Calendar calendar16 = dateFormat14.getCalendar();
        boolean boolean18 = dateFormat14.equals((java.lang.Object) 1.0f);
        dateFormat14.setLenient(true);
        java.util.TimeZone timeZone21 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone21;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat23, stdDateFormat6, and dateFormat0.", !(stdDateFormat23.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat23.equals(dateFormat0));
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean1 = dateFormat0.isLenient();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        boolean boolean4 = dateFormat0.equals((java.lang.Object) 1.0f);
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone7 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone7);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat8 and stdDateFormat8", stdDateFormat8.equals(stdDateFormat8) ? stdDateFormat8.hashCode() == stdDateFormat8.hashCode() : true);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
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
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance(1, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.AttributedCharacterIterator attributedCharacterIterator18 = stdDateFormat6.formatToCharacterIterator((java.lang.Object) (byte) 0);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
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
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        boolean boolean20 = dateFormat17.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone21 = dateFormat17.getTimeZone();
        java.util.TimeZone timeZone22 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        stdDateFormat6._formatPlain = stdDateFormat23;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat11.", dateFormat0.equals(dateFormat11) == dateFormat11.equals(dateFormat0));
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        boolean boolean22 = stdDateFormat6.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        dateFormat23.setLenient(false);
        stdDateFormat6._formatRFC1123 = dateFormat23;
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        dateFormat27.setLenient(true);
        boolean boolean30 = dateFormat27.isLenient();
        java.util.TimeZone timeZone31 = dateFormat27.getTimeZone();
        dateFormat27.setLenient(false);
        stdDateFormat6._formatISO8601_z = dateFormat27;
        java.lang.String str35 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat36 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat37 = stdDateFormat6._formatISO8601_z;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(false);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat6, and dateFormat0.", !(stdDateFormat16.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
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
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        dateFormat18.setLenient(true);
        boolean boolean21 = dateFormat18.isLenient();
        java.util.Calendar calendar22 = dateFormat18.getCalendar();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getInstance();
        boolean boolean24 = dateFormat18.equals((java.lang.Object) dateFormat23);
        stdDateFormat6._formatISO8601_z = dateFormat23;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        boolean boolean22 = stdDateFormat6.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone23 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        dateFormat24.setLenient(true);
        boolean boolean27 = dateFormat24.isLenient();
        java.util.Calendar calendar28 = dateFormat24.getCalendar();
        java.util.TimeZone timeZone29 = dateFormat24.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone29);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        stdDateFormat30.setNumberFormat(numberFormat33);
        java.text.NumberFormat numberFormat35 = stdDateFormat30.getNumberFormat();
        java.util.Locale locale36 = stdDateFormat30._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat37 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone23, locale36);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone11);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat12, stdDateFormat6, and dateFormat0.", !(stdDateFormat12.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        boolean boolean5 = dateFormat0.equals((java.lang.Object) timeZone4);
        java.text.NumberFormat numberFormat6 = dateFormat0.getNumberFormat();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat3.", dateFormat0.equals(dateFormat3) == dateFormat3.equals(dateFormat0));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat22 = stdDateFormat6._formatPlain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date24 = stdDateFormat6.parse("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
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
        java.util.Calendar calendar17 = stdDateFormat6.getCalendar();
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
        java.text.DateFormat dateFormat30 = stdDateFormat24._formatISO8601_z;
        java.util.TimeZone timeZone31 = stdDateFormat24._timezone;
        stdDateFormat6.setTimeZone(timeZone31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat22 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat23 = stdDateFormat6._formatRFC1123;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone24 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
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
        java.util.TimeZone timeZone18 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getInstance();
        boolean boolean20 = dateFormat19.isLenient();
        java.util.TimeZone timeZone21 = dateFormat19.getTimeZone();
        java.text.NumberFormat numberFormat22 = dateFormat19.getNumberFormat();
        dateFormat19.setLenient(true);
        java.util.TimeZone timeZone25 = dateFormat19.getTimeZone();
        java.util.Calendar calendar26 = dateFormat19.getCalendar();
        java.util.TimeZone timeZone27 = dateFormat19.getTimeZone();
        stdDateFormat6._formatISO8601_z = dateFormat19;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
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
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatRFC1123;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat23, stdDateFormat6, and dateFormat0.", !(stdDateFormat23.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat23.equals(dateFormat0));
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        boolean boolean3 = dateFormat0.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.lang.String str7 = stdDateFormat6.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat6 and stdDateFormat6", stdDateFormat6.equals(stdDateFormat6) ? stdDateFormat6.hashCode() == stdDateFormat6.hashCode() : true);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
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
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
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
        java.lang.String str16 = stdDateFormat6.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
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
        java.text.DateFormat dateFormat27 = stdDateFormat21._formatPlain;
        java.text.DateFormat dateFormat28 = stdDateFormat21._formatRFC1123;
        java.text.DateFormat dateFormat29 = stdDateFormat21._formatRFC1123;
        java.util.TimeZone timeZone30 = stdDateFormat21._timezone;
        java.util.Locale locale31 = stdDateFormat21._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = stdDateFormat6.withLocale(locale31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat32 and stdDateFormat21.", stdDateFormat32.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat32));
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
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
        java.util.TimeZone timeZone18 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat19 = stdDateFormat6._formatISO8601_z;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj15 = stdDateFormat6.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
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
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        boolean boolean33 = dateFormat30.equals((java.lang.Object) 2);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean35 = dateFormat34.isLenient();
        java.util.Calendar calendar36 = dateFormat34.getCalendar();
        dateFormat30.setCalendar(calendar36);
        stdDateFormat23.setCalendar(calendar36);
        stdDateFormat6.setCalendar(calendar36);
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat41 = dateFormat40.getNumberFormat();
        java.text.NumberFormat numberFormat42 = dateFormat40.getNumberFormat();
        java.text.NumberFormat numberFormat43 = dateFormat40.getNumberFormat();
        stdDateFormat6._formatRFC1123 = dateFormat40;
        java.util.Calendar calendar45 = dateFormat40.getCalendar();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat6, and dateFormat0.", !(stdDateFormat16.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean1 = dateFormat0.isLenient();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        boolean boolean4 = dateFormat0.equals((java.lang.Object) 1.0f);
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone7 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone7);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
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
        java.util.Calendar calendar15 = dateFormat12.getCalendar();
        dateFormat12.setLenient(true);
        java.text.NumberFormat numberFormat18 = dateFormat12.getNumberFormat();
        java.util.TimeZone timeZone19 = dateFormat12.getTimeZone();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
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
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        stdDateFormat21._formatPlain = dateFormat27;
        java.text.NumberFormat numberFormat30 = stdDateFormat21.getNumberFormat();
        java.text.DateFormat dateFormat31 = stdDateFormat21._formatISO8601;
        java.util.TimeZone timeZone32 = stdDateFormat21._timezone;
        boolean boolean34 = stdDateFormat21.looksLikeISO8601("07:00:00");
        stdDateFormat6._formatRFC1123 = stdDateFormat21;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat27.", dateFormat0.equals(dateFormat27) == dateFormat27.equals(dateFormat0));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
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
        java.util.TimeZone timeZone38 = stdDateFormat30._timezone;
        java.text.DateFormat dateFormat39 = stdDateFormat30._formatISO8601;
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat41 = dateFormat40.getNumberFormat();
        boolean boolean43 = dateFormat40.equals((java.lang.Object) 2);
        stdDateFormat30._formatISO8601_z = dateFormat40;
        java.text.DateFormat dateFormat45 = stdDateFormat30._formatRFC1123;
        java.util.TimeZone timeZone46 = stdDateFormat30._timezone;
        stdDateFormat6._timezone = timeZone46;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat30.", stdDateFormat6.equals(stdDateFormat30) == stdDateFormat30.equals(stdDateFormat6));
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
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
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance();
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
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        stdDateFormat19._formatPlain = dateFormat25;
        java.util.Calendar calendar28 = dateFormat25.getCalendar();
        dateFormat12.setCalendar(calendar28);
        stdDateFormat6._formatISO8601 = dateFormat12;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat25.", dateFormat0.equals(dateFormat25) == dateFormat25.equals(dateFormat0));
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(true);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date17 = stdDateFormat6.parse("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
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
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean17 = dateFormat16.isLenient();
        java.util.Calendar calendar18 = dateFormat16.getCalendar();
        boolean boolean20 = dateFormat16.equals((java.lang.Object) 1.0f);
        dateFormat16.setLenient(true);
        java.util.TimeZone timeZone23 = dateFormat16.getTimeZone();
        stdDateFormat6.setTimeZone(timeZone23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone23);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
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
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean17 = dateFormat16.isLenient();
        java.util.Calendar calendar18 = dateFormat16.getCalendar();
        boolean boolean20 = dateFormat16.equals((java.lang.Object) 1.0f);
        dateFormat16.setLenient(true);
        java.util.TimeZone timeZone23 = dateFormat16.getTimeZone();
        stdDateFormat6.setTimeZone(timeZone23);
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
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat39 = dateFormat38.getNumberFormat();
        boolean boolean41 = dateFormat38.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone42 = dateFormat38.getTimeZone();
        boolean boolean44 = dateFormat38.equals((java.lang.Object) 'a');
        stdDateFormat31._formatRFC1123 = dateFormat38;
        java.text.DateFormat dateFormat46 = stdDateFormat31._formatPlain;
        java.text.DateFormat dateFormat47 = stdDateFormat31._formatISO8601;
        boolean boolean49 = stdDateFormat31.looksLikeISO8601("1/1/13 06:59");
        java.util.Locale locale50 = stdDateFormat31._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat51 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone23, locale50);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date18 = stdDateFormat6.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone22 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone14);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        boolean boolean3 = dateFormat0.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
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
        java.text.DateFormat dateFormat30 = stdDateFormat22._formatRFC1123;
        java.util.TimeZone timeZone31 = stdDateFormat22._timezone;
        stdDateFormat6.setTimeZone(timeZone31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone15 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
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
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getInstance();
        java.lang.String str18 = dateFormat16.format((java.lang.Object) 14);
        java.lang.String str20 = dateFormat16.format((java.lang.Object) (short) -1);
        stdDateFormat6._formatPlain = dateFormat16;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone22 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean25 = dateFormat24.isLenient();
        java.util.Calendar calendar26 = dateFormat24.getCalendar();
        dateFormat22.setCalendar(calendar26);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str31 = dateFormat29.format((java.lang.Object) 100L);
        dateFormat29.setLenient(true);
        java.util.Calendar calendar34 = dateFormat29.getCalendar();
        dateFormat22.setCalendar(calendar34);
        java.util.Calendar calendar36 = dateFormat22.getCalendar();
        stdDateFormat6._formatPlain = dateFormat22;
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getTimeInstance();
        dateFormat38.setLenient(true);
        boolean boolean41 = dateFormat38.isLenient();
        java.util.Calendar calendar42 = dateFormat38.getCalendar();
        java.util.TimeZone timeZone43 = dateFormat38.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat44 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone43);
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat47 = dateFormat46.getNumberFormat();
        stdDateFormat44.setNumberFormat(numberFormat47);
        java.text.NumberFormat numberFormat49 = stdDateFormat44.getNumberFormat();
        java.util.Locale locale50 = stdDateFormat44._locale;
        java.text.DateFormat dateFormat51 = stdDateFormat44._formatRFC1123;
        stdDateFormat6._formatISO8601 = stdDateFormat44;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat22.", dateFormat0.equals(dateFormat22) == dateFormat22.equals(dateFormat0));
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
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
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        java.text.NumberFormat numberFormat17 = dateFormat15.getNumberFormat();
        java.text.NumberFormat numberFormat18 = dateFormat15.getNumberFormat();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) dateFormat15);
        stdDateFormat6._formatPlain = dateFormat13;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        dateFormat21.setLenient(true);
        boolean boolean24 = dateFormat21.isLenient();
        java.util.Calendar calendar25 = dateFormat21.getCalendar();
        java.util.TimeZone timeZone26 = dateFormat21.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone26);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        stdDateFormat27.setNumberFormat(numberFormat30);
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.util.TimeZone timeZone33 = dateFormat32.getTimeZone();
        stdDateFormat27._formatISO8601_z = dateFormat32;
        stdDateFormat6._formatRFC1123 = stdDateFormat27;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat13.", dateFormat0.equals(dateFormat13) == dateFormat13.equals(dateFormat0));
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 100L);
        java.util.TimeZone timeZone4 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4);
        java.lang.Class<?> wildcardClass6 = stdDateFormat5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat5 and stdDateFormat5", stdDateFormat5.equals(stdDateFormat5) ? stdDateFormat5.hashCode() == stdDateFormat5.hashCode() : true);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
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
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getInstance();
        java.lang.String str18 = dateFormat16.format((java.lang.Object) 14);
        java.lang.String str20 = dateFormat16.format((java.lang.Object) (short) -1);
        stdDateFormat6._formatPlain = dateFormat16;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        dateFormat22.setLenient(true);
        boolean boolean25 = dateFormat22.isLenient();
        java.util.Calendar calendar26 = dateFormat22.getCalendar();
        java.util.TimeZone timeZone27 = dateFormat22.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone27);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        stdDateFormat28.setNumberFormat(numberFormat31);
        java.text.DateFormat dateFormat33 = stdDateFormat28._formatISO8601_z;
        java.text.DateFormat dateFormat34 = stdDateFormat28._formatISO8601_z;
        java.lang.String str35 = stdDateFormat28.toString();
        java.text.DateFormat dateFormat36 = stdDateFormat28._formatRFC1123;
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str40 = dateFormat38.format((java.lang.Object) 100L);
        java.text.NumberFormat numberFormat41 = dateFormat38.getNumberFormat();
        java.util.Calendar calendar42 = dateFormat38.getCalendar();
        dateFormat38.setLenient(true);
        stdDateFormat28._formatPlain = dateFormat38;
        stdDateFormat6._formatPlain = stdDateFormat28;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat28.", stdDateFormat6.equals(stdDateFormat28) == stdDateFormat28.equals(stdDateFormat6));
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone17);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        boolean boolean3 = dateFormat0.equals((java.lang.Object) 2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean5 = dateFormat4.isLenient();
        java.util.Calendar calendar6 = dateFormat4.getCalendar();
        dateFormat0.setCalendar(calendar6);
        java.util.Calendar calendar8 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone9 = dateFormat0.getTimeZone();
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
        java.text.DateFormat dateFormat23 = stdDateFormat16._formatRFC1123;
        java.lang.String str24 = stdDateFormat16.toString();
        java.text.DateFormat dateFormat25 = stdDateFormat16._formatRFC1123;
        java.util.Locale locale26 = stdDateFormat16._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone9, locale26);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        java.text.NumberFormat numberFormat17 = dateFormat15.getNumberFormat();
        java.text.NumberFormat numberFormat18 = dateFormat15.getNumberFormat();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) dateFormat15);
        stdDateFormat6._formatPlain = dateFormat13;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatPlain;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat21.", dateFormat0.equals(dateFormat21) == dateFormat21.equals(dateFormat0));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.util.TimeZone timeZone7 = stdDateFormat6._timezone;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat6 and stdDateFormat6", stdDateFormat6.equals(stdDateFormat6) ? stdDateFormat6.hashCode() == stdDateFormat6.hashCode() : true);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat15, stdDateFormat6, and dateFormat0.", !(stdDateFormat15.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat15.equals(dateFormat0));
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date14 = stdDateFormat6.parse("1970-01-01T07:00:00.000+0700");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
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
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone16);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
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
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateInstance((int) (short) 1, locale38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone22, locale38);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
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
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        boolean boolean33 = dateFormat30.equals((java.lang.Object) 2);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean35 = dateFormat34.isLenient();
        java.util.Calendar calendar36 = dateFormat34.getCalendar();
        dateFormat30.setCalendar(calendar36);
        stdDateFormat23.setCalendar(calendar36);
        stdDateFormat6.setCalendar(calendar36);
        java.lang.String str40 = stdDateFormat6.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date20 = stdDateFormat6.parse("1970-01-01T00:00:00.004+0000");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean25 = dateFormat24.isLenient();
        java.util.Calendar calendar26 = dateFormat24.getCalendar();
        dateFormat22.setCalendar(calendar26);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str31 = dateFormat29.format((java.lang.Object) 100L);
        dateFormat29.setLenient(true);
        java.util.Calendar calendar34 = dateFormat29.getCalendar();
        dateFormat22.setCalendar(calendar34);
        java.util.Calendar calendar36 = dateFormat22.getCalendar();
        stdDateFormat6._formatPlain = dateFormat22;
        java.text.NumberFormat numberFormat38 = dateFormat22.getNumberFormat();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat22.", dateFormat0.equals(dateFormat22) == dateFormat22.equals(dateFormat0));
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
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
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatPlain;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat16.", dateFormat0.equals(dateFormat16) == dateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
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
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        boolean boolean32 = dateFormat29.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone33 = dateFormat29.getTimeZone();
        boolean boolean35 = dateFormat29.equals((java.lang.Object) 'a');
        stdDateFormat22._formatRFC1123 = dateFormat29;
        java.text.DateFormat dateFormat37 = stdDateFormat22._formatPlain;
        java.text.DateFormat dateFormat38 = stdDateFormat22._formatRFC1123;
        java.util.TimeZone timeZone39 = dateFormat38.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat40 = stdDateFormat6.withTimeZone(timeZone39);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
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
        java.util.TimeZone timeZone18 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat19 = stdDateFormat6._formatPlain;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat19.", dateFormat0.equals(dateFormat19) == dateFormat19.equals(dateFormat0));
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
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
        java.util.TimeZone timeZone27 = stdDateFormat22._timezone;
        java.text.DateFormat dateFormat28 = stdDateFormat22._formatISO8601_z;
        java.util.TimeZone timeZone29 = stdDateFormat22._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = stdDateFormat6.withTimeZone(timeZone29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat30 and stdDateFormat22.", stdDateFormat30.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat30));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
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
        java.lang.String str15 = stdDateFormat6.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat11.", dateFormat0.equals(dateFormat11) == dateFormat11.equals(dateFormat0));
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
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
        java.text.DateFormat dateFormat18 = stdDateFormat6._formatPlain;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat18.", dateFormat0.equals(dateFormat18) == dateFormat18.equals(dateFormat0));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
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
        java.util.TimeZone timeZone34 = stdDateFormat27._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat6.withTimeZone(timeZone34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat35 and stdDateFormat27.", stdDateFormat35.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat35));
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
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
        java.util.TimeZone timeZone19 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat6.withTimeZone(timeZone19);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat20, stdDateFormat6, and dateFormat0.", !(stdDateFormat20.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat20.equals(dateFormat0));
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat22 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
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
        java.lang.String str38 = stdDateFormat30.toString();
        java.text.DateFormat dateFormat39 = stdDateFormat30._formatRFC1123;
        java.util.Locale locale40 = stdDateFormat30._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone23, locale40);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(false);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
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
        java.lang.Class<?> wildcardClass18 = stdDateFormat6.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat6, and dateFormat0.", !(stdDateFormat17.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat17.equals(dateFormat0));
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat22 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        boolean boolean24 = dateFormat23.isLenient();
        stdDateFormat6._formatPlain = dateFormat23;
        java.lang.String str26 = stdDateFormat6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean27 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date24 = stdDateFormat6.parse("1/1/13 06:59");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone22);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
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
        java.util.Calendar calendar15 = stdDateFormat6.getCalendar();
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("1970-01-01T07:00:00.000+0700");
        java.util.Calendar calendar18 = stdDateFormat6.getCalendar();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
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
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        boolean boolean33 = dateFormat30.equals((java.lang.Object) 2);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean35 = dateFormat34.isLenient();
        java.util.Calendar calendar36 = dateFormat34.getCalendar();
        dateFormat30.setCalendar(calendar36);
        stdDateFormat23.setCalendar(calendar36);
        stdDateFormat6.setCalendar(calendar36);
        java.text.DateFormat dateFormat40 = stdDateFormat6._formatISO8601;
        java.util.TimeZone timeZone41 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat42 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone41);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
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
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatRFC1123;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date19 = stdDateFormat6.parse("1/1/13 06:59");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
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
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getInstance();
        dateFormat14.setLenient(true);
        dateFormat14.setLenient(false);
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
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        stdDateFormat25._formatPlain = dateFormat31;
        java.util.Calendar calendar34 = dateFormat31.getCalendar();
        java.text.NumberFormat numberFormat35 = dateFormat31.getNumberFormat();
        boolean boolean36 = dateFormat14.equals((java.lang.Object) dateFormat31);
        stdDateFormat6._formatISO8601 = dateFormat14;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat31.", dateFormat0.equals(dateFormat31) == dateFormat31.equals(dateFormat0));
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
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
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        boolean boolean33 = dateFormat30.equals((java.lang.Object) 2);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean35 = dateFormat34.isLenient();
        java.util.Calendar calendar36 = dateFormat34.getCalendar();
        dateFormat30.setCalendar(calendar36);
        stdDateFormat23.setCalendar(calendar36);
        stdDateFormat6.setCalendar(calendar36);
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str43 = dateFormat41.format((java.lang.Object) 100L);
        java.util.TimeZone timeZone44 = dateFormat41.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone44);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = stdDateFormat6.withTimeZone(timeZone44);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
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
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        boolean boolean33 = dateFormat30.equals((java.lang.Object) 2);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean35 = dateFormat34.isLenient();
        java.util.Calendar calendar36 = dateFormat34.getCalendar();
        dateFormat30.setCalendar(calendar36);
        stdDateFormat23.setCalendar(calendar36);
        stdDateFormat6.setCalendar(calendar36);
        java.util.TimeZone timeZone40 = stdDateFormat6._timezone;
        java.lang.Class<?> wildcardClass41 = stdDateFormat6.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        boolean boolean22 = stdDateFormat6.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        dateFormat23.setLenient(false);
        stdDateFormat6._formatRFC1123 = dateFormat23;
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        dateFormat27.setLenient(true);
        boolean boolean30 = dateFormat27.isLenient();
        java.util.TimeZone timeZone31 = dateFormat27.getTimeZone();
        dateFormat27.setLenient(false);
        stdDateFormat6._formatISO8601_z = dateFormat27;
        java.lang.String str35 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat36 = stdDateFormat6._formatRFC1123;
        java.lang.String str37 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getTimeInstance();
        dateFormat38.setLenient(true);
        boolean boolean41 = dateFormat38.isLenient();
        java.util.Calendar calendar42 = dateFormat38.getCalendar();
        java.util.TimeZone timeZone43 = dateFormat38.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat44 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone43);
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat47 = dateFormat46.getNumberFormat();
        stdDateFormat44.setNumberFormat(numberFormat47);
        java.lang.String str49 = stdDateFormat44.toString();
        java.text.DateFormat dateFormat50 = stdDateFormat44._formatPlain;
        java.text.DateFormat dateFormat51 = stdDateFormat44._formatRFC1123;
        java.text.DateFormat dateFormat52 = stdDateFormat44._formatRFC1123;
        java.util.TimeZone timeZone53 = stdDateFormat44._timezone;
        java.util.Locale locale54 = stdDateFormat44._locale;
        java.text.NumberFormat numberFormat55 = stdDateFormat44.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat55);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat44.", stdDateFormat6.equals(stdDateFormat44) == stdDateFormat44.equals(stdDateFormat6));
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
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
        java.text.DateFormat dateFormat34 = stdDateFormat28._formatISO8601_z;
        java.text.DateFormat dateFormat35 = stdDateFormat28._formatISO8601_z;
        java.lang.String str36 = stdDateFormat28.toString();
        java.text.DateFormat dateFormat37 = stdDateFormat28._formatISO8601;
        java.util.Locale locale38 = stdDateFormat28._locale;
        stdDateFormat6._formatISO8601_z = stdDateFormat28;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat28.", stdDateFormat6.equals(stdDateFormat28) == stdDateFormat28.equals(stdDateFormat6));
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
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
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        boolean boolean33 = dateFormat30.equals((java.lang.Object) 2);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean35 = dateFormat34.isLenient();
        java.util.Calendar calendar36 = dateFormat34.getCalendar();
        dateFormat30.setCalendar(calendar36);
        stdDateFormat23.setCalendar(calendar36);
        stdDateFormat6.setCalendar(calendar36);
        java.text.DateFormat dateFormat40 = stdDateFormat6._formatRFC1123;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat12 and dateFormat30.", dateFormat12.equals(dateFormat30) == dateFormat30.equals(dateFormat12));
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat15, stdDateFormat6, and dateFormat0.", !(stdDateFormat15.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat15.equals(dateFormat0));
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getTimeInstance();
        dateFormat12.setLenient(true);
        boolean boolean15 = dateFormat12.isLenient();
        java.util.Calendar calendar16 = dateFormat12.getCalendar();
        java.util.TimeZone timeZone17 = dateFormat12.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone17);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        stdDateFormat18.setNumberFormat(numberFormat21);
        java.text.DateFormat dateFormat23 = stdDateFormat18._formatISO8601_z;
        java.text.DateFormat dateFormat24 = stdDateFormat18._formatISO8601_z;
        java.lang.String str25 = stdDateFormat18.toString();
        java.text.DateFormat dateFormat26 = stdDateFormat18._formatISO8601_z;
        java.util.TimeZone timeZone27 = stdDateFormat18._timezone;
        stdDateFormat6._formatISO8601 = stdDateFormat18;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat18.", stdDateFormat6.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat6));
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
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
        java.lang.String str15 = stdDateFormat6.toString();
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
        java.text.DateFormat dateFormat28 = stdDateFormat22._formatISO8601_z;
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatISO8601;
        stdDateFormat6._formatISO8601_z = stdDateFormat22;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat22 = stdDateFormat6._formatISO8601;
        boolean boolean24 = stdDateFormat6.looksLikeISO8601("1/1/13 06:59");
        boolean boolean26 = stdDateFormat6.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj28 = stdDateFormat6.parseObject("1/1/13 06:59");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
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
        java.util.Locale locale17 = stdDateFormat9._locale;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance((int) (short) 1, locale17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale17);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance();
        dateFormat2.setLenient(true);
        boolean boolean5 = dateFormat2.isLenient();
        java.util.Calendar calendar6 = dateFormat2.getCalendar();
        java.util.TimeZone timeZone7 = dateFormat2.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone7);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat11 = dateFormat10.getNumberFormat();
        stdDateFormat8.setNumberFormat(numberFormat11);
        java.util.TimeZone timeZone13 = stdDateFormat8._timezone;
        java.util.Locale locale14 = stdDateFormat8._locale;
        java.text.DateFormat dateFormat15 = stdDateFormat8._formatRFC1123;
        java.util.Locale locale16 = stdDateFormat8._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat14, stdDateFormat6, and dateFormat0.", !(stdDateFormat14.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat14.equals(dateFormat0));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
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
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean15 = dateFormat14.isLenient();
        java.util.Calendar calendar16 = dateFormat14.getCalendar();
        boolean boolean18 = dateFormat14.equals((java.lang.Object) 1.0f);
        dateFormat14.setLenient(true);
        java.util.TimeZone timeZone21 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone21;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date21 = stdDateFormat6.parse("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        boolean boolean8 = stdDateFormat6.looksLikeISO8601("1970-01-01T07:00:00.010+0700");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat6 and stdDateFormat6", stdDateFormat6.equals(stdDateFormat6) ? stdDateFormat6.hashCode() == stdDateFormat6.hashCode() : true);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
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
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601_z;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
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
        java.util.Calendar calendar15 = stdDateFormat6.getCalendar();
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601_z;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date18 = stdDateFormat6.parse("07:00");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat22 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat23 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone24 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone24);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
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
        stdDateFormat6._timezone = timeZone31;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
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
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat11.", dateFormat0.equals(dateFormat11) == dateFormat11.equals(dateFormat0));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
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
        java.util.Locale locale14 = stdDateFormat6._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat15, stdDateFormat6, and dateFormat0.", !(stdDateFormat15.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat15.equals(dateFormat0));
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat22 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        boolean boolean24 = dateFormat23.isLenient();
        stdDateFormat6._formatPlain = dateFormat23;
        java.util.TimeZone timeZone26 = stdDateFormat6._timezone;
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
        java.text.DateFormat dateFormat39 = stdDateFormat33._formatPlain;
        java.text.DateFormat dateFormat40 = stdDateFormat33._formatRFC1123;
        java.text.DateFormat dateFormat41 = stdDateFormat33._formatRFC1123;
        java.util.TimeZone timeZone42 = stdDateFormat33._timezone;
        java.util.Locale locale43 = stdDateFormat33._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat44 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone26, locale43);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
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
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        boolean boolean18 = dateFormat17.isLenient();
        java.util.TimeZone timeZone19 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat6.withTimeZone(timeZone19);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat21 and stdDateFormat20.", stdDateFormat21.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat21));
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
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
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("2513-01-01T07:00:00.000+0700");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date19 = stdDateFormat6.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = stdDateFormat6._formatISO8601;
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
        java.text.DateFormat dateFormat25 = stdDateFormat18._formatRFC1123;
        java.text.DateFormat dateFormat26 = stdDateFormat18._formatRFC1123;
        java.text.DateFormat dateFormat27 = stdDateFormat18._formatRFC1123;
        java.text.DateFormat dateFormat28 = stdDateFormat18._formatPlain;
        boolean boolean30 = stdDateFormat18.looksLikeISO8601("");
        java.text.DateFormat dateFormat31 = stdDateFormat18._formatISO8601;
        stdDateFormat6._formatISO8601 = stdDateFormat18;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat18.", stdDateFormat6.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat6));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
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
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatPlain;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat11.", dateFormat0.equals(dateFormat11) == dateFormat11.equals(dateFormat0));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 100L);
        java.text.NumberFormat numberFormat4 = dateFormat1.getNumberFormat();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance(0);
        java.util.Calendar calendar7 = dateFormat6.getCalendar();
        dateFormat1.setCalendar(calendar7);
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        java.util.TimeZone timeZone11 = dateFormat9.getTimeZone();
        boolean boolean12 = dateFormat1.equals((java.lang.Object) timeZone11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone11);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean4 = dateFormat3.isLenient();
        java.util.Calendar calendar5 = dateFormat3.getCalendar();
        boolean boolean7 = dateFormat3.equals((java.lang.Object) 1.0f);
        dateFormat3.setLenient(true);
        java.util.TimeZone timeZone10 = dateFormat3.getTimeZone();
        java.text.NumberFormat numberFormat11 = dateFormat3.getNumberFormat();
        stdDateFormat2._formatPlain = dateFormat3;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
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
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        boolean boolean33 = dateFormat30.equals((java.lang.Object) 2);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean35 = dateFormat34.isLenient();
        java.util.Calendar calendar36 = dateFormat34.getCalendar();
        dateFormat30.setCalendar(calendar36);
        stdDateFormat23.setCalendar(calendar36);
        stdDateFormat6.setCalendar(calendar36);
        java.text.DateFormat dateFormat40 = stdDateFormat6._formatISO8601;
        java.util.TimeZone timeZone41 = stdDateFormat6._timezone;
        boolean boolean43 = stdDateFormat6.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
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
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(true);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
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
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date17 = stdDateFormat6.parse("1/1/13 06:59");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat22 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat23 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone24 = stdDateFormat6._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat25, stdDateFormat6, and dateFormat0.", !(stdDateFormat25.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat25.equals(dateFormat0));
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat22 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat23 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone24 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat25 = stdDateFormat6._formatISO8601_z;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(false);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat19, stdDateFormat6, and dateFormat0.", !(stdDateFormat19.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat19.equals(dateFormat0));
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
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
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        boolean boolean17 = dateFormat14.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone18 = dateFormat14.getTimeZone();
        boolean boolean20 = dateFormat14.equals((java.lang.Object) 'a');
        stdDateFormat7._formatRFC1123 = dateFormat14;
        java.text.DateFormat dateFormat22 = stdDateFormat7._formatPlain;
        java.text.DateFormat dateFormat23 = stdDateFormat7._formatISO8601;
        java.text.DateFormat dateFormat24 = stdDateFormat7._formatISO8601;
        java.util.TimeZone timeZone25 = stdDateFormat7._timezone;
        java.util.Locale locale26 = stdDateFormat7._locale;
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance((int) (byte) 0, locale26);
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        boolean boolean32 = dateFormat29.equals((java.lang.Object) 2);
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean34 = dateFormat33.isLenient();
        java.util.Calendar calendar35 = dateFormat33.getCalendar();
        dateFormat29.setCalendar(calendar35);
        boolean boolean37 = dateFormat29.isLenient();
        java.util.Calendar calendar38 = dateFormat29.getCalendar();
        dateFormat27.setCalendar(calendar38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat14 and dateFormat27.", dateFormat14.equals(dateFormat27) == dateFormat27.equals(dateFormat14));
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat22 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat23 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone24 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat25 = stdDateFormat6._formatISO8601_z;
        java.util.TimeZone timeZone26 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = stdDateFormat6._formatRFC1123;
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
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        boolean boolean28 = dateFormat25.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone29 = dateFormat25.getTimeZone();
        boolean boolean31 = dateFormat25.equals((java.lang.Object) 'a');
        stdDateFormat18._formatRFC1123 = dateFormat25;
        java.util.Calendar calendar33 = dateFormat25.getCalendar();
        stdDateFormat6.setCalendar(calendar33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat18.", stdDateFormat6.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat6));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
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
        java.util.Locale locale31 = stdDateFormat23._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = stdDateFormat6.withLocale(locale31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat32 and stdDateFormat23.", stdDateFormat32.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat32));
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date18 = stdDateFormat6.parse("1970-01-01T00:00:00.000+0000");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
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
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        boolean boolean33 = dateFormat30.equals((java.lang.Object) 2);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean35 = dateFormat34.isLenient();
        java.util.Calendar calendar36 = dateFormat34.getCalendar();
        dateFormat30.setCalendar(calendar36);
        stdDateFormat23.setCalendar(calendar36);
        stdDateFormat6.setCalendar(calendar36);
        java.util.TimeZone timeZone40 = stdDateFormat6._timezone;
        java.lang.Class<?> wildcardClass41 = timeZone40.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone6 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone6);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
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
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("1970-01-01T00:00:00.000+0000");
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
        stdDateFormat6._timezone = timeZone30;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        boolean boolean22 = stdDateFormat6.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone23 = stdDateFormat6._timezone;
        java.util.TimeZone timeZone24 = stdDateFormat6._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat25, stdDateFormat6, and dateFormat0.", !(stdDateFormat25.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat25.equals(dateFormat0));
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat15, stdDateFormat6, and dateFormat0.", !(stdDateFormat15.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat15.equals(dateFormat0));
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat20, stdDateFormat6, and dateFormat0.", !(stdDateFormat20.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat20.equals(dateFormat0));
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
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
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        boolean boolean33 = dateFormat30.equals((java.lang.Object) 2);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean35 = dateFormat34.isLenient();
        java.util.Calendar calendar36 = dateFormat34.getCalendar();
        dateFormat30.setCalendar(calendar36);
        stdDateFormat23.setCalendar(calendar36);
        stdDateFormat6.setCalendar(calendar36);
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat41 = dateFormat40.getNumberFormat();
        java.text.NumberFormat numberFormat42 = dateFormat40.getNumberFormat();
        java.text.NumberFormat numberFormat43 = dateFormat40.getNumberFormat();
        stdDateFormat6._formatRFC1123 = dateFormat40;
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getTimeInstance();
        dateFormat46.setLenient(true);
        boolean boolean49 = dateFormat46.isLenient();
        java.util.Calendar calendar50 = dateFormat46.getCalendar();
        java.util.TimeZone timeZone51 = dateFormat46.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat52 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone51);
        java.text.DateFormat dateFormat54 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat55 = dateFormat54.getNumberFormat();
        stdDateFormat52.setNumberFormat(numberFormat55);
        java.lang.String str57 = stdDateFormat52.toString();
        java.util.TimeZone timeZone58 = stdDateFormat52._timezone;
        java.util.TimeZone timeZone59 = stdDateFormat52._timezone;
        java.util.Locale locale60 = stdDateFormat52._locale;
        java.text.DateFormat dateFormat61 = java.text.DateFormat.getDateInstance((int) (short) 1, locale60);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat62 = stdDateFormat6.withLocale(locale60);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(true);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone6 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat7.setLenient(true);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat6, and dateFormat0.", !(stdDateFormat16.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone6 = dateFormat0.getTimeZone();
        java.util.Calendar calendar7 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8);
        java.text.DateFormat dateFormat10 = stdDateFormat9._formatISO8601;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat9 and stdDateFormat9", stdDateFormat9.equals(stdDateFormat9) ? stdDateFormat9.hashCode() == stdDateFormat9.hashCode() : true);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean1 = dateFormat0.isLenient();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        boolean boolean4 = dateFormat0.equals((java.lang.Object) 1.0f);
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone7 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone7);
        java.util.TimeZone timeZone9 = stdDateFormat8._timezone;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat8 and stdDateFormat8", stdDateFormat8.equals(stdDateFormat8) ? stdDateFormat8.hashCode() == stdDateFormat8.hashCode() : true);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        boolean boolean3 = dateFormat0.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.util.Locale locale7 = stdDateFormat6._locale;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat6 and stdDateFormat6", stdDateFormat6.equals(stdDateFormat6) ? stdDateFormat6.hashCode() == stdDateFormat6.hashCode() : true);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
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
        java.util.Calendar calendar15 = dateFormat12.getCalendar();
        dateFormat12.setLenient(true);
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
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        boolean boolean34 = dateFormat31.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone35 = dateFormat31.getTimeZone();
        boolean boolean37 = dateFormat31.equals((java.lang.Object) 'a');
        stdDateFormat24._formatRFC1123 = dateFormat31;
        java.text.DateFormat dateFormat39 = stdDateFormat24._formatPlain;
        java.text.DateFormat dateFormat40 = stdDateFormat24._formatISO8601;
        java.text.DateFormat dateFormat41 = stdDateFormat24._formatISO8601;
        java.text.DateFormat dateFormat42 = stdDateFormat24._formatRFC1123;
        java.text.NumberFormat numberFormat43 = stdDateFormat24.getNumberFormat();
        dateFormat12.setNumberFormat(numberFormat43);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
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
        stdDateFormat6.setTimeZone(timeZone30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(false);
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj6 = dateFormat0.parseObject("1/1/13 06:59");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date15 = stdDateFormat6.parse("1970-01-01T07:00:00.005+0700");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        boolean boolean16 = dateFormat13.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone17 = dateFormat13.getTimeZone();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) 'a');
        stdDateFormat6._formatRFC1123 = dateFormat13;
        java.text.DateFormat dateFormat21 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat22 = stdDateFormat6._formatPlain;
        java.util.TimeZone timeZone23 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getInstance();
        dateFormat24.setLenient(true);
        java.util.TimeZone timeZone27 = dateFormat24.getTimeZone();
        stdDateFormat6._formatPlain = dateFormat24;
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance();
        dateFormat29.setLenient(true);
        boolean boolean32 = dateFormat29.isLenient();
        java.util.Calendar calendar33 = dateFormat29.getCalendar();
        java.util.TimeZone timeZone34 = dateFormat29.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone34);
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat38 = dateFormat37.getNumberFormat();
        stdDateFormat35.setNumberFormat(numberFormat38);
        java.lang.String str40 = stdDateFormat35.toString();
        java.util.TimeZone timeZone41 = stdDateFormat35._timezone;
        java.text.DateFormat dateFormat42 = stdDateFormat35._formatRFC1123;
        java.util.TimeZone timeZone43 = stdDateFormat35._timezone;
        java.text.DateFormat dateFormat44 = stdDateFormat35._formatPlain;
        java.lang.String str45 = stdDateFormat35.toString();
        java.lang.String str46 = stdDateFormat35.toString();
        stdDateFormat6._formatPlain = stdDateFormat35;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat35.", stdDateFormat6.equals(stdDateFormat35) == stdDateFormat35.equals(stdDateFormat6));
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
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
        java.text.DateFormat dateFormat14 = stdDateFormat8._formatPlain;
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        boolean boolean18 = dateFormat15.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone19 = dateFormat15.getTimeZone();
        boolean boolean21 = dateFormat15.equals((java.lang.Object) 'a');
        stdDateFormat8._formatRFC1123 = dateFormat15;
        java.text.DateFormat dateFormat23 = stdDateFormat8._formatPlain;
        java.text.DateFormat dateFormat24 = stdDateFormat8._formatISO8601;
        boolean boolean26 = stdDateFormat8.looksLikeISO8601("1/1/13 06:59");
        java.util.Locale locale27 = stdDateFormat8._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
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
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getInstance();
        java.lang.String str18 = dateFormat16.format((java.lang.Object) 14);
        java.lang.String str20 = dateFormat16.format((java.lang.Object) (short) -1);
        stdDateFormat6._formatPlain = dateFormat16;
        java.lang.String str22 = stdDateFormat6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(false);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat6, and dateFormat0.", !(stdDateFormat17.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat17.equals(dateFormat0));
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
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
        java.text.DateFormat dateFormat33 = stdDateFormat27._formatPlain;
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat35 = dateFormat34.getNumberFormat();
        boolean boolean37 = dateFormat34.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone38 = dateFormat34.getTimeZone();
        boolean boolean40 = dateFormat34.equals((java.lang.Object) 'a');
        stdDateFormat27._formatRFC1123 = dateFormat34;
        boolean boolean43 = stdDateFormat27.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat44 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        dateFormat44.setLenient(false);
        stdDateFormat27._formatRFC1123 = dateFormat44;
        java.text.DateFormat dateFormat48 = java.text.DateFormat.getTimeInstance();
        dateFormat48.setLenient(true);
        boolean boolean51 = dateFormat48.isLenient();
        java.util.TimeZone timeZone52 = dateFormat48.getTimeZone();
        dateFormat48.setLenient(false);
        stdDateFormat27._formatISO8601_z = dateFormat48;
        java.lang.String str56 = stdDateFormat27.toString();
        boolean boolean58 = stdDateFormat27.looksLikeISO8601("1970-01-01T00:00:00.000+0000");
        stdDateFormat6._formatISO8601 = stdDateFormat27;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat27.", stdDateFormat6.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat6));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
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
        java.lang.String str29 = stdDateFormat21.toString();
        stdDateFormat6._formatISO8601_z = stdDateFormat21;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat21.", stdDateFormat6.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat6));
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
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
        java.util.Locale locale14 = stdDateFormat6._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
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
        java.util.Calendar calendar17 = stdDateFormat6.getCalendar();
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
        java.util.Locale locale31 = stdDateFormat24._locale;
        java.text.DateFormat dateFormat32 = stdDateFormat24._formatRFC1123;
        java.util.Calendar calendar33 = stdDateFormat24.getCalendar();
        java.util.TimeZone timeZone34 = stdDateFormat24._timezone;
        stdDateFormat6._timezone = timeZone34;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date17 = stdDateFormat6.parse("1970-01-01T07:00:00.005+0700");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
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
        java.text.NumberFormat numberFormat21 = dateFormat16.getNumberFormat();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat16.", dateFormat0.equals(dateFormat16) == dateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(true);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
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
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        boolean boolean18 = stdDateFormat6.looksLikeISO8601("1970-01-01T07:00:00.000+0700");
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
        java.text.DateFormat dateFormat33 = stdDateFormat26._formatISO8601;
        stdDateFormat6._formatPlain = stdDateFormat26;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat26.", stdDateFormat6.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat6));
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat20, stdDateFormat6, and dateFormat0.", !(stdDateFormat20.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat20.equals(dateFormat0));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
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
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.util.TimeZone timeZone29 = dateFormat28.getTimeZone();
        stdDateFormat23._formatISO8601_z = dateFormat28;
        java.util.TimeZone timeZone31 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone31);
        stdDateFormat6._formatISO8601_z = dateFormat32;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
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
        java.text.DateFormat dateFormat31 = stdDateFormat24._formatISO8601_z;
        java.util.TimeZone timeZone32 = stdDateFormat24._timezone;
        java.util.Locale locale33 = stdDateFormat24._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone17, locale33);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(true);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
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
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getInstance();
        boolean boolean17 = dateFormat16.isLenient();
        java.util.TimeZone timeZone18 = dateFormat16.getTimeZone();
        java.text.NumberFormat numberFormat19 = dateFormat16.getNumberFormat();
        dateFormat16.setLenient(true);
        java.util.TimeZone timeZone22 = dateFormat16.getTimeZone();
        java.util.Calendar calendar23 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone24 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        stdDateFormat6._formatRFC1123 = stdDateFormat25;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat25.", stdDateFormat6.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat6));
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
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
        java.util.TimeZone timeZone22 = stdDateFormat16._timezone;
        java.text.DateFormat dateFormat23 = stdDateFormat16._formatRFC1123;
        java.util.TimeZone timeZone24 = stdDateFormat16._timezone;
        java.text.DateFormat dateFormat25 = stdDateFormat16._formatPlain;
        java.lang.String str26 = stdDateFormat16.toString();
        java.text.DateFormat dateFormat27 = stdDateFormat16._formatISO8601;
        java.text.DateFormat dateFormat28 = stdDateFormat16._formatPlain;
        java.text.DateFormat dateFormat29 = stdDateFormat16._formatISO8601_z;
        java.util.TimeZone timeZone30 = stdDateFormat16._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = stdDateFormat9.withTimeZone(timeZone30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat31 and stdDateFormat31", stdDateFormat31.equals(stdDateFormat31) ? stdDateFormat31.hashCode() == stdDateFormat31.hashCode() : true);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (byte) 1);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj16 = stdDateFormat6.parseObject("1970-01-01T07:00:00.000+0700");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = stdDateFormat4.isLenient();
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
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
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        dateFormat18.setLenient(true);
        boolean boolean21 = dateFormat18.isLenient();
        java.util.Calendar calendar22 = dateFormat18.getCalendar();
        java.util.TimeZone timeZone23 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        stdDateFormat24.setNumberFormat(numberFormat27);
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.util.TimeZone timeZone30 = dateFormat29.getTimeZone();
        stdDateFormat24._formatISO8601_z = dateFormat29;
        java.util.TimeZone timeZone32 = stdDateFormat24._timezone;
        boolean boolean34 = stdDateFormat24.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.util.TimeZone timeZone35 = stdDateFormat24._timezone;
        stdDateFormat6._timezone = timeZone35;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
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
        java.util.Calendar calendar15 = dateFormat12.getCalendar();
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
        java.text.DateFormat dateFormat30 = stdDateFormat22._formatRFC1123;
        java.util.TimeZone timeZone31 = stdDateFormat22._timezone;
        java.util.Locale locale32 = stdDateFormat22._locale;
        java.text.NumberFormat numberFormat33 = stdDateFormat22.getNumberFormat();
        dateFormat12.setNumberFormat(numberFormat33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getTimeInstance();
        dateFormat7.setLenient(true);
        boolean boolean10 = dateFormat7.isLenient();
        java.util.Calendar calendar11 = dateFormat7.getCalendar();
        java.util.TimeZone timeZone12 = dateFormat7.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        stdDateFormat13.setNumberFormat(numberFormat16);
        java.lang.String str18 = stdDateFormat13.toString();
        java.util.TimeZone timeZone19 = stdDateFormat13._timezone;
        java.text.DateFormat dateFormat20 = stdDateFormat13._formatRFC1123;
        java.lang.String str21 = stdDateFormat13.toString();
        java.text.DateFormat dateFormat22 = stdDateFormat13._formatRFC1123;
        java.util.Locale locale23 = stdDateFormat13._locale;
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone5, locale23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat6 and stdDateFormat6", stdDateFormat6.equals(stdDateFormat6) ? stdDateFormat6.hashCode() == stdDateFormat6.hashCode() : true);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
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
        java.util.TimeZone timeZone17 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = stdDateFormat6.format((java.lang.Object) 7L);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj2 = stdDateFormat0.parseObject("1970-01-01T00:00:00.004+0000");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat6, and dateFormat0.", !(stdDateFormat17.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat17.equals(dateFormat0));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
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
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str22 = dateFormat20.format((java.lang.Object) 100L);
        java.text.NumberFormat numberFormat23 = dateFormat20.getNumberFormat();
        java.util.Calendar calendar24 = dateFormat20.getCalendar();
        dateFormat20.setLenient(true);
        java.util.Calendar calendar27 = dateFormat20.getCalendar();
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance();
        dateFormat28.setLenient(true);
        java.util.Calendar calendar31 = dateFormat28.getCalendar();
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getTimeInstance();
        dateFormat32.setLenient(true);
        boolean boolean35 = dateFormat32.isLenient();
        java.util.Calendar calendar36 = dateFormat32.getCalendar();
        java.util.TimeZone timeZone37 = dateFormat32.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone37);
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat41 = dateFormat40.getNumberFormat();
        stdDateFormat38.setNumberFormat(numberFormat41);
        java.lang.String str43 = stdDateFormat38.toString();
        java.text.DateFormat dateFormat44 = stdDateFormat38._formatPlain;
        java.text.DateFormat dateFormat45 = stdDateFormat38._formatRFC1123;
        java.text.NumberFormat numberFormat46 = stdDateFormat38.getNumberFormat();
        dateFormat28.setNumberFormat(numberFormat46);
        java.lang.Object obj49 = numberFormat46.parseObject("1970-01-01T00:00:00.004+0000");
        dateFormat20.setNumberFormat(numberFormat46);
        stdDateFormat6.setNumberFormat(numberFormat46);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat38.", stdDateFormat6.equals(stdDateFormat38) == stdDateFormat38.equals(stdDateFormat6));
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
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
        java.util.TimeZone timeZone18 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
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
        java.util.TimeZone timeZone28 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat29 = stdDateFormat23._formatISO8601_z;
        java.text.DateFormat dateFormat30 = stdDateFormat23._formatISO8601_z;
        java.lang.String str31 = stdDateFormat23.toString();
        java.text.DateFormat dateFormat32 = stdDateFormat23._formatISO8601;
        java.util.Locale locale33 = stdDateFormat23._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16, locale33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
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
        java.util.TimeZone timeZone14 = stdDateFormat9._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat9._formatISO8601_z;
        java.text.DateFormat dateFormat16 = stdDateFormat9._formatISO8601;
        boolean boolean18 = stdDateFormat9.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat19 = stdDateFormat9._formatISO8601;
        java.util.Locale locale20 = stdDateFormat9._locale;
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
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
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatRFC1123;
        java.util.Locale locale30 = stdDateFormat22._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15, locale30);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
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
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateTimeInstance();
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
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        stdDateFormat21._formatPlain = dateFormat27;
        java.util.Calendar calendar30 = dateFormat27.getCalendar();
        dateFormat14.setCalendar(calendar30);
        stdDateFormat6.setCalendar(calendar30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat21.", stdDateFormat6.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat6));
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat4.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
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
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat6, and dateFormat0.", !(stdDateFormat17.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat17.equals(dateFormat0));
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.util.Locale locale5 = stdDateFormat4._locale;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        java.text.NumberFormat numberFormat17 = dateFormat15.getNumberFormat();
        java.text.NumberFormat numberFormat18 = dateFormat15.getNumberFormat();
        boolean boolean19 = dateFormat13.equals((java.lang.Object) dateFormat15);
        stdDateFormat6._formatPlain = dateFormat13;
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
        stdDateFormat6.setTimeZone(timeZone32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat27.", stdDateFormat6.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat6));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
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
        java.lang.String str14 = stdDateFormat9.toString();
        java.util.TimeZone timeZone15 = stdDateFormat9._timezone;
        java.util.TimeZone timeZone16 = stdDateFormat9._timezone;
        java.util.Locale locale17 = stdDateFormat9._locale;
        java.util.Locale locale18 = stdDateFormat9._locale;
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date16 = stdDateFormat6.parse("1970-01-01T00:00:00.000+0000");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
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
        java.text.DateFormat dateFormat23 = stdDateFormat6._formatISO8601;
        java.lang.String str24 = stdDateFormat6.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat16.", dateFormat0.equals(dateFormat16) == dateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
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
        java.util.Locale locale29 = stdDateFormat22._locale;
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale29);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(0, locale29);
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone13, locale29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        dateFormat0.setLenient(true);
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
        java.lang.String str16 = stdDateFormat11.toString();
        java.util.TimeZone timeZone17 = stdDateFormat11._timezone;
        java.util.TimeZone timeZone18 = stdDateFormat11._timezone;
        java.util.Locale locale19 = stdDateFormat11._locale;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance((int) (short) 0, locale19);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale19);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat21, stdDateFormat11, and dateFormat0.", !(stdDateFormat21.equals(stdDateFormat11) && stdDateFormat11.equals(dateFormat0)) || stdDateFormat21.equals(dateFormat0));
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
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
        boolean boolean38 = stdDateFormat25.looksLikeISO8601("07:00:00");
        java.util.Locale locale39 = stdDateFormat25._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone18, locale39);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone6 = dateFormat0.getTimeZone();
        java.util.Calendar calendar7 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8);
        java.util.TimeZone timeZone10 = stdDateFormat9._timezone;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat9 and stdDateFormat9", stdDateFormat9.equals(stdDateFormat9) ? stdDateFormat9.hashCode() == stdDateFormat9.hashCode() : true);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date17 = stdDateFormat6.parse("1970-01-01T00:00:00.004+0000");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
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
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        java.lang.String str17 = stdDateFormat6.toString();
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
        java.util.Locale locale31 = stdDateFormat24._locale;
        java.text.DateFormat dateFormat32 = stdDateFormat24._formatRFC1123;
        java.util.Calendar calendar33 = stdDateFormat24.getCalendar();
        java.util.TimeZone timeZone34 = stdDateFormat24._timezone;
        java.text.DateFormat dateFormat35 = stdDateFormat24._formatPlain;
        stdDateFormat6._formatPlain = stdDateFormat24;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
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
        java.util.Locale locale35 = stdDateFormat25._locale;
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(2, locale35);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = stdDateFormat6.withLocale(locale35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat15, stdDateFormat6, and dateFormat0.", !(stdDateFormat15.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat15.equals(dateFormat0));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone15 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date18 = stdDateFormat6.parse("1970-01-01T00:00:00.000+0000");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
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
        java.text.DateFormat dateFormat33 = stdDateFormat25._formatPlain;
        java.text.DateFormat dateFormat34 = stdDateFormat25._formatISO8601_z;
        java.text.DateFormat dateFormat35 = stdDateFormat25._formatISO8601;
        stdDateFormat6._formatISO8601 = stdDateFormat25;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat25.", stdDateFormat6.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat6));
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone16 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
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
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        dateFormat17.setLenient(true);
        boolean boolean20 = dateFormat17.isLenient();
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        java.text.NumberFormat numberFormat22 = dateFormat17.getNumberFormat();
        dateFormat17.setLenient(true);
        stdDateFormat6._formatPlain = dateFormat17;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat26, stdDateFormat6, and dateFormat0.", !(stdDateFormat26.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat26.equals(dateFormat0));
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
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
        java.text.DateFormat dateFormat24 = stdDateFormat6._formatISO8601;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat16.", dateFormat0.equals(dateFormat16) == dateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
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
        java.util.Locale locale34 = stdDateFormat26._locale;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateInstance((int) (short) 1, locale34);
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance((int) (short) 0, locale34);
        stdDateFormat6._formatISO8601_z = dateFormat36;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat26.", stdDateFormat6.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat6));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
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
        java.util.TimeZone timeZone17 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone17);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat19, stdDateFormat6, and dateFormat0.", !(stdDateFormat19.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat19.equals(dateFormat0));
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone19);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.DateFormat dateFormat2 = stdDateFormat1._formatPlain;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
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
        java.util.Locale locale14 = stdDateFormat6._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(true);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
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
        java.util.TimeZone timeZone14 = stdDateFormat8._timezone;
        java.util.Locale locale15 = stdDateFormat8._locale;
        boolean boolean17 = stdDateFormat8.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        java.util.Locale locale18 = stdDateFormat8._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone15 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
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
        java.util.Locale locale20 = stdDateFormat6._locale;
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
        java.util.TimeZone timeZone34 = stdDateFormat27._timezone;
        java.lang.String str35 = stdDateFormat27.toString();
        stdDateFormat6._formatRFC1123 = stdDateFormat27;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat27.", stdDateFormat6.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat6));
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
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
        java.util.TimeZone timeZone15 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = stdDateFormat6.withTimeZone(timeZone15);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat16.", stdDateFormat6.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat6));
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
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
        java.util.TimeZone timeZone29 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat30 = stdDateFormat23._formatRFC1123;
        java.util.TimeZone timeZone31 = stdDateFormat23._timezone;
        stdDateFormat6._formatISO8601 = stdDateFormat23;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
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
        java.lang.String str16 = stdDateFormat6.toString();
        java.util.TimeZone timeZone17 = stdDateFormat6._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone17);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat18, stdDateFormat6, and dateFormat0.", !(stdDateFormat18.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat18.equals(dateFormat0));
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
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
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        stdDateFormat20._formatPlain = dateFormat26;
        java.util.Calendar calendar29 = dateFormat26.getCalendar();
        java.text.NumberFormat numberFormat30 = dateFormat26.getNumberFormat();
        dateFormat26.setLenient(false);
        boolean boolean33 = stdDateFormat6.equals((java.lang.Object) dateFormat26);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat20.", stdDateFormat6.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat6));
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
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
        java.lang.String str26 = stdDateFormat21.toString();
        java.util.TimeZone timeZone27 = stdDateFormat21._timezone;
        java.text.DateFormat dateFormat28 = stdDateFormat21._formatRFC1123;
        java.util.TimeZone timeZone29 = stdDateFormat21._timezone;
        java.text.DateFormat dateFormat30 = stdDateFormat21._formatISO8601;
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        boolean boolean34 = dateFormat31.equals((java.lang.Object) 2);
        stdDateFormat21._formatISO8601_z = dateFormat31;
        java.text.DateFormat dateFormat36 = stdDateFormat21._formatISO8601_z;
        stdDateFormat6._formatPlain = dateFormat36;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat36.", dateFormat0.equals(dateFormat36) == dateFormat36.equals(dateFormat0));
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 100L);
        java.util.TimeZone timeZone4 = dateFormat1.getTimeZone();
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
        java.lang.String str17 = stdDateFormat12.toString();
        java.util.TimeZone timeZone18 = stdDateFormat12._timezone;
        java.text.DateFormat dateFormat19 = stdDateFormat12._formatRFC1123;
        java.util.TimeZone timeZone20 = stdDateFormat12._timezone;
        java.text.DateFormat dateFormat21 = stdDateFormat12._formatPlain;
        java.lang.String str22 = stdDateFormat12.toString();
        java.util.Calendar calendar23 = stdDateFormat12.getCalendar();
        java.text.DateFormat dateFormat24 = stdDateFormat12._formatRFC1123;
        java.util.Locale locale25 = stdDateFormat12._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4, locale25);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat6, and dateFormat0.", !(stdDateFormat16.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
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
        java.lang.String str28 = stdDateFormat23.toString();
        java.util.TimeZone timeZone29 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat30 = stdDateFormat23._formatRFC1123;
        java.util.TimeZone timeZone31 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat32 = stdDateFormat23._formatPlain;
        java.lang.String str33 = stdDateFormat23.toString();
        java.text.DateFormat dateFormat34 = stdDateFormat23._formatISO8601;
        java.util.Locale locale35 = stdDateFormat23._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = stdDateFormat6.withLocale(locale35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat36 and stdDateFormat23.", stdDateFormat36.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat36));
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
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
        java.text.DateFormat dateFormat28 = stdDateFormat22._formatPlain;
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatISO8601_z;
        java.text.NumberFormat numberFormat30 = stdDateFormat22.getNumberFormat();
        java.util.Locale locale31 = stdDateFormat22._locale;
        java.lang.String str32 = stdDateFormat22.toString();
        java.util.Locale locale33 = stdDateFormat22._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat6.withLocale(locale33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat34 and stdDateFormat22.", stdDateFormat34.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat34));
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat12, stdDateFormat6, and dateFormat0.", !(stdDateFormat12.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
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
        java.text.DateFormat dateFormat31 = stdDateFormat24._formatISO8601;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getInstance();
        boolean boolean33 = dateFormat32.isLenient();
        java.util.TimeZone timeZone34 = dateFormat32.getTimeZone();
        java.text.NumberFormat numberFormat35 = dateFormat32.getNumberFormat();
        dateFormat32.setLenient(true);
        java.util.TimeZone timeZone38 = dateFormat32.getTimeZone();
        boolean boolean39 = stdDateFormat24.equals((java.lang.Object) dateFormat32);
        java.text.DateFormat dateFormat40 = stdDateFormat24._formatISO8601_z;
        java.util.Calendar calendar41 = stdDateFormat24.getCalendar();
        stdDateFormat6._formatPlain = stdDateFormat24;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
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
        java.text.DateFormat dateFormat27 = stdDateFormat20._formatRFC1123;
        java.text.DateFormat dateFormat28 = stdDateFormat20._formatRFC1123;
        java.util.TimeZone timeZone29 = stdDateFormat20._timezone;
        stdDateFormat6._formatRFC1123 = stdDateFormat20;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat20.", stdDateFormat6.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat6));
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
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
        java.util.TimeZone timeZone34 = stdDateFormat29._timezone;
        java.util.Locale locale35 = stdDateFormat29._locale;
        java.text.DateFormat dateFormat36 = stdDateFormat29._formatRFC1123;
        java.util.TimeZone timeZone37 = stdDateFormat29._timezone;
        java.text.DateFormat dateFormat38 = stdDateFormat29._formatPlain;
        java.util.TimeZone timeZone39 = stdDateFormat29._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat40 = stdDateFormat6.withTimeZone(timeZone39);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat16.", dateFormat0.equals(dateFormat16) == dateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat22, stdDateFormat6, and dateFormat0.", !(stdDateFormat22.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat22.equals(dateFormat0));
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
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
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone15 = stdDateFormat6._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat6, and dateFormat0.", !(stdDateFormat16.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
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
        java.text.DateFormat dateFormat28 = stdDateFormat22._formatISO8601_z;
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatISO8601;
        java.util.Locale locale30 = stdDateFormat22._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = stdDateFormat6.withLocale(locale30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat31 and stdDateFormat22.", stdDateFormat31.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat31));
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
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
        java.util.TimeZone timeZone20 = stdDateFormat6._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat21, stdDateFormat6, and dateFormat0.", !(stdDateFormat21.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat21.equals(dateFormat0));
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
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
        java.util.TimeZone timeZone28 = stdDateFormat22._timezone;
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatRFC1123;
        java.util.Locale locale30 = stdDateFormat22._locale;
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone15, locale30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone16);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
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
        java.lang.String str31 = stdDateFormat26.toString();
        java.text.DateFormat dateFormat32 = stdDateFormat26._formatPlain;
        java.text.DateFormat dateFormat33 = stdDateFormat26._formatISO8601_z;
        java.text.NumberFormat numberFormat34 = stdDateFormat26.getNumberFormat();
        java.util.Locale locale35 = stdDateFormat26._locale;
        java.lang.String str36 = stdDateFormat26.toString();
        java.util.Locale locale37 = stdDateFormat26._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = stdDateFormat6.withLocale(locale37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat38 and stdDateFormat26.", stdDateFormat38.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat38));
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getTimeInstance();
        dateFormat11.setLenient(true);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.Calendar calendar15 = dateFormat11.getCalendar();
        java.util.TimeZone timeZone16 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        stdDateFormat17.setNumberFormat(numberFormat20);
        java.lang.String str22 = stdDateFormat17.toString();
        java.util.TimeZone timeZone23 = stdDateFormat17._timezone;
        java.util.Locale locale24 = stdDateFormat17._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = stdDateFormat6.withLocale(locale24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat25 and stdDateFormat17.", stdDateFormat25.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat25));
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
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
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance((int) (short) 1, locale32);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat6.withLocale(locale32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat34 and stdDateFormat24.", stdDateFormat34.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat34));
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
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
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        boolean boolean18 = stdDateFormat6.looksLikeISO8601("1970-01-01T07:00:00.000+0700");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(true);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.util.Locale locale3 = stdDateFormat2._locale;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone17 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
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
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        java.text.NumberFormat numberFormat33 = dateFormat31.getNumberFormat();
        java.text.NumberFormat numberFormat34 = dateFormat31.getNumberFormat();
        boolean boolean35 = dateFormat29.equals((java.lang.Object) dateFormat31);
        stdDateFormat22._formatPlain = dateFormat29;
        stdDateFormat6._formatISO8601 = dateFormat29;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone17 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
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
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        dateFormat16.setLenient(true);
        boolean boolean19 = dateFormat16.isLenient();
        java.util.Calendar calendar20 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone21 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        stdDateFormat22.setNumberFormat(numberFormat25);
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.util.TimeZone timeZone28 = dateFormat27.getTimeZone();
        stdDateFormat22._formatISO8601_z = dateFormat27;
        java.util.TimeZone timeZone30 = stdDateFormat22._timezone;
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone30);
        stdDateFormat6._formatRFC1123 = dateFormat31;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
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
        boolean boolean17 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
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
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat6, and dateFormat0.", !(stdDateFormat17.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat17.equals(dateFormat0));
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
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
        java.text.DateFormat dateFormat22 = stdDateFormat16._formatPlain;
        java.text.DateFormat dateFormat23 = stdDateFormat16._formatISO8601_z;
        java.text.NumberFormat numberFormat24 = stdDateFormat16.getNumberFormat();
        java.util.Locale locale25 = stdDateFormat16._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone8, locale25);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
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
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatRFC1123;
        java.text.DateFormat dateFormat30 = stdDateFormat22._formatRFC1123;
        java.text.DateFormat dateFormat31 = stdDateFormat22._formatRFC1123;
        java.text.DateFormat dateFormat32 = stdDateFormat22._formatPlain;
        boolean boolean34 = stdDateFormat22.looksLikeISO8601("");
        java.util.Locale locale35 = stdDateFormat22._locale;
        stdDateFormat6._formatRFC1123 = stdDateFormat22;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
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
        boolean boolean19 = stdDateFormat6.looksLikeISO8601("07:00:00");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone20 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
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
        java.text.DateFormat dateFormat32 = stdDateFormat24._formatISO8601;
        java.text.DateFormat dateFormat33 = stdDateFormat24._formatPlain;
        java.util.TimeZone timeZone34 = stdDateFormat24._timezone;
        stdDateFormat6._timezone = timeZone34;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date16 = stdDateFormat6.parse("1970-01-01T07:00:00.010+0700");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
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
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("1970-01-01T00:00:00.000+0000");
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
        java.util.Locale locale31 = stdDateFormat24._locale;
        java.text.DateFormat dateFormat32 = stdDateFormat24._formatRFC1123;
        java.util.Calendar calendar33 = stdDateFormat24.getCalendar();
        java.util.TimeZone timeZone34 = stdDateFormat24._timezone;
        stdDateFormat6.setTimeZone(timeZone34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
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
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
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
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateTimeInstance(1, (int) (byte) 0);
        java.util.Calendar calendar32 = dateFormat31.getCalendar();
        stdDateFormat22.setCalendar(calendar32);
        java.util.TimeZone timeZone34 = stdDateFormat22.getTimeZone();
        stdDateFormat6._timezone = timeZone34;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        java.util.TimeZone timeZone4 = dateFormat1.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
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
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale32);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat6.withLocale(locale32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat34 and stdDateFormat23.", stdDateFormat34.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat34));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
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
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(false);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat15, stdDateFormat6, and dateFormat0.", !(stdDateFormat15.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat15.equals(dateFormat0));
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
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
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601_z;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date18 = stdDateFormat6.parse("2513-01-01T07:00:00.000+0700");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
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
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601_z;
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
        java.util.Locale locale31 = stdDateFormat24._locale;
        java.text.DateFormat dateFormat32 = stdDateFormat24._formatRFC1123;
        java.util.Calendar calendar33 = stdDateFormat24.getCalendar();
        java.util.TimeZone timeZone34 = stdDateFormat24._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat6.withTimeZone(timeZone34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat35 and stdDateFormat24.", stdDateFormat35.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat35));
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
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
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone13);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone13);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat15, stdDateFormat6, and dateFormat0.", !(stdDateFormat15.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat15.equals(dateFormat0));
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone24 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
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
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(true);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        dateFormat15.setLenient(true);
        boolean boolean18 = dateFormat15.isLenient();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        stdDateFormat21.setNumberFormat(numberFormat24);
        java.text.DateFormat dateFormat26 = stdDateFormat21._formatISO8601_z;
        java.text.DateFormat dateFormat27 = stdDateFormat21._formatISO8601_z;
        java.lang.String str28 = stdDateFormat21.toString();
        stdDateFormat6._formatISO8601_z = stdDateFormat21;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat21.", stdDateFormat6.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat6));
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 100L);
        java.util.TimeZone timeZone4 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        java.util.Calendar calendar8 = dateFormat6.getCalendar();
        stdDateFormat5._formatISO8601 = dateFormat6;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat5 and stdDateFormat5", stdDateFormat5.equals(stdDateFormat5) ? stdDateFormat5.hashCode() == stdDateFormat5.hashCode() : true);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat14, stdDateFormat6, and dateFormat0.", !(stdDateFormat14.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat14.equals(dateFormat0));
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
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
        java.text.DateFormat dateFormat28 = stdDateFormat22._formatISO8601_z;
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatRFC1123;
        boolean boolean31 = stdDateFormat22.looksLikeISO8601("1/1/13 06:59");
        java.lang.String str32 = stdDateFormat22.toString();
        java.util.TimeZone timeZone33 = stdDateFormat22._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat6.withTimeZone(timeZone33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat34 and stdDateFormat22.", stdDateFormat34.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat34));
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
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
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat6, and dateFormat0.", !(stdDateFormat16.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
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
        java.text.DateFormat dateFormat22 = stdDateFormat6._formatRFC1123;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat16.", dateFormat0.equals(dateFormat16) == dateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
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
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        dateFormat20.setLenient(true);
        boolean boolean23 = dateFormat20.isLenient();
        java.util.Calendar calendar24 = dateFormat20.getCalendar();
        java.util.Calendar calendar25 = dateFormat20.getCalendar();
        boolean boolean26 = dateFormat20.isLenient();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance();
        dateFormat28.setLenient(true);
        boolean boolean31 = dateFormat28.isLenient();
        java.util.Calendar calendar32 = dateFormat28.getCalendar();
        java.util.TimeZone timeZone33 = dateFormat28.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone33);
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat37 = dateFormat36.getNumberFormat();
        stdDateFormat34.setNumberFormat(numberFormat37);
        java.lang.String str39 = stdDateFormat34.toString();
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat41 = dateFormat40.getNumberFormat();
        stdDateFormat34._formatPlain = dateFormat40;
        java.util.Calendar calendar43 = dateFormat40.getCalendar();
        dateFormat27.setCalendar(calendar43);
        dateFormat20.setCalendar(calendar43);
        stdDateFormat6._formatRFC1123 = dateFormat20;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat34.", stdDateFormat6.equals(stdDateFormat34) == stdDateFormat34.equals(stdDateFormat6));
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
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
        java.util.Locale locale29 = stdDateFormat21._locale;
        java.util.TimeZone timeZone30 = stdDateFormat21._timezone;
        stdDateFormat6.setTimeZone(timeZone30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat21.", stdDateFormat6.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat6));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat19, stdDateFormat6, and dateFormat0.", !(stdDateFormat19.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat19.equals(dateFormat0));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
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
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
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
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale37);
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone22, locale37);
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateInstance((int) (byte) 1, locale37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone16, locale37);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
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
        boolean boolean18 = stdDateFormat6.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
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
        java.util.Locale locale32 = stdDateFormat25._locale;
        java.text.DateFormat dateFormat33 = stdDateFormat25._formatRFC1123;
        java.util.Calendar calendar34 = stdDateFormat25.getCalendar();
        java.util.TimeZone timeZone35 = stdDateFormat25._timezone;
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone35);
        stdDateFormat6.setTimeZone(timeZone35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat25.", stdDateFormat6.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat6));
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
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
        java.util.Locale locale20 = stdDateFormat6._locale;
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
        java.text.DateFormat dateFormat33 = stdDateFormat27._formatPlain;
        java.text.DateFormat dateFormat34 = stdDateFormat27._formatRFC1123;
        java.text.DateFormat dateFormat35 = stdDateFormat27._formatPlain;
        java.text.DateFormat dateFormat36 = stdDateFormat27._formatRFC1123;
        java.util.TimeZone timeZone37 = stdDateFormat27._timezone;
        stdDateFormat6.setTimeZone(timeZone37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat27.", stdDateFormat6.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat6));
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
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
        java.util.Calendar calendar17 = stdDateFormat6.getCalendar();
        java.text.DateFormat dateFormat18 = stdDateFormat6._formatRFC1123;
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
        java.lang.String str31 = stdDateFormat26.toString();
        java.util.TimeZone timeZone32 = stdDateFormat26._timezone;
        java.util.Locale locale33 = stdDateFormat26._locale;
        java.text.NumberFormat numberFormat34 = stdDateFormat26.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat26.", stdDateFormat6.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat6));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
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
        java.text.DateFormat dateFormat22 = stdDateFormat6._formatPlain;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat16.", dateFormat0.equals(dateFormat16) == dateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone14 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(false);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
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
        java.text.DateFormat dateFormat30 = stdDateFormat21._formatRFC1123;
        boolean boolean32 = stdDateFormat21.looksLikeISO8601("1/1/13 07:00");
        java.util.Locale locale33 = stdDateFormat21._locale;
        stdDateFormat6._formatISO8601 = stdDateFormat21;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat21.", stdDateFormat6.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat6));
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone17 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone6 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = stdDateFormat7.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat7 and stdDateFormat7", stdDateFormat7.equals(stdDateFormat7) ? stdDateFormat7.hashCode() == stdDateFormat7.hashCode() : true);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
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
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601_z;
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat6.withLocale(locale32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat34 and stdDateFormat24.", stdDateFormat34.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat34));
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
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
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        dateFormat18.setLenient(true);
        boolean boolean21 = dateFormat18.isLenient();
        java.util.Calendar calendar22 = dateFormat18.getCalendar();
        java.util.TimeZone timeZone23 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        stdDateFormat24.setNumberFormat(numberFormat27);
        java.text.NumberFormat numberFormat29 = stdDateFormat24.getNumberFormat();
        java.util.Locale locale30 = stdDateFormat24._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = stdDateFormat6.withLocale(locale30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat31 and stdDateFormat24.", stdDateFormat31.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat31));
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
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
        java.util.Calendar calendar15 = stdDateFormat6.getCalendar();
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("1970-01-01T07:00:00.000+0700");
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
        java.util.Locale locale33 = stdDateFormat25._locale;
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance((int) (short) 1, locale33);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat6.withLocale(locale33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone6 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone7 = dateFormat0.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone7);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.NumberFormat numberFormat2 = stdDateFormat1.getNumberFormat();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
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
        java.util.Calendar calendar15 = stdDateFormat6.getCalendar();
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("1970-01-01T07:00:00.000+0700");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date19 = stdDateFormat6.parse("1970-01-01T07:00:00.005+0700");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
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
        java.util.Locale locale15 = stdDateFormat6._locale;
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
        stdDateFormat6._formatISO8601 = stdDateFormat22;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
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
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        dateFormat19.setLenient(true);
        boolean boolean22 = dateFormat19.isLenient();
        java.util.Calendar calendar23 = dateFormat19.getCalendar();
        java.util.TimeZone timeZone24 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        stdDateFormat25.setNumberFormat(numberFormat28);
        java.text.NumberFormat numberFormat30 = stdDateFormat25.getNumberFormat();
        java.util.Locale locale31 = stdDateFormat25._locale;
        java.text.DateFormat dateFormat32 = stdDateFormat25._formatRFC1123;
        stdDateFormat6._formatPlain = stdDateFormat25;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat25.", stdDateFormat6.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat6));
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
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
        java.util.Locale locale16 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
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
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj19 = stdDateFormat6.parseObject("1970-01-01T07:00:00.000+0700");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = stdDateFormat6.withTimeZone(timeZone31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat32 and stdDateFormat24.", stdDateFormat32.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat32));
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
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
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone19);
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
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateInstance((int) (short) 1, locale37);
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateInstance((int) (short) 0, locale37);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat40 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19, locale37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat29.", stdDateFormat6.equals(stdDateFormat29) == stdDateFormat29.equals(stdDateFormat6));
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
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
        java.util.Calendar calendar15 = stdDateFormat6.getCalendar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getTimeInstance();
        dateFormat9.setLenient(true);
        boolean boolean12 = dateFormat9.isLenient();
        java.util.Calendar calendar13 = dateFormat9.getCalendar();
        java.util.TimeZone timeZone14 = dateFormat9.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        stdDateFormat15.setNumberFormat(numberFormat18);
        java.util.TimeZone timeZone20 = stdDateFormat15._timezone;
        java.text.DateFormat dateFormat21 = stdDateFormat15._formatISO8601_z;
        java.text.DateFormat dateFormat22 = stdDateFormat15._formatISO8601_z;
        java.util.TimeZone timeZone23 = stdDateFormat15._timezone;
        java.util.Locale locale24 = stdDateFormat15._locale;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale24);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance((int) (short) 0, locale24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5, locale24);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
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
        java.util.Locale locale30 = stdDateFormat24._locale;
        java.text.DateFormat dateFormat31 = stdDateFormat24._formatRFC1123;
        java.util.Locale locale32 = stdDateFormat24._locale;
        java.util.TimeZone timeZone33 = stdDateFormat24._timezone;
        boolean boolean35 = stdDateFormat24.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        stdDateFormat6._formatRFC1123 = stdDateFormat24;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
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
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone16 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
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
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone19);
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
        java.lang.String str35 = stdDateFormat27.toString();
        java.util.Locale locale36 = stdDateFormat27._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19, locale36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat27.", stdDateFormat6.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat6));
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
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
        java.lang.String str16 = stdDateFormat6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone17 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone21 = dateFormat16.getTimeZone();
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
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
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        dateFormat19.setLenient(true);
        boolean boolean22 = dateFormat19.isLenient();
        java.util.Calendar calendar23 = dateFormat19.getCalendar();
        java.util.TimeZone timeZone24 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        stdDateFormat25.setNumberFormat(numberFormat28);
        java.text.NumberFormat numberFormat30 = stdDateFormat25.getNumberFormat();
        java.util.Locale locale31 = stdDateFormat25._locale;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getTimeInstance((int) (short) 1, locale31);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = stdDateFormat6.withLocale(locale31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat33 and stdDateFormat25.", stdDateFormat33.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat33));
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat6, and dateFormat0.", !(stdDateFormat16.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
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
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        dateFormat14.setLenient(true);
        boolean boolean17 = dateFormat14.isLenient();
        java.util.Calendar calendar18 = dateFormat14.getCalendar();
        java.util.TimeZone timeZone19 = dateFormat14.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        stdDateFormat20.setNumberFormat(numberFormat23);
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.util.TimeZone timeZone26 = dateFormat25.getTimeZone();
        stdDateFormat20._formatISO8601_z = dateFormat25;
        java.util.TimeZone timeZone28 = stdDateFormat20._timezone;
        boolean boolean30 = stdDateFormat20.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        stdDateFormat6._formatISO8601_z = stdDateFormat20;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat20.", stdDateFormat6.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat6));
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
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
        java.util.Date date18 = stdDateFormat6.parse("1970-01-01T00:00:00.004+0000");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getInstance();
        boolean boolean16 = dateFormat15.isLenient();
        java.util.TimeZone timeZone17 = dateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone17);
        stdDateFormat6._timezone = timeZone17;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat18.", stdDateFormat6.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat6));
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone3 = stdDateFormat2.getTimeZone();
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
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
        java.util.TimeZone timeZone28 = stdDateFormat22._timezone;
        java.util.TimeZone timeZone29 = stdDateFormat22._timezone;
        java.util.Locale locale30 = stdDateFormat22._locale;
        java.util.Locale locale31 = stdDateFormat22._locale;
        java.text.NumberFormat numberFormat32 = stdDateFormat22.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
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
        java.text.NumberFormat numberFormat29 = stdDateFormat22.getNumberFormat();
        java.text.NumberFormat numberFormat30 = stdDateFormat22.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
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
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatPlain;
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
        stdDateFormat6._formatRFC1123 = stdDateFormat23;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
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
        java.util.Locale locale33 = stdDateFormat25._locale;
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance((int) (short) 0, locale33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat35 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone16, locale33);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone16 = dateFormat15.getTimeZone();
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
        java.util.Locale locale31 = stdDateFormat24._locale;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale31);
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16, locale31);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone13, locale31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat6, and dateFormat0.", !(stdDateFormat16.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
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
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        stdDateFormat6._formatPlain = dateFormat18;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat18.", dateFormat0.equals(dateFormat18) == dateFormat18.equals(dateFormat0));
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
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
        java.text.DateFormat dateFormat32 = stdDateFormat24._formatISO8601;
        java.text.DateFormat dateFormat33 = stdDateFormat24._formatRFC1123;
        java.util.Locale locale34 = stdDateFormat24._locale;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getTimeInstance((int) (short) 0, locale34);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = stdDateFormat6.withLocale(locale34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat36 and stdDateFormat24.", stdDateFormat36.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat36));
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
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
        java.util.Locale locale15 = stdDateFormat6._locale;
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
        java.text.DateFormat dateFormat28 = stdDateFormat22._formatISO8601_z;
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatISO8601;
        java.lang.String str30 = stdDateFormat22.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean31 = stdDateFormat6.equals((java.lang.Object) stdDateFormat22);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(false);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
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
        boolean boolean20 = stdDateFormat6.looksLikeISO8601("1970-01-01T07:00:00.005+0700");
        java.util.Calendar calendar21 = stdDateFormat6.getCalendar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone22 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
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
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("2513-01-01T07:00:00.000+0700");
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
        java.text.DateFormat dateFormat31 = stdDateFormat24._formatRFC1123;
        java.text.DateFormat dateFormat32 = stdDateFormat24._formatRFC1123;
        java.util.TimeZone timeZone33 = stdDateFormat24._timezone;
        java.util.Locale locale34 = stdDateFormat24._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat6.withLocale(locale34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat35 and stdDateFormat24.", stdDateFormat35.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat35));
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date19 = stdDateFormat6.parse("1970-01-01T07:00:00.000+0700");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat20, stdDateFormat6, and dateFormat0.", !(stdDateFormat20.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat20.equals(dateFormat0));
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 100L);
        java.text.NumberFormat numberFormat4 = dateFormat1.getNumberFormat();
        java.util.Calendar calendar5 = dateFormat1.getCalendar();
        dateFormat1.setLenient(true);
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
        java.text.DateFormat dateFormat20 = stdDateFormat14._formatISO8601_z;
        java.text.DateFormat dateFormat21 = stdDateFormat14._formatRFC1123;
        boolean boolean23 = stdDateFormat14.looksLikeISO8601("1/1/13 06:59");
        java.lang.String str24 = stdDateFormat14.toString();
        java.util.TimeZone timeZone25 = stdDateFormat14._timezone;
        boolean boolean26 = dateFormat1.equals((java.lang.Object) timeZone25);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        dateFormat27.setLenient(true);
        boolean boolean30 = dateFormat27.isLenient();
        java.util.Calendar calendar31 = dateFormat27.getCalendar();
        java.util.TimeZone timeZone32 = dateFormat27.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone32);
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat36 = dateFormat35.getNumberFormat();
        stdDateFormat33.setNumberFormat(numberFormat36);
        java.text.DateFormat dateFormat38 = stdDateFormat33._formatISO8601_z;
        java.text.DateFormat dateFormat39 = stdDateFormat33._formatISO8601_z;
        java.lang.String str40 = stdDateFormat33.toString();
        java.text.DateFormat dateFormat41 = stdDateFormat33._formatRFC1123;
        java.util.Locale locale42 = stdDateFormat33._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat43 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone25, locale42);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat14 and stdDateFormat33.", stdDateFormat14.equals(stdDateFormat33) == stdDateFormat33.equals(stdDateFormat14));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
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
        java.util.TimeZone timeZone15 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(true);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
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
        java.util.TimeZone timeZone27 = stdDateFormat20._timezone;
        java.util.Locale locale28 = stdDateFormat20._locale;
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance((int) (short) 1, locale28);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance((int) (short) 0, locale28);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = stdDateFormat6.withLocale(locale28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat31 and stdDateFormat20.", stdDateFormat31.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat31));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
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
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone21 = dateFormat20.getTimeZone();
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone21);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        stdDateFormat6._timezone = timeZone21;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date18 = stdDateFormat6.parse("1970-01-01T07:00:00.010+0700");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
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
        java.text.DateFormat dateFormat28 = stdDateFormat22._formatPlain;
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatRFC1123;
        java.text.DateFormat dateFormat30 = stdDateFormat22._formatRFC1123;
        java.text.DateFormat dateFormat31 = stdDateFormat22._formatRFC1123;
        java.text.DateFormat dateFormat32 = stdDateFormat22._formatPlain;
        boolean boolean34 = stdDateFormat22.looksLikeISO8601("");
        stdDateFormat6._formatISO8601_z = stdDateFormat22;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
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
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getInstance();
        java.lang.String str18 = dateFormat16.format((java.lang.Object) 14);
        java.lang.String str20 = dateFormat16.format((java.lang.Object) (short) -1);
        stdDateFormat6._formatPlain = dateFormat16;
        java.lang.String str22 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat23 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat24 = stdDateFormat6._formatPlain;
        java.text.DateFormat dateFormat25 = stdDateFormat6._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat26, stdDateFormat6, and dateFormat0.", !(stdDateFormat26.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat26.equals(dateFormat0));
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
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
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat18, stdDateFormat6, and dateFormat0.", !(stdDateFormat18.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat18.equals(dateFormat0));
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat18, stdDateFormat6, and dateFormat0.", !(stdDateFormat18.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat18.equals(dateFormat0));
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
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
        java.text.DateFormat dateFormat37 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone20, locale36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat29.", stdDateFormat6.equals(stdDateFormat29) == stdDateFormat29.equals(stdDateFormat6));
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
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
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, locale32);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat6.withLocale(locale32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat34 and stdDateFormat26.", stdDateFormat34.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat34));
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
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
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("1970-01-01T00:00:00.000+0000");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat18, stdDateFormat6, and dateFormat0.", !(stdDateFormat18.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat18.equals(dateFormat0));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat14, stdDateFormat6, and dateFormat0.", !(stdDateFormat14.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat14.equals(dateFormat0));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
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
        stdDateFormat6.setLenient(false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone6 = dateFormat0.getTimeZone();
        java.util.Calendar calendar7 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8);
        boolean boolean11 = stdDateFormat9.looksLikeISO8601("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat9 and stdDateFormat9", stdDateFormat9.equals(stdDateFormat9) ? stdDateFormat9.hashCode() == stdDateFormat9.hashCode() : true);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat6, and dateFormat0.", !(stdDateFormat17.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat17.equals(dateFormat0));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone24 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
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
        java.text.DateFormat dateFormat24 = stdDateFormat18._formatISO8601_z;
        java.text.DateFormat dateFormat25 = stdDateFormat18._formatRFC1123;
        java.text.DateFormat dateFormat26 = stdDateFormat18._formatPlain;
        stdDateFormat6._formatRFC1123 = stdDateFormat18;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat18.", stdDateFormat6.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat6));
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
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
        java.text.DateFormat dateFormat35 = stdDateFormat29._formatPlain;
        java.text.DateFormat dateFormat36 = stdDateFormat29._formatRFC1123;
        java.text.DateFormat dateFormat37 = stdDateFormat29._formatRFC1123;
        java.util.TimeZone timeZone38 = stdDateFormat29._timezone;
        java.util.Locale locale39 = stdDateFormat29._locale;
        java.text.NumberFormat numberFormat40 = stdDateFormat29.getNumberFormat();
        boolean boolean42 = stdDateFormat29.looksLikeISO8601("07:00:00");
        java.util.Locale locale43 = stdDateFormat29._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat44 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22, locale43);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat16.", dateFormat0.equals(dateFormat16) == dateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
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
        java.lang.String str26 = stdDateFormat21.toString();
        java.text.DateFormat dateFormat27 = stdDateFormat21._formatPlain;
        java.text.DateFormat dateFormat28 = stdDateFormat21._formatRFC1123;
        java.text.DateFormat dateFormat29 = stdDateFormat21._formatRFC1123;
        java.util.TimeZone timeZone30 = stdDateFormat21._timezone;
        stdDateFormat6.setTimeZone(timeZone30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat21.", stdDateFormat6.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat6));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
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
        java.util.TimeZone timeZone14 = stdDateFormat9._timezone;
        java.util.Locale locale15 = stdDateFormat9._locale;
        java.text.DateFormat dateFormat16 = stdDateFormat9._formatRFC1123;
        boolean boolean18 = stdDateFormat9.looksLikeISO8601("1970-01-01T00:00:00.000+0000");
        java.text.DateFormat dateFormat19 = stdDateFormat9._formatRFC1123;
        java.util.Locale locale20 = stdDateFormat9._locale;
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
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
        java.lang.String str31 = stdDateFormat22.toString();
        java.util.Calendar calendar32 = stdDateFormat22.getCalendar();
        java.text.DateFormat dateFormat33 = stdDateFormat22._formatPlain;
        java.util.TimeZone timeZone34 = stdDateFormat22._timezone;
        stdDateFormat6.setTimeZone(timeZone34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
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
        java.text.DateFormat dateFormat20 = stdDateFormat6._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat21, stdDateFormat6, and dateFormat0.", !(stdDateFormat21.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat21.equals(dateFormat0));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
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
        java.text.DateFormat dateFormat19 = stdDateFormat6._formatISO8601;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date21 = stdDateFormat6.parse("1970-01-01T07:00:00.000+0700");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
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
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.util.TimeZone timeZone19 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19);
        stdDateFormat6.setTimeZone(timeZone19);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat20.", stdDateFormat6.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat6));
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
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
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        java.lang.String str17 = stdDateFormat6.toString();
        java.util.TimeZone timeZone18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = stdDateFormat6.withTimeZone(timeZone18);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat19, stdDateFormat6, and dateFormat0.", !(stdDateFormat19.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat19.equals(dateFormat0));
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        java.text.NumberFormat numberFormat4 = dateFormat2.getNumberFormat();
        java.text.NumberFormat numberFormat5 = dateFormat2.getNumberFormat();
        boolean boolean6 = dateFormat0.equals((java.lang.Object) dateFormat2);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone9 = dateFormat8.getTimeZone();
        java.util.TimeZone timeZone10 = dateFormat8.getTimeZone();
        java.util.TimeZone timeZone11 = dateFormat8.getTimeZone();
        java.util.Calendar calendar12 = dateFormat8.getCalendar();
        dateFormat2.setCalendar(calendar12);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat2.", dateFormat0.equals(dateFormat2) == dateFormat2.equals(dateFormat0));
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
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
        java.util.Locale locale33 = stdDateFormat26._locale;
        java.text.DateFormat dateFormat34 = stdDateFormat26._formatRFC1123;
        java.util.Calendar calendar35 = stdDateFormat26.getCalendar();
        java.util.TimeZone timeZone36 = stdDateFormat26._timezone;
        stdDateFormat6._timezone = timeZone36;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat26.", stdDateFormat6.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat6));
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone6 = dateFormat0.getTimeZone();
        java.util.Calendar calendar7 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8);
        java.lang.Class<?> wildcardClass10 = timeZone8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat9 and stdDateFormat9", stdDateFormat9.equals(stdDateFormat9) ? stdDateFormat9.hashCode() == stdDateFormat9.hashCode() : true);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
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
        java.util.TimeZone timeZone17 = dateFormat15.getTimeZone();
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
        java.util.Locale locale33 = stdDateFormat25._locale;
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale33);
        java.text.DateFormat dateFormat35 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone17, locale33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat25.", stdDateFormat6.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat6));
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat6, and dateFormat0.", !(stdDateFormat16.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
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
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.lang.String str16 = stdDateFormat6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str17 = dateFormat15.format((java.lang.Object) 100L);
        dateFormat15.setLenient(true);
        java.text.NumberFormat numberFormat20 = dateFormat15.getNumberFormat();
        stdDateFormat6._formatISO8601 = dateFormat15;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        dateFormat22.setLenient(true);
        boolean boolean25 = dateFormat22.isLenient();
        java.util.Calendar calendar26 = dateFormat22.getCalendar();
        java.util.TimeZone timeZone27 = dateFormat22.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone27);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        stdDateFormat28.setNumberFormat(numberFormat31);
        java.text.NumberFormat numberFormat33 = stdDateFormat28.getNumberFormat();
        java.util.TimeZone timeZone34 = stdDateFormat28._timezone;
        java.text.NumberFormat numberFormat35 = stdDateFormat28.getNumberFormat();
        java.text.DateFormat dateFormat36 = stdDateFormat28._formatRFC1123;
        stdDateFormat6._formatPlain = stdDateFormat28;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat28.", stdDateFormat6.equals(stdDateFormat28) == stdDateFormat28.equals(stdDateFormat6));
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date15 = stdDateFormat6.parse("1970-01-01T07:00:00.000+0700");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
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
        java.util.Locale locale30 = stdDateFormat23._locale;
        java.text.DateFormat dateFormat31 = stdDateFormat23._formatRFC1123;
        java.util.Calendar calendar32 = stdDateFormat23.getCalendar();
        java.text.DateFormat dateFormat33 = stdDateFormat23._formatISO8601;
        java.text.DateFormat dateFormat34 = stdDateFormat23._formatPlain;
        stdDateFormat6._formatPlain = stdDateFormat23;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
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
        java.text.DateFormat dateFormat31 = stdDateFormat22._formatPlain;
        java.util.TimeZone timeZone32 = stdDateFormat22._timezone;
        java.text.DateFormat dateFormat33 = stdDateFormat22._formatISO8601_z;
        java.util.Calendar calendar34 = stdDateFormat22.getCalendar();
        java.util.Locale locale35 = stdDateFormat22._locale;
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(3, locale35);
        stdDateFormat6._formatRFC1123 = dateFormat36;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
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
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat6, and dateFormat0.", !(stdDateFormat17.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat17.equals(dateFormat0));
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
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
        java.util.TimeZone timeZone13 = stdDateFormat7._timezone;
        java.text.DateFormat dateFormat14 = stdDateFormat7._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat7._formatISO8601;
        java.text.DateFormat dateFormat16 = stdDateFormat7._formatPlain;
        java.util.TimeZone timeZone17 = stdDateFormat7._timezone;
        java.text.DateFormat dateFormat18 = stdDateFormat7._formatISO8601_z;
        java.util.Calendar calendar19 = stdDateFormat7.getCalendar();
        java.util.Locale locale20 = stdDateFormat7._locale;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance(3, locale20);
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        java.text.NumberFormat numberFormat24 = dateFormat22.getNumberFormat();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance();
        dateFormat25.setLenient(true);
        boolean boolean28 = dateFormat25.isLenient();
        java.util.Calendar calendar29 = dateFormat25.getCalendar();
        java.text.NumberFormat numberFormat30 = dateFormat25.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat30);
        boolean boolean32 = dateFormat22.isLenient();
        java.text.NumberFormat numberFormat33 = dateFormat22.getNumberFormat();
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getTimeInstance();
        dateFormat34.setLenient(true);
        boolean boolean37 = dateFormat34.isLenient();
        java.util.Calendar calendar38 = dateFormat34.getCalendar();
        java.util.TimeZone timeZone39 = dateFormat34.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat40 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone39);
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat43 = dateFormat42.getNumberFormat();
        stdDateFormat40.setNumberFormat(numberFormat43);
        dateFormat22.setNumberFormat(numberFormat43);
        boolean boolean46 = dateFormat21.equals((java.lang.Object) dateFormat22);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat7 and stdDateFormat40.", stdDateFormat7.equals(stdDateFormat40) == stdDateFormat40.equals(stdDateFormat7));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
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
        java.text.DateFormat dateFormat35 = stdDateFormat26._formatPlain;
        java.util.TimeZone timeZone36 = stdDateFormat26._timezone;
        java.text.DateFormat dateFormat37 = stdDateFormat26._formatISO8601_z;
        java.util.Calendar calendar38 = stdDateFormat26.getCalendar();
        java.util.Locale locale39 = stdDateFormat26._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone19, locale39);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
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
        java.util.Calendar calendar16 = stdDateFormat6.getCalendar();
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
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
        java.text.DateFormat dateFormat32 = stdDateFormat25._formatISO8601;
        boolean boolean34 = stdDateFormat25.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        stdDateFormat6._formatISO8601_z = stdDateFormat25;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat25.", stdDateFormat6.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat6));
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
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
        java.text.DateFormat dateFormat17 = stdDateFormat10._formatRFC1123;
        java.text.DateFormat dateFormat18 = stdDateFormat10._formatISO8601;
        java.text.DateFormat dateFormat19 = stdDateFormat10._formatPlain;
        java.lang.String str20 = stdDateFormat10.toString();
        java.text.DateFormat dateFormat21 = stdDateFormat10._formatISO8601;
        java.lang.String str22 = stdDateFormat10.toString();
        java.util.Locale locale23 = stdDateFormat10._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale23);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat24, stdDateFormat10, and dateFormat0.", !(stdDateFormat24.equals(stdDateFormat10) && stdDateFormat10.equals(dateFormat0)) || stdDateFormat24.equals(dateFormat0));
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat6, and dateFormat0.", !(stdDateFormat17.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat17.equals(dateFormat0));
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getInstance();
        boolean boolean6 = dateFormat0.equals((java.lang.Object) dateFormat5);
        java.util.TimeZone timeZone7 = dateFormat5.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone7);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
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
        java.text.DateFormat dateFormat14 = stdDateFormat8._formatPlain;
        java.util.Locale locale15 = stdDateFormat8._locale;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale15);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale15);
        java.util.TimeZone timeZone18 = dateFormat17.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat15, stdDateFormat6, and dateFormat0.", !(stdDateFormat15.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat15.equals(dateFormat0));
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
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
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        stdDateFormat22._formatPlain = dateFormat28;
        java.util.Calendar calendar31 = dateFormat28.getCalendar();
        boolean boolean32 = dateFormat28.isLenient();
        stdDateFormat6._formatISO8601 = dateFormat28;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
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
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getInstance();
        java.lang.String str18 = dateFormat16.format((java.lang.Object) 14);
        java.lang.String str20 = dateFormat16.format((java.lang.Object) (short) -1);
        stdDateFormat6._formatPlain = dateFormat16;
        java.lang.String str22 = stdDateFormat6.toString();
        java.util.TimeZone timeZone23 = stdDateFormat6._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat24, stdDateFormat6, and dateFormat0.", !(stdDateFormat24.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat24.equals(dateFormat0));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
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
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone21);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat17.", dateFormat0.equals(dateFormat17) == dateFormat17.equals(dateFormat0));
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
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
        java.lang.String str18 = stdDateFormat6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj20 = stdDateFormat6.parseObject("1970-01-01T00:00:00.000+0000");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
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
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601_z;
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
        java.util.TimeZone timeZone30 = stdDateFormat23._timezone;
        stdDateFormat6._timezone = timeZone30;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
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
        java.lang.String str32 = stdDateFormat27.toString();
        java.util.TimeZone timeZone33 = stdDateFormat27._timezone;
        java.text.DateFormat dateFormat34 = stdDateFormat27._formatRFC1123;
        java.util.Locale locale35 = stdDateFormat27._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20, locale35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat27.", stdDateFormat6.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat6));
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
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
        java.text.NumberFormat numberFormat37 = dateFormat33.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat27.", stdDateFormat6.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat6));
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
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
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatRFC1123;
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = stdDateFormat6.withTimeZone(timeZone36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat37 and stdDateFormat24.", stdDateFormat37.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat37));
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone16 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
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
        java.lang.String str14 = stdDateFormat6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone15 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
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
        java.text.DateFormat dateFormat30 = stdDateFormat23._formatISO8601;
        boolean boolean32 = stdDateFormat23.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat33 = stdDateFormat23._formatISO8601;
        java.util.Locale locale34 = stdDateFormat23._locale;
        java.util.TimeZone timeZone35 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat36 = stdDateFormat23._formatISO8601;
        stdDateFormat6._formatRFC1123 = stdDateFormat23;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date16 = stdDateFormat6.parse("1970-01-01T07:00:00.010+0700");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
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
        boolean boolean22 = stdDateFormat6.looksLikeISO8601("07:00:00");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat17.", dateFormat0.equals(dateFormat17) == dateFormat17.equals(dateFormat0));
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
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
        java.util.TimeZone timeZone29 = stdDateFormat24._timezone;
        java.text.DateFormat dateFormat30 = stdDateFormat24._formatISO8601_z;
        java.text.DateFormat dateFormat31 = stdDateFormat24._formatISO8601_z;
        java.lang.String str32 = stdDateFormat24.toString();
        java.text.DateFormat dateFormat33 = stdDateFormat24._formatISO8601;
        boolean boolean35 = stdDateFormat24.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        stdDateFormat6._formatISO8601_z = stdDateFormat24;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
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
        java.lang.String str25 = stdDateFormat6.toString();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat26, stdDateFormat6, and dateFormat0.", !(stdDateFormat26.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat26.equals(dateFormat0));
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
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
        java.util.TimeZone timeZone17 = stdDateFormat6._timezone;
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
        java.util.Locale locale30 = stdDateFormat24._locale;
        java.text.DateFormat dateFormat31 = stdDateFormat24._formatRFC1123;
        java.util.TimeZone timeZone32 = stdDateFormat24._timezone;
        java.text.DateFormat dateFormat33 = stdDateFormat24._formatPlain;
        java.util.TimeZone timeZone34 = stdDateFormat24._timezone;
        java.text.DateFormat dateFormat35 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone34);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = stdDateFormat6.withTimeZone(timeZone34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat36 and stdDateFormat24.", stdDateFormat36.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat36));
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat19, stdDateFormat6, and dateFormat0.", !(stdDateFormat19.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat19.equals(dateFormat0));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
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
        java.lang.String str15 = stdDateFormat6.toString();
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
        java.util.TimeZone timeZone29 = stdDateFormat22._timezone;
        java.text.DateFormat dateFormat30 = stdDateFormat22._formatRFC1123;
        java.util.TimeZone timeZone31 = stdDateFormat22._timezone;
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone31);
        stdDateFormat6.setTimeZone(timeZone31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 100L);
        java.lang.String str5 = dateFormat1.format((java.lang.Object) 3);
        java.util.TimeZone timeZone6 = dateFormat1.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone6);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
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
        java.lang.String str19 = stdDateFormat6.toString();
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
        java.text.DateFormat dateFormat33 = stdDateFormat26._formatRFC1123;
        java.text.NumberFormat numberFormat34 = stdDateFormat26.getNumberFormat();
        java.text.DateFormat dateFormat35 = stdDateFormat26._formatISO8601;
        java.util.Calendar calendar36 = stdDateFormat26.getCalendar();
        java.text.DateFormat dateFormat37 = stdDateFormat26._formatRFC1123;
        stdDateFormat6._formatPlain = stdDateFormat26;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat26.", stdDateFormat6.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat6));
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone13);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat14, stdDateFormat6, and dateFormat0.", !(stdDateFormat14.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat14.equals(dateFormat0));
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        boolean boolean2 = dateFormat0.isLenient();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
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
        java.text.DateFormat dateFormat35 = stdDateFormat28._formatRFC1123;
        java.text.DateFormat dateFormat36 = stdDateFormat28._formatRFC1123;
        java.util.TimeZone timeZone37 = stdDateFormat28._timezone;
        stdDateFormat6._formatISO8601_z = stdDateFormat28;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat28.", stdDateFormat6.equals(stdDateFormat28) == stdDateFormat28.equals(stdDateFormat6));
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
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
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        dateFormat19.setLenient(false);
        stdDateFormat6._formatPlain = dateFormat19;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        dateFormat24.setLenient(true);
        boolean boolean27 = dateFormat24.isLenient();
        java.util.Calendar calendar28 = dateFormat24.getCalendar();
        java.util.TimeZone timeZone29 = dateFormat24.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone29);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        stdDateFormat30.setNumberFormat(numberFormat33);
        java.text.DateFormat dateFormat35 = stdDateFormat30._formatISO8601_z;
        java.text.DateFormat dateFormat36 = stdDateFormat30._formatISO8601_z;
        java.lang.String str37 = stdDateFormat30.toString();
        java.text.DateFormat dateFormat38 = stdDateFormat30._formatISO8601_z;
        java.util.TimeZone timeZone39 = stdDateFormat30._timezone;
        java.util.TimeZone timeZone40 = stdDateFormat30._timezone;
        stdDateFormat6._timezone = timeZone40;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat30.", stdDateFormat6.equals(stdDateFormat30) == stdDateFormat30.equals(stdDateFormat6));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
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
        java.text.NumberFormat numberFormat22 = stdDateFormat6.getNumberFormat();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat16.", dateFormat0.equals(dateFormat16) == dateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
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
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat6, and dateFormat0.", !(stdDateFormat17.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat17.equals(dateFormat0));
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
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
        java.util.TimeZone timeZone14 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14);
        stdDateFormat6.setTimeZone(timeZone14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat15.", stdDateFormat6.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat6));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
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
        java.lang.String str14 = stdDateFormat6.toString();
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
        java.util.Locale locale30 = stdDateFormat23._locale;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateTimeInstance(2, (int) (short) 0, locale30);
        stdDateFormat6._formatRFC1123 = dateFormat31;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat6, and dateFormat0.", !(stdDateFormat17.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat17.equals(dateFormat0));
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat18, stdDateFormat6, and dateFormat0.", !(stdDateFormat18.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat18.equals(dateFormat0));
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
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
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        dateFormat19.setLenient(true);
        boolean boolean22 = dateFormat19.isLenient();
        java.util.Calendar calendar23 = dateFormat19.getCalendar();
        java.util.TimeZone timeZone24 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        stdDateFormat25.setNumberFormat(numberFormat28);
        java.text.NumberFormat numberFormat30 = stdDateFormat25.getNumberFormat();
        java.util.TimeZone timeZone31 = stdDateFormat25._timezone;
        java.util.TimeZone timeZone32 = stdDateFormat25._timezone;
        stdDateFormat6._timezone = timeZone32;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat25.", stdDateFormat6.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat6));
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
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
        java.text.DateFormat dateFormat28 = stdDateFormat22._formatISO8601_z;
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatISO8601_z;
        java.util.TimeZone timeZone30 = stdDateFormat22._timezone;
        java.util.Locale locale31 = stdDateFormat22._locale;
        java.util.Locale locale32 = stdDateFormat22._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = stdDateFormat6.withLocale(locale32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat33 and stdDateFormat22.", stdDateFormat33.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat33));
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
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
        java.lang.String str30 = stdDateFormat25.toString();
        java.text.DateFormat dateFormat31 = stdDateFormat25._formatISO8601;
        stdDateFormat6._formatISO8601_z = stdDateFormat25;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat25.", stdDateFormat6.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat6));
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
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
        java.util.Locale locale31 = stdDateFormat24._locale;
        java.util.Locale locale32 = stdDateFormat24._locale;
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone17, locale32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone17);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat19, stdDateFormat6, and dateFormat0.", !(stdDateFormat19.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat19.equals(dateFormat0));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        java.text.NumberFormat numberFormat8 = dateFormat6.getNumberFormat();
        java.text.NumberFormat numberFormat9 = dateFormat6.getNumberFormat();
        boolean boolean10 = dateFormat4.equals((java.lang.Object) dateFormat6);
        java.util.Calendar calendar11 = dateFormat6.getCalendar();
        stdDateFormat3.setCalendar(calendar11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat6.", dateFormat0.equals(dateFormat6) == dateFormat6.equals(dateFormat0));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date14 = stdDateFormat6.parse("1970-01-01T00:00:00.000+0000");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone15 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
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
        java.text.DateFormat dateFormat15 = stdDateFormat6._formatISO8601_z;
        boolean boolean17 = stdDateFormat6.looksLikeISO8601("07:00");
        java.util.TimeZone timeZone18 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        dateFormat19.setLenient(true);
        java.util.Calendar calendar22 = dateFormat19.getCalendar();
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
        java.text.DateFormat dateFormat36 = stdDateFormat29._formatRFC1123;
        java.text.NumberFormat numberFormat37 = stdDateFormat29.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat37);
        java.util.Calendar calendar39 = dateFormat19.getCalendar();
        stdDateFormat6.setCalendar(calendar39);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat29.", stdDateFormat6.equals(stdDateFormat29) == stdDateFormat29.equals(stdDateFormat6));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
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
        java.text.DateFormat dateFormat32 = stdDateFormat23._formatPlain;
        java.util.TimeZone timeZone33 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat34 = stdDateFormat23._formatISO8601_z;
        java.util.Calendar calendar35 = stdDateFormat23.getCalendar();
        java.util.Locale locale36 = stdDateFormat23._locale;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance(3, locale36);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = stdDateFormat6.withLocale(locale36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat38 and stdDateFormat23.", stdDateFormat38.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat38));
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
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
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601_z;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone17 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
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
        java.text.DateFormat dateFormat19 = stdDateFormat6._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat20, stdDateFormat6, and dateFormat0.", !(stdDateFormat20.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat20.equals(dateFormat0));
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
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
        java.text.DateFormat dateFormat22 = stdDateFormat6._formatRFC1123;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat16.", dateFormat0.equals(dateFormat16) == dateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
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
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getInstance();
        boolean boolean25 = dateFormat24.isLenient();
        java.util.TimeZone timeZone26 = dateFormat24.getTimeZone();
        java.text.NumberFormat numberFormat27 = dateFormat24.getNumberFormat();
        dateFormat24.setLenient(true);
        java.util.TimeZone timeZone30 = dateFormat24.getTimeZone();
        java.util.Calendar calendar31 = dateFormat24.getCalendar();
        java.util.TimeZone timeZone32 = dateFormat24.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone32);
        stdDateFormat6.setTimeZone(timeZone32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat33.", stdDateFormat6.equals(stdDateFormat33) == stdDateFormat33.equals(stdDateFormat6));
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
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
        java.util.Locale locale16 = stdDateFormat9._locale;
        boolean boolean18 = stdDateFormat9.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        java.util.Locale locale19 = stdDateFormat9._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale19);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone15 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
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
        java.text.DateFormat dateFormat31 = stdDateFormat24._formatRFC1123;
        java.text.DateFormat dateFormat32 = stdDateFormat24._formatISO8601;
        java.util.TimeZone timeZone33 = stdDateFormat24._timezone;
        stdDateFormat6.setTimeZone(timeZone33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
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
        java.util.TimeZone timeZone29 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat30 = stdDateFormat23._formatRFC1123;
        java.text.DateFormat dateFormat31 = stdDateFormat23._formatISO8601;
        java.util.TimeZone timeZone32 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat33 = stdDateFormat23._formatPlain;
        java.text.DateFormat dateFormat34 = stdDateFormat23._formatISO8601;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getInstance();
        dateFormat35.setLenient(true);
        java.util.TimeZone timeZone38 = dateFormat35.getTimeZone();
        java.util.Calendar calendar39 = dateFormat35.getCalendar();
        java.util.TimeZone timeZone40 = dateFormat35.getTimeZone();
        stdDateFormat23._timezone = timeZone40;
        stdDateFormat6._formatISO8601 = stdDateFormat23;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone16);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
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
        boolean boolean34 = stdDateFormat23.looksLikeISO8601("1970-01-01T07:00:00.005+0700");
        java.text.NumberFormat numberFormat35 = stdDateFormat23.getNumberFormat();
        java.lang.Object obj37 = numberFormat35.parseObject("1/1/13 06:59");
        stdDateFormat6.setNumberFormat(numberFormat35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
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
        java.lang.String str35 = stdDateFormat26.toString();
        java.util.Locale locale36 = stdDateFormat26._locale;
        java.text.DateFormat dateFormat37 = stdDateFormat26._formatISO8601_z;
        stdDateFormat6._formatISO8601_z = stdDateFormat26;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat26.", stdDateFormat6.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat6));
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
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
        java.util.TimeZone timeZone30 = stdDateFormat25._timezone;
        java.text.DateFormat dateFormat31 = stdDateFormat25._formatISO8601_z;
        java.text.DateFormat dateFormat32 = stdDateFormat25._formatISO8601_z;
        java.util.TimeZone timeZone33 = stdDateFormat25._timezone;
        java.text.DateFormat dateFormat34 = stdDateFormat25._formatRFC1123;
        boolean boolean36 = stdDateFormat25.looksLikeISO8601("1/1/13 07:00");
        java.util.Locale locale37 = stdDateFormat25._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone16, locale37);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
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
        java.lang.String str31 = stdDateFormat23.toString();
        java.text.DateFormat dateFormat32 = stdDateFormat23._formatRFC1123;
        java.util.Locale locale33 = stdDateFormat23._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat6.withLocale(locale33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat34 and stdDateFormat23.", stdDateFormat34.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat34));
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
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
        java.text.DateFormat dateFormat28 = stdDateFormat22._formatISO8601_z;
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatISO8601_z;
        java.util.TimeZone timeZone30 = stdDateFormat22._timezone;
        java.util.Locale locale31 = stdDateFormat22._locale;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getTimeInstance(1, locale31);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14, locale31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date15 = stdDateFormat6.parse("1970-01-01T07:00:00.010+0700");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
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
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        dateFormat19.setLenient(true);
        boolean boolean22 = dateFormat19.isLenient();
        java.util.Calendar calendar23 = dateFormat19.getCalendar();
        java.util.TimeZone timeZone24 = dateFormat19.getTimeZone();
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone24);
        stdDateFormat6.setTimeZone(timeZone24);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        dateFormat27.setLenient(true);
        boolean boolean30 = dateFormat27.isLenient();
        java.util.Calendar calendar31 = dateFormat27.getCalendar();
        java.util.TimeZone timeZone32 = dateFormat27.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone32);
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat36 = dateFormat35.getNumberFormat();
        stdDateFormat33.setNumberFormat(numberFormat36);
        java.util.TimeZone timeZone38 = stdDateFormat33._timezone;
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone38);
        stdDateFormat6.setTimeZone(timeZone38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat33.", stdDateFormat6.equals(stdDateFormat33) == stdDateFormat33.equals(stdDateFormat6));
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
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
        java.lang.String str31 = stdDateFormat23.toString();
        java.text.DateFormat dateFormat32 = stdDateFormat23._formatISO8601;
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str36 = dateFormat34.format((java.lang.Object) 100L);
        java.lang.String str38 = dateFormat34.format((java.lang.Object) 3);
        java.util.TimeZone timeZone39 = dateFormat34.getTimeZone();
        stdDateFormat23._timezone = timeZone39;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat41 = stdDateFormat6.withTimeZone(timeZone39);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat41 and stdDateFormat23.", stdDateFormat41.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat41));
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
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
        java.util.TimeZone timeZone17 = stdDateFormat6._timezone;
        java.text.NumberFormat numberFormat18 = stdDateFormat6.getNumberFormat();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone19 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
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
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance(0);
        java.util.Calendar calendar14 = dateFormat13.getCalendar();
        stdDateFormat6.setCalendar(calendar14);
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
        stdDateFormat6._timezone = timeZone34;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone6 = dateFormat0.getTimeZone();
        java.util.Calendar calendar7 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8);
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat9 and stdDateFormat9", stdDateFormat9.equals(stdDateFormat9) ? stdDateFormat9.hashCode() == stdDateFormat9.hashCode() : true);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
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
        java.text.DateFormat dateFormat32 = stdDateFormat26._formatPlain;
        java.text.DateFormat dateFormat33 = stdDateFormat26._formatRFC1123;
        java.text.DateFormat dateFormat34 = stdDateFormat26._formatRFC1123;
        java.text.DateFormat dateFormat35 = stdDateFormat26._formatRFC1123;
        java.text.DateFormat dateFormat36 = stdDateFormat26._formatRFC1123;
        java.util.TimeZone timeZone37 = stdDateFormat26._timezone;
        stdDateFormat6.setTimeZone(timeZone37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat26.", stdDateFormat6.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat6));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
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
        java.util.Locale locale21 = stdDateFormat6._locale;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat16.", dateFormat0.equals(dateFormat16) == dateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.lang.String str4 = stdDateFormat3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone15 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
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
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone18 = dateFormat17.getTimeZone();
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone18);
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
        java.text.DateFormat dateFormat33 = stdDateFormat26._formatRFC1123;
        java.text.NumberFormat numberFormat34 = stdDateFormat26.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat34);
        stdDateFormat6.setNumberFormat(numberFormat34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat26.", stdDateFormat6.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat6));
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
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
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        boolean boolean18 = dateFormat17.isLenient();
        dateFormat17.setLenient(true);
        stdDateFormat6._formatISO8601 = dateFormat17;
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
        java.util.TimeZone timeZone37 = stdDateFormat29._timezone;
        java.text.DateFormat dateFormat38 = stdDateFormat29._formatPlain;
        boolean boolean40 = stdDateFormat29.looksLikeISO8601("1970-01-01T07:00:00.005+0700");
        java.text.NumberFormat numberFormat41 = stdDateFormat29.getNumberFormat();
        java.util.Locale locale42 = stdDateFormat29._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat43 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone22, locale42);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
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
        java.util.Locale locale30 = stdDateFormat24._locale;
        java.text.DateFormat dateFormat31 = stdDateFormat24._formatRFC1123;
        java.util.Locale locale32 = stdDateFormat24._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = stdDateFormat6.withLocale(locale32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat33 and stdDateFormat24.", stdDateFormat33.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat33));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
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
        java.text.DateFormat dateFormat31 = stdDateFormat24._formatISO8601_z;
        java.text.NumberFormat numberFormat32 = stdDateFormat24.getNumberFormat();
        java.util.Locale locale33 = stdDateFormat24._locale;
        java.text.DateFormat dateFormat34 = stdDateFormat24._formatISO8601_z;
        java.util.Locale locale35 = stdDateFormat24._locale;
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getTimeInstance((int) (short) 0, locale35);
        java.util.TimeZone timeZone37 = dateFormat36.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = stdDateFormat6.withTimeZone(timeZone37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat38 and stdDateFormat24.", stdDateFormat38.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat38));
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone6 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6);
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat7 and stdDateFormat7", stdDateFormat7.equals(stdDateFormat7) ? stdDateFormat7.hashCode() == stdDateFormat7.hashCode() : true);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat15, stdDateFormat6, and dateFormat0.", !(stdDateFormat15.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat15.equals(dateFormat0));
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
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
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        boolean boolean18 = stdDateFormat6.looksLikeISO8601("1970-01-01T07:00:00.000+0700");
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
        java.util.TimeZone timeZone33 = stdDateFormat25._timezone;
        java.text.DateFormat dateFormat34 = stdDateFormat25._formatPlain;
        java.lang.String str35 = stdDateFormat25.toString();
        java.text.DateFormat dateFormat36 = stdDateFormat25._formatISO8601;
        java.text.DateFormat dateFormat37 = stdDateFormat25._formatPlain;
        java.text.DateFormat dateFormat38 = stdDateFormat25._formatISO8601_z;
        java.util.TimeZone timeZone39 = stdDateFormat25._timezone;
        java.text.DateFormat dateFormat40 = stdDateFormat25._formatPlain;
        java.util.TimeZone timeZone41 = stdDateFormat25._timezone;
        stdDateFormat6._formatISO8601_z = stdDateFormat25;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat25.", stdDateFormat6.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat6));
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
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
        java.lang.String str30 = stdDateFormat22.toString();
        java.text.DateFormat dateFormat31 = stdDateFormat22._formatRFC1123;
        boolean boolean33 = stdDateFormat22.looksLikeISO8601("07:00");
        java.util.TimeZone timeZone34 = stdDateFormat22._timezone;
        stdDateFormat6._timezone = timeZone34;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat22.", stdDateFormat6.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat6));
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat13, stdDateFormat6, and dateFormat0.", !(stdDateFormat13.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat13.equals(dateFormat0));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat21, stdDateFormat6, and dateFormat0.", !(stdDateFormat21.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat21.equals(dateFormat0));
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
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
        java.util.TimeZone timeZone20 = stdDateFormat6._timezone;
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        java.util.Calendar calendar23 = dateFormat21.getCalendar();
        stdDateFormat6.setCalendar(calendar23);
        java.text.DateFormat dateFormat25 = stdDateFormat6._formatISO8601_z;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj27 = stdDateFormat6.parseObject("1970-01-01T07:00:00.000+0700");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
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
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        java.text.NumberFormat numberFormat17 = dateFormat15.getNumberFormat();
        java.text.NumberFormat numberFormat18 = dateFormat15.getNumberFormat();
        boolean boolean19 = stdDateFormat6.equals((java.lang.Object) numberFormat18);
        java.util.TimeZone timeZone20 = stdDateFormat6._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj22 = stdDateFormat6.parseObject("1970-01-01T07:00:00.010+0700");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
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
        java.text.DateFormat dateFormat23 = stdDateFormat6._formatISO8601_z;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat23.", dateFormat0.equals(dateFormat23) == dateFormat23.equals(dateFormat0));
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
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
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        dateFormat23.setLenient(true);
        boolean boolean26 = dateFormat23.isLenient();
        java.util.Calendar calendar27 = dateFormat23.getCalendar();
        java.util.TimeZone timeZone28 = dateFormat23.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone28);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        stdDateFormat29.setNumberFormat(numberFormat32);
        java.util.TimeZone timeZone34 = stdDateFormat29._timezone;
        java.text.DateFormat dateFormat35 = stdDateFormat29._formatISO8601_z;
        java.text.DateFormat dateFormat36 = stdDateFormat29._formatISO8601_z;
        java.util.TimeZone timeZone37 = stdDateFormat29._timezone;
        java.util.Locale locale38 = stdDateFormat29._locale;
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getTimeInstance(1, locale38);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat40 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20, locale38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat29.", stdDateFormat6.equals(stdDateFormat29) == stdDateFormat29.equals(stdDateFormat6));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
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
        java.text.DateFormat dateFormat32 = stdDateFormat27._formatISO8601_z;
        java.text.DateFormat dateFormat33 = stdDateFormat27._formatISO8601_z;
        java.lang.String str34 = stdDateFormat27.toString();
        java.text.DateFormat dateFormat35 = stdDateFormat27._formatISO8601_z;
        java.util.TimeZone timeZone36 = stdDateFormat27._timezone;
        java.util.TimeZone timeZone37 = stdDateFormat27._timezone;
        stdDateFormat6._formatISO8601 = stdDateFormat27;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat27.", stdDateFormat6.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat6));
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat23, stdDateFormat6, and dateFormat0.", !(stdDateFormat23.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat23.equals(dateFormat0));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = stdDateFormat6.isLenient();
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone20 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone17 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
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
        java.text.DateFormat dateFormat19 = stdDateFormat6._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat20, stdDateFormat6, and dateFormat0.", !(stdDateFormat20.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat20.equals(dateFormat0));
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.DateFormat dateFormat2 = stdDateFormat1._formatISO8601;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
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
        java.util.Calendar calendar33 = stdDateFormat23.getCalendar();
        java.text.DateFormat dateFormat34 = stdDateFormat23._formatPlain;
        boolean boolean36 = stdDateFormat23.looksLikeISO8601("");
        stdDateFormat6._formatRFC1123 = stdDateFormat23;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat23.", stdDateFormat6.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat6));
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
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
        java.lang.String str14 = stdDateFormat6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone15 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat15, stdDateFormat6, and dateFormat0.", !(stdDateFormat15.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat15.equals(dateFormat0));
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone16 = stdDateFormat6.getTimeZone();
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
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
        java.lang.String str29 = stdDateFormat24.toString();
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        stdDateFormat24._formatPlain = dateFormat30;
        java.lang.String str33 = stdDateFormat24.toString();
        java.util.Locale locale34 = stdDateFormat24._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat6.withLocale(locale34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat35 and stdDateFormat24.", stdDateFormat35.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat35));
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
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
        java.text.DateFormat dateFormat16 = stdDateFormat6._formatISO8601;
        java.lang.String str17 = stdDateFormat6.toString();
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat40 = stdDateFormat6.withLocale(locale36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat40 and stdDateFormat28.", stdDateFormat40.equals(stdDateFormat28) == stdDateFormat28.equals(stdDateFormat40));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat18, stdDateFormat6, and dateFormat0.", !(stdDateFormat18.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat18.equals(dateFormat0));
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat6.setLenient(true);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
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
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        dateFormat20.setLenient(true);
        boolean boolean23 = dateFormat20.isLenient();
        java.util.Calendar calendar24 = dateFormat20.getCalendar();
        java.util.TimeZone timeZone25 = dateFormat20.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone25);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        stdDateFormat26.setNumberFormat(numberFormat29);
        java.text.DateFormat dateFormat31 = stdDateFormat26._formatISO8601_z;
        java.text.DateFormat dateFormat32 = stdDateFormat26._formatISO8601_z;
        java.lang.String str33 = stdDateFormat26.toString();
        java.text.DateFormat dateFormat34 = stdDateFormat26._formatRFC1123;
        java.util.Locale locale35 = stdDateFormat26._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19, locale35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat26.", stdDateFormat6.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat6));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
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
        java.util.Locale locale33 = stdDateFormat26._locale;
        boolean boolean35 = stdDateFormat26.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        java.util.Locale locale36 = stdDateFormat26._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19, locale36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat26.", stdDateFormat6.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat6));
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone6 = dateFormat0.getTimeZone();
        java.util.Calendar calendar7 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat0.getTimeZone();
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
        java.util.TimeZone timeZone23 = stdDateFormat16._timezone;
        java.util.Locale locale24 = stdDateFormat16._locale;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance(0, locale24);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8, locale24);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat26, stdDateFormat16, and dateFormat0.", !(stdDateFormat26.equals(stdDateFormat16) && stdDateFormat16.equals(dateFormat0)) || stdDateFormat26.equals(dateFormat0));
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
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
        java.util.TimeZone timeZone32 = stdDateFormat26._timezone;
        stdDateFormat9.setTimeZone(timeZone32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat9 and stdDateFormat26.", stdDateFormat9.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat9));
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = stdDateFormat6.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat25, stdDateFormat6, and dateFormat0.", !(stdDateFormat25.equals(stdDateFormat6) && stdDateFormat6.equals(dateFormat0)) || stdDateFormat25.equals(dateFormat0));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
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
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance(3, 0);
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
        java.text.DateFormat dateFormat32 = stdDateFormat24._formatPlain;
        java.util.Locale locale33 = stdDateFormat24._locale;
        boolean boolean34 = dateFormat17.equals((java.lang.Object) stdDateFormat24);
        java.util.TimeZone timeZone35 = stdDateFormat24._timezone;
        stdDateFormat6.setTimeZone(timeZone35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat24.", stdDateFormat6.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat6));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
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
        java.util.TimeZone timeZone13 = stdDateFormat7._timezone;
        java.util.TimeZone timeZone14 = stdDateFormat7._timezone;
        java.util.Locale locale15 = stdDateFormat7._locale;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance(0, locale15);
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
        boolean boolean30 = stdDateFormat23.looksLikeISO8601("1/1/13 06:59");
        java.lang.String str31 = stdDateFormat23.toString();
        java.text.NumberFormat numberFormat32 = stdDateFormat23.getNumberFormat();
        java.lang.Object obj34 = numberFormat32.parseObject("1970-01-01T07:00:00.005+0700");
        boolean boolean35 = dateFormat16.equals((java.lang.Object) "1970-01-01T07:00:00.005+0700");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat7 and stdDateFormat23.", stdDateFormat7.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat7));
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
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
        java.util.TimeZone timeZone24 = stdDateFormat6._timezone;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat16.", dateFormat0.equals(dateFormat16) == dateFormat16.equals(dateFormat0));
    }
}

