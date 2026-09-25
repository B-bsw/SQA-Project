package org.apache.commons.lang3.time;

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale11 = fastDateFormat10.getLocale();
        java.lang.String str12 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone5, true, (int) (short) 1, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone5);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone19);
        boolean boolean23 = fastDateFormat22.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone24 = fastDateFormat22.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone29 = fastDateFormat28.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone29);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        java.util.Locale locale32 = fastDateFormat30.getLocale();
        java.lang.String str33 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone24, true, 0, locale32);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = new org.apache.commons.lang3.time.FastDateFormat("", timeZone14, locale32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = fastDateFormat34.format((long) (short) 0);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone3);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1);
        java.util.Locale locale10 = fastDateFormat9.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = new org.apache.commons.lang3.time.FastDateFormat("hi!", timeZone7, locale10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = new org.apache.commons.lang3.time.FastDateFormat("FastDateFormat[d/M/yy]", timeZone3, locale10);
        java.lang.Object obj13 = fastDateFormat12.clone();
        java.lang.String str14 = fastDateFormat12.getPattern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = fastDateFormat12.format((long) '4');
    }
}

