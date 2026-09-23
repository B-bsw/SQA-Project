package com.fasterxml.jackson.databind.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.Calendar calendar1 = stdDateFormat0.getCalendar();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = stdDateFormat0._formatPlain;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = stdDateFormat0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.lang.String str1 = stdDateFormat0.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = stdDateFormat0._formatISO8601;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        boolean boolean1 = stdDateFormat0.isLenient();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat0._timezone = timeZone1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        stdDateFormat0._formatISO8601_z = stdDateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone1 = stdDateFormat0.getTimeZone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean1 = stdDateFormat0.isLenient();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = stdDateFormat0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = stdDateFormat0._formatRFC1123;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance();
        stdDateFormat0._formatISO8601_z = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat0._formatRFC1123 = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.lang.Boolean boolean1 = stdDateFormat0._lenient;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        stdDateFormat0._formatISO8601_z = stdDateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.Locale locale1 = stdDateFormat0._locale;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = stdDateFormat0._timezone;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        stdDateFormat0._formatISO8601_z = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = stdDateFormat0.getTimeZone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat0._formatPlain = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        stdDateFormat0.setTimeZone(timeZone1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        stdDateFormat0._formatPlain = stdDateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = stdDateFormat0._formatPlain;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat0._formatPlain = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = stdDateFormat0._formatISO8601_z;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1);
        stdDateFormat0._formatISO8601_z = dateFormat3;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = stdDateFormat0._formatISO8601_z;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        stdDateFormat0._clearFormats();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = stdDateFormat0.formatToCharacterIterator((java.lang.Object) 11);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean2 = dateFormat0.equals((java.lang.Object) 10L);
        dateFormat0.setLenient(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.AttributedCharacterIterator attributedCharacterIterator6 = dateFormat0.formatToCharacterIterator((java.lang.Object) 100L);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.lang.Boolean boolean1 = stdDateFormat0._lenient;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone1 = stdDateFormat0._timezone;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = stdDateFormat0._formatISO8601;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        stdDateFormat0._lenient = false;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("07:00:00");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        stdDateFormat0._lenient = false;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance();
        stdDateFormat0._formatRFC1123 = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        boolean boolean2 = stdDateFormat0.equals((java.lang.Object) 9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat0.setTimeZone(timeZone1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.Locale locale1 = stdDateFormat0._locale;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.lang.Class<?> wildcardClass1 = stdDateFormat0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean3 = dateFormat1.equals((java.lang.Object) 10L);
        stdDateFormat0._formatISO8601_z = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 10.0d);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean3 = dateFormat1.equals((java.lang.Object) "");
        stdDateFormat0._formatISO8601_z = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.lang.String str1 = stdDateFormat0.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat0._formatISO8601 = dateFormat2;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        dateFormat1.setLenient(true);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance(2);
        boolean boolean6 = dateFormat1.equals((java.lang.Object) 2);
        stdDateFormat0._formatISO8601_z = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance();
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 10L);
        java.util.Calendar calendar4 = dateFormat1.getCalendar();
        stdDateFormat0._formatISO8601 = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        stdDateFormat0._clearFormats();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.Date date2 = stdDateFormat0.parse("1970-01-01");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat2);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat1.", dateFormat0.equals(dateFormat1) == dateFormat1.equals(dateFormat0));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat0._formatISO8601 = dateFormat2;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        stdDateFormat0._lenient = true;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        stdDateFormat0._formatPlain = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 100.0f);
        stdDateFormat0._formatISO8601_z = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dateFormat0.setLenient(true);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        stdDateFormat0.setTimeZone(timeZone1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance();
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 10L);
        java.util.Calendar calendar4 = dateFormat1.getCalendar();
        java.lang.Object obj6 = dateFormat1.parseObject("07:00:00");
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean9 = dateFormat7.equals((java.lang.Object) 10L);
        java.util.Calendar calendar10 = dateFormat7.getCalendar();
        dateFormat1.setCalendar(calendar10);
        stdDateFormat0._formatPlain = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance();
        boolean boolean2 = stdDateFormat0.equals((java.lang.Object) dateFormat1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = stdDateFormat0._formatRFC1123;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        boolean boolean3 = dateFormat1.equals((java.lang.Object) "");
        stdDateFormat0._formatISO8601 = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance();
        dateFormat1.setLenient(true);
        boolean boolean4 = stdDateFormat0.equals((java.lang.Object) dateFormat1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        stdDateFormat0._timezone = timeZone1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj3 = dateFormat0.parseObject("1970-01-01");
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        dateFormat1.setLenient(true);
        java.lang.String str5 = dateFormat1.format((java.lang.Object) 100.0d);
        java.util.Calendar calendar6 = dateFormat1.getCalendar();
        stdDateFormat0.setCalendar(calendar6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 100.0d);
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = null;
        java.util.Locale locale6 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5, locale6);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        stdDateFormat7.setNumberFormat(numberFormat9);
        stdDateFormat7._lenient = false;
        stdDateFormat7._lenient = false;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 0);
        stdDateFormat7._formatPlain = dateFormat17;
        stdDateFormat7._clearFormats();
        stdDateFormat7._clearFormats();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance();
        java.util.Calendar calendar22 = dateFormat21.getCalendar();
        dateFormat21.setLenient(false);
        stdDateFormat7._formatISO8601_z = dateFormat21;
        java.util.Locale locale26 = stdDateFormat7._locale;
        java.text.NumberFormat numberFormat27 = stdDateFormat7.getNumberFormat();
        boolean boolean28 = dateFormat0.equals((java.lang.Object) numberFormat27);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance((int) (byte) 1);
        java.util.Calendar calendar31 = dateFormat30.getCalendar();
        dateFormat0.setCalendar(calendar31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar22 and calendar31", (calendar22.compareTo(calendar31) == 0) == calendar22.equals(calendar31));
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dateFormat0.setLenient(true);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
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
        stdDateFormat2._lenient = false;
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
        java.util.Locale locale30 = stdDateFormat18._locale;
        boolean boolean32 = stdDateFormat18.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance();
        java.lang.String str35 = dateFormat33.format((java.lang.Object) 10L);
        java.util.Calendar calendar36 = dateFormat33.getCalendar();
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getTimeInstance();
        java.lang.String str39 = dateFormat37.format((java.lang.Object) 10L);
        dateFormat37.setLenient(true);
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat43 = dateFormat42.getNumberFormat();
        dateFormat37.setNumberFormat(numberFormat43);
        dateFormat33.setNumberFormat(numberFormat43);
        java.util.Calendar calendar46 = dateFormat33.getCalendar();
        stdDateFormat18.setCalendar(calendar46);
        java.text.DateFormat dateFormat48 = java.text.DateFormat.getTimeInstance();
        java.lang.String str50 = dateFormat48.format((java.lang.Object) 10L);
        dateFormat48.setLenient(true);
        dateFormat48.setLenient(true);
        java.util.Calendar calendar55 = dateFormat48.getCalendar();
        stdDateFormat18.setCalendar(calendar55);
        stdDateFormat2.setCalendar(calendar55);
        stdDateFormat2.setLenient(false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar36 and calendar55", (calendar36.compareTo(calendar55) == 0) == calendar36.equals(calendar55));
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat0.setLenient(true);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
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
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance();
        java.lang.String str33 = dateFormat31.format((java.lang.Object) 10L);
        dateFormat31.setLenient(true);
        dateFormat31.setLenient(true);
        java.util.Calendar calendar38 = dateFormat31.getCalendar();
        dateFormat29.setCalendar(calendar38);
        stdDateFormat2.setCalendar(calendar38);
        java.text.DateFormat dateFormat41 = stdDateFormat2._formatPlain;
        java.text.DateFormat dateFormat42 = stdDateFormat2._formatPlain;
        java.util.TimeZone timeZone43 = null;
        java.util.Locale locale44 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone43, locale44);
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat47 = dateFormat46.getNumberFormat();
        stdDateFormat45.setNumberFormat(numberFormat47);
        java.lang.String str49 = stdDateFormat45.toString();
        java.lang.String str50 = stdDateFormat45.toString();
        java.text.DateFormat dateFormat51 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat45._formatISO8601 = dateFormat51;
        java.text.DateFormat dateFormat53 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean55 = dateFormat53.equals((java.lang.Object) 10L);
        java.util.Calendar calendar56 = dateFormat53.getCalendar();
        stdDateFormat45.setCalendar(calendar56);
        java.text.DateFormat dateFormat58 = stdDateFormat45._formatRFC1123;
        java.text.DateFormat dateFormat59 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat60 = dateFormat59.getNumberFormat();
        java.text.DateFormat dateFormat61 = java.text.DateFormat.getTimeInstance();
        java.lang.String str63 = dateFormat61.format((java.lang.Object) 10L);
        dateFormat61.setLenient(true);
        dateFormat61.setLenient(true);
        java.util.Calendar calendar68 = dateFormat61.getCalendar();
        dateFormat59.setCalendar(calendar68);
        dateFormat59.setLenient(false);
        stdDateFormat45._formatISO8601 = dateFormat59;
        java.text.DateFormat dateFormat73 = stdDateFormat45._formatISO8601;
        java.lang.Class<?> wildcardClass74 = stdDateFormat45.getClass();
        boolean boolean75 = dateFormat42.equals((java.lang.Object) wildcardClass74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar38 and calendar68", (calendar38.compareTo(calendar68) == 0) == calendar38.equals(calendar68));
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
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
        java.util.TimeZone timeZone26 = null;
        java.util.Locale locale27 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone26, locale27);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        stdDateFormat28.setNumberFormat(numberFormat30);
        java.text.DateFormat dateFormat32 = stdDateFormat28._formatRFC1123;
        java.text.DateFormat dateFormat33 = stdDateFormat28._formatPlain;
        boolean boolean34 = stdDateFormat28.isLenient();
        java.text.DateFormat dateFormat35 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat36 = dateFormat35.getNumberFormat();
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance();
        dateFormat37.setLenient(true);
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getTimeInstance();
        java.lang.String str43 = dateFormat41.format((java.lang.Object) 10L);
        java.util.Calendar calendar44 = dateFormat41.getCalendar();
        dateFormat40.setCalendar(calendar44);
        dateFormat37.setCalendar(calendar44);
        dateFormat35.setCalendar(calendar44);
        stdDateFormat28.setCalendar(calendar44);
        java.text.NumberFormat numberFormat49 = stdDateFormat28.getNumberFormat();
        stdDateFormat2._formatISO8601 = stdDateFormat28;
        stdDateFormat28.setLenient(false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar44", (calendar18.compareTo(calendar44) == 0) == calendar18.equals(calendar44));
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(2, 1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.lang.String str5 = dateFormat3.format((java.lang.Object) 10L);
        dateFormat3.setLenient(true);
        dateFormat3.setLenient(true);
        java.util.Calendar calendar10 = dateFormat3.getCalendar();
        dateFormat2.setCalendar(calendar10);
        dateFormat2.setLenient(false);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        dateFormat14.setLenient(true);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.lang.String str19 = dateFormat17.format((java.lang.Object) 10L);
        java.util.Calendar calendar20 = dateFormat17.getCalendar();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        java.lang.String str23 = dateFormat21.format((java.lang.Object) 10L);
        dateFormat21.setLenient(true);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat27);
        dateFormat17.setNumberFormat(numberFormat27);
        dateFormat14.setNumberFormat(numberFormat27);
        boolean boolean31 = dateFormat2.equals((java.lang.Object) numberFormat27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar10 and calendar20", (calendar10.compareTo(calendar20) == 0) == calendar10.equals(calendar20));
    }
}

