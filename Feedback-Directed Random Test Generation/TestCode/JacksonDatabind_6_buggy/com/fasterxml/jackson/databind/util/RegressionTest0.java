package com.fasterxml.jackson.databind.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.String str0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_STR_ISO8601;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy-MM-dd'T'HH:mm:ss.SSSZ" + "'", str0, "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int0 = java.text.DateFormat.ERA_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int0 = java.text.DateFormat.DAY_OF_WEEK_IN_MONTH_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int int0 = java.text.DateFormat.MONTH_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = dateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        int int0 = java.text.DateFormat.SECOND_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int0 = java.text.DateFormat.FULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int int0 = java.text.DateFormat.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.parseObject("", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (short) 10, (int) (byte) 10, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(0, 0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat2.withLocale(locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsRFC1123("hi!", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int int0 = java.text.DateFormat.DATE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        int int0 = java.text.DateFormat.MEDIUM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        int int0 = java.text.DateFormat.DAY_OF_YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar2 = null;
        dateFormat1.setCalendar(calendar2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateFormat0.format((java.lang.Object) calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int int0 = java.text.DateFormat.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = stdDateFormat0.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        int int0 = java.text.DateFormat.DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.String str0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_STR_ISO8601_Z;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'" + "'", str0, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = stdDateFormat1.format((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        int int0 = java.text.DateFormat.WEEK_OF_YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int int0 = java.text.DateFormat.AM_PM_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = stdDateFormat1.withLocale(locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        int int0 = java.text.DateFormat.HOUR1_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(7, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.String str0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_STR_PLAIN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy-MM-dd" + "'", str0, "yyyy-MM-dd");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parse("", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        int int0 = java.text.DateFormat.HOUR_OF_DAY0_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(100, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat1.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        int int0 = java.text.DateFormat.MINUTE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.lang.Class<?> wildcardClass2 = numberFormat1.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int int0 = java.text.DateFormat.DAY_OF_WEEK_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) -1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        int int0 = java.text.DateFormat.HOUR_OF_DAY1_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 100, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) -1, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int int0 = java.text.DateFormat.TIMEZONE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        int int0 = java.text.DateFormat.WEEK_OF_MONTH_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.lang.StringBuffer stringBuffer2 = null;
        java.text.FieldPosition fieldPosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer4 = dateFormat0.format((java.lang.Object) (short) 0, stringBuffer2, fieldPosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (short) 100, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        dateFormat0.setLenient(false);
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(7, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(5, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.Date date1 = null;
        java.lang.StringBuffer stringBuffer2 = null;
        java.text.FieldPosition fieldPosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer4 = stdDateFormat0.format(date1, stringBuffer2, fieldPosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.TimeZone timeZone3 = stdDateFormat2.getTimeZone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.util.Date date3 = null;
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = stdDateFormat2.format(date3, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        int int0 = java.text.DateFormat.YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.util.Date date2 = null;
        java.lang.StringBuffer stringBuffer3 = null;
        java.text.FieldPosition fieldPosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = stdDateFormat1.format(date2, stringBuffer3, fieldPosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(7, (int) '#', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parseAsRFC1123("1/1/13 07:00", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withLocale(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat2.setLenient(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale3);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = stdDateFormat4.withLocale(locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 100, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        int int0 = java.text.DateFormat.MILLISECOND_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parseAsISO8601("1/1/13 07:00", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale3);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parseAsISO8601("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.NumberFormat numberFormat2 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = dateFormat0.format((java.lang.Object) dateFormat3, stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale3);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        int int0 = java.text.DateFormat.HOUR0_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withLocale(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parseAsRFC1123("yyyy-MM-dd", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.NumberFormat numberFormat2 = dateFormat0.getNumberFormat();
        java.lang.Class<?> wildcardClass3 = dateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 14);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator4 = stdDateFormat0.formatToCharacterIterator((java.lang.Object) str3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1/1/13 07:00" + "'", str3, "1/1/13 07:00");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 14);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateFormat0.format((java.lang.Object) dateFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1/1/13 07:00" + "'", str2, "1/1/13 07:00");
        org.junit.Assert.assertNotNull(dateFormat4);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar1 = null;
        dateFormat0.setCalendar(calendar1);
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        java.lang.Class<?> wildcardClass4 = dateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateFormat2.format((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) (short) 1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.util.TimeZone timeZone3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat2.setTimeZone(timeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.NumberFormat numberFormat2 = dateFormat0.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = numberFormat2.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.lang.StringBuffer stringBuffer2 = null;
        java.text.FieldPosition fieldPosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer4 = dateFormat0.format((java.lang.Object) dateFormat1, stringBuffer2, fieldPosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(3);
        java.util.Calendar calendar2 = null;
        dateFormat1.setCalendar(calendar2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = dateFormat1.isLenient();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = dateFormat0.format(date1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.util.Calendar calendar1 = null;
        dateFormat0.setCalendar(calendar1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = numberFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parseAsISO8601("yyyy-MM-dd", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(13, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stdDateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(3);
        java.lang.StringBuffer stringBuffer3 = null;
        java.text.FieldPosition fieldPosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = dateFormat1.format((java.lang.Object) 8, stringBuffer3, fieldPosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat2.parse("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.lang.String str0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_STR_RFC1123;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "EEE, dd MMM yyyy HH:mm:ss zzz" + "'", str0, "EEE, dd MMM yyyy HH:mm:ss zzz");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = dateFormat1.getClass();
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = stdDateFormat1.isLenient();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) '#', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.lang.StringBuffer stringBuffer3 = null;
        java.text.FieldPosition fieldPosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = dateFormat0.format((java.lang.Object) (byte) 0, stringBuffer3, fieldPosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = dateFormat0.format((java.lang.Object) "yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(17, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.lang.Class<?> wildcardClass2 = numberFormat1.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar2 = null;
        dateFormat1.setCalendar(calendar2);
        java.text.NumberFormat numberFormat4 = dateFormat1.getNumberFormat();
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = dateFormat0.format((java.lang.Object) dateFormat1, stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        java.util.Date date4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = stdDateFormat3.format(date4, stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale3);
        java.util.Date date5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = stdDateFormat4.format(date5, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = stdDateFormat4.withLocale(locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.lang.Class<?> wildcardClass2 = timeZone1.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = dateFormat0.format(date1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateFormat0.format((java.lang.Object) "EEE, dd MMM yyyy HH:mm:ss zzz");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNull(calendar1);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 14);
        java.lang.Class<?> wildcardClass3 = dateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1/1/13 07:00" + "'", str2, "1/1/13 07:00");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(14, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(9, 11, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(100, (int) (byte) -1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.lang.Class<?> wildcardClass2 = timeZone1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator3 = dateFormat0.formatToCharacterIterator((java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateFormat0.format((java.lang.Object) timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.util.Calendar calendar1 = null;
        dateFormat0.setCalendar(calendar1);
        // The following exception was thrown during execution in test generation
        try {
            dateFormat0.setLenient(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stdDateFormat2.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(100, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
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
        org.junit.Assert.assertNull(calendar1);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.parseObject("1/1/13 07:00", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat3.withLocale(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (short) 100, (int) (byte) -1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(16, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = stdDateFormat6.parseAsRFC1123("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "1) test0144(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418503456,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=36,MILLISECOND=544,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.parseObject("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parseAsRFC1123("1/1/13 07:00", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        boolean boolean3 = dateFormat0.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.Date date2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateFormat0.format(date2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat2.parse("1/1/13 07:00");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsRFC1123("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4);
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = dateFormat0.format((java.lang.Object) stdDateFormat5, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = stdDateFormat6.withLocale(locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "2) test0155(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418503184,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=36,MILLISECOND=816,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(3);
        java.util.Calendar calendar2 = null;
        dateFormat1.setCalendar(calendar2);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str7 = dateFormat5.format((java.lang.Object) 100L);
        java.util.TimeZone timeZone8 = dateFormat5.getTimeZone();
        java.lang.StringBuffer stringBuffer9 = null;
        java.text.FieldPosition fieldPosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = dateFormat1.format((java.lang.Object) dateFormat5, stringBuffer9, fieldPosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat5);
// flaky "3) test0156(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str7, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(false);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        // The following exception was thrown during execution in test generation
{ // flaky ('try' without 'catch', 'finally' or resource declarations):         try {
            java.util.Date date6 = null; // flaky "4) test0159(com.fasterxml.jackson.databind.util.RegressionTest0)": stdDateFormat4.parse("1/1/13 07:00");
// flaky "1) test0159(com.fasterxml.jackson.databind.util.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"1/1/13 07:00\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
// flaky (is never thrown in body of corresponding try statement):         } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat2.parse("EEE, dd MMM yyyy HH:mm:ss zzz");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parse("1/1/13 07:00", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateFormat0.format(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "5) test0162(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418503013,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=36,MILLISECOND=987,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parse("yyyy-MM-dd", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        // The following exception was thrown during execution in test generation
{ // flaky ('try' without 'catch', 'finally' or resource declarations):         try {
            java.util.Date date2 = null; // flaky "6) test0164(com.fasterxml.jackson.databind.util.RegressionTest0)": stdDateFormat0.parse("1/1/13 07:00");
// flaky "2) test0164(com.fasterxml.jackson.databind.util.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"1/1/13 07:00\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
// flaky (is never thrown in body of corresponding try statement):         } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parse("1/1/13 07:00", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parseAsRFC1123("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stdDateFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        dateFormat0.setLenient(true);
        java.lang.Class<?> wildcardClass4 = dateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone5, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "7) test0172(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418502698,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=37,MILLISECOND=302,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((-1), locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateFormat0.format((java.lang.Object) dateFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateFormat1.format(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parseAsISO8601("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance();
        dateFormat6.setLenient(true);
        boolean boolean9 = dateFormat6.isLenient();
        java.util.Calendar calendar10 = dateFormat6.getCalendar();
        dateFormat2.setCalendar(calendar10);
        java.lang.Class<?> wildcardClass12 = dateFormat2.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(calendar10);
// flaky "8) test0177(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar10.toString(), "sun.util.BuddhistCalendar[time=-734418502567,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=37,MILLISECOND=433,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.util.Date date5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = stdDateFormat4.format(date5, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(16, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parseAsISO8601("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (short) 1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat4.parse("EEE, dd MMM yyyy HH:mm:ss zzz");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat2.withLocale(locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = numberFormat1.formatToCharacterIterator((java.lang.Object) stdDateFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean1 = dateFormat0.isLenient();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        java.util.Locale locale5 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat0.formatToCharacterIterator((java.lang.Object) stdDateFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(0, (int) ' ', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean1 = dateFormat0.isLenient();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone3 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = dateFormat0.format((java.lang.Object) timeZone3, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "9) test0190(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-734418508900,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=31,MILLISECOND=100,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        boolean boolean3 = dateFormat0.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat5 = null; // flaky "10) test0191(com.fasterxml.jackson.databind.util.RegressionTest0)": com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone4);
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
// flaky "3) test0191(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertNotNull(dateFormat5);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (short) 100, 2, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) (short) 0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = stdDateFormat6.parseAsISO8601("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "11) test0194(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418502069,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=37,MILLISECOND=931,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parse("yyyy-MM-dd", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(9, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        // The following exception was thrown during execution in test generation
{ // flaky ('try' without 'catch', 'finally' or resource declarations):         try {
            java.util.Date date2 = null; // flaky "12) test0197(com.fasterxml.jackson.databind.util.RegressionTest0)": stdDateFormat0.parse("1/1/13 07:00");
// flaky "4) test0197(com.fasterxml.jackson.databind.util.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"1/1/13 07:00\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
// flaky (is never thrown in body of corresponding try statement):         } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "13) test0198(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418502015,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=37,MILLISECOND=985,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        // The following exception was thrown during execution in test generation
{ // flaky ('try' without 'catch', 'finally' or resource declarations):         try {
            java.util.Date date2 = null; // flaky "14) test0199(com.fasterxml.jackson.databind.util.RegressionTest0)": stdDateFormat0.parse("yyyy-MM-dd");
// flaky "5) test0199(com.fasterxml.jackson.databind.util.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
// flaky (is never thrown in body of corresponding try statement):         } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 100L);
        dateFormat1.setLenient(true);
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = dateFormat1.format((java.lang.Object) (-1.0f), stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
// flaky "15) test0200(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str3, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) ' ', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator5 = dateFormat2.formatToCharacterIterator((java.lang.Object) 8);
        dateFormat2.setLenient(true);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone9 = dateFormat8.getTimeZone();
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone9);
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        dateFormat10.setNumberFormat(numberFormat12);
        boolean boolean14 = dateFormat10.isLenient();
        boolean boolean15 = dateFormat10.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateFormat2.format((java.lang.Object) dateFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator5);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance();
        dateFormat6.setLenient(true);
        boolean boolean9 = dateFormat6.isLenient();
        java.util.Calendar calendar10 = dateFormat6.getCalendar();
        dateFormat2.setCalendar(calendar10);
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateFormat2.format(date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(calendar10);
// flaky "16) test0203(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar10.toString(), "sun.util.BuddhistCalendar[time=-734418501810,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=38,MILLISECOND=190,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) ' ', (int) (short) 10, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        java.util.Locale locale6 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5, locale6);
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = stdDateFormat7.parse("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "17) test0205(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418501780,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=38,MILLISECOND=220,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parse("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = stdDateFormat6.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "18) test0210(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418501587,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=38,MILLISECOND=413,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(13, 1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 100L);
        java.util.TimeZone timeZone4 = dateFormat1.getTimeZone();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone6 = dateFormat5.getTimeZone();
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone6);
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        dateFormat7.setNumberFormat(numberFormat9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateFormat1.format((java.lang.Object) numberFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
// flaky "19) test0212(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str3, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator5 = dateFormat2.formatToCharacterIterator((java.lang.Object) 8);
        dateFormat2.setLenient(true);
        java.lang.Class<?> wildcardClass8 = dateFormat2.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (short) 10, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat2.parseObject("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat6.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "20) test0218(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418501410,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=38,MILLISECOND=590,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        java.util.Locale locale6 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5, locale6);
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = stdDateFormat7.parse("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "21) test0219(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418501394,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=38,MILLISECOND=606,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stdDateFormat5.parseObject("1/1/13 07:00", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = stdDateFormat6.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "22) test0221(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418501319,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=38,MILLISECOND=681,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(9, 0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = dateFormat5.parseObject("1/1/13 07:00", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance();
        dateFormat1.setLenient(true);
        boolean boolean4 = dateFormat1.isLenient();
        java.util.Calendar calendar5 = dateFormat1.getCalendar();
        java.text.NumberFormat numberFormat6 = dateFormat1.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateFormat0.format((java.lang.Object) dateFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "23) test0224(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "sun.util.BuddhistCalendar[time=-734418501250,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=38,MILLISECOND=750,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat6);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) '#', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parse("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat3 = null; // flaky "24) test0227(com.fasterxml.jackson.databind.util.RegressionTest0)": com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
// flaky "6) test0227(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertNotNull(dateFormat3);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parse("1/1/13 07:00", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat2.setLenient(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = stdDateFormat5.withLocale(locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stdDateFormat2.parseObject("1/1/13 07:00", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.NumberFormat numberFormat2 = dateFormat0.getNumberFormat();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        java.util.TimeZone timeZone4 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.lang.Class<?> wildcardClass5 = timeZone4.getClass();
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = dateFormat0.format((java.lang.Object) wildcardClass5, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stdDateFormat6.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "25) test0234(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418500915,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=39,MILLISECOND=85,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean4 = dateFormat3.isLenient();
        java.util.Calendar calendar5 = dateFormat3.getCalendar();
        dateFormat2.setCalendar(calendar5);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "26) test0236(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=-734418508900,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=31,MILLISECOND=100,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getInstance();
        boolean boolean3 = dateFormat2.isLenient();
        java.lang.Class<?> wildcardClass4 = dateFormat2.getClass();
        boolean boolean5 = dateFormat0.equals((java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat0.formatToCharacterIterator((java.lang.Object) "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(1, 5, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean1 = dateFormat0.isLenient();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = numberFormat3.format(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "27) test0239(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-734418508900,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=31,MILLISECOND=100,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat3);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(15, 2, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parse("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parseAsRFC1123("yyyy-MM-dd", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean1 = dateFormat0.isLenient();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = dateFormat0.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "28) test0243(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-734418508900,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=31,MILLISECOND=100,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat3);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) 10, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean1 = dateFormat0.isLenient();
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat0.parseObject("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.NumberFormat numberFormat2 = dateFormat0.getNumberFormat();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat5);
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean8 = dateFormat7.isLenient();
        java.util.Calendar calendar9 = dateFormat7.getCalendar();
        dateFormat0.setCalendar(calendar9);
        java.lang.StringBuffer stringBuffer12 = null;
        java.text.FieldPosition fieldPosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = dateFormat0.format((java.lang.Object) 100L, stringBuffer12, fieldPosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(calendar9);
// flaky "29) test0247(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-734418508900,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=31,MILLISECOND=100,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = dateFormat0.format((java.lang.Object) numberFormat4, stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        dateFormat2.setLenient(false);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.util.TimeZone timeZone6 = null; // flaky "30) test0249(com.fasterxml.jackson.databind.util.RegressionTest0)": dateFormat5.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateFormat2.format((java.lang.Object) timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat5);
// flaky "7) test0249(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertNotNull(timeZone6);
// flaky "1) test0249(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 100L);
        java.util.TimeZone timeZone4 = dateFormat1.getTimeZone();
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
// flaky "31) test0250(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str3, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 14);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat0.parseObject("hi!", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1/1/13 07:00" + "'", str2, "1/1/13 07:00");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        // The following exception was thrown during execution in test generation
{ // flaky ('try' without 'catch', 'finally' or resource declarations):         try {
            java.util.Date date5 = null; // flaky "32) test0252(com.fasterxml.jackson.databind.util.RegressionTest0)": stdDateFormat3.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
// flaky "8) test0252(com.fasterxml.jackson.databind.util.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
// flaky (is never thrown in body of corresponding try statement):         } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parse("1/1/13 07:00", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (short) 10, (int) '#', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        dateFormat0.setLenient(true);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        java.text.NumberFormat numberFormat7 = dateFormat5.getNumberFormat();
        java.text.NumberFormat numberFormat8 = dateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean13 = dateFormat12.isLenient();
        java.util.Calendar calendar14 = dateFormat12.getCalendar();
        dateFormat5.setCalendar(calendar14);
        dateFormat4.setCalendar(calendar14);
        dateFormat0.setCalendar(calendar14);
        java.text.ParsePosition parsePosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = dateFormat0.parseObject("1/1/13 07:00", parsePosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(calendar14);
// flaky "33) test0255(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-734418508900,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=31,MILLISECOND=100,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) -1, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 100L);
        java.util.TimeZone timeZone4 = dateFormat1.getTimeZone();
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateFormat1.format(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
// flaky "34) test0257(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str3, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean1 = dateFormat0.isLenient();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        boolean boolean9 = dateFormat5.isLenient();
        java.text.NumberFormat numberFormat10 = dateFormat5.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateFormat0.format((java.lang.Object) dateFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "35) test0258(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-734418508900,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=31,MILLISECOND=100,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(numberFormat10);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = stdDateFormat6.parseAsRFC1123("", parsePosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "36) test0260(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418500266,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=39,MILLISECOND=734,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.lang.Class<?> wildcardClass2 = dateFormat1.getClass();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(14, (int) (byte) 100, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5);
        java.lang.StringBuffer stringBuffer8 = null;
        java.text.FieldPosition fieldPosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = dateFormat6.format((java.lang.Object) 100.0d, stringBuffer8, fieldPosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "37) test0265(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418500163,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=39,MILLISECOND=837,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat6);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parseAsISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator5 = dateFormat2.formatToCharacterIterator((java.lang.Object) 8);
        dateFormat2.setLenient(true);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateFormat2.format((java.lang.Object) dateFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator5);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5);
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat8 = dateFormat7.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = dateFormat6.formatToCharacterIterator((java.lang.Object) numberFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "38) test0268(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418500122,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=39,MILLISECOND=878,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.TimeZone timeZone4 = stdDateFormat3.getTimeZone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.lang.Object obj3 = null;
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = stdDateFormat2.format(obj3, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator5 = dateFormat2.formatToCharacterIterator((java.lang.Object) 8);
        dateFormat2.setLenient(true);
        java.text.NumberFormat numberFormat8 = dateFormat2.getNumberFormat();
        java.lang.Class<?> wildcardClass9 = numberFormat8.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator5);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(16, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.util.Locale locale5 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4, locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = numberFormat1.formatToCharacterIterator((java.lang.Object) stdDateFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        boolean boolean6 = dateFormat2.isLenient();
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat8 = dateFormat7.getNumberFormat();
        java.lang.StringBuffer stringBuffer9 = null;
        java.text.FieldPosition fieldPosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = dateFormat2.format((java.lang.Object) numberFormat8, stringBuffer9, fieldPosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) '4', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        dateFormat0.setLenient(true);
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateFormat0.format(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) 'a', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parseAsRFC1123("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsISO8601("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = stdDateFormat6.parseAsISO8601("hi!", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "39) test0283(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418499743,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=40,MILLISECOND=257,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat12);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.util.Date date2 = null;
        java.lang.StringBuffer stringBuffer3 = null;
        java.text.FieldPosition fieldPosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = stdDateFormat1.format(date2, stringBuffer3, fieldPosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(11, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.NumberFormat numberFormat2 = dateFormat0.getNumberFormat();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar5 = null;
        dateFormat4.setCalendar(calendar5);
        java.text.NumberFormat numberFormat7 = dateFormat4.getNumberFormat();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getTimeInstance();
        dateFormat8.setLenient(true);
        boolean boolean11 = dateFormat8.isLenient();
        java.util.Calendar calendar12 = dateFormat8.getCalendar();
        dateFormat4.setCalendar(calendar12);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator14 = numberFormat3.formatToCharacterIterator((java.lang.Object) calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(calendar12);
// flaky "40) test0288(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar12.toString(), "sun.util.BuddhistCalendar[time=-734418499662,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=40,MILLISECOND=338,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parse("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) ' ', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat4.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        boolean boolean2 = dateFormat0.isLenient();
        java.lang.Object obj3 = null;
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = dateFormat0.format(obj3, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 1, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(12, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat2.withLocale(locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean1 = dateFormat0.isLenient();
        java.lang.String str3 = dateFormat0.format((java.lang.Object) 4);
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "41) test0298(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.004+0000" + "'", str3, "1970-01-01T00:00:00.004+0000");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        boolean boolean3 = dateFormat0.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = dateFormat0.formatToCharacterIterator((java.lang.Object) "1/1/13 07:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        boolean boolean6 = dateFormat5.isLenient();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = dateFormat5.formatToCharacterIterator(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatToCharacterIterator must be passed non-null object");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
// flaky "42) test0301(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = stdDateFormat2.isLenient();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Calendar calendar3 = dateFormat1.getCalendar();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        java.text.NumberFormat numberFormat6 = dateFormat4.getNumberFormat();
        java.text.NumberFormat numberFormat7 = dateFormat4.getNumberFormat();
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat9);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = dateFormat1.format((java.lang.Object) dateFormat4, stringBuffer11, fieldPosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar3);
// flaky "43) test0303(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar3.toString(), "sun.util.BuddhistCalendar[time=-734418499276,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=40,MILLISECOND=724,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        java.util.Date date13 = null;
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = stdDateFormat6.format(date13, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "44) test0304(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418499249,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=40,MILLISECOND=751,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat12);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(7, 0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5);
        java.util.Locale locale7 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5, locale7);
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat8.withLocale(locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "45) test0306(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418499194,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=40,MILLISECOND=806,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat6);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat6.withLocale(locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "46) test0307(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418499176,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=40,MILLISECOND=824,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        java.util.Locale locale6 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5, locale6);
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = stdDateFormat7.parseAsISO8601("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "47) test0309(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418499046,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=40,MILLISECOND=954,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.util.TimeZone timeZone3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat2.setTimeZone(timeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsRFC1123("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(3, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        dateFormat2.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = dateFormat2.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        dateFormat0.setLenient(false);
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateFormat0.format(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parse("1/1/13 07:00", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(16, 14, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "48) test0318(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418498821,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=41,MILLISECOND=179,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(16, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.AttributedCharacterIterator attributedCharacterIterator4 = dateFormat2.formatToCharacterIterator((java.lang.Object) 1.0f);
        java.text.NumberFormat numberFormat5 = dateFormat2.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = numberFormat5.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(attributedCharacterIterator4);
        org.junit.Assert.assertNotNull(numberFormat5);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str6 = dateFormat4.format((java.lang.Object) 100L);
        java.util.TimeZone timeZone7 = dateFormat4.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateFormat0.format((java.lang.Object) timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat4);
// flaky "49) test0325(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str6, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        boolean boolean17 = dateFormat13.isLenient();
        boolean boolean18 = dateFormat13.isLenient();
        dateFormat13.setLenient(true);
        stdDateFormat6._formatISO8601_z = dateFormat13;
        java.text.ParsePosition parsePosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date24 = stdDateFormat6.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "50) test0326(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418498628,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=41,MILLISECOND=372,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat1.parseObject("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat18 = stdDateFormat6._formatISO8601_z;
        java.util.Date date19 = null;
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = stdDateFormat6.format(date19, stringBuffer20, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "51) test0329(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418498534,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=41,MILLISECOND=466,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(dateFormat18);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = stdDateFormat4.format((java.lang.Object) 3, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parse("1/1/13 07:00", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        boolean boolean6 = dateFormat2.isLenient();
        dateFormat2.setLenient(false);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (byte) 100, 11, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(15, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 100L);
        java.util.TimeZone timeZone4 = dateFormat1.getTimeZone();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = dateFormat1.parseObject("1970-01-01T00:00:00.004+0000", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
// flaky "52) test0336(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str3, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        boolean boolean6 = dateFormat5.isLenient();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateFormat5.format(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.text.ParsePosition parsePosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stdDateFormat6.parseObject("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", parsePosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "53) test0340(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418498298,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=41,MILLISECOND=702,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        dateFormat0.setLenient(false);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str6 = dateFormat4.format((java.lang.Object) 100L);
        java.util.TimeZone timeZone7 = dateFormat4.getTimeZone();
        java.lang.StringBuffer stringBuffer8 = null;
        java.text.FieldPosition fieldPosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = dateFormat0.format((java.lang.Object) timeZone7, stringBuffer8, fieldPosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat4);
// flaky "54) test0341(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str6, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) (byte) 10, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 0, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        boolean boolean17 = dateFormat13.isLenient();
        boolean boolean18 = dateFormat13.isLenient();
        dateFormat13.setLenient(true);
        stdDateFormat6._formatISO8601_z = dateFormat13;
        java.text.ParsePosition parsePosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date24 = stdDateFormat6.parse("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", parsePosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "55) test0344(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418498076,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=41,MILLISECOND=924,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone14 = dateFormat13.getTimeZone();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
        java.util.TimeZone timeZone16 = dateFormat15.getTimeZone();
        stdDateFormat7._timezone = timeZone16;
        java.lang.String str19 = stdDateFormat7.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone21 = dateFormat20.getTimeZone();
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21);
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator25 = dateFormat22.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat7._formatRFC1123 = dateFormat22;
        java.util.Locale locale27 = stdDateFormat7._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance(8, locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "56) test0345(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "sun.util.BuddhistCalendar[time=-734418497991,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=42,MILLISECOND=9,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str19, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone14 = dateFormat13.getTimeZone();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
        java.util.TimeZone timeZone16 = dateFormat15.getTimeZone();
        stdDateFormat7._timezone = timeZone16;
        java.lang.String str19 = stdDateFormat7.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone21 = dateFormat20.getTimeZone();
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21);
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator25 = dateFormat22.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat7._formatRFC1123 = dateFormat22;
        java.util.Locale locale27 = stdDateFormat7._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance(13, locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "57) test0346(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "sun.util.BuddhistCalendar[time=-734418497972,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=42,MILLISECOND=28,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str19, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat1.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = stdDateFormat6.parse("1/1/13 07:00");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"1/1/13 07:00\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "58) test0348(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418497887,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=42,MILLISECOND=113,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat13);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.lang.String str18 = stdDateFormat6.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20);
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator24 = dateFormat21.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat6._formatRFC1123 = dateFormat21;
        java.util.Locale locale26 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        boolean boolean30 = dateFormat27.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone31 = dateFormat27.getTimeZone();
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone31);
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        java.text.NumberFormat numberFormat35 = dateFormat33.getNumberFormat();
        java.text.NumberFormat numberFormat36 = dateFormat33.getNumberFormat();
        dateFormat32.setNumberFormat(numberFormat36);
        stdDateFormat6._formatISO8601 = dateFormat32;
        java.text.ParsePosition parsePosition40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date41 = stdDateFormat6.parseAsISO8601("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "59) test0350(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418497825,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=42,MILLISECOND=175,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str18, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertNotNull(numberFormat36);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone14 = dateFormat13.getTimeZone();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
        java.util.TimeZone timeZone16 = dateFormat15.getTimeZone();
        stdDateFormat7._timezone = timeZone16;
        java.lang.String str19 = stdDateFormat7.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone21 = dateFormat20.getTimeZone();
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21);
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator25 = dateFormat22.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat7._formatRFC1123 = dateFormat22;
        java.util.Locale locale27 = stdDateFormat7._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance(8, locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "60) test0351(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "sun.util.BuddhistCalendar[time=-734418497767,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=42,MILLISECOND=233,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str19, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        boolean boolean3 = dateFormat0.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat7);
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale10 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9, locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateFormat0.format((java.lang.Object) stdDateFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5);
        java.util.Locale locale7 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5, locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = stdDateFormat8.parse("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "61) test0353(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418497710,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=42,MILLISECOND=290,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat6);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.lang.String str18 = stdDateFormat6.format((java.lang.Object) 5);
        java.text.ParsePosition parsePosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = stdDateFormat6.parseAsRFC1123("1970-01-01T00:00:00.004+0000", parsePosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "62) test0354(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418497697,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=42,MILLISECOND=303,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str18, "1970-01-01T07:00:00.005+0700");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance();
        dateFormat2.setLenient(true);
        boolean boolean5 = dateFormat2.isLenient();
        java.util.Calendar calendar6 = dateFormat2.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat0.formatToCharacterIterator((java.lang.Object) calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(calendar6);
// flaky "63) test0355(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar6.toString(), "sun.util.BuddhistCalendar[time=-734418497682,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=42,MILLISECOND=318,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.lang.String str18 = stdDateFormat6.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20);
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator24 = dateFormat21.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat6._formatRFC1123 = dateFormat21;
        java.util.Locale locale26 = stdDateFormat6._locale;
        java.text.ParsePosition parsePosition28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date29 = stdDateFormat6.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "64) test0356(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418497644,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=42,MILLISECOND=356,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str18, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.lang.String str18 = stdDateFormat6.format((java.lang.Object) 10);
        java.text.ParsePosition parsePosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = stdDateFormat6.parseAsRFC1123("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "65) test0357(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418497589,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=42,MILLISECOND=411,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T07:00:00.010+0700" + "'", str18, "1970-01-01T07:00:00.010+0700");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.lang.String str18 = stdDateFormat6.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20);
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator24 = dateFormat21.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat6._formatRFC1123 = dateFormat21;
        java.text.NumberFormat numberFormat26 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean28 = dateFormat27.isLenient();
        java.util.Calendar calendar29 = dateFormat27.getCalendar();
        boolean boolean31 = dateFormat27.equals((java.lang.Object) 1.0f);
        dateFormat27.setLenient(true);
        java.util.TimeZone timeZone34 = dateFormat27.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = stdDateFormat6.format((java.lang.Object) timeZone34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "66) test0358(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418497560,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=42,MILLISECOND=440,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str18, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator24);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
// flaky "9) test0358(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(calendar29);
// flaky "2) test0358(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = stdDateFormat6.parseAsRFC1123("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "67) test0359(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418497506,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=42,MILLISECOND=494,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat13);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone14 = dateFormat13.getTimeZone();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
        java.util.TimeZone timeZone16 = dateFormat15.getTimeZone();
        stdDateFormat7._timezone = timeZone16;
        java.lang.String str19 = stdDateFormat7.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone21 = dateFormat20.getTimeZone();
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21);
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator25 = dateFormat22.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat7._formatRFC1123 = dateFormat22;
        java.util.Locale locale27 = stdDateFormat7._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance(11, locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "68) test0360(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "sun.util.BuddhistCalendar[time=-734418497441,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=42,MILLISECOND=559,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str19, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat5.parseAsRFC1123("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        boolean boolean17 = dateFormat13.isLenient();
        boolean boolean18 = dateFormat13.isLenient();
        dateFormat13.setLenient(true);
        stdDateFormat6._formatISO8601_z = dateFormat13;
        java.text.ParsePosition parsePosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date24 = stdDateFormat6.parseAsRFC1123("yyyy-MM-dd", parsePosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "69) test0362(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418497396,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=42,MILLISECOND=604,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
        java.util.TimeZone timeZone6 = dateFormat5.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator8 = dateFormat5.formatToCharacterIterator((java.lang.Object) 8);
        dateFormat5.setLenient(true);
        java.util.TimeZone timeZone11 = dateFormat5.getTimeZone();
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
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone25 = dateFormat24.getTimeZone();
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone25);
        java.util.TimeZone timeZone27 = dateFormat26.getTimeZone();
        stdDateFormat18._timezone = timeZone27;
        java.lang.String str30 = stdDateFormat18.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone32 = dateFormat31.getTimeZone();
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone32);
        java.util.TimeZone timeZone34 = dateFormat33.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator36 = dateFormat33.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat18._formatRFC1123 = dateFormat33;
        java.util.Locale locale38 = stdDateFormat18._locale;
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone11, locale38);
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1, locale38);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateInstance((int) (byte) -1, locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator8);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(calendar16);
// flaky "70) test0363(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar16.toString(), "sun.util.BuddhistCalendar[time=-734418497196,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=42,MILLISECOND=804,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str23, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str30, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator36);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat39);
        org.junit.Assert.assertNotNull(dateFormat40);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.text.NumberFormat numberFormat5 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        java.text.NumberFormat numberFormat8 = dateFormat6.getNumberFormat();
        java.text.NumberFormat numberFormat9 = dateFormat6.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = numberFormat5.format((java.lang.Object) numberFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "71) test0364(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418497178,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=42,MILLISECOND=822,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator5 = dateFormat2.formatToCharacterIterator((java.lang.Object) 8);
        dateFormat2.setLenient(true);
        java.text.NumberFormat numberFormat8 = dateFormat2.getNumberFormat();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = dateFormat2.parseObject("yyyy-MM-dd", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator5);
        org.junit.Assert.assertNotNull(numberFormat8);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.lang.Class<?> wildcardClass3 = dateFormat1.getClass();
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        boolean boolean3 = dateFormat0.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone4);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        java.text.NumberFormat numberFormat8 = dateFormat6.getNumberFormat();
        java.text.NumberFormat numberFormat9 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = numberFormat9.format((java.lang.Object) dateFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.lang.String str18 = stdDateFormat6.format((java.lang.Object) 5);
        java.text.ParsePosition parsePosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = stdDateFormat6.parse("hi!", parsePosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "72) test0369(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418496979,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=43,MILLISECOND=21,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str18, "1970-01-01T07:00:00.005+0700");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.NumberFormat numberFormat2 = dateFormat0.getNumberFormat();
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateFormat0.format(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = dateFormat0.parseObject("yyyy-MM-dd", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        stdDateFormat8._timezone = timeZone17;
        java.lang.String str20 = stdDateFormat8.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone22);
        java.util.TimeZone timeZone24 = dateFormat23.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator26 = dateFormat23.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat8._formatRFC1123 = dateFormat23;
        java.util.Locale locale28 = stdDateFormat8._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateTimeInstance(17, 12, locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(calendar6);
// flaky "73) test0373(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar6.toString(), "sun.util.BuddhistCalendar[time=-734418496790,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=43,MILLISECOND=210,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str20, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = stdDateFormat6.parse("EEE, dd MMM yyyy HH:mm:ss zzz");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"EEE, dd MMM yyyy HH:mm:ss zzz\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "74) test0375(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418496749,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=43,MILLISECOND=251,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNull(dateFormat11);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(3);
        java.util.Calendar calendar2 = null;
        dateFormat1.setCalendar(calendar2);
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateFormat1.format((java.lang.Object) str15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(calendar8);
// flaky "75) test0376(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar8.toString(), "sun.util.BuddhistCalendar[time=-734418496699,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=43,MILLISECOND=301,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        stdDateFormat8._timezone = timeZone17;
        java.lang.String str20 = stdDateFormat8.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone22);
        java.util.TimeZone timeZone24 = dateFormat23.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator26 = dateFormat23.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat8._formatRFC1123 = dateFormat23;
        java.util.Locale locale28 = stdDateFormat8._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateTimeInstance((int) '#', (int) (short) 100, locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(calendar6);
// flaky "76) test0377(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar6.toString(), "sun.util.BuddhistCalendar[time=-734418496684,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=43,MILLISECOND=316,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str20, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stdDateFormat1.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator5 = dateFormat2.formatToCharacterIterator((java.lang.Object) 8);
        dateFormat2.setLenient(true);
        java.util.TimeZone timeZone8 = dateFormat2.getTimeZone();
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
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone22);
        java.util.TimeZone timeZone24 = dateFormat23.getTimeZone();
        stdDateFormat15._timezone = timeZone24;
        java.lang.String str27 = stdDateFormat15.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone29 = dateFormat28.getTimeZone();
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone29);
        java.util.TimeZone timeZone31 = dateFormat30.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator33 = dateFormat30.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat15._formatRFC1123 = dateFormat30;
        java.util.Locale locale35 = stdDateFormat15._locale;
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone8, locale35);
        java.lang.Class<?> wildcardClass37 = timeZone8.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator5);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(calendar13);
// flaky "77) test0379(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar13.toString(), "sun.util.BuddhistCalendar[time=-734418496620,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=43,MILLISECOND=380,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str20, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str27, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator33);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5);
        java.util.Locale locale7 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5, locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = stdDateFormat8.parse("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "78) test0380(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418496573,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=43,MILLISECOND=427,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat6);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.lang.String str18 = stdDateFormat6.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20);
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator24 = dateFormat21.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat6._formatRFC1123 = dateFormat21;
        java.util.Locale locale26 = stdDateFormat6._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date28 = stdDateFormat6.parse("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"7 ?????? 00 ???? 00 ?????? ????????????\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "79) test0381(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418496541,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=43,MILLISECOND=459,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str18, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        dateFormat2.setLenient(false);
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = dateFormat2.format((java.lang.Object) 100.0d, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone14 = dateFormat13.getTimeZone();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
        java.util.TimeZone timeZone16 = dateFormat15.getTimeZone();
        stdDateFormat7._timezone = timeZone16;
        java.lang.String str19 = stdDateFormat7.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone21 = dateFormat20.getTimeZone();
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21);
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator25 = dateFormat22.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat7._formatRFC1123 = dateFormat22;
        java.util.Locale locale27 = stdDateFormat7._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance((int) '4', locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "80) test0383(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "sun.util.BuddhistCalendar[time=-734418496486,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=43,MILLISECOND=514,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str19, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.TimeZone timeZone6 = stdDateFormat5.getTimeZone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(5, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
        java.util.TimeZone timeZone6 = dateFormat5.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator8 = dateFormat5.formatToCharacterIterator((java.lang.Object) 8);
        dateFormat5.setLenient(true);
        java.util.TimeZone timeZone11 = dateFormat5.getTimeZone();
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
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone25 = dateFormat24.getTimeZone();
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone25);
        java.util.TimeZone timeZone27 = dateFormat26.getTimeZone();
        stdDateFormat18._timezone = timeZone27;
        java.lang.String str30 = stdDateFormat18.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone32 = dateFormat31.getTimeZone();
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone32);
        java.util.TimeZone timeZone34 = dateFormat33.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator36 = dateFormat33.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat18._formatRFC1123 = dateFormat33;
        java.util.Locale locale38 = stdDateFormat18._locale;
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone11, locale38);
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1, locale38);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateInstance((int) '#', locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator8);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(calendar16);
// flaky "81) test0386(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar16.toString(), "sun.util.BuddhistCalendar[time=-734418496435,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=43,MILLISECOND=565,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str23, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str30, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator36);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat39);
        org.junit.Assert.assertNotNull(dateFormat40);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) 100, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        boolean boolean6 = dateFormat2.isLenient();
        boolean boolean7 = dateFormat2.isLenient();
        java.util.Calendar calendar8 = dateFormat2.getCalendar();
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateFormat2.format(date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(calendar8);
// flaky "82) test0388(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar2 = null;
        dateFormat1.setCalendar(calendar2);
        java.text.NumberFormat numberFormat4 = dateFormat1.getNumberFormat();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        dateFormat5.setLenient(true);
        boolean boolean8 = dateFormat5.isLenient();
        java.util.Calendar calendar9 = dateFormat5.getCalendar();
        dateFormat1.setCalendar(calendar9);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = dateFormat0.format((java.lang.Object) dateFormat1, stringBuffer11, fieldPosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(calendar9);
// flaky "83) test0389(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar9.toString(), "sun.util.BuddhistCalendar[time=-734418496131,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=43,MILLISECOND=869,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.lang.String str18 = stdDateFormat6.format((java.lang.Object) 5);
        java.text.ParsePosition parsePosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = stdDateFormat6.parse("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "84) test0390(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418496065,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=43,MILLISECOND=935,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str18, "1970-01-01T07:00:00.005+0700");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(4, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
        java.util.TimeZone timeZone6 = dateFormat5.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator8 = dateFormat5.formatToCharacterIterator((java.lang.Object) 8);
        dateFormat5.setLenient(true);
        java.util.TimeZone timeZone11 = dateFormat5.getTimeZone();
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
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone25 = dateFormat24.getTimeZone();
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone25);
        java.util.TimeZone timeZone27 = dateFormat26.getTimeZone();
        stdDateFormat18._timezone = timeZone27;
        java.lang.String str30 = stdDateFormat18.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone32 = dateFormat31.getTimeZone();
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone32);
        java.util.TimeZone timeZone34 = dateFormat33.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator36 = dateFormat33.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat18._formatRFC1123 = dateFormat33;
        java.util.Locale locale38 = stdDateFormat18._locale;
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone11, locale38);
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1, locale38);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat41 = java.text.DateFormat.getTimeInstance(16, locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator8);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(calendar16);
// flaky "85) test0392(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar16.toString(), "sun.util.BuddhistCalendar[time=-734418496028,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=43,MILLISECOND=972,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str23, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str30, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator36);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat39);
        org.junit.Assert.assertNotNull(dateFormat40);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getInstance();
        dateFormat21.setLenient(true);
        java.util.TimeZone timeZone24 = dateFormat21.getTimeZone();
        java.util.Locale locale25 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24, locale25);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator27 = dateFormat13.formatToCharacterIterator((java.lang.Object) locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatToCharacterIterator must be passed non-null object");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "86) test0393(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418495996,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=4,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getTimeInstance();
        dateFormat7.setLenient(true);
        boolean boolean10 = dateFormat7.isLenient();
        java.util.Calendar calendar11 = dateFormat7.getCalendar();
        java.util.TimeZone timeZone12 = dateFormat7.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        stdDateFormat13.setNumberFormat(numberFormat16);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone19 = dateFormat18.getTimeZone();
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone19);
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat22);
        boolean boolean24 = dateFormat20.isLenient();
        boolean boolean25 = dateFormat20.isLenient();
        dateFormat20.setLenient(true);
        stdDateFormat13._formatISO8601_z = dateFormat20;
        java.util.Locale locale29 = stdDateFormat13._locale;
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance(3, locale29);
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4, locale29);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateTimeInstance(16, 0, locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(calendar11);
// flaky "87) test0394(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar11.toString(), "sun.util.BuddhistCalendar[time=-734418495944,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=56,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(dateFormat31);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = dateFormat2.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        boolean boolean17 = dateFormat13.isLenient();
        boolean boolean18 = dateFormat13.isLenient();
        dateFormat13.setLenient(true);
        stdDateFormat6._formatISO8601_z = dateFormat13;
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        java.text.NumberFormat numberFormat26 = dateFormat24.getNumberFormat();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        dateFormat27.setLenient(true);
        boolean boolean30 = dateFormat27.isLenient();
        java.util.Calendar calendar31 = dateFormat27.getCalendar();
        java.text.NumberFormat numberFormat32 = dateFormat27.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat32);
        dateFormat22.setNumberFormat(numberFormat32);
        stdDateFormat6._formatRFC1123 = dateFormat22;
        java.text.DateFormat dateFormat36 = stdDateFormat6._formatISO8601_z;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = stdDateFormat6.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "88) test0396(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418495892,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=108,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(calendar31);
// flaky "10) test0396(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar31.toString(), "sun.util.BuddhistCalendar[time=-734418495892,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=108,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNotNull(dateFormat36);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        boolean boolean5 = dateFormat2.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone6 = dateFormat2.getTimeZone();
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone6);
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        java.text.NumberFormat numberFormat10 = dateFormat8.getNumberFormat();
        java.text.NumberFormat numberFormat11 = dateFormat8.getNumberFormat();
        dateFormat7.setNumberFormat(numberFormat11);
        dateFormat0.setNumberFormat(numberFormat11);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 100L);
        dateFormat1.setLenient(true);
        java.text.NumberFormat numberFormat6 = dateFormat1.getNumberFormat();
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat8 = dateFormat7.getNumberFormat();
        boolean boolean10 = dateFormat7.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone11 = dateFormat7.getTimeZone();
        java.util.Locale locale12 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone11, locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateFormat1.format((java.lang.Object) stdDateFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
// flaky "89) test0398(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str3, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat5.parse("1/1/13 07:00", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        dateFormat3.setLenient(false);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = stdDateFormat6.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"hi!\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "90) test0403(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418495788,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=212,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat12);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        java.text.NumberFormat numberFormat4 = dateFormat2.getNumberFormat();
        java.text.NumberFormat numberFormat5 = dateFormat2.getNumberFormat();
        boolean boolean6 = dateFormat0.equals((java.lang.Object) dateFormat2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = dateFormat0.parseObject("1970-01-01T00:00:00.004+0000");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.lang.String str18 = stdDateFormat6.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20);
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator24 = dateFormat21.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat6._formatRFC1123 = dateFormat21;
        java.util.Locale locale26 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat27 = null;
        stdDateFormat6._formatPlain = dateFormat27;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = stdDateFormat6.isLenient();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "91) test0405(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418495763,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=237,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str18, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parse("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        java.util.Locale locale24 = stdDateFormat7._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (short) 100, locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "92) test0407(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "sun.util.BuddhistCalendar[time=-734418495726,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=274,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.util.TimeZone timeZone2 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone5 = dateFormat4.getTimeZone();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5);
        java.util.TimeZone timeZone7 = dateFormat6.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator9 = dateFormat6.formatToCharacterIterator((java.lang.Object) 8);
        dateFormat6.setLenient(true);
        java.util.TimeZone timeZone12 = dateFormat6.getTimeZone();
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
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone26 = dateFormat25.getTimeZone();
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        java.util.TimeZone timeZone28 = dateFormat27.getTimeZone();
        stdDateFormat19._timezone = timeZone28;
        java.lang.String str31 = stdDateFormat19.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone33 = dateFormat32.getTimeZone();
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone33);
        java.util.TimeZone timeZone35 = dateFormat34.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator37 = dateFormat34.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat19._formatRFC1123 = dateFormat34;
        java.util.Locale locale39 = stdDateFormat19._locale;
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12, locale39);
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale39);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateTimeInstance(0, 13, locale39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator9);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "93) test0408(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar17.toString(), "sun.util.BuddhistCalendar[time=-734418495712,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=288,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str24, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str31, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator37);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat40);
        org.junit.Assert.assertNotNull(dateFormat41);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        java.util.Locale locale24 = stdDateFormat7._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (short) 10, locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "94) test0409(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "sun.util.BuddhistCalendar[time=-734418495667,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=333,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        java.text.ParsePosition parsePosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stdDateFormat6.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)", parsePosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "95) test0410(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418495614,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=386,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(numberFormat15);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat0.parseObject("1970-01-01T07:00:00.005+0700", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "96) test0411(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734418496131,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=43,MILLISECOND=869,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.util.TimeZone timeZone2 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone5 = dateFormat4.getTimeZone();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5);
        java.util.TimeZone timeZone7 = dateFormat6.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator9 = dateFormat6.formatToCharacterIterator((java.lang.Object) 8);
        dateFormat6.setLenient(true);
        java.util.TimeZone timeZone12 = dateFormat6.getTimeZone();
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
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone26 = dateFormat25.getTimeZone();
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        java.util.TimeZone timeZone28 = dateFormat27.getTimeZone();
        stdDateFormat19._timezone = timeZone28;
        java.lang.String str31 = stdDateFormat19.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone33 = dateFormat32.getTimeZone();
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone33);
        java.util.TimeZone timeZone35 = dateFormat34.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator37 = dateFormat34.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat19._formatRFC1123 = dateFormat34;
        java.util.Locale locale39 = stdDateFormat19._locale;
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12, locale39);
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale39);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateTimeInstance(14, 12, locale39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator9);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "97) test0412(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar17.toString(), "sun.util.BuddhistCalendar[time=-734418495578,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=422,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str24, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str31, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator37);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat40);
        org.junit.Assert.assertNotNull(dateFormat41);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.lang.String str18 = stdDateFormat6.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20);
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator24 = dateFormat21.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat6._formatRFC1123 = dateFormat21;
        java.util.Locale locale26 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        boolean boolean30 = dateFormat27.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone31 = dateFormat27.getTimeZone();
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone31);
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        java.text.NumberFormat numberFormat35 = dateFormat33.getNumberFormat();
        java.text.NumberFormat numberFormat36 = dateFormat33.getNumberFormat();
        dateFormat32.setNumberFormat(numberFormat36);
        stdDateFormat6._formatISO8601 = dateFormat32;
        java.lang.Class<?> wildcardClass39 = stdDateFormat6.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "98) test0413(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418495550,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=450,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str18, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertNotNull(numberFormat36);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) '#', 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone5 = dateFormat4.getTimeZone();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat8 = dateFormat7.getNumberFormat();
        java.text.NumberFormat numberFormat9 = dateFormat7.getNumberFormat();
        java.text.NumberFormat numberFormat10 = dateFormat7.getNumberFormat();
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        dateFormat7.setNumberFormat(numberFormat12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean15 = dateFormat14.isLenient();
        java.util.Calendar calendar16 = dateFormat14.getCalendar();
        dateFormat7.setCalendar(calendar16);
        dateFormat6.setCalendar(calendar16);
        dateFormat4.setCalendar(calendar16);
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = dateFormat0.format((java.lang.Object) calendar16, stringBuffer20, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(calendar16);
// flaky "99) test0415(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.lang.String str18 = stdDateFormat6.format((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass19 = stdDateFormat6.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "100) test0416(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418495433,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=567,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T07:00:00.010+0700" + "'", str18, "1970-01-01T07:00:00.010+0700");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        boolean boolean6 = dateFormat2.isLenient();
        java.text.NumberFormat numberFormat7 = dateFormat2.getNumberFormat();
        boolean boolean8 = dateFormat2.isLenient();
        boolean boolean9 = dateFormat2.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = dateFormat2.parseObject("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = stdDateFormat6.parse("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"7 ?????? 00 ???? 00 ?????? ????????????\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "101) test0418(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418495360,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=640,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat12);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(14, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.lang.String str18 = stdDateFormat6.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20);
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator24 = dateFormat21.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat6._formatRFC1123 = dateFormat21;
        java.util.Locale locale26 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        boolean boolean30 = dateFormat27.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone31 = dateFormat27.getTimeZone();
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone31);
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        java.text.NumberFormat numberFormat35 = dateFormat33.getNumberFormat();
        java.text.NumberFormat numberFormat36 = dateFormat33.getNumberFormat();
        dateFormat32.setNumberFormat(numberFormat36);
        stdDateFormat6._formatISO8601 = dateFormat32;
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str42 = dateFormat40.format((java.lang.Object) 100L);
        dateFormat40.setLenient(true);
        java.util.Calendar calendar45 = dateFormat40.getCalendar();
        stdDateFormat6._formatPlain = dateFormat40;
        java.util.Date date47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = stdDateFormat6.format(date47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "102) test0420(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418495313,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=687,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str18, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertNotNull(numberFormat36);
        org.junit.Assert.assertNotNull(dateFormat40);
// flaky "11) test0420(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str42, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar45);
        org.junit.Assert.assertEquals(calendar45.toString(), "sun.util.BuddhistCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.util.Date date3 = null;
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = stdDateFormat2.format(date3, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        java.util.Date date14 = null;
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = stdDateFormat6.format(date14, stringBuffer15, fieldPosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "103) test0422(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418495252,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=748,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.lang.String str18 = stdDateFormat6.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20);
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator24 = dateFormat21.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat6._formatRFC1123 = dateFormat21;
        java.util.Locale locale26 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat27 = null;
        stdDateFormat6._formatPlain = dateFormat27;
        java.util.Date date29 = null;
        java.lang.StringBuffer stringBuffer30 = null;
        java.text.FieldPosition fieldPosition31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer32 = stdDateFormat6.format(date29, stringBuffer30, fieldPosition31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "104) test0423(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418495240,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=760,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str18, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat5.parseAsRFC1123("yyyy-MM-dd", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.lang.String str18 = stdDateFormat6.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20);
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator24 = dateFormat21.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat6._formatRFC1123 = dateFormat21;
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance();
        dateFormat26.setLenient(true);
        boolean boolean29 = dateFormat26.isLenient();
        java.util.Calendar calendar30 = dateFormat26.getCalendar();
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getInstance();
        boolean boolean32 = dateFormat26.equals((java.lang.Object) dateFormat31);
        stdDateFormat6._formatPlain = dateFormat26;
        java.text.ParsePosition parsePosition35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date36 = stdDateFormat6.parseAsISO8601("yyyy-MM-dd", parsePosition35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "105) test0425(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418495168,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=832,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str18, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator24);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(calendar30);
// flaky "12) test0425(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar30.toString(), "sun.util.BuddhistCalendar[time=-734418495168,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=832,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Calendar calendar3 = dateFormat1.getCalendar();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone5 = dateFormat4.getTimeZone();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5);
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat8 = dateFormat7.getNumberFormat();
        dateFormat6.setNumberFormat(numberFormat8);
        boolean boolean10 = dateFormat6.isLenient();
        java.text.NumberFormat numberFormat11 = dateFormat6.getNumberFormat();
        java.util.Calendar calendar12 = dateFormat6.getCalendar();
        dateFormat1.setCalendar(calendar12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateFormat1.format((java.lang.Object) numberFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar3);
// flaky "106) test0426(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar3.toString(), "sun.util.BuddhistCalendar[time=-734418495140,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=860,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
// flaky "13) test0426(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(calendar12);
// flaky "3) test0426(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator5 = dateFormat2.formatToCharacterIterator((java.lang.Object) 8);
        dateFormat2.setLenient(true);
        java.text.NumberFormat numberFormat8 = dateFormat2.getNumberFormat();
        dateFormat2.setLenient(true);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator5);
        org.junit.Assert.assertNotNull(numberFormat8);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat5.parse("1/1/13 07:00");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        boolean boolean17 = dateFormat13.isLenient();
        boolean boolean18 = dateFormat13.isLenient();
        dateFormat13.setLenient(true);
        stdDateFormat6._formatISO8601_z = dateFormat13;
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        java.text.NumberFormat numberFormat26 = dateFormat24.getNumberFormat();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        dateFormat27.setLenient(true);
        boolean boolean30 = dateFormat27.isLenient();
        java.util.Calendar calendar31 = dateFormat27.getCalendar();
        java.text.NumberFormat numberFormat32 = dateFormat27.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat32);
        dateFormat22.setNumberFormat(numberFormat32);
        stdDateFormat6._formatRFC1123 = dateFormat22;
        java.text.DateFormat dateFormat36 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat37 = stdDateFormat6._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "107) test0429(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418495020,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=980,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
// flaky "14) test0429(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "4) test0429(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(calendar31);
// flaky "1) test0429(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar31.toString(), "sun.util.BuddhistCalendar[time=-734418495020,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=44,MILLISECOND=980,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNull(dateFormat37);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.lang.String str18 = stdDateFormat6.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20);
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator24 = dateFormat21.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat6._formatRFC1123 = dateFormat21;
        java.util.Locale locale26 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        boolean boolean30 = dateFormat27.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone31 = dateFormat27.getTimeZone();
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone31);
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        java.text.NumberFormat numberFormat35 = dateFormat33.getNumberFormat();
        java.text.NumberFormat numberFormat36 = dateFormat33.getNumberFormat();
        dateFormat32.setNumberFormat(numberFormat36);
        stdDateFormat6._formatISO8601 = dateFormat32;
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str42 = dateFormat40.format((java.lang.Object) 100L);
        dateFormat40.setLenient(true);
        java.util.Calendar calendar45 = dateFormat40.getCalendar();
        stdDateFormat6._formatPlain = dateFormat40;
        java.text.ParsePosition parsePosition48 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date49 = stdDateFormat6.parseAsRFC1123("", parsePosition48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "108) test0430(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418494997,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=3,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str18, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertNotNull(numberFormat36);
        org.junit.Assert.assertNotNull(dateFormat40);
// flaky "15) test0430(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str42, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar45);
        org.junit.Assert.assertEquals(calendar45.toString(), "sun.util.BuddhistCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        java.text.ParsePosition parsePosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date24 = stdDateFormat6.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "109) test0431(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418494966,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=34,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dateFormat21);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.util.TimeZone timeZone1 = null;
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        dateFormat3.setLenient(true);
        boolean boolean6 = dateFormat3.isLenient();
        java.util.Calendar calendar7 = dateFormat3.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat3.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        stdDateFormat9.setNumberFormat(numberFormat12);
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15);
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        boolean boolean20 = dateFormat16.isLenient();
        boolean boolean21 = dateFormat16.isLenient();
        dateFormat16.setLenient(true);
        stdDateFormat9._formatISO8601_z = dateFormat16;
        java.util.Locale locale25 = stdDateFormat9._locale;
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance(3, locale25);
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale25);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance((int) (byte) 10, locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(calendar7);
// flaky "110) test0433(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar7.toString(), "sun.util.BuddhistCalendar[time=-734418494942,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=58,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
// flaky "16) test0433(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "5) test0433(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        java.text.ParsePosition parsePosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = stdDateFormat6.parseAsISO8601("yyyy-MM-dd", parsePosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "111) test0434(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418494929,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=71,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNull(dateFormat16);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        boolean boolean17 = dateFormat13.isLenient();
        boolean boolean18 = dateFormat13.isLenient();
        dateFormat13.setLenient(true);
        stdDateFormat6._formatISO8601_z = dateFormat13;
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        java.text.NumberFormat numberFormat26 = dateFormat24.getNumberFormat();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        dateFormat27.setLenient(true);
        boolean boolean30 = dateFormat27.isLenient();
        java.util.Calendar calendar31 = dateFormat27.getCalendar();
        java.text.NumberFormat numberFormat32 = dateFormat27.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat32);
        dateFormat22.setNumberFormat(numberFormat32);
        stdDateFormat6._formatRFC1123 = dateFormat22;
        java.util.Date date36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = dateFormat22.format(date36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "112) test0435(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418494916,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=84,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
// flaky "17) test0435(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "6) test0435(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(calendar31);
// flaky "2) test0435(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar31.toString(), "sun.util.BuddhistCalendar[time=-734418494915,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=85,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat32);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = dateFormat0.parseObject("1970-01-01T07:00:00.010+0700", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "113) test0436(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418494868,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=132,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        boolean boolean3 = dateFormat0.equals((java.lang.Object) 2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean5 = dateFormat4.isLenient();
        java.util.Calendar calendar6 = dateFormat4.getCalendar();
        dateFormat0.setCalendar(calendar6);
        java.util.Calendar calendar8 = dateFormat0.getCalendar();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = dateFormat0.parseObject("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateFormat4);
// flaky "114) test0437(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(calendar6);
// flaky "18) test0437(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar8);
// flaky "7) test0437(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        boolean boolean4 = dateFormat1.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone5 = dateFormat1.getTimeZone();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone5);
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
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone21 = dateFormat20.getTimeZone();
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21);
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        stdDateFormat14._timezone = timeZone23;
        java.lang.String str26 = stdDateFormat14.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone28 = dateFormat27.getTimeZone();
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone28);
        java.util.TimeZone timeZone30 = dateFormat29.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator32 = dateFormat29.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat14._formatRFC1123 = dateFormat29;
        java.util.Locale locale34 = stdDateFormat14._locale;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getTimeInstance(1, locale34);
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5, locale34);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat37 = java.text.DateFormat.getTimeInstance((int) (short) 10, locale34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(calendar12);
// flaky "115) test0438(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar12.toString(), "sun.util.BuddhistCalendar[time=-734418494834,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=166,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str19, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str26, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator32);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertNotNull(dateFormat36);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = stdDateFormat6.parseAsRFC1123("1/1/13 07:00", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "116) test0439(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418494818,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=182,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone7 = dateFormat6.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = stdDateFormat4.format((java.lang.Object) timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = stdDateFormat6.parseAsRFC1123("1970-01-01T00:00:00.004+0000", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "117) test0441(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418494796,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=204,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat12);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        java.text.DateFormat dateFormat18 = stdDateFormat6._formatPlain;
        java.text.ParsePosition parsePosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = stdDateFormat6.parseAsISO8601("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", parsePosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "118) test0442(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418494766,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=234,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(dateFormat18);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        boolean boolean17 = dateFormat13.isLenient();
        boolean boolean18 = dateFormat13.isLenient();
        dateFormat13.setLenient(true);
        stdDateFormat6._formatISO8601_z = dateFormat13;
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        java.text.NumberFormat numberFormat26 = dateFormat24.getNumberFormat();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        dateFormat27.setLenient(true);
        boolean boolean30 = dateFormat27.isLenient();
        java.util.Calendar calendar31 = dateFormat27.getCalendar();
        java.text.NumberFormat numberFormat32 = dateFormat27.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat32);
        dateFormat22.setNumberFormat(numberFormat32);
        stdDateFormat6._formatRFC1123 = dateFormat22;
        java.text.DateFormat dateFormat36 = stdDateFormat6._formatISO8601_z;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date38 = stdDateFormat6.parse("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "119) test0443(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418494722,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=278,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
// flaky "19) test0443(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "8) test0443(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(calendar31);
// flaky "3) test0443(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar31.toString(), "sun.util.BuddhistCalendar[time=-734418494722,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=278,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNotNull(dateFormat36);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance();
        dateFormat1.setLenient(true);
        boolean boolean4 = dateFormat1.isLenient();
        java.util.Calendar calendar5 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone6 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        stdDateFormat7.setNumberFormat(numberFormat10);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat16);
        boolean boolean18 = dateFormat14.isLenient();
        boolean boolean19 = dateFormat14.isLenient();
        dateFormat14.setLenient(true);
        stdDateFormat7._formatISO8601_z = dateFormat14;
        java.util.Locale locale23 = stdDateFormat7._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance(16, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "120) test0444(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "sun.util.BuddhistCalendar[time=-734418494709,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=291,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
// flaky "20) test0444(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "9) test0444(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = stdDateFormat6.parseAsISO8601("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", parsePosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "121) test0445(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418494687,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=313,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNull(dateFormat14);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone16 = dateFormat15.getTimeZone();
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone16);
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        java.lang.Class<?> wildcardClass21 = numberFormat19.getClass();
        java.lang.StringBuffer stringBuffer22 = null;
        java.text.FieldPosition fieldPosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = stdDateFormat6.format((java.lang.Object) numberFormat19, stringBuffer22, fieldPosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "122) test0446(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418494672,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=328,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        boolean boolean3 = dateFormat0.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone4);
        java.lang.Class<?> wildcardClass6 = timeZone4.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = stdDateFormat6.parseAsISO8601("1/1/13 07:00", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "123) test0448(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418494605,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=395,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = dateFormat2.getClass();
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        java.text.ParsePosition parsePosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date20 = stdDateFormat6.parseAsRFC1123("yyyy-MM-dd", parsePosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "124) test0451(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418494480,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=520,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat17);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone14 = dateFormat13.getTimeZone();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
        java.util.TimeZone timeZone16 = dateFormat15.getTimeZone();
        stdDateFormat7._timezone = timeZone16;
        java.lang.String str19 = stdDateFormat7.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone21 = dateFormat20.getTimeZone();
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21);
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator25 = dateFormat22.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat7._formatRFC1123 = dateFormat22;
        java.util.Locale locale27 = stdDateFormat7._locale;
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance(3, locale27);
        java.util.TimeZone timeZone29 = dateFormat28.getTimeZone();
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "125) test0452(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "sun.util.BuddhistCalendar[time=-734418494442,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=558,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str19, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str5 = dateFormat3.format((java.lang.Object) 100L);
        java.util.TimeZone timeZone6 = dateFormat3.getTimeZone();
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone6);
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
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone22);
        java.util.TimeZone timeZone24 = dateFormat23.getTimeZone();
        stdDateFormat15._timezone = timeZone24;
        java.lang.String str27 = stdDateFormat15.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone29 = dateFormat28.getTimeZone();
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone29);
        java.util.TimeZone timeZone31 = dateFormat30.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator33 = dateFormat30.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat15._formatRFC1123 = dateFormat30;
        java.util.Locale locale35 = stdDateFormat15._locale;
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getTimeInstance(1, locale35);
        java.text.DateFormat dateFormat37 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone6, locale35);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateTimeInstance(4, (int) (short) 10, locale35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
// flaky "126) test0453(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str5, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(calendar13);
// flaky "21) test0453(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar13.toString(), "sun.util.BuddhistCalendar[time=-734418494426,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=574,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str20, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str27, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator33);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(dateFormat37);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        boolean boolean17 = dateFormat13.isLenient();
        boolean boolean18 = dateFormat13.isLenient();
        dateFormat13.setLenient(true);
        stdDateFormat6._formatISO8601_z = dateFormat13;
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        java.text.NumberFormat numberFormat26 = dateFormat24.getNumberFormat();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        dateFormat27.setLenient(true);
        boolean boolean30 = dateFormat27.isLenient();
        java.util.Calendar calendar31 = dateFormat27.getCalendar();
        java.text.NumberFormat numberFormat32 = dateFormat27.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat32);
        dateFormat22.setNumberFormat(numberFormat32);
        stdDateFormat6._formatRFC1123 = dateFormat22;
        java.text.DateFormat dateFormat36 = stdDateFormat6._formatISO8601_z;
        boolean boolean38 = stdDateFormat6.looksLikeISO8601("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = stdDateFormat6.parseObject("1/1/13 07:00");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "127) test0454(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418494396,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=604,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
// flaky "22) test0454(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "10) test0454(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(calendar31);
// flaky "4) test0454(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar31.toString(), "sun.util.BuddhistCalendar[time=-734418494396,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=604,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str5 = dateFormat3.format((java.lang.Object) 100L);
        java.util.TimeZone timeZone6 = dateFormat3.getTimeZone();
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone6);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = numberFormat1.formatToCharacterIterator((java.lang.Object) timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(dateFormat3);
// flaky "128) test0455(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str5, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat7);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat2.setLenient(false);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone7 = dateFormat6.getTimeZone();
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone7);
        java.util.TimeZone timeZone9 = dateFormat8.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator11 = dateFormat8.formatToCharacterIterator((java.lang.Object) 8);
        dateFormat8.setLenient(true);
        java.util.TimeZone timeZone14 = dateFormat8.getTimeZone();
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
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone28 = dateFormat27.getTimeZone();
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone28);
        java.util.TimeZone timeZone30 = dateFormat29.getTimeZone();
        stdDateFormat21._timezone = timeZone30;
        java.lang.String str33 = stdDateFormat21.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone35 = dateFormat34.getTimeZone();
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone35);
        java.util.TimeZone timeZone37 = dateFormat36.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator39 = dateFormat36.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat21._formatRFC1123 = dateFormat36;
        java.util.Locale locale41 = stdDateFormat21._locale;
        java.text.DateFormat dateFormat42 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14, locale41);
        boolean boolean43 = dateFormat2.equals((java.lang.Object) locale41);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat44 = java.text.DateFormat.getDateTimeInstance(11, (int) (byte) 10, locale41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator11);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(calendar19);
// flaky "129) test0456(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar19.toString(), "sun.util.BuddhistCalendar[time=-734418494351,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=649,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str26, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str33, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator39);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean1 = dateFormat0.isLenient();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        boolean boolean4 = dateFormat0.equals((java.lang.Object) 1.0f);
        java.util.Calendar calendar5 = dateFormat0.getCalendar();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = dateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "130) test0457(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "23) test0457(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        dateFormat0.setLenient(true);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        java.text.NumberFormat numberFormat7 = dateFormat5.getNumberFormat();
        java.text.NumberFormat numberFormat8 = dateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean13 = dateFormat12.isLenient();
        java.util.Calendar calendar14 = dateFormat12.getCalendar();
        dateFormat5.setCalendar(calendar14);
        dateFormat4.setCalendar(calendar14);
        dateFormat0.setCalendar(calendar14);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        dateFormat18.setLenient(true);
        boolean boolean21 = dateFormat18.isLenient();
        java.util.Calendar calendar22 = dateFormat18.getCalendar();
        java.util.TimeZone timeZone23 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        stdDateFormat24.setNumberFormat(numberFormat27);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone30 = dateFormat29.getTimeZone();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone30);
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        dateFormat31.setNumberFormat(numberFormat33);
        boolean boolean35 = dateFormat31.isLenient();
        boolean boolean36 = dateFormat31.isLenient();
        dateFormat31.setLenient(true);
        stdDateFormat24._formatISO8601_z = dateFormat31;
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.util.TimeZone timeZone41 = dateFormat40.getTimeZone();
        java.text.DateFormat dateFormat42 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat43 = dateFormat42.getNumberFormat();
        java.text.NumberFormat numberFormat44 = dateFormat42.getNumberFormat();
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getTimeInstance();
        dateFormat45.setLenient(true);
        boolean boolean48 = dateFormat45.isLenient();
        java.util.Calendar calendar49 = dateFormat45.getCalendar();
        java.text.NumberFormat numberFormat50 = dateFormat45.getNumberFormat();
        dateFormat42.setNumberFormat(numberFormat50);
        dateFormat40.setNumberFormat(numberFormat50);
        stdDateFormat24._formatRFC1123 = dateFormat40;
        java.text.DateFormat dateFormat54 = stdDateFormat24._formatISO8601_z;
        java.text.DateFormat dateFormat55 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat56 = dateFormat55.getNumberFormat();
        boolean boolean58 = dateFormat55.equals((java.lang.Object) 2);
        java.text.DateFormat dateFormat59 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean60 = dateFormat59.isLenient();
        java.util.Calendar calendar61 = dateFormat59.getCalendar();
        dateFormat55.setCalendar(calendar61);
        java.util.Calendar calendar63 = dateFormat55.getCalendar();
        dateFormat54.setCalendar(calendar63);
        dateFormat0.setCalendar(calendar63);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(calendar14);
// flaky "131) test0459(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(calendar22);
// flaky "24) test0459(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=-734418494262,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=738,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(numberFormat27);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(numberFormat33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat42);
        org.junit.Assert.assertNotNull(numberFormat43);
        org.junit.Assert.assertNotNull(numberFormat44);
        org.junit.Assert.assertNotNull(dateFormat45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(calendar49);
// flaky "11) test0459(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar49.toString(), "sun.util.BuddhistCalendar[time=-734418494262,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=738,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat50);
        org.junit.Assert.assertNotNull(dateFormat54);
        org.junit.Assert.assertNotNull(dateFormat55);
        org.junit.Assert.assertNotNull(numberFormat56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(dateFormat59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(calendar61);
// flaky "5) test0459(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar61.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar63);
// flaky "1) test0459(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar63.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        boolean boolean17 = dateFormat13.isLenient();
        boolean boolean18 = dateFormat13.isLenient();
        dateFormat13.setLenient(true);
        stdDateFormat6._formatISO8601_z = dateFormat13;
        java.util.Locale locale22 = stdDateFormat6._locale;
        java.util.TimeZone timeZone23 = stdDateFormat6._timezone;
        java.text.ParsePosition parsePosition25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date26 = stdDateFormat6.parse("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", parsePosition25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "132) test0460(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418494213,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=787,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        java.text.ParsePosition parsePosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = stdDateFormat6.parseAsRFC1123("1970-01-01T07:00:00.010+0700", parsePosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "133) test0461(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418494096,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=45,MILLISECOND=904,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(numberFormat15);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        java.text.NumberFormat numberFormat3 = dateFormat1.getNumberFormat();
        java.text.NumberFormat numberFormat4 = dateFormat1.getNumberFormat();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat6);
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean9 = dateFormat8.isLenient();
        java.util.Calendar calendar10 = dateFormat8.getCalendar();
        dateFormat1.setCalendar(calendar10);
        dateFormat0.setCalendar(calendar10);
        java.util.Date date13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateFormat0.format(date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(dateFormat8);
// flaky "134) test0462(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(calendar10);
// flaky "25) test0462(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.AttributedCharacterIterator attributedCharacterIterator18 = dateFormat16.formatToCharacterIterator((java.lang.Object) 10);
        stdDateFormat6._formatPlain = dateFormat16;
        java.text.ParsePosition parsePosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = stdDateFormat6.parseAsISO8601("1970-01-01T07:00:00.005+0700", parsePosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "135) test0463(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418493988,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=12,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(attributedCharacterIterator18);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = stdDateFormat6.parseAsRFC1123("1970-01-01T07:00:00.005+0700", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "136) test0464(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418493974,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=26,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.NumberFormat numberFormat2 = dateFormat0.getNumberFormat();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat5);
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean8 = dateFormat7.isLenient();
        java.util.Calendar calendar9 = dateFormat7.getCalendar();
        dateFormat0.setCalendar(calendar9);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15);
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        dateFormat20.setLenient(true);
        boolean boolean23 = dateFormat20.isLenient();
        java.util.Calendar calendar24 = dateFormat20.getCalendar();
        dateFormat16.setCalendar(calendar24);
        dateFormat12.setCalendar(calendar24);
        dateFormat0.setCalendar(calendar24);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(dateFormat7);
// flaky "137) test0465(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(calendar9);
// flaky "26) test0465(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(calendar24);
// flaky "12) test0465(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar24.toString(), "sun.util.BuddhistCalendar[time=-734418493951,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=49,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        boolean boolean3 = dateFormat0.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone4);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = dateFormat6.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar1 = null;
        dateFormat0.setCalendar(calendar1);
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar5 = null;
        dateFormat4.setCalendar(calendar5);
        java.text.NumberFormat numberFormat7 = dateFormat4.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = dateFormat0.formatToCharacterIterator((java.lang.Object) numberFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat7);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(false);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone5 = dateFormat4.getTimeZone();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5);
        java.util.TimeZone timeZone7 = dateFormat6.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator9 = dateFormat6.formatToCharacterIterator((java.lang.Object) 8);
        dateFormat6.setLenient(true);
        java.util.TimeZone timeZone12 = dateFormat6.getTimeZone();
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
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone26 = dateFormat25.getTimeZone();
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        java.util.TimeZone timeZone28 = dateFormat27.getTimeZone();
        stdDateFormat19._timezone = timeZone28;
        java.lang.String str31 = stdDateFormat19.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone33 = dateFormat32.getTimeZone();
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone33);
        java.util.TimeZone timeZone35 = dateFormat34.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator37 = dateFormat34.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat19._formatRFC1123 = dateFormat34;
        java.util.Locale locale39 = stdDateFormat19._locale;
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12, locale39);
        boolean boolean41 = dateFormat0.equals((java.lang.Object) locale39);
        java.lang.Class<?> wildcardClass42 = dateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator9);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "138) test0469(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar17.toString(), "sun.util.BuddhistCalendar[time=-734418493826,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=174,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str24, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str31, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator37);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getTimeInstance();
        dateFormat7.setLenient(true);
        boolean boolean10 = dateFormat7.isLenient();
        java.util.Calendar calendar11 = dateFormat7.getCalendar();
        java.util.TimeZone timeZone12 = dateFormat7.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        stdDateFormat13.setNumberFormat(numberFormat16);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone19 = dateFormat18.getTimeZone();
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone19);
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat22);
        boolean boolean24 = dateFormat20.isLenient();
        boolean boolean25 = dateFormat20.isLenient();
        dateFormat20.setLenient(true);
        stdDateFormat13._formatISO8601_z = dateFormat20;
        java.util.Locale locale29 = stdDateFormat13._locale;
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance(3, locale29);
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4, locale29);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateTimeInstance(5, 8, locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(calendar11);
// flaky "139) test0470(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar11.toString(), "sun.util.BuddhistCalendar[time=-734418493803,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=197,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
// flaky "27) test0470(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky "13) test0470(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(dateFormat31);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        java.text.NumberFormat numberFormat19 = dateFormat17.getNumberFormat();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        dateFormat20.setLenient(true);
        boolean boolean23 = dateFormat20.isLenient();
        java.util.Calendar calendar24 = dateFormat20.getCalendar();
        java.text.NumberFormat numberFormat25 = dateFormat20.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat25);
        stdDateFormat6.setNumberFormat(numberFormat25);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar29 = null;
        dateFormat28.setCalendar(calendar29);
        java.text.NumberFormat numberFormat31 = dateFormat28.getNumberFormat();
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getTimeInstance();
        dateFormat32.setLenient(true);
        boolean boolean35 = dateFormat32.isLenient();
        java.util.Calendar calendar36 = dateFormat32.getCalendar();
        dateFormat28.setCalendar(calendar36);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator38 = stdDateFormat6.formatToCharacterIterator((java.lang.Object) calendar36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "140) test0471(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418493789,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=211,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(calendar24);
// flaky "28) test0471(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar24.toString(), "sun.util.BuddhistCalendar[time=-734418493789,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=211,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(numberFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(calendar36);
// flaky "14) test0471(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar36.toString(), "sun.util.BuddhistCalendar[time=-734418493789,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=211,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = dateFormat11.format((java.lang.Object) dateFormat13, stringBuffer15, fieldPosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "141) test0472(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418493752,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=248,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(numberFormat14);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        java.util.TimeZone timeZone22 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone22);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone25 = dateFormat24.getTimeZone();
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone25);
        java.util.TimeZone timeZone27 = dateFormat26.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator29 = dateFormat26.formatToCharacterIterator((java.lang.Object) 8);
        dateFormat26.setLenient(true);
        java.util.TimeZone timeZone32 = dateFormat26.getTimeZone();
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
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone46 = dateFormat45.getTimeZone();
        java.text.DateFormat dateFormat47 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone46);
        java.util.TimeZone timeZone48 = dateFormat47.getTimeZone();
        stdDateFormat39._timezone = timeZone48;
        java.lang.String str51 = stdDateFormat39.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat52 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone53 = dateFormat52.getTimeZone();
        java.text.DateFormat dateFormat54 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone53);
        java.util.TimeZone timeZone55 = dateFormat54.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator57 = dateFormat54.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat39._formatRFC1123 = dateFormat54;
        java.util.Locale locale59 = stdDateFormat39._locale;
        java.text.DateFormat dateFormat60 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone32, locale59);
        java.text.DateFormat dateFormat61 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone22, locale59);
        java.text.DateFormat dateFormat62 = java.text.DateFormat.getDateInstance((int) (short) 0, locale59);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str63 = stdDateFormat6.format((java.lang.Object) locale59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "142) test0473(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418493741,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=259,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator29);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(calendar37);
// flaky "29) test0473(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar37.toString(), "sun.util.BuddhistCalendar[time=-734418493740,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=260,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat41);
        org.junit.Assert.assertNotNull(numberFormat42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str44, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat45);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat47);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str51, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat52);
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat54);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator57);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat60);
        org.junit.Assert.assertNotNull(dateFormat61);
        org.junit.Assert.assertNotNull(dateFormat62);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.lang.String str18 = stdDateFormat6.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20);
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator24 = dateFormat21.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat6._formatRFC1123 = dateFormat21;
        java.util.TimeZone timeZone26 = stdDateFormat6._timezone;
        java.text.ParsePosition parsePosition28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = stdDateFormat6.parseObject("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", parsePosition28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "143) test0474(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418493710,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=290,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str18, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator24);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getInstance();
        boolean boolean3 = dateFormat2.isLenient();
        java.lang.Class<?> wildcardClass4 = dateFormat2.getClass();
        boolean boolean5 = dateFormat0.equals((java.lang.Object) wildcardClass4);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        java.util.Calendar calendar8 = dateFormat6.getCalendar();
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        java.text.NumberFormat numberFormat11 = dateFormat9.getNumberFormat();
        java.text.NumberFormat numberFormat12 = dateFormat9.getNumberFormat();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        dateFormat9.setNumberFormat(numberFormat14);
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean17 = dateFormat16.isLenient();
        java.util.Calendar calendar18 = dateFormat16.getCalendar();
        dateFormat9.setCalendar(calendar18);
        dateFormat6.setCalendar(calendar18);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator21 = dateFormat0.formatToCharacterIterator((java.lang.Object) calendar18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(calendar8);
// flaky "144) test0475(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertNotNull(dateFormat16);
// flaky "30) test0475(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(calendar18);
// flaky "15) test0475(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        boolean boolean17 = dateFormat13.isLenient();
        boolean boolean18 = dateFormat13.isLenient();
        dateFormat13.setLenient(true);
        stdDateFormat6._formatISO8601_z = dateFormat13;
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        java.text.NumberFormat numberFormat26 = dateFormat24.getNumberFormat();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        dateFormat27.setLenient(true);
        boolean boolean30 = dateFormat27.isLenient();
        java.util.Calendar calendar31 = dateFormat27.getCalendar();
        java.text.NumberFormat numberFormat32 = dateFormat27.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat32);
        dateFormat22.setNumberFormat(numberFormat32);
        stdDateFormat6._formatRFC1123 = dateFormat22;
        java.text.DateFormat dateFormat36 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat37 = stdDateFormat6._formatISO8601;
        java.text.ParsePosition parsePosition39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date40 = stdDateFormat6.parse("1970-01-01T00:00:00.004+0000", parsePosition39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "145) test0476(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418493670,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=330,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
// flaky "31) test0476(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "16) test0476(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(calendar31);
// flaky "6) test0476(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar31.toString(), "sun.util.BuddhistCalendar[time=-734418493670,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=330,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNull(dateFormat37);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(14, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = stdDateFormat6.parse("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "146) test0478(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418493646,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=354,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = stdDateFormat6.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "147) test0479(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418493634,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=366,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat12);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
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
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone19 = dateFormat18.getTimeZone();
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone19);
        java.util.TimeZone timeZone21 = dateFormat20.getTimeZone();
        stdDateFormat12._timezone = timeZone21;
        java.lang.String str24 = stdDateFormat12.format((java.lang.Object) 5);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone26 = dateFormat25.getTimeZone();
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        java.util.TimeZone timeZone28 = dateFormat27.getTimeZone();
        java.text.AttributedCharacterIterator attributedCharacterIterator30 = dateFormat27.formatToCharacterIterator((java.lang.Object) 8);
        stdDateFormat12._formatRFC1123 = dateFormat27;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator32 = numberFormat4.formatToCharacterIterator((java.lang.Object) stdDateFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(calendar10);
// flaky "148) test0480(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar10.toString(), "sun.util.BuddhistCalendar[time=-734418493623,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=377,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str17, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01T07:00:00.005+0700" + "'", str24, "1970-01-01T07:00:00.005+0700");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(attributedCharacterIterator30);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = stdDateFormat6.parseAsRFC1123("", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "149) test0481(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418493608,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=392,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNull(dateFormat13);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.Class<?> wildcardClass1 = dateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.AttributedCharacterIterator attributedCharacterIterator18 = dateFormat16.formatToCharacterIterator((java.lang.Object) 10);
        stdDateFormat6._formatPlain = dateFormat16;
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        boolean boolean23 = dateFormat20.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone24 = dateFormat20.getTimeZone();
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone24);
        stdDateFormat6.setTimeZone(timeZone24);
        java.util.Locale locale27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone24, locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "150) test0484(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418493492,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=508,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(attributedCharacterIterator18);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat25);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        boolean boolean2 = dateFormat1.isLenient();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone6 = dateFormat5.getTimeZone();
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone6);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getTimeInstance();
        dateFormat9.setLenient(true);
        boolean boolean12 = dateFormat9.isLenient();
        java.util.Calendar calendar13 = dateFormat9.getCalendar();
        java.util.TimeZone timeZone14 = dateFormat9.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        stdDateFormat15.setNumberFormat(numberFormat18);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone21 = dateFormat20.getTimeZone();
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21);
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat24);
        boolean boolean26 = dateFormat22.isLenient();
        boolean boolean27 = dateFormat22.isLenient();
        dateFormat22.setLenient(true);
        stdDateFormat15._formatISO8601_z = dateFormat22;
        java.util.Locale locale31 = stdDateFormat15._locale;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getTimeInstance(3, locale31);
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone6, locale31);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3, locale31);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat35 = java.text.DateFormat.getTimeInstance((int) '4', locale31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(calendar13);
// flaky "151) test0485(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar13.toString(), "sun.util.BuddhistCalendar[time=-734418493480,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=520,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(numberFormat24);
// flaky "32) test0485(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
// flaky "17) test0485(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(dateFormat34);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        boolean boolean17 = dateFormat13.isLenient();
        boolean boolean18 = dateFormat13.isLenient();
        dateFormat13.setLenient(true);
        stdDateFormat6._formatISO8601_z = dateFormat13;
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        java.text.NumberFormat numberFormat26 = dateFormat24.getNumberFormat();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        dateFormat27.setLenient(true);
        boolean boolean30 = dateFormat27.isLenient();
        java.util.Calendar calendar31 = dateFormat27.getCalendar();
        java.text.NumberFormat numberFormat32 = dateFormat27.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat32);
        dateFormat22.setNumberFormat(numberFormat32);
        stdDateFormat6._formatRFC1123 = dateFormat22;
        java.text.DateFormat dateFormat36 = stdDateFormat6._formatISO8601_z;
        java.text.ParsePosition parsePosition38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date39 = stdDateFormat6.parseAsRFC1123("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", parsePosition38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "152) test0486(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418493434,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=566,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
// flaky "33) test0486(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "18) test0486(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(calendar31);
// flaky "7) test0486(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar31.toString(), "sun.util.BuddhistCalendar[time=-734418493434,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=566,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNotNull(dateFormat36);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        java.text.NumberFormat numberFormat3 = dateFormat1.getNumberFormat();
        java.text.NumberFormat numberFormat4 = dateFormat1.getNumberFormat();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat6);
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean9 = dateFormat8.isLenient();
        java.util.Calendar calendar10 = dateFormat8.getCalendar();
        dateFormat1.setCalendar(calendar10);
        dateFormat0.setCalendar(calendar10);
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = dateFormat0.parseObject("yyyy-MM-dd", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(dateFormat8);
// flaky "153) test0488(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(calendar10);
// flaky "34) test0488(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.AttributedCharacterIterator attributedCharacterIterator18 = dateFormat16.formatToCharacterIterator((java.lang.Object) 10);
        stdDateFormat6._formatPlain = dateFormat16;
        java.text.DateFormat dateFormat20 = stdDateFormat6._formatISO8601_z;
        java.lang.String str21 = stdDateFormat6.toString();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "154) test0489(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418493260,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=740,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(attributedCharacterIterator18);
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str21, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 100L);
        java.util.TimeZone timeZone4 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat5.parseAsISO8601("1970-01-01T07:00:00.010+0700", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
// flaky "155) test0490(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str3, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance();
        dateFormat6.setLenient(true);
        boolean boolean9 = dateFormat6.isLenient();
        java.util.Calendar calendar10 = dateFormat6.getCalendar();
        java.util.TimeZone timeZone11 = dateFormat6.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone11);
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        stdDateFormat12.setNumberFormat(numberFormat15);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone18 = dateFormat17.getTimeZone();
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        boolean boolean23 = dateFormat19.isLenient();
        boolean boolean24 = dateFormat19.isLenient();
        dateFormat19.setLenient(true);
        stdDateFormat12._formatISO8601_z = dateFormat19;
        java.util.Locale locale28 = stdDateFormat12._locale;
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance(3, locale28);
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3, locale28);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance(15, locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(calendar10);
// flaky "156) test0491(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar10.toString(), "sun.util.BuddhistCalendar[time=-734418493219,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=781,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(numberFormat21);
// flaky "35) test0491(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky "19) test0491(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(dateFormat30);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        boolean boolean17 = dateFormat13.isLenient();
        boolean boolean18 = dateFormat13.isLenient();
        dateFormat13.setLenient(true);
        stdDateFormat6._formatISO8601_z = dateFormat13;
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        java.text.NumberFormat numberFormat26 = dateFormat24.getNumberFormat();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        dateFormat27.setLenient(true);
        boolean boolean30 = dateFormat27.isLenient();
        java.util.Calendar calendar31 = dateFormat27.getCalendar();
        java.text.NumberFormat numberFormat32 = dateFormat27.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat32);
        dateFormat22.setNumberFormat(numberFormat32);
        stdDateFormat6._formatRFC1123 = dateFormat22;
        java.lang.String str36 = stdDateFormat6.toString();
        java.lang.Object obj38 = stdDateFormat6.parseObject("1970-01-01T00:00:00.004+0000");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date40 = stdDateFormat6.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "157) test0492(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418493181,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=819,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
// flaky "36) test0492(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "20) test0492(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(calendar31);
// flaky "8) test0492(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar31.toString(), "sun.util.BuddhistCalendar[time=-734418493181,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=819,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str36, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15);
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        boolean boolean20 = dateFormat16.isLenient();
        java.text.NumberFormat numberFormat21 = dateFormat16.getNumberFormat();
        boolean boolean22 = dateFormat16.isLenient();
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        boolean boolean26 = dateFormat23.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone27 = dateFormat23.getTimeZone();
        java.util.Calendar calendar28 = dateFormat23.getCalendar();
        dateFormat16.setCalendar(calendar28);
        // The following exception was thrown during execution in test generation
        try {
            dateFormat13.setCalendar(calendar28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "158) test0493(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418493153,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=847,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
// flaky "37) test0493(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(numberFormat21);
// flaky "21) test0493(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(calendar28);
// flaky "9) test0493(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.lang.String str11 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        stdDateFormat6._timezone = timeZone15;
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601;
        java.lang.String str18 = stdDateFormat6.toString();
        java.text.ParsePosition parsePosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = stdDateFormat6.parse("1970-01-01T07:00:00.010+0700", parsePosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "159) test0494(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418493140,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=860,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str18, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        java.text.ParsePosition parsePosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = stdDateFormat6.parseAsISO8601("", parsePosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "160) test0495(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418493099,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=901,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.Date date1 = null;
        java.lang.StringBuffer stringBuffer2 = null;
        java.text.FieldPosition fieldPosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer4 = stdDateFormat0.format(date1, stringBuffer2, fieldPosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
        java.util.Date date23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = stdDateFormat6.format(date23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "161) test0497(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418493072,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=928,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(true);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        boolean boolean17 = dateFormat13.isLenient();
        boolean boolean18 = dateFormat13.isLenient();
        dateFormat13.setLenient(true);
        stdDateFormat6._formatISO8601_z = dateFormat13;
        java.util.Locale locale22 = stdDateFormat6._locale;
        java.util.TimeZone timeZone23 = stdDateFormat6._timezone;
        java.text.ParsePosition parsePosition25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date26 = stdDateFormat6.parse("1970-01-01T00:00:00.004+0000", parsePosition25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "162) test0498(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734418493015,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=46,MILLISECOND=985,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
// flaky "38) test0498(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "22) test0498(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        java.util.Locale locale24 = stdDateFormat7._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance(14, locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "163) test0499(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "sun.util.BuddhistCalendar[time=-734418492975,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=51,SECOND=47,MILLISECOND=25,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        boolean boolean3 = dateFormat0.equals((java.lang.Object) 2);
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        java.util.Calendar calendar5 = dateFormat0.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = dateFormat0.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(calendar5);
// flaky "164) test0500(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
    }
}
