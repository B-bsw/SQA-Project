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
        java.lang.String str0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_STR_RFC1123;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "EEE, dd MMM yyyy HH:mm:ss zzz" + "'", str0, "EEE, dd MMM yyyy HH:mm:ss zzz");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int0 = java.text.DateFormat.DAY_OF_YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int int0 = java.text.DateFormat.YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int int0 = java.text.DateFormat.MEDIUM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = dateFormat0.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz");
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
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stdDateFormat0.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int int0 = java.text.DateFormat.DAY_OF_WEEK_IN_MONTH_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(2, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        int int0 = java.text.DateFormat.DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        int int0 = java.text.DateFormat.SECOND_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator4 = dateFormat0.formatToCharacterIterator((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "07:00:00" + "'", str2, "07:00:00");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        int int0 = java.text.DateFormat.WEEK_OF_MONTH_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int int0 = java.text.DateFormat.MONTH_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.lang.Class<?> wildcardClass1 = dateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
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
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.String str0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_STR_PLAIN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy-MM-dd" + "'", str0, "yyyy-MM-dd");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int int0 = java.text.DateFormat.FULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = stdDateFormat0.format(date1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        int int0 = java.text.DateFormat.HOUR_OF_DAY1_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        int int0 = java.text.DateFormat.MILLISECOND_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 10, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean2 = dateFormat0.equals((java.lang.Object) "");
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = dateFormat0.format((java.lang.Object) 'a', stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
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
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.lang.String str0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_STR_ISO8601;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy-MM-dd'T'HH:mm:ss.SSSZ" + "'", str0, "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        int int0 = java.text.DateFormat.MINUTE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.lang.StringBuffer stringBuffer2 = null;
        java.text.FieldPosition fieldPosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer4 = dateFormat0.format((java.lang.Object) 1L, stringBuffer2, fieldPosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        int int0 = java.text.DateFormat.HOUR1_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(10, (int) '#', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(0, 10, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parse("07:00:00", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int int0 = java.text.DateFormat.WEEK_OF_YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        int int0 = java.text.DateFormat.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int int0 = java.text.DateFormat.AM_PM_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
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
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        int int0 = java.text.DateFormat.TIMEZONE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat0.parseAsISO8601("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (short) -1, 11, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean2 = dateFormat0.equals((java.lang.Object) "");
        java.util.Calendar calendar3 = null;
        dateFormat0.setCalendar(calendar3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = dateFormat0.parseObject("\u0e21\u0e04. 2513");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        int int0 = java.text.DateFormat.HOUR_OF_DAY0_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
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
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.lang.StringBuffer stringBuffer2 = null;
        java.text.FieldPosition fieldPosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer4 = dateFormat0.format((java.lang.Object) "", stringBuffer2, fieldPosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.String str0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_STR_ISO8601_Z;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'" + "'", str0, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        int int0 = java.text.DateFormat.DAY_OF_WEEK_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
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
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        int int0 = java.text.DateFormat.HOUR0_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        int int0 = java.text.DateFormat.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = stdDateFormat0.parse("\u0e21\u0e04. 2513");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"1 ?.?. 2513\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (byte) -1, (int) (byte) 100, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        int int0 = java.text.DateFormat.DATE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 10.0f);
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateFormat0.format(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(attributedCharacterIterator2);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsRFC1123("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean2 = dateFormat0.equals((java.lang.Object) 10L);
        dateFormat0.setLenient(true);
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateFormat0.format(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = dateFormat0.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat0.parseAsISO8601("07:00:00", parsePosition2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator3 = dateFormat1.formatToCharacterIterator((java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator4 = dateFormat0.formatToCharacterIterator((java.lang.Object) attributedCharacterIterator3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(attributedCharacterIterator3);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        dateFormat0.setLenient(true);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat0.parseObject("hi!", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
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
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsRFC1123("1970-01-01", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.util.TimeZone timeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
// flaky "1) test0083(com.fasterxml.jackson.databind.util.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.parseObject("07:00:00", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parse("1970-01-01", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat2.setLenient(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat2.parseAsISO8601("07:00:00", parsePosition4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        int int0 = java.text.DateFormat.ERA_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
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
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = stdDateFormat0.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (short) 1, 9, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsRFC1123("yyyy-MM-dd", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator3 = dateFormat0.formatToCharacterIterator((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 100.0d);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat0.parseObject("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "2) test0099(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0e21\u0e04. 2513" + "'", str2, "\u0e21\u0e04. 2513");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
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
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) ' ', (int) '4', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = stdDateFormat0.format((java.lang.Object) dateFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat3.withLocale(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        dateFormat0.setLenient(true);
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = dateFormat0.format((java.lang.Object) 0, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat0.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        dateFormat0.setLenient(true);
        java.lang.String str4 = dateFormat0.format((java.lang.Object) 100.0d);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.lang.String str7 = dateFormat5.format((java.lang.Object) 10L);
        dateFormat5.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator10 = dateFormat0.formatToCharacterIterator((java.lang.Object) dateFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "3) test0109(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2513-01-01" + "'", str4, "2513-01-01");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "07:00:00" + "'", str7, "07:00:00");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat0.parseAsISO8601("yyyy-MM-dd", parsePosition2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        dateFormat0.setLenient(true);
        java.lang.String str4 = dateFormat0.format((java.lang.Object) 100.0d);
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateFormat0.format(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "4) test0111(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2513-01-01" + "'", str4, "2513-01-01");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.lang.String[] strArray1 = com.fasterxml.jackson.databind.util.StdDateFormat.ALL_FORMATS;
        java.lang.StringBuffer stringBuffer2 = null;
        java.text.FieldPosition fieldPosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer4 = stdDateFormat0.format((java.lang.Object) strArray1, stringBuffer2, fieldPosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd" });
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) (short) -1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(4, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 10L);
        java.util.Calendar calendar3 = dateFormat0.getCalendar();
        java.lang.Object obj5 = dateFormat0.parseObject("07:00:00");
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateFormat0.format(date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "07:00:00" + "'", str2, "07:00:00");
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat2.parseObject("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean2 = dateFormat0.equals((java.lang.Object) "");
        java.util.Calendar calendar3 = null;
        dateFormat0.setCalendar(calendar3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = dateFormat0.parseObject("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean2 = dateFormat0.equals((java.lang.Object) "");
        java.util.Calendar calendar3 = null;
        dateFormat0.setCalendar(calendar3);
        java.util.Calendar calendar5 = dateFormat0.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat0.formatToCharacterIterator((java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(calendar5);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(8, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance();
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 10L);
        java.util.Calendar calendar4 = dateFormat1.getCalendar();
        dateFormat0.setCalendar(calendar4);
        java.lang.Class<?> wildcardClass6 = dateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "07:00:00" + "'", str3, "07:00:00");
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) ' ', 0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(17, 0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat0.parseObject("\u0e21\u0e04. 2513");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(attributedCharacterIterator2);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 10L);
        dateFormat0.setLenient(true);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat6);
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = dateFormat0.parseObject("yyyy-MM-dd", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "07:00:00" + "'", str2, "07:00:00");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat1.parseObject("1970-01-01");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.lang.StringBuffer stringBuffer3 = null;
        java.text.FieldPosition fieldPosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = dateFormat0.format((java.lang.Object) (short) 1, stringBuffer3, fieldPosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean2 = dateFormat0.equals((java.lang.Object) "");
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateFormat0.format(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.util.TimeZone timeZone0 = null;
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
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(8, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat2.parseAsISO8601("", parsePosition4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        dateFormat0.setLenient(true);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance(2);
        boolean boolean5 = dateFormat0.equals((java.lang.Object) 2);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = dateFormat0.parseObject("07:00:00", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (byte) 100, 15, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat2.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "07:00:00" + "'", str2, "07:00:00");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(13, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean2 = dateFormat0.equals((java.lang.Object) "");
        java.util.Calendar calendar3 = null;
        dateFormat0.setCalendar(calendar3);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = dateFormat0.formatToCharacterIterator((java.lang.Object) "\u0e21\u0e04. 2513");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stdDateFormat2.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parseAsRFC1123("\u0e21\u0e04. 2513", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(6, 1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(6, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean2 = dateFormat0.equals((java.lang.Object) "");
        java.util.Calendar calendar3 = null;
        dateFormat0.setCalendar(calendar3);
        java.util.Calendar calendar5 = dateFormat0.getCalendar();
        java.lang.Class<?> wildcardClass6 = dateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(calendar5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2, (java.lang.Boolean) true);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat4.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        dateFormat0.setLenient(true);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator4 = dateFormat0.formatToCharacterIterator((java.lang.Object) dateFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat3);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(11, 9, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
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
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(13, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) '4', 10, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat2.parse("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (short) 0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(11, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2, (java.lang.Boolean) true);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat4.parseAsISO8601("yyyy-MM-dd", parsePosition6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parse("\u0e21\u0e04. 2513", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2, (java.lang.Boolean) true);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(1, 13, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        dateFormat2.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateFormat0.format((java.lang.Object) dateFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNull(calendar1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat4.parse("07:00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = stdDateFormat3.format(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2, (java.lang.Boolean) true);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = stdDateFormat4.withLocale(locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateFormat0.format((java.lang.Object) numberFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = stdDateFormat0.parse("EEE, dd MMM yyyy HH:mm:ss zzz");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"EEE, dd MMM yyyy HH:mm:ss zzz\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean2 = dateFormat0.equals((java.lang.Object) "");
        java.util.Calendar calendar3 = null;
        dateFormat0.setCalendar(calendar3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = dateFormat0.parseObject("1970-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.lang.StringBuffer stringBuffer3 = null;
        java.text.FieldPosition fieldPosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = dateFormat1.format((java.lang.Object) "yyyy-MM-dd'T'HH:mm:ss.SSSZ", stringBuffer3, fieldPosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
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
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = stdDateFormat2.format((java.lang.Object) 7, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) (byte) 100, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        dateFormat0.setLenient(true);
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = dateFormat0.format((java.lang.Object) (byte) 0, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean2 = dateFormat0.equals((java.lang.Object) "");
        java.util.Calendar calendar3 = null;
        dateFormat0.setCalendar(calendar3);
        java.util.Calendar calendar5 = dateFormat0.getCalendar();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean8 = dateFormat6.equals((java.lang.Object) 10L);
        dateFormat6.setLenient(true);
        java.lang.Class<?> wildcardClass11 = dateFormat6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateFormat0.format((java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(calendar5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) ' ', 10, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) 'a', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        // The following exception was thrown during execution in test generation
{ // flaky ('try' without 'catch', 'finally' or resource declarations):         try {
            java.lang.Object obj2 = null; // flaky "5) test0191(com.fasterxml.jackson.databind.util.RegressionTest0)": dateFormat0.parseObject("\u0e21\u0e04. 2513");
// flaky "1) test0191(com.fasterxml.jackson.databind.util.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
// flaky (is never thrown in body of corresponding try statement):         } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.parseObject("\u0e21\u0e04. 2513");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(6, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.util.TimeZone timeZone0 = null;
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
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stdDateFormat3.parseObject("\u0e21\u0e04. 2513");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat3.parseAsISO8601("\u0e21\u0e04. 2513", parsePosition5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = stdDateFormat4.formatToCharacterIterator((java.lang.Object) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 10L);
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = dateFormat0.format((java.lang.Object) 10, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "07:00:00" + "'", str2, "07:00:00");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat0.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "07:00:00" + "'", str2, "07:00:00");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat4.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat3.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) '#', 16, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat3.parse("1970-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat1.parseObject("\u0e21\u0e04. 2513", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 100.0f);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat0.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2513-01-01" + "'", str2, "2513-01-01");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 10L);
        java.util.Calendar calendar3 = dateFormat0.getCalendar();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.lang.String str6 = dateFormat4.format((java.lang.Object) 10L);
        dateFormat4.setLenient(true);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat10);
        dateFormat0.setNumberFormat(numberFormat10);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = numberFormat10.format((java.lang.Object) dateFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "07:00:00" + "'", str2, "07:00:00");
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "07:00:00" + "'", str6, "07:00:00");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(dateFormat13);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat3.parseAsISO8601("07:00:00", parsePosition5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean8 = dateFormat6.equals((java.lang.Object) "");
        java.text.AttributedCharacterIterator attributedCharacterIterator10 = null; // flaky "6) test0216(com.fasterxml.jackson.databind.util.RegressionTest0)": dateFormat6.formatToCharacterIterator((java.lang.Object) (-1.0d));
        stdDateFormat2._formatISO8601_z = dateFormat6;
        java.util.Date date12 = null;
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = stdDateFormat2.format(date12, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "2) test0216(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertNotNull(attributedCharacterIterator10);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator3 = stdDateFormat0.formatToCharacterIterator((java.lang.Object) dateFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (short) -1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean2 = dateFormat0.equals((java.lang.Object) "");
        java.util.Calendar calendar3 = null;
        dateFormat0.setCalendar(calendar3);
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateFormat0.format(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat3.parseAsISO8601("yyyy-MM-dd", parsePosition5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = stdDateFormat2.parseAsISO8601("", parsePosition7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(13, 100, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
// flaky "7) test0225(com.fasterxml.jackson.databind.util.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = stdDateFormat2.format(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 10L);
        java.util.Calendar calendar3 = dateFormat0.getCalendar();
        java.lang.Object obj5 = dateFormat0.parseObject("07:00:00");
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean8 = dateFormat6.equals((java.lang.Object) 10L);
        java.util.Calendar calendar9 = dateFormat6.getCalendar();
        dateFormat0.setCalendar(calendar9);
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateFormat0.format(date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "07:00:00" + "'", str2, "07:00:00");
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(calendar9);
// flaky "8) test0228(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(14, (-1), locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(16, 13, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) 'a', 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat2.parse("1970-01-01", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = stdDateFormat2.parseAsISO8601("06:59:59", parsePosition7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateFormat0.format((java.lang.Object) dateFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNull(calendar1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator4 = dateFormat0.formatToCharacterIterator((java.lang.Object) "07:00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(attributedCharacterIterator2);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone8 = null;
        java.util.Locale locale9 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8, locale9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        stdDateFormat10.setNumberFormat(numberFormat12);
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = stdDateFormat2.format((java.lang.Object) numberFormat12, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.NumberFormat numberFormat2 = dateFormat0.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat0.parseObject("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance();
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 10L);
        java.util.Calendar calendar4 = dateFormat1.getCalendar();
        dateFormat0.setCalendar(calendar4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = dateFormat0.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "07:00:00" + "'", str3, "07:00:00");
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsRFC1123("yyyy-MM-dd", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.NumberFormat numberFormat2 = dateFormat0.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = numberFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance();
        java.lang.String str4 = dateFormat2.format((java.lang.Object) 10L);
        dateFormat2.setLenient(true);
        dateFormat2.setLenient(true);
        java.util.Calendar calendar9 = dateFormat2.getCalendar();
        dateFormat0.setCalendar(calendar9);
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = dateFormat0.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "07:00:00" + "'", str4, "07:00:00");
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat2.parse("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean2 = dateFormat0.equals((java.lang.Object) 10L);
        dateFormat0.setLenient(true);
        java.text.NumberFormat numberFormat5 = null;
        dateFormat0.setNumberFormat(numberFormat5);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat8 = dateFormat7.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat8);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = dateFormat0.format((java.lang.Object) stdDateFormat10, stringBuffer11, fieldPosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertNotNull(stdDateFormat10);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat2.parse("1970-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(1);
        java.util.TimeZone timeZone2 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator4 = dateFormat1.formatToCharacterIterator((java.lang.Object) dateFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat3);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale3, (java.lang.Boolean) true);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat5.parseAsRFC1123("06:59:59", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = stdDateFormat2.withLocale(locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = stdDateFormat2.parse("07:00:00", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((-1), locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = stdDateFormat2.withLocale(locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatPlain;
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = stdDateFormat2.parse("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stdDateFormat2.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 10L);
        dateFormat0.setLenient(true);
        dateFormat0.setLenient(true);
        java.util.Calendar calendar7 = dateFormat0.getCalendar();
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateFormat0.format(date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "07:00:00" + "'", str2, "07:00:00");
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 10L);
        boolean boolean4 = dateFormat0.equals((java.lang.Object) 0);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateFormat0.format((java.lang.Object) numberFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "07:00:00" + "'", str2, "07:00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat3.parseAsISO8601("hi!", parsePosition5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(4, (int) (byte) 1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stdDateFormat2.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stdDateFormat2.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
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
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone10 = stdDateFormat2._timezone;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = stdDateFormat2.parse("1970-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone10);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance();
        java.lang.String str8 = dateFormat6.format((java.lang.Object) 10L);
        java.util.Calendar calendar9 = dateFormat6.getCalendar();
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance();
        java.lang.String str12 = dateFormat10.format((java.lang.Object) 10L);
        dateFormat10.setLenient(true);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        dateFormat10.setNumberFormat(numberFormat16);
        dateFormat6.setNumberFormat(numberFormat16);
        java.util.Calendar calendar19 = dateFormat6.getCalendar();
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = stdDateFormat2.format((java.lang.Object) calendar19, stringBuffer20, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "07:00:00" + "'", str8, "07:00:00");
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "07:00:00" + "'", str12, "07:00:00");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(calendar19);
        org.junit.Assert.assertEquals(calendar19.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 10L);
        dateFormat0.setLenient(true);
        dateFormat0.setLenient(true);
        java.util.Calendar calendar7 = dateFormat0.getCalendar();
        java.lang.String str9 = dateFormat0.format((java.lang.Object) (short) -1);
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = dateFormat0.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "07:00:00" + "'", str2, "07:00:00");
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "sun.util.BuddhistCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "06:59:59" + "'", str9, "06:59:59");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale3, (java.lang.Boolean) false);
        java.util.Date date6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = stdDateFormat5.format(date6, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stdDateFormat0.parseObject("\u0e21\u0e04. 2513", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 100, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat2.withLocale(locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) ' ', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = stdDateFormat2.parseAsISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)", parsePosition8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2, (java.lang.Boolean) true);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parseAsRFC1123("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getTimeInstance((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = stdDateFormat2.formatToCharacterIterator((java.lang.Object) dateFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat8);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(100, 1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = stdDateFormat2.parseAsISO8601("yyyy-MM-dd", parsePosition8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = dateFormat0.parseObject("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stdDateFormat2.parseObject("1970-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = stdDateFormat2.parse("07:00:00", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone9);
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
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = dateFormat8.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(2, 1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat2.parseObject("hi!", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(1);
        dateFormat1.setLenient(true);
        dateFormat1.setLenient(true);
        java.util.TimeZone timeZone6 = null;
        java.util.Locale locale7 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6, locale7);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        stdDateFormat8.setNumberFormat(numberFormat10);
        stdDateFormat8._lenient = false;
        stdDateFormat8._lenient = false;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat8._formatPlain = dateFormat18;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = dateFormat1.format((java.lang.Object) dateFormat18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(dateFormat18);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean7 = stdDateFormat2._lenient;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat2.withLocale(locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean2 = dateFormat0.equals((java.lang.Object) "");
        java.lang.Class<?> wildcardClass3 = dateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = stdDateFormat2.parseAsISO8601("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition12, true);
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
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (byte) 1);
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateFormat1.format((java.lang.Object) dateFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = stdDateFormat2.parseAsISO8601("\u0e21\u0e04. 2513", parsePosition8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean4 = dateFormat2.equals((java.lang.Object) 10L);
        java.util.Calendar calendar5 = dateFormat2.getCalendar();
        dateFormat0.setCalendar(calendar5);
        java.lang.StringBuffer stringBuffer8 = null;
        java.text.FieldPosition fieldPosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = dateFormat0.format((java.lang.Object) "yyyy-MM-dd", stringBuffer8, fieldPosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNull(calendar1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "9) test0292(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = stdDateFormat2.parse("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.lang.String str7 = stdDateFormat2.toString();
        java.lang.Class<?> wildcardClass8 = stdDateFormat2.getClass();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(2, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.lang.Boolean boolean10 = stdDateFormat2._lenient;
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = stdDateFormat2.parseAsISO8601("07:00:00", parsePosition12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = stdDateFormat2.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date47 = stdDateFormat2.parse("2513-01-01");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"2513-01-01\": while it seems to fit format 'yyyy-MM-dd', parsing fails (leniency? false)");
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
// flaky "10) test0300(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat43);
        org.junit.Assert.assertNotNull(numberFormat44);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        java.util.Date date44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = stdDateFormat2.format(date44);
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
// flaky "11) test0301(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNull(locale43);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat2.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(2, 1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.lang.String str5 = dateFormat3.format((java.lang.Object) 10L);
        dateFormat3.setLenient(true);
        dateFormat3.setLenient(true);
        java.util.Calendar calendar10 = dateFormat3.getCalendar();
        dateFormat2.setCalendar(calendar10);
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = dateFormat2.parseObject("1970-01-01", parsePosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "07:00:00" + "'", str5, "07:00:00");
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = stdDateFormat2.parse("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stdDateFormat3.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        java.util.TimeZone timeZone15 = null;
        java.util.Locale locale16 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15, locale16);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        stdDateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat17._lenient = false;
        stdDateFormat17._lenient = false;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator25 = dateFormat7.formatToCharacterIterator((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "07:00:00" + "'", str9, "07:00:00");
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = stdDateFormat2.parseAsRFC1123("06:59:59", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = stdDateFormat2.parseAsISO8601("\u0e21\u0e04. 2513", parsePosition10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat2.withLocale(locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = stdDateFormat2.parse("", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 10L);
        java.util.Calendar calendar3 = dateFormat0.getCalendar();
        java.lang.Object obj5 = dateFormat0.parseObject("07:00:00");
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance();
        java.lang.String str8 = dateFormat6.format((java.lang.Object) 10L);
        java.util.Calendar calendar9 = dateFormat6.getCalendar();
        java.lang.Object obj11 = dateFormat6.parseObject("07:00:00");
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean14 = dateFormat12.equals((java.lang.Object) 10L);
        java.util.Calendar calendar15 = dateFormat12.getCalendar();
        dateFormat6.setCalendar(calendar15);
        dateFormat0.setCalendar(calendar15);
        java.util.Date date18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dateFormat0.format(date18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "07:00:00" + "'", str2, "07:00:00");
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "07:00:00" + "'", str8, "07:00:00");
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(calendar15);
// flaky "12) test0312(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale3, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
// flaky "13) test0313(com.fasterxml.jackson.databind.util.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = stdDateFormat2.parseAsRFC1123("yyyy-MM-dd", parsePosition11);
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
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.lang.Boolean boolean10 = stdDateFormat2._lenient;
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = stdDateFormat2.parseAsISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)", parsePosition12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(5, (int) (byte) 0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stdDateFormat2.parseObject("yyyy-MM-dd", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator12 = numberFormat10.formatToCharacterIterator((java.lang.Object) "06:59:59");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat10);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.lang.Class<?> wildcardClass2 = dateFormat1.getClass();
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 10L);
        dateFormat0.setLenient(true);
        dateFormat0.setLenient(true);
        java.util.Calendar calendar7 = dateFormat0.getCalendar();
        java.lang.String str9 = dateFormat0.format((java.lang.Object) (short) -1);
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean12 = dateFormat10.equals((java.lang.Object) "");
        java.util.Calendar calendar13 = null;
        dateFormat10.setCalendar(calendar13);
        java.util.Calendar calendar15 = dateFormat10.getCalendar();
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = dateFormat0.format((java.lang.Object) dateFormat10, stringBuffer16, fieldPosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "07:00:00" + "'", str2, "07:00:00");
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "sun.util.BuddhistCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "06:59:59" + "'", str9, "06:59:59");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(calendar15);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = stdDateFormat2.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat13);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        java.text.ParsePosition parsePosition27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date28 = stdDateFormat2.parse("1970-01-01", parsePosition27);
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
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone10 = stdDateFormat2._timezone;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = stdDateFormat2.format(date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone10);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean7 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone8 = stdDateFormat2.getTimeZone();
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = stdDateFormat2.format(date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(timeZone8);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.lang.Boolean boolean10 = stdDateFormat2._lenient;
        java.lang.String[] strArray11 = com.fasterxml.jackson.databind.util.StdDateFormat.ALL_FORMATS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = stdDateFormat2.format((java.lang.Object) strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd" });
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        java.util.Date date17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = stdDateFormat2.format(date17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
// flaky "14) test0327(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat2.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        dateFormat0.setLenient(true);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat0.parseObject("hi!", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        java.util.Locale locale27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = stdDateFormat2.withLocale(locale27);
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
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "07:00:00" + "'", str9, "07:00:00");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        java.util.TimeZone timeZone4 = null;
        java.util.Locale locale5 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4, locale5);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat8 = dateFormat7.getNumberFormat();
        stdDateFormat6.setNumberFormat(numberFormat8);
        java.text.DateFormat dateFormat10 = stdDateFormat6._formatRFC1123;
        java.lang.Boolean boolean11 = stdDateFormat6._lenient;
        java.util.TimeZone timeZone12 = stdDateFormat6.getTimeZone();
        stdDateFormat6._clearFormats();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = stdDateFormat3.equals((java.lang.Object) stdDateFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(timeZone12);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale3, (java.lang.Boolean) true);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat5.parse("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        java.util.Date date16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateFormat0.format(date16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.lang.Class<?> wildcardClass1 = dateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 10L);
        java.util.Calendar calendar3 = dateFormat0.getCalendar();
        java.lang.String str5 = dateFormat0.format((java.lang.Object) 9);
        java.util.TimeZone timeZone6 = null;
        java.util.Locale locale7 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6, locale7);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        stdDateFormat8.setNumberFormat(numberFormat10);
        stdDateFormat8._lenient = false;
        stdDateFormat8._lenient = false;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat8._formatPlain = dateFormat18;
        boolean boolean20 = stdDateFormat8.isLenient();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance(1);
        dateFormat22.setLenient(true);
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str27 = dateFormat25.format((java.lang.Object) 100.0f);
        boolean boolean28 = dateFormat22.equals((java.lang.Object) dateFormat25);
        stdDateFormat8._formatRFC1123 = dateFormat25;
        boolean boolean31 = stdDateFormat8.looksLikeISO8601("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = dateFormat0.format((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "07:00:00" + "'", str2, "07:00:00");
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "sun.util.BuddhistCalendar[time=9,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=9,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "07:00:00" + "'", str5, "07:00:00");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2513-01-01" + "'", str27, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(11, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale3, (java.lang.Boolean) true);
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parse("2513-01-01", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateInstance();
        java.lang.String str14 = dateFormat12.format((java.lang.Object) 100.0d);
        java.text.NumberFormat numberFormat15 = dateFormat12.getNumberFormat();
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = stdDateFormat2.format((java.lang.Object) numberFormat15, stringBuffer16, fieldPosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(dateFormat12);
// flaky "15) test0340(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u0e21\u0e04. 2513" + "'", str14, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(numberFormat15);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean7 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone8 = stdDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = stdDateFormat2.parse("", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(timeZone8);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stdDateFormat2.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition13);
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
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) '#', 5, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = stdDateFormat2.formatToCharacterIterator(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = stdDateFormat2.parse("2513-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(2, 14, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.lang.String str7 = stdDateFormat2.toString();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = stdDateFormat2.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(0, (int) (short) 10, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = stdDateFormat2.parseAsRFC1123("07:00:00", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat13);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = stdDateFormat2.parse("06:59:59", parsePosition16);
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
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(3, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = stdDateFormat2.parseAsISO8601("\u0e21\u0e04. 2513", parsePosition16, false);
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
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = stdDateFormat2.parseAsRFC1123("\u0e21\u0e04. 2513", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = stdDateFormat2.parse("1970-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stdDateFormat2.parseObject("\u0e21\u0e04. 2513");
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
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = stdDateFormat2.parseAsRFC1123("", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(dateFormat7);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        java.util.TimeZone timeZone27 = null;
        java.util.Locale locale28 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone27, locale28);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        stdDateFormat29.setNumberFormat(numberFormat31);
        java.text.DateFormat dateFormat33 = stdDateFormat29._formatRFC1123;
        java.text.DateFormat dateFormat34 = stdDateFormat29._formatRFC1123;
        java.text.DateFormat dateFormat35 = stdDateFormat29._formatPlain;
        java.text.DateFormat dateFormat36 = stdDateFormat29._formatRFC1123;
        java.util.TimeZone timeZone37 = stdDateFormat29._timezone;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = stdDateFormat2.format((java.lang.Object) timeZone37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(numberFormat31);
        org.junit.Assert.assertNull(dateFormat33);
        org.junit.Assert.assertNull(dateFormat34);
        org.junit.Assert.assertNull(dateFormat35);
        org.junit.Assert.assertNull(dateFormat36);
        org.junit.Assert.assertNull(timeZone37);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.lang.Boolean boolean11 = stdDateFormat2._lenient;
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stdDateFormat3.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone12);
        stdDateFormat2._formatRFC1123 = dateFormat13;
        java.text.DateFormat dateFormat15 = stdDateFormat2._formatRFC1123;
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat15);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatISO8601_z;
        java.util.TimeZone timeZone8 = null;
        java.util.Locale locale9 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8, locale9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        stdDateFormat10.setNumberFormat(numberFormat12);
        java.lang.String str14 = stdDateFormat10.toString();
        java.lang.String str15 = stdDateFormat10.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat10._formatISO8601 = dateFormat16;
        java.text.NumberFormat numberFormat18 = stdDateFormat10.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            dateFormat7.setNumberFormat(numberFormat18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(numberFormat18);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale3, (java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = dateFormat0.format((java.lang.Object) timeZone1, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        java.text.ParsePosition parsePosition45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date47 = stdDateFormat2.parseAsISO8601("yyyy-MM-dd", parsePosition45, false);
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
// flaky "16) test0367(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNull(locale43);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = stdDateFormat3.parseAsISO8601("1970-01-01", parsePosition15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (byte) 1, 17, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(15, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.lang.String str7 = stdDateFormat2.toString();
        java.util.Date date8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.text.FieldPosition fieldPosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = stdDateFormat2.format(date8, stringBuffer9, fieldPosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = stdDateFormat2.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)");
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
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = stdDateFormat2.parseAsISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)", parsePosition9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(3, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = stdDateFormat2.parseAsISO8601("2513-01-01", parsePosition8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale3, (java.lang.Boolean) true);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = stdDateFormat5.parseAsISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)", parsePosition7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        java.lang.String str29 = dateFormat27.format((java.lang.Object) 10L);
        java.util.Calendar calendar30 = dateFormat27.getCalendar();
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance();
        java.lang.String str33 = dateFormat31.format((java.lang.Object) 10L);
        dateFormat31.setLenient(true);
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat37 = dateFormat36.getNumberFormat();
        dateFormat31.setNumberFormat(numberFormat37);
        dateFormat27.setNumberFormat(numberFormat37);
        // The following exception was thrown during execution in test generation
        try {
            dateFormat26.setNumberFormat(numberFormat37);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "07:00:00" + "'", str29, "07:00:00");
        org.junit.Assert.assertNotNull(calendar30);
        org.junit.Assert.assertEquals(calendar30.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "07:00:00" + "'", str33, "07:00:00");
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(numberFormat37);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
            java.lang.Object obj16 = stdDateFormat2.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)", parsePosition15);
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
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(2);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean4 = dateFormat2.equals((java.lang.Object) "");
        java.util.Calendar calendar5 = null;
        dateFormat2.setCalendar(calendar5);
        java.util.Calendar calendar7 = dateFormat2.getCalendar();
        boolean boolean9 = dateFormat2.equals((java.lang.Object) "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateFormat1.format((java.lang.Object) "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(calendar7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale3, (java.lang.Boolean) false);
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = stdDateFormat2.parseAsISO8601("\u0e21\u0e04. 2513", parsePosition12, false);
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
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        java.util.TimeZone timeZone4 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone4);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone4);
        java.util.Locale locale7 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4, locale7, (java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = stdDateFormat3.format((java.lang.Object) locale7, stringBuffer10, fieldPosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        java.lang.Class<?> wildcardClass30 = stdDateFormat2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        java.util.TimeZone timeZone46 = null;
        java.util.Locale locale47 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat48 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone46, locale47);
        java.text.DateFormat dateFormat49 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat50 = dateFormat49.getNumberFormat();
        stdDateFormat48.setNumberFormat(numberFormat50);
        java.lang.String str52 = stdDateFormat48.toString();
        java.lang.String str53 = stdDateFormat48.toString();
        java.text.DateFormat dateFormat54 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat48._formatISO8601 = dateFormat54;
        java.text.NumberFormat numberFormat56 = stdDateFormat48.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str57 = numberFormat44.format((java.lang.Object) numberFormat56);
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
// flaky "17) test0386(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat43);
        org.junit.Assert.assertNotNull(numberFormat44);
        org.junit.Assert.assertNotNull(dateFormat49);
        org.junit.Assert.assertNotNull(numberFormat50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str52, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str53, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat54);
        org.junit.Assert.assertNotNull(numberFormat56);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        stdDateFormat4.setNumberFormat(numberFormat6);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat4.setNumberFormat(numberFormat9);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = dateFormat0.format((java.lang.Object) numberFormat9, stringBuffer11, fieldPosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNull(calendar1);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        java.lang.Class<?> wildcardClass29 = dateFormat27.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator30 = stdDateFormat2.formatToCharacterIterator((java.lang.Object) wildcardClass29);
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
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.lang.String str6 = stdDateFormat2.toString();
        java.util.TimeZone timeZone7 = stdDateFormat2.getTimeZone();
        java.lang.Class<?> wildcardClass8 = stdDateFormat2.getClass();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2513-01-01" + "'", str21, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str26, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNull(timeZone27);
        org.junit.Assert.assertNull(calendar28);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = stdDateFormat2.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)", parsePosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = stdDateFormat3.format((java.lang.Object) "yyyy-MM-dd", stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        stdDateFormat5.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        stdDateFormat5.setNumberFormat(numberFormat10);
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone12);
        stdDateFormat5.setTimeZone(timeZone12);
        java.lang.Boolean boolean16 = stdDateFormat5._lenient;
        java.text.DateFormat dateFormat17 = stdDateFormat5._formatRFC1123;
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.FieldPosition fieldPosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = dateFormat0.format((java.lang.Object) stdDateFormat5, stringBuffer18, fieldPosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(dateFormat17);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.util.TimeZone timeZone7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat2._timezone = timeZone7;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        stdDateFormat2._lenient = false;
        java.text.ParsePosition parsePosition30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date31 = stdDateFormat2.parse("", parsePosition30);
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
        org.junit.Assert.assertNull(dateFormat26);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        // The following exception was thrown during execution in test generation
        try {
            dateFormat11.setLenient(true);
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
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        java.lang.Class<?> wildcardClass11 = stdDateFormat2.getClass();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale3, (java.lang.Boolean) true);
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 10L);
        boolean boolean4 = dateFormat0.equals((java.lang.Object) 0);
        java.util.Calendar calendar5 = dateFormat0.getCalendar();
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateFormat0.format(date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "07:00:00" + "'", str2, "07:00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = stdDateFormat2.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)", parsePosition16);
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
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        boolean boolean9 = stdDateFormat2.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = stdDateFormat2.parse("\u0e21\u0e04. 2513", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.util.TimeZone timeZone7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat2._timezone = timeZone7;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone7, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        java.util.Locale locale27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = stdDateFormat2.withLocale(locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        java.util.TimeZone timeZone10 = null;
        java.util.Locale locale11 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale11);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        stdDateFormat12.setNumberFormat(numberFormat14);
        stdDateFormat12._lenient = false;
        stdDateFormat12._lenient = false;
        java.lang.Boolean boolean20 = stdDateFormat12._lenient;
        java.lang.String str21 = stdDateFormat12.toString();
        java.util.TimeZone timeZone22 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone22);
        stdDateFormat12._formatRFC1123 = dateFormat23;
        java.lang.StringBuffer stringBuffer25 = null;
        java.text.FieldPosition fieldPosition26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer27 = dateFormat8.format((java.lang.Object) dateFormat23, stringBuffer25, fieldPosition26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str21, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat23);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        stdDateFormat2._lenient = true;
        java.util.Locale locale46 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat47 = stdDateFormat2.withLocale(locale46);
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
// flaky "18) test0408(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNull(locale43);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone10 = stdDateFormat2._timezone;
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = stdDateFormat2.parse("1970-01-01", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone10);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(12, (int) (byte) 0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance();
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 10L);
        java.util.Calendar calendar4 = dateFormat1.getCalendar();
        dateFormat0.setCalendar(calendar4);
        java.lang.Class<?> wildcardClass6 = dateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "07:00:00" + "'", str3, "07:00:00");
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = stdDateFormat2.parse("06:59:59", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat3.withLocale(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        java.text.ParsePosition parsePosition27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date28 = stdDateFormat2.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)", parsePosition27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "07:00:00" + "'", str16, "07:00:00");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "06:59:59" + "'", str23, "06:59:59");
        org.junit.Assert.assertNull(dateFormat25);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean7 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone8 = null;
        java.util.Locale locale9 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8, locale9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        stdDateFormat10.setNumberFormat(numberFormat12);
        stdDateFormat10._lenient = false;
        java.text.DateFormat dateFormat16 = stdDateFormat10._formatISO8601_z;
        boolean boolean18 = stdDateFormat10.looksLikeISO8601("07:00:00");
        java.util.TimeZone timeZone19 = stdDateFormat10.getTimeZone();
        boolean boolean21 = stdDateFormat10.looksLikeISO8601("");
        java.util.Locale locale22 = stdDateFormat10._locale;
        java.util.TimeZone timeZone23 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone23);
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone23);
        stdDateFormat10._formatPlain = dateFormat25;
        java.lang.StringBuffer stringBuffer27 = null;
        java.text.FieldPosition fieldPosition28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer29 = stdDateFormat2.format((java.lang.Object) dateFormat25, stringBuffer27, fieldPosition28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(timeZone19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(dateFormat25);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(5, (int) 'a', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        java.text.NumberFormat numberFormat17 = dateFormat15.getNumberFormat();
        stdDateFormat2._formatISO8601 = dateFormat15;
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat2.withLocale(locale19);
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
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        java.text.ParsePosition parsePosition31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date32 = stdDateFormat2.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition31);
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
// flaky "19) test0422(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar27.toString(), "sun.util.BuddhistCalendar[time=-734417822793,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=2,SECOND=57,MILLISECOND=207,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(calendar29);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        java.util.TimeZone timeZone44 = null;
        java.util.Locale locale45 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone44, locale45);
        java.text.DateFormat dateFormat47 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat48 = dateFormat47.getNumberFormat();
        stdDateFormat46.setNumberFormat(numberFormat48);
        stdDateFormat46._lenient = false;
        java.text.DateFormat dateFormat52 = stdDateFormat46._formatISO8601_z;
        boolean boolean54 = stdDateFormat46.looksLikeISO8601("07:00:00");
        java.text.DateFormat dateFormat56 = java.text.DateFormat.getDateInstance(1);
        dateFormat56.setLenient(true);
        java.text.DateFormat dateFormat59 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str61 = dateFormat59.format((java.lang.Object) 100.0f);
        boolean boolean62 = dateFormat56.equals((java.lang.Object) dateFormat59);
        stdDateFormat46._formatPlain = dateFormat59;
        java.lang.StringBuffer stringBuffer64 = null;
        java.text.FieldPosition fieldPosition65 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer66 = stdDateFormat2.format((java.lang.Object) dateFormat59, stringBuffer64, fieldPosition65);
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
// flaky "20) test0423(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNull(locale43);
        org.junit.Assert.assertNotNull(dateFormat47);
        org.junit.Assert.assertNotNull(numberFormat48);
        org.junit.Assert.assertNull(dateFormat52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(dateFormat56);
        org.junit.Assert.assertNotNull(dateFormat59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "2513-01-01" + "'", str61, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone12);
        stdDateFormat2._formatRFC1123 = dateFormat13;
        java.util.TimeZone timeZone15 = null;
        java.util.Locale locale16 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15, locale16);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        stdDateFormat17.setNumberFormat(numberFormat19);
        java.lang.String str21 = stdDateFormat17.toString();
        java.lang.String str22 = stdDateFormat17.toString();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat17._formatISO8601 = dateFormat23;
        java.text.NumberFormat numberFormat25 = stdDateFormat17.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator26 = dateFormat13.formatToCharacterIterator((java.lang.Object) numberFormat25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str21, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str22, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(numberFormat25);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date28 = stdDateFormat2.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str26, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat2._formatISO8601;
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = stdDateFormat2.withLocale(locale16);
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
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        java.text.ParsePosition parsePosition26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = stdDateFormat2.parse("2513-01-01", parsePosition26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "07:00:00" + "'", str16, "07:00:00");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "06:59:59" + "'", str23, "06:59:59");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(15, 6, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = stdDateFormat2.parse("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "07:00:00" + "'", str16, "07:00:00");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "06:59:59" + "'", str23, "06:59:59");
        org.junit.Assert.assertNull(dateFormat25);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        dateFormat13.setLenient(false);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat13);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatPlain;
        // The following exception was thrown during execution in test generation
        try {
            java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        java.util.Date date10 = null;
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = stdDateFormat2.format(date10, stringBuffer11, fieldPosition12);
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
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        java.util.TimeZone timeZone15 = null;
        java.util.Locale locale16 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15, locale16);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        stdDateFormat17.setNumberFormat(numberFormat19);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        stdDateFormat17.setNumberFormat(numberFormat22);
        java.util.TimeZone timeZone24 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone24);
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone24);
        stdDateFormat17.setTimeZone(timeZone24);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator28 = dateFormat7.formatToCharacterIterator((java.lang.Object) stdDateFormat17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "07:00:00" + "'", str9, "07:00:00");
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(dateFormat26);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        java.text.DateFormat dateFormat15 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.lang.String str18 = dateFormat16.format((java.lang.Object) 10L);
        dateFormat16.setLenient(true);
        dateFormat16.setLenient(true);
        java.util.Calendar calendar23 = dateFormat16.getCalendar();
        java.lang.String str25 = dateFormat16.format((java.lang.Object) (short) -1);
        stdDateFormat2._formatISO8601 = dateFormat16;
        java.util.TimeZone timeZone27 = null;
        java.util.Locale locale28 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone27, locale28);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        stdDateFormat29.setNumberFormat(numberFormat31);
        stdDateFormat29._lenient = false;
        stdDateFormat29._lenient = false;
        java.util.TimeZone timeZone37 = stdDateFormat29._timezone;
        stdDateFormat29._clearFormats();
        boolean boolean39 = stdDateFormat29.isLenient();
        boolean boolean41 = stdDateFormat29.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.util.TimeZone timeZone42 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat29.setTimeZone(timeZone42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = dateFormat16.format((java.lang.Object) timeZone42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "07:00:00" + "'", str18, "07:00:00");
        org.junit.Assert.assertNotNull(calendar23);
        org.junit.Assert.assertEquals(calendar23.toString(), "sun.util.BuddhistCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "06:59:59" + "'", str25, "06:59:59");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(numberFormat31);
        org.junit.Assert.assertNull(timeZone37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        org.junit.Assert.assertNull(locale15);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(4, 14, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        java.util.Date date11 = null;
        java.lang.StringBuffer stringBuffer12 = null;
        java.text.FieldPosition fieldPosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = stdDateFormat2.format(date11, stringBuffer12, fieldPosition13);
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
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("07:00:00");
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateInstance(1);
        dateFormat12.setLenient(true);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str17 = dateFormat15.format((java.lang.Object) 100.0f);
        boolean boolean18 = dateFormat12.equals((java.lang.Object) dateFormat15);
        stdDateFormat2._formatPlain = dateFormat15;
        java.text.DateFormat dateFormat20 = stdDateFormat2._formatISO8601_z;
        java.util.Date date21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = stdDateFormat2.format(date21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2513-01-01" + "'", str17, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dateFormat20);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15, locale17);
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
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        java.util.Date date12 = null;
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = stdDateFormat2.format(date12, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(timeZone10);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateInstance();
        java.util.TimeZone timeZone11 = null;
        java.util.Locale locale12 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone11, locale12);
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        stdDateFormat13.setNumberFormat(numberFormat15);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        stdDateFormat13.setNumberFormat(numberFormat18);
        java.util.TimeZone timeZone20 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone20);
        stdDateFormat13._timezone = timeZone20;
        boolean boolean23 = dateFormat10.equals((java.lang.Object) stdDateFormat13);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator24 = stdDateFormat2.formatToCharacterIterator((java.lang.Object) boolean23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(timeZone8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(14, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        java.util.TimeZone timeZone12 = stdDateFormat2._timezone;
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = stdDateFormat2.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNull(timeZone12);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 10L);
        java.util.Calendar calendar3 = dateFormat0.getCalendar();
        java.lang.Object obj5 = dateFormat0.parseObject("07:00:00");
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean8 = dateFormat6.equals((java.lang.Object) 10L);
        java.util.Calendar calendar9 = dateFormat6.getCalendar();
        dateFormat0.setCalendar(calendar9);
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
        java.text.DateFormat dateFormat37 = stdDateFormat13._formatISO8601_z;
        java.text.DateFormat dateFormat38 = stdDateFormat13._formatISO8601_z;
        java.lang.StringBuffer stringBuffer39 = null;
        java.text.FieldPosition fieldPosition40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer41 = dateFormat0.format((java.lang.Object) dateFormat38, stringBuffer39, fieldPosition40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "07:00:00" + "'", str2, "07:00:00");
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(calendar9);
// flaky "21) test0451(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2513-01-01" + "'", str32, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(dateFormat37);
        org.junit.Assert.assertNull(dateFormat38);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        stdDateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat3._lenient = false;
        stdDateFormat3._lenient = false;
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat3._formatPlain = dateFormat13;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.lang.String str17 = dateFormat15.format((java.lang.Object) 10L);
        dateFormat15.setLenient(true);
        dateFormat15.setLenient(true);
        java.util.Calendar calendar22 = dateFormat15.getCalendar();
        java.lang.String str24 = dateFormat15.format((java.lang.Object) (short) -1);
        stdDateFormat3._formatISO8601 = dateFormat15;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator26 = dateFormat0.formatToCharacterIterator((java.lang.Object) stdDateFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "07:00:00" + "'", str17, "07:00:00");
        org.junit.Assert.assertNotNull(calendar22);
        org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "06:59:59" + "'", str24, "06:59:59");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        java.util.TimeZone timeZone14 = null;
        java.util.Locale locale15 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14, locale15);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        stdDateFormat16.setNumberFormat(numberFormat18);
        stdDateFormat16._lenient = false;
        stdDateFormat16._lenient = false;
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat16._formatPlain = dateFormat26;
        boolean boolean28 = stdDateFormat16.isLenient();
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance(1);
        dateFormat30.setLenient(true);
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str35 = dateFormat33.format((java.lang.Object) 100.0f);
        boolean boolean36 = dateFormat30.equals((java.lang.Object) dateFormat33);
        stdDateFormat16._formatRFC1123 = dateFormat33;
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getTimeInstance();
        java.lang.String str40 = dateFormat38.format((java.lang.Object) 10L);
        java.util.Calendar calendar41 = dateFormat38.getCalendar();
        java.lang.Object obj43 = dateFormat38.parseObject("07:00:00");
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getTimeInstance();
        java.lang.String str46 = dateFormat44.format((java.lang.Object) 10L);
        java.util.Calendar calendar47 = dateFormat44.getCalendar();
        java.lang.Object obj49 = dateFormat44.parseObject("07:00:00");
        java.text.DateFormat dateFormat50 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean52 = dateFormat50.equals((java.lang.Object) 10L);
        java.util.Calendar calendar53 = dateFormat50.getCalendar();
        dateFormat44.setCalendar(calendar53);
        dateFormat38.setCalendar(calendar53);
        stdDateFormat16.setCalendar(calendar53);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator57 = dateFormat13.formatToCharacterIterator((java.lang.Object) stdDateFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2513-01-01" + "'", str35, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateFormat38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "07:00:00" + "'", str40, "07:00:00");
        org.junit.Assert.assertNotNull(calendar41);
        org.junit.Assert.assertEquals(calendar41.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "07:00:00" + "'", str46, "07:00:00");
        org.junit.Assert.assertNotNull(calendar47);
        org.junit.Assert.assertEquals(calendar47.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(calendar53);
// flaky "22) test0453(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar53.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stdDateFormat2.parseObject("hi!", parsePosition12);
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
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(1);
        dateFormat1.setLenient(true);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str6 = dateFormat4.format((java.lang.Object) 100.0f);
        boolean boolean7 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator10 = dateFormat8.formatToCharacterIterator((java.lang.Object) 10.0f);
        java.text.AttributedCharacterIterator attributedCharacterIterator12 = dateFormat8.formatToCharacterIterator((java.lang.Object) 14);
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = dateFormat4.format((java.lang.Object) attributedCharacterIterator12, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2513-01-01" + "'", str6, "2513-01-01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(attributedCharacterIterator10);
        org.junit.Assert.assertNotNull(attributedCharacterIterator12);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatISO8601_z;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar8 = dateFormat7.getCalendar();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat0.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance();
        java.lang.String str12 = dateFormat10.format((java.lang.Object) 10L);
        java.util.Calendar calendar13 = dateFormat10.getCalendar();
        java.lang.Object obj15 = dateFormat10.parseObject("07:00:00");
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.lang.String str18 = dateFormat16.format((java.lang.Object) 10L);
        java.util.Calendar calendar19 = dateFormat16.getCalendar();
        java.lang.Object obj21 = dateFormat16.parseObject("07:00:00");
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean24 = dateFormat22.equals((java.lang.Object) 10L);
        java.util.Calendar calendar25 = dateFormat22.getCalendar();
        dateFormat16.setCalendar(calendar25);
        dateFormat10.setCalendar(calendar25);
        stdDateFormat2._formatISO8601_z = dateFormat10;
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance((int) (byte) 1);
        stdDateFormat2._formatISO8601 = dateFormat30;
        java.util.Date date32 = null;
        java.lang.StringBuffer stringBuffer33 = null;
        java.text.FieldPosition fieldPosition34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer35 = stdDateFormat2.format(date32, stringBuffer33, fieldPosition34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "07:00:00" + "'", str12, "07:00:00");
        org.junit.Assert.assertNotNull(calendar13);
        org.junit.Assert.assertEquals(calendar13.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "07:00:00" + "'", str18, "07:00:00");
        org.junit.Assert.assertNotNull(calendar19);
        org.junit.Assert.assertEquals(calendar19.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(calendar25);
// flaky "23) test0459(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat30);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = stdDateFormat2.parseAsISO8601("", parsePosition16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
// flaky "24) test0461(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
            java.lang.Object obj16 = stdDateFormat2.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: null)", parsePosition15);
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        java.text.ParsePosition parsePosition27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date28 = stdDateFormat2.parse("06:59:59", parsePosition27);
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
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (short) 100, 8, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.util.TimeZone timeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        stdDateFormat2._timezone = timeZone9;
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9);
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone9);
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
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat13);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(4, 1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        java.text.DateFormat dateFormat14 = stdDateFormat2._formatRFC1123;
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = stdDateFormat2.parseAsISO8601("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition16, true);
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
        org.junit.Assert.assertNull(dateFormat14);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = stdDateFormat2.parse("1970-01-01");
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
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone15);
        java.util.Locale locale18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone15, locale18);
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
        org.junit.Assert.assertNotNull(dateFormat17);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        java.util.TimeZone timeZone24 = null;
        java.util.Locale locale25 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24, locale25);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        stdDateFormat26.setNumberFormat(numberFormat28);
        java.text.DateFormat dateFormat30 = stdDateFormat26._formatRFC1123;
        java.lang.Boolean boolean31 = stdDateFormat26._lenient;
        java.util.TimeZone timeZone32 = stdDateFormat26.getTimeZone();
        stdDateFormat26._clearFormats();
        java.lang.StringBuffer stringBuffer34 = null;
        java.text.FieldPosition fieldPosition35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer36 = dateFormat19.format((java.lang.Object) stdDateFormat26, stringBuffer34, fieldPosition35);
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
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertNull(dateFormat30);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertNull(timeZone32);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(8, (int) (byte) 100, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = stdDateFormat2.parseAsISO8601("", parsePosition11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(timeZone8);
        org.junit.Assert.assertNull(dateFormat9);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        stdDateFormat2._timezone = timeZone9;
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone9);
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
        org.junit.Assert.assertNotNull(dateFormat12);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = stdDateFormat2.parseAsRFC1123("yyyy-MM-dd", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean17 = dateFormat15.equals((java.lang.Object) 10L);
        dateFormat15.setLenient(true);
        java.text.NumberFormat numberFormat20 = dateFormat15.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date23 = stdDateFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(numberFormat20);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
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
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        java.util.TimeZone timeZone14 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone14);
        stdDateFormat2.setTimeZone(timeZone14);
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone14);
        java.util.Locale locale18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat17);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone15, locale17);
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
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        java.lang.Class<?> wildcardClass10 = stdDateFormat2.getClass();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(calendar9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(15, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.lang.Boolean boolean7 = stdDateFormat2._lenient;
        java.util.TimeZone timeZone8 = stdDateFormat2.getTimeZone();
        java.lang.Class<?> wildcardClass9 = stdDateFormat2.getClass();
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(timeZone8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.NumberFormat numberFormat2 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        java.lang.Object obj8 = numberFormat5.parseObject("1970-01-01");
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = dateFormat0.formatToCharacterIterator((java.lang.Object) numberFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1970L + "'", obj8, 1970L);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance();
        java.lang.String str12 = dateFormat10.format((java.lang.Object) 10L);
        java.util.Calendar calendar13 = dateFormat10.getCalendar();
        java.lang.Object obj15 = dateFormat10.parseObject("07:00:00");
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.lang.String str18 = dateFormat16.format((java.lang.Object) 10L);
        java.util.Calendar calendar19 = dateFormat16.getCalendar();
        java.lang.Object obj21 = dateFormat16.parseObject("07:00:00");
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean24 = dateFormat22.equals((java.lang.Object) 10L);
        java.util.Calendar calendar25 = dateFormat22.getCalendar();
        dateFormat16.setCalendar(calendar25);
        dateFormat10.setCalendar(calendar25);
        stdDateFormat2._formatISO8601_z = dateFormat10;
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance((int) (byte) 1);
        stdDateFormat2._formatISO8601 = dateFormat30;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getTimeInstance();
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance();
        java.lang.String str35 = dateFormat33.format((java.lang.Object) 10L);
        java.util.Calendar calendar36 = dateFormat33.getCalendar();
        dateFormat32.setCalendar(calendar36);
        dateFormat30.setCalendar(calendar36);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "07:00:00" + "'", str12, "07:00:00");
        org.junit.Assert.assertNotNull(calendar13);
        org.junit.Assert.assertEquals(calendar13.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "07:00:00" + "'", str18, "07:00:00");
        org.junit.Assert.assertNotNull(calendar19);
        org.junit.Assert.assertEquals(calendar19.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(calendar25);
// flaky "25) test0485(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "07:00:00" + "'", str35, "07:00:00");
        org.junit.Assert.assertNotNull(calendar36);
        org.junit.Assert.assertEquals(calendar36.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        java.text.ParsePosition parsePosition30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = stdDateFormat2.parseObject("\u0e21\u0e04. 2513", parsePosition30);
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
        org.junit.Assert.assertNull(calendar28);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        java.util.Locale locale44 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = stdDateFormat2.withLocale(locale44);
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
// flaky "26) test0487(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNull(locale43);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = stdDateFormat2.parseAsRFC1123("yyyy-MM-dd", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat13);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat2._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat2._formatISO8601_z;
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = stdDateFormat2.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsRFC1123("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat4.setLenient(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
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
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        java.text.ParsePosition parsePosition25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date26 = stdDateFormat2.parseAsRFC1123("\u0e21\u0e04. 2513", parsePosition25);
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
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(17, (int) '#', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        stdDateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat2._lenient = false;
        stdDateFormat2._lenient = false;
        java.util.TimeZone timeZone10 = null;
        java.util.Locale locale11 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale11);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        stdDateFormat12.setNumberFormat(numberFormat14);
        stdDateFormat12._lenient = false;
        stdDateFormat12._lenient = false;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.lang.String str22 = dateFormat20.format((java.lang.Object) 10L);
        java.util.Calendar calendar23 = dateFormat20.getCalendar();
        java.lang.Object obj25 = dateFormat20.parseObject("07:00:00");
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance();
        java.lang.String str28 = dateFormat26.format((java.lang.Object) 10L);
        java.util.Calendar calendar29 = dateFormat26.getCalendar();
        java.lang.Object obj31 = dateFormat26.parseObject("07:00:00");
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean34 = dateFormat32.equals((java.lang.Object) 10L);
        java.util.Calendar calendar35 = dateFormat32.getCalendar();
        dateFormat26.setCalendar(calendar35);
        dateFormat20.setCalendar(calendar35);
        stdDateFormat12._formatISO8601_z = dateFormat20;
        stdDateFormat12._lenient = false;
        java.text.DateFormat dateFormat41 = stdDateFormat12._formatISO8601_z;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = stdDateFormat2.equals((java.lang.Object) stdDateFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "07:00:00" + "'", str22, "07:00:00");
        org.junit.Assert.assertNotNull(calendar23);
        org.junit.Assert.assertEquals(calendar23.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "07:00:00" + "'", str28, "07:00:00");
        org.junit.Assert.assertNotNull(calendar29);
        org.junit.Assert.assertEquals(calendar29.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(calendar35);
// flaky "27) test0497(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar35.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat41);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 10, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stdDateFormat2.parseObject("2513-01-01");
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
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        boolean boolean14 = stdDateFormat2.isLenient();
        java.lang.String str15 = stdDateFormat2.toString();
        java.util.TimeZone timeZone16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16);
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16);
        stdDateFormat2.setTimeZone(timeZone16);
        java.util.TimeZone timeZone20 = stdDateFormat2._timezone;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }
}
