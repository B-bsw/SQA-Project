package org.apache.commons.lang3.time;

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
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5);
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone5, locale7);
        java.util.Calendar calendar9 = null;
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.StringBuffer stringBuffer11 = fastDateFormat8.applyRules(calendar9, stringBuffer10);
        java.util.TimeZone timeZone12 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone12, locale14);
        java.lang.String str16 = fastDateFormat15.getPattern();
        java.util.Locale locale17 = fastDateFormat15.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance("mm", locale17);
        java.lang.String str20 = fastDateFormat18.format(0L);
        java.lang.String str21 = fastDateFormat18.toString();
        boolean boolean22 = fastDateFormat18.getTimeZoneOverridesCalendar();
        java.lang.String str23 = fastDateFormat18.toString();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNull(stringBuffer11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
// flaky "1) test5501(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz" + "'", str16, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00" + "'", str20, "00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "FastDateFormat[mm]" + "'", str21, "FastDateFormat[mm]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "FastDateFormat[mm]" + "'", str23, "FastDateFormat[mm]");
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone9, locale12);
        boolean boolean14 = fastDateFormat13.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone15 = fastDateFormat13.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        java.lang.String str26 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone19, true, (int) (short) 1, locale25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone15, locale25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone29 = fastDateFormat28.getTimeZone();
        boolean boolean31 = fastDateFormat28.equals((java.lang.Object) 1.0f);
        java.lang.String str33 = fastDateFormat28.format((long) (short) -1);
        boolean boolean34 = fastDateFormat28.getTimeZoneOverridesCalendar();
        java.util.Locale locale35 = fastDateFormat28.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = new org.apache.commons.lang3.time.FastDateFormat("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]", timeZone15, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone44 = fastDateFormat43.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale50 = fastDateFormat49.getLocale();
        java.lang.String str51 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone44, true, (int) (short) 1, locale50);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone58 = fastDateFormat57.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone58);
        java.util.Locale locale60 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 06:59", timeZone58, locale60);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone58);
        boolean boolean64 = fastDateFormat62.equals((java.lang.Object) 1L);
        java.util.TimeZone timeZone65 = fastDateFormat62.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone70 = fastDateFormat69.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone70);
        java.util.Locale locale72 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone70, locale72);
        java.util.Calendar calendar74 = null;
        java.lang.StringBuffer stringBuffer75 = null;
        java.lang.StringBuffer stringBuffer76 = fastDateFormat73.applyRules(calendar74, stringBuffer75);
        java.util.TimeZone timeZone77 = fastDateFormat73.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale79 = fastDateFormat78.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone77, locale79);
        java.lang.String str81 = fastDateFormat80.getPattern();
        java.util.Locale locale82 = fastDateFormat80.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat83 = new org.apache.commons.lang3.time.FastDateFormat("mm", timeZone65, locale82);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat84 = new org.apache.commons.lang3.time.FastDateFormat("\u0e32\u0e17\u0e35 ", timeZone44, locale82);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat85 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, 0, locale82);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat86 = new org.apache.commons.lang3.time.FastDateFormat("07:00:00", timeZone15, locale82);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(51, (-1), timeZone15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Indochina Summer Time" + "'", str26, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1/1/70 06:59" + "'", str33, "1/1/70 06:59");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Indochina Summer Time" + "'", str51, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(timeZone58);
        org.junit.Assert.assertEquals(timeZone58.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(timeZone65);
        org.junit.Assert.assertEquals(timeZone65.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(timeZone70);
        org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNull(stringBuffer76);
        org.junit.Assert.assertNotNull(timeZone77);
        org.junit.Assert.assertEquals(timeZone77.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat80);
// flaky "2) test5502(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str81 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz" + "'", str81, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat85);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone6);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6, locale8);
        java.util.Calendar calendar10 = null;
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.StringBuffer stringBuffer12 = fastDateFormat9.applyRules(calendar10, stringBuffer11);
        java.util.TimeZone timeZone13 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone13, locale15);
        java.lang.String str17 = fastDateFormat16.getPattern();
        int int18 = fastDateFormat16.getMaxLengthEstimate();
        java.lang.String str19 = fastDateFormat16.toString();
        java.util.TimeZone timeZone20 = fastDateFormat16.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(11, 30, timeZone20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 30");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNull(stringBuffer12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat16);
// flaky "3) test5503(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz" + "'", str17, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
// flaky "1) test5503(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]" + "'", str19, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone8);
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone8, locale10);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone8, locale12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance("'1/1/70 06:59", locale14);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone30);
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone30, locale32);
        java.util.Locale locale34 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone30, locale34);
        java.util.Locale locale36 = fastDateFormat35.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = new org.apache.commons.lang3.time.FastDateFormat("'1/1/70 06:59", timeZone23, locale36);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone43 = fastDateFormat42.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone48 = fastDateFormat47.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone48);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone48);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale54 = fastDateFormat53.getLocale();
        java.lang.String str55 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone48, true, (int) (short) 1, locale54);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone43, locale54);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getInstance("d/M/yy HH:mm", locale54);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale54);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone23, locale54);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = new org.apache.commons.lang3.time.FastDateFormat("FastDateFormat[d/M/yy HH:mm]", timeZone16, locale54);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone66 = fastDateFormat65.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone66);
        java.util.Locale locale68 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone66, locale68);
        java.util.TimeZone timeZone70 = fastDateFormat69.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone70);
        java.util.TimeZone timeZone72 = fastDateFormat71.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone79 = fastDateFormat78.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone79);
        java.util.Locale locale81 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat82 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone79, locale81);
        java.util.Calendar calendar83 = null;
        java.lang.StringBuffer stringBuffer84 = null;
        java.lang.StringBuffer stringBuffer85 = fastDateFormat82.applyRules(calendar83, stringBuffer84);
        java.util.TimeZone timeZone86 = fastDateFormat82.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale88 = fastDateFormat87.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat89 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone86, locale88);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat90 = org.apache.commons.lang3.time.FastDateFormat.getInstance("d MMMM y", locale88);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat91 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, locale88);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat92 = org.apache.commons.lang3.time.FastDateFormat.getInstance("d MMM y", timeZone72, locale88);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat93 = new org.apache.commons.lang3.time.FastDateFormat("1/1/70 06:59", timeZone16, locale88);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str95 = fastDateFormat93.format((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Indochina Summer Time" + "'", str55, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(timeZone66);
        org.junit.Assert.assertEquals(timeZone66.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(timeZone70);
        org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(timeZone72);
        org.junit.Assert.assertEquals(timeZone72.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(timeZone79);
        org.junit.Assert.assertEquals(timeZone79.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertNotNull(fastDateFormat82);
        org.junit.Assert.assertNull(stringBuffer85);
        org.junit.Assert.assertNotNull(timeZone86);
        org.junit.Assert.assertEquals(timeZone86.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat89);
        org.junit.Assert.assertNotNull(fastDateFormat90);
        org.junit.Assert.assertNotNull(fastDateFormat91);
        org.junit.Assert.assertNotNull(fastDateFormat92);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone6);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6, locale8);
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone6, locale10);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("'1/1/70 06:59", locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48 d MMMM GGGG y", locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone19);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        boolean boolean24 = fastDateFormat22.getTimeZoneOverridesCalendar();
        java.lang.String str25 = fastDateFormat22.getPattern();
        fastDateFormat22.init();
        boolean boolean27 = fastDateFormat14.equals((java.lang.Object) fastDateFormat22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone33);
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 06:59", timeZone33, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone41 = fastDateFormat40.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone41);
        java.util.Locale locale43 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone41, locale43);
        java.util.Calendar calendar45 = null;
        java.lang.StringBuffer stringBuffer46 = null;
        java.lang.StringBuffer stringBuffer47 = fastDateFormat44.applyRules(calendar45, stringBuffer46);
        java.util.TimeZone timeZone48 = fastDateFormat44.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale50 = fastDateFormat49.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone48, locale50);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = new org.apache.commons.lang3.time.FastDateFormat("d MMM y", timeZone33, locale50);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str55 = fastDateFormat54.getPattern();
        java.util.Locale locale56 = fastDateFormat54.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = new org.apache.commons.lang3.time.FastDateFormat("1/1/70 06:59", timeZone33, locale56);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator58 = fastDateFormat22.formatToCharacterIterator((java.lang.Object) timeZone33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: sun.util.calendar.ZoneInfo");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNull(stringBuffer47);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "d MMM y" + "'", str55, "d MMM y");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "th_TH");
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("a");
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone7);
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 06:59", timeZone7, locale9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone7);
        boolean boolean13 = fastDateFormat11.equals((java.lang.Object) 1L);
        java.util.TimeZone timeZone14 = fastDateFormat11.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone19);
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone19, locale21);
        java.util.Calendar calendar23 = null;
        java.lang.StringBuffer stringBuffer24 = null;
        java.lang.StringBuffer stringBuffer25 = fastDateFormat22.applyRules(calendar23, stringBuffer24);
        java.util.TimeZone timeZone26 = fastDateFormat22.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale28 = fastDateFormat27.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone26, locale28);
        java.lang.String str30 = fastDateFormat29.getPattern();
        java.util.Locale locale31 = fastDateFormat29.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = new org.apache.commons.lang3.time.FastDateFormat("mm", timeZone14, locale31);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale44 = fastDateFormat43.getLocale();
        java.lang.String str45 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone38, true, (int) (short) 1, locale44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone38);
        java.util.TimeZone timeZone47 = fastDateFormat46.getTimeZone();
        java.lang.String str48 = fastDateFormat46.getPattern();
        java.lang.Object obj49 = fastDateFormat46.clone();
        java.util.Locale locale50 = fastDateFormat46.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = new org.apache.commons.lang3.time.FastDateFormat("\u0e17\u0e35\u0e48\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z]", timeZone33, locale50);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale50);
        fastDateFormat52.init();
        java.lang.String str55 = fastDateFormat52.format((long) (short) 1);
        java.lang.String str56 = fastDateFormat52.getPattern();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone59 = fastDateFormat58.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone59);
        int int61 = fastDateFormat60.getMaxLengthEstimate();
        java.util.TimeZone timeZone62 = fastDateFormat60.getTimeZone();
        int int63 = fastDateFormat60.getMaxLengthEstimate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str64 = fastDateFormat52.format((java.lang.Object) fastDateFormat60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNull(stringBuffer25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat29);
// flaky "4) test5507(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz" + "'", str30, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Indochina Summer Time" + "'", str45, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
// flaky "2) test5507(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z" + "'", str48, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z");
        org.junit.Assert.assertNotNull(obj49);
// flaky "1) test5507(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals(obj49.toString(), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z]");
// flaky "1) test5507(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z]");
// flaky "1) test5507(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z]");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat52);
// flaky "1) test5507(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str55, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
// flaky "1) test5507(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz" + "'", str56, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz");
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(timeZone59);
        org.junit.Assert.assertEquals(timeZone59.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 45 + "'", int61 == 45);
        org.junit.Assert.assertNotNull(timeZone62);
        org.junit.Assert.assertEquals(timeZone62.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 45 + "'", int63 == 45);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        boolean boolean6 = fastDateFormat4.getTimeZoneOverridesCalendar();
        java.lang.String str7 = fastDateFormat4.getPattern();
        java.util.TimeZone timeZone8 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone8);
        java.util.Locale locale10 = fastDateFormat9.getLocale();
        fastDateFormat9.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = fastDateFormat9.parseObject("06:59:59");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "5) test5508(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u0e17\u0e35\u0e48 d MMMM GGGG y" + "'", str7, "\u0e17\u0e35\u0e48 d MMMM GGGG y");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone8);
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone8, locale10);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone8, locale12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e32\u0e17\u0e35 ", locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, locale14);
        java.lang.Object obj19 = fastDateFormat18.clone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone24);
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone24, locale26);
        java.util.Calendar calendar28 = null;
        java.lang.StringBuffer stringBuffer29 = null;
        java.lang.StringBuffer stringBuffer30 = fastDateFormat27.applyRules(calendar28, stringBuffer29);
        java.lang.Object obj31 = fastDateFormat27.clone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone37 = fastDateFormat36.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone37);
        java.util.Locale locale39 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone37, locale39);
        java.util.Locale locale41 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone37, locale41);
        fastDateFormat42.init();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70");
        java.util.Locale locale47 = fastDateFormat46.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone52 = fastDateFormat51.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone52);
        java.util.Locale locale54 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone52, locale54);
        java.util.Calendar calendar56 = null;
        java.lang.StringBuffer stringBuffer57 = null;
        java.lang.StringBuffer stringBuffer58 = fastDateFormat55.applyRules(calendar56, stringBuffer57);
        int[] intArray66 = new int[] { 0, 0, (short) 1, (short) -1, (byte) 0, 0 };
        java.lang.String str67 = fastDateFormat55.parseToken("1/1/70 06:59", intArray66);
        java.lang.String str68 = fastDateFormat46.parseToken("Indochina Summer Time", intArray66);
        java.lang.String str69 = fastDateFormat42.parseToken("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz", intArray66);
        java.lang.String str70 = fastDateFormat27.parseToken("FastDateFormat[d MMM y]", intArray66);
        java.lang.String str71 = fastDateFormat18.parseToken("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z]", intArray66);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "FastDateFormat[d MMMM y]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "FastDateFormat[d MMMM y]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "FastDateFormat[d MMMM y]");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNull(stringBuffer30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNull(stringBuffer58);
        org.junit.Assert.assertNotNull(intArray66);
// flaky "6) test5509(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertArrayEquals(intArray66, new int[] { 23, 0, 1, (-1), 0, 0 });
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "'1/1/70 06:59" + "'", str67, "'1/1/70 06:59");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "mm" + "'", str68, "mm");
// flaky "3) test5509(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\u0e32\u0e17\u0e35 " + "'", str69, "\u0e32\u0e17\u0e35 ");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "' " + "'", str70, "' ");
// flaky "2) test5509(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32 " + "'", str71, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32 ");
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70");
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11);
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone11, locale14);
        boolean boolean16 = fastDateFormat15.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone17 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale27 = fastDateFormat26.getLocale();
        java.lang.String str28 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone21, true, (int) (short) 1, locale27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone17, locale27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone5, locale27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz", timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone5);
        int int33 = fastDateFormat32.getMaxLengthEstimate();
        java.util.TimeZone timeZone34 = fastDateFormat32.getTimeZone();
        java.lang.String str35 = fastDateFormat32.toString();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Indochina Summer Time" + "'", str28, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 45 + "'", int33 == 45);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
// flaky "7) test5510(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u0e17\u0e35\u0e48 d MMMM GGGG y]" + "'", str35, "\u0e17\u0e35\u0e48 d MMMM GGGG y]");
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone4);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone4);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone4);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        boolean boolean9 = fastDateFormat7.getTimeZoneOverridesCalendar();
        int int10 = fastDateFormat7.getMaxLengthEstimate();
        java.lang.String str12 = fastDateFormat7.format((long) (short) 1);
        java.lang.Object obj13 = fastDateFormat7.clone();
        java.util.Calendar calendar14 = null;
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = fastDateFormat7.format(calendar14, stringBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "FastDateFormat[]");
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70");
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12);
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone12, locale15);
        boolean boolean17 = fastDateFormat16.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone18 = fastDateFormat16.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale28 = fastDateFormat27.getLocale();
        java.lang.String str29 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone22, true, (int) (short) 1, locale28);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone18, locale28);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone6, locale28);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz", timeZone6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone38);
        java.util.Locale locale40 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 06:59", timeZone38, locale40);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone45 = fastDateFormat44.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone48 = fastDateFormat47.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1);
        java.util.Locale locale51 = fastDateFormat50.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = new org.apache.commons.lang3.time.FastDateFormat("hi!", timeZone48, locale51);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getInstance("mm", timeZone45, locale51);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = new org.apache.commons.lang3.time.FastDateFormat("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32 ", timeZone38, locale51);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone6, locale51);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone60 = fastDateFormat59.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone60);
        java.util.Locale locale62 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone60, locale62);
        java.util.Calendar calendar64 = null;
        java.lang.StringBuffer stringBuffer65 = null;
        java.lang.StringBuffer stringBuffer66 = fastDateFormat63.applyRules(calendar64, stringBuffer65);
        int[] intArray74 = new int[] { 0, 0, (short) 1, (short) -1, (byte) 0, 0 };
        java.lang.String str75 = fastDateFormat63.parseToken("1/1/70 06:59", intArray74);
        java.lang.Object obj76 = fastDateFormat63.clone();
        java.util.TimeZone timeZone77 = fastDateFormat63.getTimeZone();
        java.util.Locale locale78 = fastDateFormat63.getLocale();
        boolean boolean79 = fastDateFormat63.getTimeZoneOverridesCalendar();
        java.util.Locale locale80 = fastDateFormat63.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", locale80);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat82 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[mm]", timeZone6, locale80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Indochina Summer Time" + "'", str29, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(timeZone60);
        org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNull(stringBuffer66);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { 12, 0, 1, (-1), 0, 0 });
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "'1/1/70 06:59" + "'", str75, "'1/1/70 06:59");
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertEquals(obj76.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj76), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj76), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone77);
        org.junit.Assert.assertEquals(timeZone77.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat81);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone6);
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6, locale9);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance("'1/1/70 06:59", timeZone6, locale11);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone21);
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 06:59", timeZone21, locale23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1);
        java.util.Locale locale34 = fastDateFormat33.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = new org.apache.commons.lang3.time.FastDateFormat("hi!", timeZone31, locale34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getInstance("mm", timeZone28, locale34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = new org.apache.commons.lang3.time.FastDateFormat("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32 ", timeZone21, locale34);
        java.lang.String str38 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone13, true, 0, locale34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone43 = fastDateFormat42.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone48 = fastDateFormat47.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone48);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone48);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale54 = fastDateFormat53.getLocale();
        java.lang.String str55 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone48, true, (int) (short) 1, locale54);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone43, locale54);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getInstance("d/M/yy HH:mm", locale54);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone13, locale54);
        boolean boolean59 = fastDateFormat58.getTimeZoneOverridesCalendar();
        java.lang.StringBuffer stringBuffer61 = null;
        java.lang.StringBuffer stringBuffer62 = fastDateFormat58.format((long) (byte) 0, stringBuffer61);
        boolean boolean63 = fastDateFormat58.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ICST" + "'", str38, "ICST");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Indochina Summer Time" + "'", str55, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(stringBuffer62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48 d MMMM GGGG y");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone8, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("mm", timeZone8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone18 = fastDateFormat17.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone18);
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone18, locale20);
        java.util.Calendar calendar22 = null;
        java.lang.StringBuffer stringBuffer23 = null;
        java.lang.StringBuffer stringBuffer24 = fastDateFormat21.applyRules(calendar22, stringBuffer23);
        java.util.TimeZone timeZone25 = fastDateFormat21.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale27 = fastDateFormat26.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone25, locale27);
        java.util.Locale locale29 = fastDateFormat28.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48 d MMMM GGGG y", timeZone8, locale29);
        boolean boolean31 = fastDateFormat1.equals((java.lang.Object) timeZone8);
        java.util.TimeZone timeZone32 = fastDateFormat1.getTimeZone();
        java.lang.String str33 = fastDateFormat1.toString();
        java.lang.String str34 = fastDateFormat1.toString();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNull(stringBuffer24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
// flaky "8) test5514(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u0e17\u0e35\u0e48 d MMMM GGGG y]" + "'", str33, "\u0e17\u0e35\u0e48 d MMMM GGGG y]");
// flaky "4) test5514(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u0e17\u0e35\u0e48 d MMMM GGGG y]" + "'", str34, "\u0e17\u0e35\u0e48 d MMMM GGGG y]");
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = new org.apache.commons.lang3.time.FastDateFormat("hi!", timeZone9, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone6, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance("d/M/yy", locale12);
        java.lang.String str17 = fastDateFormat15.format((long) 0);
        java.util.Calendar calendar18 = null;
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = fastDateFormat15.applyRules(calendar18, stringBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1/1/70" + "'", str17, "1/1/70");
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale11 = fastDateFormat10.getLocale();
        java.lang.String str12 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone5, true, (int) (short) 1, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone19);
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 06:59", timeZone19, locale21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone27);
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone27, locale29);
        java.util.Calendar calendar31 = null;
        java.lang.StringBuffer stringBuffer32 = null;
        java.lang.StringBuffer stringBuffer33 = fastDateFormat30.applyRules(calendar31, stringBuffer32);
        java.util.TimeZone timeZone34 = fastDateFormat30.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale36 = fastDateFormat35.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone34, locale36);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = new org.apache.commons.lang3.time.FastDateFormat("d MMM y", timeZone19, locale36);
        java.lang.String str39 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone5, true, (int) (byte) 1, locale36);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, locale36);
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Indochina Summer Time" + "'", str12, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNull(stringBuffer33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Indochina Summer Time" + "'", str39, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat40);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale11 = fastDateFormat10.getLocale();
        java.lang.String str12 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone5, true, (int) (short) 1, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone5);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone20 = fastDateFormat19.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone20);
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone20, locale22);
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        java.util.Locale locale25 = fastDateFormat23.getLocale();
        java.lang.String str26 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone14, true, (int) (short) 0, locale25);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[00]", timeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Indochina Summer Time" + "'", str12, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ICST" + "'", str26, "ICST");
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone10);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone10, locale12);
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone10, locale14);
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70", locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1, locale16);
        java.lang.String str22 = fastDateFormat21.toString();
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
// flaky "9) test5518(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]" + "'", str22, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone9);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone9, locale11);
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone9, locale13);
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance("'1/1/70 06:59", locale15);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone17);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone28);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone28);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale34 = fastDateFormat33.getLocale();
        java.lang.String str35 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone28, true, (int) (short) 1, locale34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone23, locale34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance("d/M/yy HH:mm", locale34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone17, locale34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale40 = fastDateFormat39.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = new org.apache.commons.lang3.time.FastDateFormat("\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70]", timeZone17, locale40);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(12, locale40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Indochina Summer Time" + "'", str35, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        java.lang.String str14 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone7, true, (int) (short) 1, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone7);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone21);
        boolean boolean25 = fastDateFormat24.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone26 = fastDateFormat24.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone31);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        java.util.Locale locale34 = fastDateFormat32.getLocale();
        java.lang.String str35 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone26, true, 0, locale34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = new org.apache.commons.lang3.time.FastDateFormat("", timeZone16, locale34);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(34, (int) (short) -1, locale34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Indochina Summer Time" + "'", str14, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ICST" + "'", str35, "ICST");
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone1 = fastDateFormat0.getTimeZone();
        boolean boolean3 = fastDateFormat0.equals((java.lang.Object) 1.0f);
        java.lang.String str5 = fastDateFormat0.format((long) (short) -1);
        boolean boolean6 = fastDateFormat0.getTimeZoneOverridesCalendar();
        java.util.Locale locale7 = fastDateFormat0.getLocale();
        fastDateFormat0.init();
        java.util.TimeZone timeZone9 = fastDateFormat0.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fastDateFormat0.parseObject("' 70");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1/1/70 06:59" + "'", str5, "1/1/70 06:59");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean11 = fastDateFormat10.getTimeZoneOverridesCalendar();
        java.lang.String str13 = fastDateFormat10.format(0L);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone20 = fastDateFormat19.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone20);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone20);
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone20, locale23);
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("'1/1/70 06:59", timeZone20, locale25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale28 = fastDateFormat27.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = new org.apache.commons.lang3.time.FastDateFormat("FastDateFormat[d/M/yy HH:mm]", timeZone20, locale28);
        boolean boolean30 = fastDateFormat10.equals((java.lang.Object) locale28);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance("'1/1/70 06:59", locale28);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone5, locale28);
        int int33 = fastDateFormat32.getMaxLengthEstimate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = fastDateFormat32.parseObject("FastDateFormat[00]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1/1/70 07:00" + "'", str13, "1/1/70 07:00");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 45 + "'", int33 == 45);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        fastDateFormat0.init();
        java.lang.String str2 = fastDateFormat0.toString();
        boolean boolean3 = fastDateFormat0.getTimeZoneOverridesCalendar();
        java.lang.Object obj4 = fastDateFormat0.clone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone9);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone9, locale11);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone23);
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone23, locale25);
        java.util.Locale locale27 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone23, locale27);
        java.util.Locale locale29 = fastDateFormat28.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getInstance("'1/1/70 06:59", locale29);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 06:59", timeZone31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone38);
        java.util.Locale locale40 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 06:59", timeZone38, locale40);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 06:59");
        java.util.Locale locale45 = fastDateFormat44.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale45);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone38, locale45);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 07:00", locale45);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = new org.apache.commons.lang3.time.FastDateFormat("\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70]", timeZone31, locale45);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1);
        java.util.Locale locale52 = fastDateFormat51.getLocale();
        boolean boolean53 = fastDateFormat51.getTimeZoneOverridesCalendar();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone57 = fastDateFormat56.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone57);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone57);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale63 = fastDateFormat62.getLocale();
        java.lang.String str64 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone57, true, (int) (short) 1, locale63);
        boolean boolean65 = fastDateFormat51.equals((java.lang.Object) true);
        int int66 = fastDateFormat51.getMaxLengthEstimate();
        java.util.Locale locale67 = fastDateFormat51.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz", timeZone31, locale67);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getInstance("d/M/yy", locale67);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat70 = new org.apache.commons.lang3.time.FastDateFormat("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]", timeZone13, locale67);
        boolean boolean71 = fastDateFormat0.equals((java.lang.Object) locale67);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang3.time.FastDateFormat.getInstance("d MMM y");
        java.lang.Object obj74 = fastDateFormat73.clone();
        java.lang.String str75 = fastDateFormat73.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str76 = fastDateFormat0.format((java.lang.Object) fastDateFormat73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FastDateFormat[d/M/yy HH:mm]" + "'", str2, "FastDateFormat[d/M/yy HH:mm]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "FastDateFormat[d/M/yy HH:mm]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "FastDateFormat[d/M/yy HH:mm]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "FastDateFormat[d/M/yy HH:mm]");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(timeZone57);
        org.junit.Assert.assertEquals(timeZone57.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Indochina Summer Time" + "'", str64, "Indochina Summer Time");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 34 + "'", int66 == 34);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertEquals(obj74.toString(), "FastDateFormat[d MMM y]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj74), "FastDateFormat[d MMM y]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj74), "FastDateFormat[d MMM y]");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "FastDateFormat[d MMM y]" + "'", str75, "FastDateFormat[d MMM y]");
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("'1/1/70 06:59", timeZone1);
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        java.lang.String str17 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone10, true, (int) (short) 1, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone5, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getInstance("d/M/yy HH:mm", locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale16);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone27);
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone27, locale29);
        java.util.Calendar calendar31 = null;
        java.lang.StringBuffer stringBuffer32 = null;
        java.lang.StringBuffer stringBuffer33 = fastDateFormat30.applyRules(calendar31, stringBuffer32);
        int[] intArray41 = new int[] { 0, 0, (short) 1, (short) -1, (byte) 0, 0 };
        java.lang.String str42 = fastDateFormat30.parseToken("1/1/70 06:59", intArray41);
        java.lang.Object obj43 = fastDateFormat30.clone();
        java.util.TimeZone timeZone44 = fastDateFormat30.getTimeZone();
        java.util.Locale locale45 = fastDateFormat30.getLocale();
        boolean boolean46 = fastDateFormat23.equals((java.lang.Object) fastDateFormat30);
        boolean boolean47 = fastDateFormat20.equals((java.lang.Object) boolean46);
        boolean boolean48 = fastDateFormat20.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone49 = fastDateFormat20.getTimeZone();
        java.util.Date date50 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = fastDateFormat20.format(date50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Indochina Summer Time" + "'", str17, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNull(stringBuffer33);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 12, 0, 1, (-1), 0, 0 });
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "'1/1/70 06:59" + "'", str42, "'1/1/70 06:59");
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.lang.String str2 = fastDateFormat1.getPattern();
        java.util.Locale locale3 = fastDateFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 10, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d/M/yy HH:mm" + "'", str2, "d/M/yy HH:mm");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1);
        java.lang.String str3 = fastDateFormat2.getPattern();
        int int4 = fastDateFormat2.getMaxLengthEstimate();
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11);
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone11, locale14);
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getInstance("'1/1/70 06:59", timeZone11, locale16);
        boolean boolean18 = fastDateFormat2.equals((java.lang.Object) timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone23);
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone23, locale25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance("mm", timeZone23);
        fastDateFormat27.init();
        java.util.Locale locale29 = fastDateFormat27.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = new org.apache.commons.lang3.time.FastDateFormat("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]", timeZone11, locale29);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale44 = fastDateFormat43.getLocale();
        java.lang.String str45 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone38, true, (int) (short) 1, locale44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone49 = fastDateFormat48.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone54 = fastDateFormat53.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone54);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone54);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone61 = fastDateFormat60.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone61);
        java.util.Locale locale63 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone61, locale63);
        java.util.Locale locale65 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone61, locale65);
        java.util.Locale locale67 = fastDateFormat66.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat68 = new org.apache.commons.lang3.time.FastDateFormat("'1/1/70 06:59", timeZone54, locale67);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = new org.apache.commons.lang3.time.FastDateFormat("d/M/yy", timeZone49, locale67);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang3.time.FastDateFormat.getInstance("07:00", timeZone38, locale67);
        java.lang.String str71 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone11, true, 0, locale67);
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "d MMMM y" + "'", str3, "d MMMM y");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 18 + "'", int4 == 18);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 18 + "'", int5 == 18);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Indochina Summer Time" + "'", str45, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(timeZone61);
        org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "ICST" + "'", str71, "ICST");
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5);
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone5, locale7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone15);
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 06:59", timeZone15, locale17);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 06:59");
        java.util.Locale locale22 = fastDateFormat21.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone15, locale22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 07:00", locale22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone9, locale22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32 ]", timeZone9);
// flaky "10) test5528(org.apache.commons.lang3.time.RegressionTest11)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone7);
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7, locale10);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("'1/1/70 06:59", timeZone7, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = new org.apache.commons.lang3.time.FastDateFormat("FastDateFormat[d/M/yy HH:mm]", timeZone7, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean29 = fastDateFormat28.getTimeZoneOverridesCalendar();
        java.lang.String str31 = fastDateFormat28.format(0L);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone38);
        java.util.Locale locale41 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone38, locale41);
        java.util.Locale locale43 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getInstance("'1/1/70 06:59", timeZone38, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale46 = fastDateFormat45.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = new org.apache.commons.lang3.time.FastDateFormat("FastDateFormat[d/M/yy HH:mm]", timeZone38, locale46);
        boolean boolean48 = fastDateFormat28.equals((java.lang.Object) locale46);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getInstance("'1/1/70 06:59", locale46);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone23, locale46);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone55 = fastDateFormat54.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone62 = fastDateFormat61.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone62);
        java.util.TimeZone timeZone64 = fastDateFormat63.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone67 = fastDateFormat66.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1);
        java.util.Locale locale70 = fastDateFormat69.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat71 = new org.apache.commons.lang3.time.FastDateFormat("hi!", timeZone67, locale70);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone64, locale70);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang3.time.FastDateFormat.getInstance("d/M/yy", locale70);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat74 = new org.apache.commons.lang3.time.FastDateFormat("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70]", timeZone55, locale70);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat75 = new org.apache.commons.lang3.time.FastDateFormat("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone23, locale70);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(24, timeZone7, locale70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 24");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1/1/70 07:00" + "'", str31, "1/1/70 07:00");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(timeZone62);
        org.junit.Assert.assertEquals(timeZone62.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(timeZone64);
        org.junit.Assert.assertEquals(timeZone64.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(timeZone67);
        org.junit.Assert.assertEquals(timeZone67.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(fastDateFormat73);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32 ]", locale1);
// flaky "11) test5530(org.apache.commons.lang3.time.RegressionTest11)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e04\u0e28. 70]");
        java.util.Calendar calendar2 = null;
        java.lang.String str3 = fastDateFormat1.format(calendar2);
        java.lang.Object obj4 = fastDateFormat1.clone();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u0e04\u0e28. 70]" + "'", str3, "\u0e04\u0e28. 70]");
        org.junit.Assert.assertNotNull(obj4);
// flaky "12) test5531(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals(obj4.toString(), "\u0e04\u0e28. 70]]");
// flaky "5) test5531(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "\u0e04\u0e28. 70]]");
// flaky "3) test5531(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "\u0e04\u0e28. 70]]");
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("07:00");
        java.lang.Object obj2 = fastDateFormat1.clone();
        java.util.Locale locale3 = fastDateFormat1.getLocale();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[07:00]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "FastDateFormat[07:00]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "FastDateFormat[07:00]");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone5);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone16);
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone16, locale18);
        java.util.Calendar calendar20 = null;
        java.lang.StringBuffer stringBuffer21 = null;
        java.lang.StringBuffer stringBuffer22 = fastDateFormat19.applyRules(calendar20, stringBuffer21);
        java.util.TimeZone timeZone23 = fastDateFormat19.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone23, locale25);
        java.util.Locale locale27 = fastDateFormat26.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, 2, locale27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getInstance("d MMM y", timeZone9, locale27);
        boolean boolean30 = fastDateFormat29.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNull(stringBuffer22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone1 = fastDateFormat0.getTimeZone();
        boolean boolean3 = fastDateFormat0.equals((java.lang.Object) 1.0f);
        java.lang.String str5 = fastDateFormat0.format((long) (short) -1);
        boolean boolean6 = fastDateFormat0.getTimeZoneOverridesCalendar();
        java.util.Locale locale7 = fastDateFormat0.getLocale();
        java.lang.String str8 = fastDateFormat0.getPattern();
        int int9 = fastDateFormat0.getMaxLengthEstimate();
        java.lang.String str10 = fastDateFormat0.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1/1/70 06:59" + "'", str5, "1/1/70 06:59");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d/M/yy HH:mm" + "'", str8, "d/M/yy HH:mm");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d/M/yy HH:mm" + "'", str10, "d/M/yy HH:mm");
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        fastDateFormat0.init();
        java.lang.String str2 = fastDateFormat0.toString();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7);
        boolean boolean11 = fastDateFormat0.equals((java.lang.Object) fastDateFormat10);
        boolean boolean12 = fastDateFormat10.getTimeZoneOverridesCalendar();
        java.lang.Object obj13 = null;
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = fastDateFormat10.format(obj13, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: <null>");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FastDateFormat[d/M/yy HH:mm]" + "'", str2, "FastDateFormat[d/M/yy HH:mm]");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70", timeZone1);
        boolean boolean3 = fastDateFormat2.getTimeZoneOverridesCalendar();
        boolean boolean4 = fastDateFormat2.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone4);
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone4, locale6);
        java.util.Calendar calendar8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat7.applyRules(calendar8, stringBuffer9);
        int[] intArray18 = new int[] { 0, 0, (short) 1, (short) -1, (byte) 0, 0 };
        java.lang.String str19 = fastDateFormat7.parseToken("1/1/70 06:59", intArray18);
        java.util.Locale locale20 = fastDateFormat7.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70", locale20);
        java.util.Locale locale22 = fastDateFormat21.getLocale();
        java.text.ParsePosition parsePosition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = fastDateFormat21.parseObject("\u0e32\u0e17\u0e35 ", parsePosition24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 12, 0, 1, (-1), 0, 0 });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "'1/1/70 06:59" + "'", str19, "'1/1/70 06:59");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e21\u0e04\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        fastDateFormat1.init();
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone3);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone3);
        java.lang.String str6 = fastDateFormat5.getPattern();
        java.lang.String str8 = fastDateFormat5.format((long) (short) 1);
        java.lang.Object obj9 = fastDateFormat5.clone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone16);
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone16, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance("mm", timeZone16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1);
        java.util.Locale locale24 = fastDateFormat23.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone16, locale24);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone32 = fastDateFormat31.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone32);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone32);
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone32, locale35);
        boolean boolean37 = fastDateFormat36.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone38 = fastDateFormat36.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone42 = fastDateFormat41.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone42);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone42);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale48 = fastDateFormat47.getLocale();
        java.lang.String str49 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone42, true, (int) (short) 1, locale48);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone38, locale48);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone52 = fastDateFormat51.getTimeZone();
        boolean boolean54 = fastDateFormat51.equals((java.lang.Object) 1.0f);
        java.lang.String str56 = fastDateFormat51.format((long) (short) -1);
        boolean boolean57 = fastDateFormat51.getTimeZoneOverridesCalendar();
        java.util.Locale locale58 = fastDateFormat51.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = new org.apache.commons.lang3.time.FastDateFormat("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]", timeZone38, locale58);
        boolean boolean60 = fastDateFormat25.equals((java.lang.Object) timeZone38);
        java.lang.StringBuffer stringBuffer61 = null;
        java.text.FieldPosition fieldPosition62 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer63 = fastDateFormat5.format((java.lang.Object) timeZone38, stringBuffer61, fieldPosition62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: sun.util.calendar.ZoneInfo");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d/M/yy" + "'", str6, "d/M/yy");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1/1/70" + "'", str8, "1/1/70");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[d/M/yy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "FastDateFormat[d/M/yy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "FastDateFormat[d/M/yy]");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Indochina Summer Time" + "'", str49, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1/1/70 06:59" + "'", str56, "1/1/70 06:59");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        fastDateFormat0.init();
        java.lang.String str2 = fastDateFormat0.toString();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7);
        boolean boolean11 = fastDateFormat0.equals((java.lang.Object) fastDateFormat10);
        java.lang.Object obj12 = fastDateFormat10.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fastDateFormat10.parseObject("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FastDateFormat[d/M/yy HH:mm]" + "'", str2, "FastDateFormat[d/M/yy HH:mm]");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "FastDateFormat[]");
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone7);
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7, locale10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance("mm", timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1);
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone7, locale15);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone17);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat18);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = new org.apache.commons.lang3.time.FastDateFormat("hi!", timeZone9, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = new org.apache.commons.lang3.time.FastDateFormat("FastDateFormat[d/M/yy]", timeZone5, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone19);
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 06:59", timeZone19, locale21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone25 = fastDateFormat24.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone30);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone30);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone37 = fastDateFormat36.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone37);
        java.util.Locale locale39 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone37, locale39);
        java.util.Locale locale41 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone37, locale41);
        java.util.Locale locale43 = fastDateFormat42.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = new org.apache.commons.lang3.time.FastDateFormat("'1/1/70 06:59", timeZone30, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = new org.apache.commons.lang3.time.FastDateFormat("d/M/yy", timeZone25, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = new org.apache.commons.lang3.time.FastDateFormat("mm", timeZone19, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = new org.apache.commons.lang3.time.FastDateFormat("\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70]", timeZone5, locale43);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(70, timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 70");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70", timeZone1);
        java.util.Calendar calendar3 = null;
        java.lang.String str4 = fastDateFormat2.format(calendar3);
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/1/70" + "'", str4, "1/1/70");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone3);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone3);
        java.lang.String str6 = fastDateFormat5.getPattern();
        java.lang.String str7 = fastDateFormat5.toString();
        boolean boolean8 = fastDateFormat5.getTimeZoneOverridesCalendar();
        boolean boolean9 = fastDateFormat5.getTimeZoneOverridesCalendar();
        java.util.Locale locale10 = fastDateFormat5.getLocale();
        java.lang.String str11 = fastDateFormat5.toString();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone15);
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone15, locale17);
        java.util.Calendar calendar19 = null;
        java.lang.StringBuffer stringBuffer20 = null;
        java.lang.StringBuffer stringBuffer21 = fastDateFormat18.applyRules(calendar19, stringBuffer20);
        java.lang.Object obj22 = fastDateFormat18.clone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone28);
        java.util.Locale locale30 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone28, locale30);
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone28, locale32);
        fastDateFormat33.init();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70");
        java.util.Locale locale38 = fastDateFormat37.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone43 = fastDateFormat42.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone43);
        java.util.Locale locale45 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone43, locale45);
        java.util.Calendar calendar47 = null;
        java.lang.StringBuffer stringBuffer48 = null;
        java.lang.StringBuffer stringBuffer49 = fastDateFormat46.applyRules(calendar47, stringBuffer48);
        int[] intArray57 = new int[] { 0, 0, (short) 1, (short) -1, (byte) 0, 0 };
        java.lang.String str58 = fastDateFormat46.parseToken("1/1/70 06:59", intArray57);
        java.lang.String str59 = fastDateFormat37.parseToken("Indochina Summer Time", intArray57);
        java.lang.String str60 = fastDateFormat33.parseToken("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz", intArray57);
        java.lang.String str61 = fastDateFormat18.parseToken("FastDateFormat[d MMM y]", intArray57);
        java.lang.StringBuffer stringBuffer63 = null;
        java.lang.StringBuffer stringBuffer64 = fastDateFormat18.format((long) (short) 1, stringBuffer63);
        java.lang.StringBuffer stringBuffer65 = null;
        java.text.FieldPosition fieldPosition66 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer67 = fastDateFormat5.format((java.lang.Object) (short) 1, stringBuffer65, fieldPosition66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d/M/yy" + "'", str6, "d/M/yy");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FastDateFormat[d/M/yy]" + "'", str7, "FastDateFormat[d/M/yy]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FastDateFormat[d/M/yy]" + "'", str11, "FastDateFormat[d/M/yy]");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNull(stringBuffer21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNull(stringBuffer49);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 16, 0, 1, (-1), 0, 0 });
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "'1/1/70 06:59" + "'", str58, "'1/1/70 06:59");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "mm" + "'", str59, "mm");
// flaky "13) test5544(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\u0e32\u0e17\u0e35 " + "'", str60, "\u0e32\u0e17\u0e35 ");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "' " + "'", str61, "' ");
        org.junit.Assert.assertNull(stringBuffer64);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone5);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone5, locale8);
        fastDateFormat9.init();
        java.lang.String str12 = fastDateFormat9.format((long) (byte) 0);
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.StringBuffer stringBuffer15 = fastDateFormat9.format((long) (short) 100, stringBuffer14);
        java.lang.String str17 = fastDateFormat9.format((long) '#');
        java.util.TimeZone timeZone18 = fastDateFormat9.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(11, timeZone18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(stringBuffer15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        boolean boolean10 = fastDateFormat7.equals((java.lang.Object) 1.0f);
        java.lang.String str12 = fastDateFormat7.format((long) (short) -1);
        boolean boolean13 = fastDateFormat7.getTimeZoneOverridesCalendar();
        java.util.Locale locale14 = fastDateFormat7.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = new org.apache.commons.lang3.time.FastDateFormat("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone6, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, locale14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(11, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1/1/70 06:59" + "'", str12, "1/1/70 06:59");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat16);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5);
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone5, locale7);
        java.util.Calendar calendar9 = null;
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.StringBuffer stringBuffer11 = fastDateFormat8.applyRules(calendar9, stringBuffer10);
        int[] intArray19 = new int[] { 0, 0, (short) 1, (short) -1, (byte) 0, 0 };
        java.lang.String str20 = fastDateFormat8.parseToken("1/1/70 06:59", intArray19);
        java.lang.Object obj21 = fastDateFormat8.clone();
        java.util.TimeZone timeZone22 = fastDateFormat8.getTimeZone();
        java.util.Locale locale23 = fastDateFormat8.getLocale();
        int int24 = fastDateFormat8.getMaxLengthEstimate();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70");
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone32 = fastDateFormat31.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone32);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone32);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale38 = fastDateFormat37.getLocale();
        java.lang.String str39 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone32, true, (int) (short) 1, locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone28, locale38);
        boolean boolean41 = fastDateFormat8.equals((java.lang.Object) locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = new org.apache.commons.lang3.time.FastDateFormat("d/M/yy HH:mm", timeZone1, locale38);
        java.lang.Object obj43 = fastDateFormat42.clone();
        java.lang.String str44 = fastDateFormat42.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNull(stringBuffer11);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 12, 0, 1, (-1), 0, 0 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "'1/1/70 06:59" + "'", str20, "'1/1/70 06:59");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Indochina Summer Time" + "'", str39, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "FastDateFormat[d/M/yy HH:mm]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "FastDateFormat[d/M/yy HH:mm]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "FastDateFormat[d/M/yy HH:mm]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "d/M/yy HH:mm" + "'", str44, "d/M/yy HH:mm");
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        java.lang.String str16 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone9, true, (int) (short) 1, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone9);
        java.util.TimeZone timeZone18 = fastDateFormat17.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone24);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone24);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone31);
        java.util.Locale locale33 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone31, locale33);
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone31, locale35);
        java.util.Locale locale37 = fastDateFormat36.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = new org.apache.commons.lang3.time.FastDateFormat("'1/1/70 06:59", timeZone24, locale37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone44 = fastDateFormat43.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone49 = fastDateFormat48.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone49);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone49);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale55 = fastDateFormat54.getLocale();
        java.lang.String str56 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone49, true, (int) (short) 1, locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone44, locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getInstance("d/M/yy HH:mm", locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 07:00", timeZone24, locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone18, locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale55);
        java.util.Locale locale63 = fastDateFormat62.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (-1), timeZone2, locale63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Indochina Summer Time" + "'", str16, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Indochina Summer Time" + "'", str56, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "th_TH");
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone6);
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6, locale9);
        boolean boolean11 = fastDateFormat10.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone12 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale27 = fastDateFormat26.getLocale();
        java.lang.String str28 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone21, true, (int) (short) 1, locale27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone16, locale27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = new org.apache.commons.lang3.time.FastDateFormat("d MMMM y", timeZone12, locale27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance("H", timeZone12);
        java.lang.Object obj32 = fastDateFormat31.clone();
        fastDateFormat31.init();
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Indochina Summer Time" + "'", str28, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "FastDateFormat[H]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "FastDateFormat[H]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "FastDateFormat[H]");
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone6);
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6, locale9);
        java.lang.String str11 = fastDateFormat10.toString();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone15);
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 06:59", timeZone15, locale17);
        boolean boolean19 = fastDateFormat10.equals((java.lang.Object) "1/1/70 06:59");
        java.util.TimeZone timeZone20 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone26 = fastDateFormat25.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone26);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone26);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone26);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone32 = fastDateFormat31.getTimeZone();
        boolean boolean34 = fastDateFormat31.equals((java.lang.Object) 1.0f);
        java.lang.String str36 = fastDateFormat31.format((long) (short) -1);
        boolean boolean37 = fastDateFormat31.getTimeZoneOverridesCalendar();
        java.util.Locale locale38 = fastDateFormat31.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32 ", timeZone30, locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz", timeZone20, locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 06:59");
        java.util.Locale locale44 = fastDateFormat43.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = new org.apache.commons.lang3.time.FastDateFormat("FastDateFormat[]", timeZone20, locale44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1);
        java.util.Locale locale50 = fastDateFormat49.getLocale();
        boolean boolean51 = fastDateFormat49.getTimeZoneOverridesCalendar();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone55 = fastDateFormat54.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale61 = fastDateFormat60.getLocale();
        java.lang.String str62 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone55, true, (int) (short) 1, locale61);
        boolean boolean63 = fastDateFormat49.equals((java.lang.Object) true);
        int int64 = fastDateFormat49.getMaxLengthEstimate();
        java.util.Locale locale65 = fastDateFormat49.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getInstance("HH:mm", locale65);
        java.lang.Object obj67 = fastDateFormat66.clone();
        boolean boolean68 = fastDateFormat46.equals((java.lang.Object) fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FastDateFormat[]" + "'", str11, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1/1/70 06:59" + "'", str36, "1/1/70 06:59");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Indochina Summer Time" + "'", str62, "Indochina Summer Time");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 34 + "'", int64 == 34);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertEquals(obj67.toString(), "FastDateFormat[HH:mm]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj67), "FastDateFormat[HH:mm]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj67), "FastDateFormat[HH:mm]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        java.lang.String str17 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone10, true, (int) (short) 1, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone5, locale16);
        java.lang.String str19 = fastDateFormat18.toString();
        java.util.TimeZone timeZone20 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone24);
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone24, locale26);
        java.util.Calendar calendar28 = null;
        java.lang.StringBuffer stringBuffer29 = null;
        java.lang.StringBuffer stringBuffer30 = fastDateFormat27.applyRules(calendar28, stringBuffer29);
        int[] intArray33 = new int[] { 1 };
        java.lang.String str34 = fastDateFormat27.parseToken("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", intArray33);
        java.lang.Object obj35 = fastDateFormat27.clone();
        fastDateFormat27.init();
        boolean boolean37 = fastDateFormat27.getTimeZoneOverridesCalendar();
        java.util.Locale locale38 = fastDateFormat27.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = new org.apache.commons.lang3.time.FastDateFormat("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz", timeZone20, locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone42 = fastDateFormat41.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone42);
        java.lang.String str44 = fastDateFormat43.toString();
        java.util.Locale locale45 = fastDateFormat43.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone20, locale45);
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Indochina Summer Time" + "'", str17, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
// flaky "14) test5551(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]" + "'", str19, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNull(stringBuffer30);
        org.junit.Assert.assertNotNull(intArray33);
// flaky "6) test5551(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertArrayEquals(intArray33, new int[] { 31 });
// flaky "4) test5551(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70" + "'", str34, "\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat43);
// flaky "2) test5551(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u0e17\u0e35\u0e48 d MMMM GGGG y]" + "'", str44, "\u0e17\u0e35\u0e48 d MMMM GGGG y]");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat46);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone10);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone10, locale12);
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone10, locale14);
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getInstance("'1/1/70 06:59", locale16);
        java.util.TimeZone timeZone18 = fastDateFormat17.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone22);
        java.lang.String str24 = fastDateFormat23.toString();
        java.util.TimeZone timeZone25 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone32 = fastDateFormat31.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone32);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone37 = fastDateFormat36.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale43 = fastDateFormat42.getLocale();
        java.lang.String str44 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone37, true, (int) (short) 1, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone32, locale43);
        java.util.TimeZone timeZone46 = fastDateFormat45.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone50 = fastDateFormat49.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone50);
        java.util.TimeZone timeZone52 = fastDateFormat51.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone55 = fastDateFormat54.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1);
        java.util.Locale locale58 = fastDateFormat57.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = new org.apache.commons.lang3.time.FastDateFormat("hi!", timeZone55, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone52, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, timeZone46, locale58);
        java.lang.String str62 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone25, false, 0, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = new org.apache.commons.lang3.time.FastDateFormat("FastDateFormat[]", timeZone18, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e21\u0e04. 70", locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale58);
        java.lang.Class<?> wildcardClass66 = fastDateFormat65.getClass();
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat23);
// flaky "15) test5552(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u0e17\u0e35\u0e48 d MMMM GGGG y]" + "'", str24, "\u0e17\u0e35\u0e48 d MMMM GGGG y]");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Indochina Summer Time" + "'", str44, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ICT" + "'", str62, "ICT");
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone6);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6, locale8);
        java.util.Calendar calendar10 = null;
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.StringBuffer stringBuffer12 = fastDateFormat9.applyRules(calendar10, stringBuffer11);
        java.lang.Object obj13 = fastDateFormat9.clone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone19);
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone19, locale21);
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone19, locale23);
        fastDateFormat24.init();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70");
        java.util.Locale locale29 = fastDateFormat28.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone34);
        java.util.Locale locale36 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone34, locale36);
        java.util.Calendar calendar38 = null;
        java.lang.StringBuffer stringBuffer39 = null;
        java.lang.StringBuffer stringBuffer40 = fastDateFormat37.applyRules(calendar38, stringBuffer39);
        int[] intArray48 = new int[] { 0, 0, (short) 1, (short) -1, (byte) 0, 0 };
        java.lang.String str49 = fastDateFormat37.parseToken("1/1/70 06:59", intArray48);
        java.lang.String str50 = fastDateFormat28.parseToken("Indochina Summer Time", intArray48);
        java.lang.String str51 = fastDateFormat24.parseToken("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz", intArray48);
        java.lang.String str52 = fastDateFormat9.parseToken("FastDateFormat[d MMM y]", intArray48);
        java.util.Locale locale53 = fastDateFormat9.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone2, locale53);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) -1, locale53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNull(stringBuffer12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNull(stringBuffer40);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 16, 0, 1, (-1), 0, 0 });
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "'1/1/70 06:59" + "'", str49, "'1/1/70 06:59");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "mm" + "'", str50, "mm");
// flaky "16) test5553(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\u0e32\u0e17\u0e35 " + "'", str51, "\u0e32\u0e17\u0e35 ");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "' " + "'", str52, "' ");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat54);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, timeZone5);
        boolean boolean9 = fastDateFormat8.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone10 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone16);
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 06:59", timeZone16, locale18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone24);
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone24, locale26);
        java.util.Calendar calendar28 = null;
        java.lang.StringBuffer stringBuffer29 = null;
        java.lang.StringBuffer stringBuffer30 = fastDateFormat27.applyRules(calendar28, stringBuffer29);
        java.util.TimeZone timeZone31 = fastDateFormat27.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale33 = fastDateFormat32.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone31, locale33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = new org.apache.commons.lang3.time.FastDateFormat("d MMM y", timeZone16, locale33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2);
        java.lang.String str38 = fastDateFormat37.getPattern();
        java.util.Locale locale39 = fastDateFormat37.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = new org.apache.commons.lang3.time.FastDateFormat("1/1/70 06:59", timeZone16, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone48 = fastDateFormat47.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone48);
        java.util.Locale locale50 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 06:59", timeZone48, locale50);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 06:59");
        java.util.Locale locale55 = fastDateFormat54.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone48, locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone63 = fastDateFormat62.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone63);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone68 = fastDateFormat67.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone68);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone68);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale74 = fastDateFormat73.getLocale();
        java.lang.String str75 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone68, true, (int) (short) 1, locale74);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone63, locale74);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang3.time.FastDateFormat.getInstance("d/M/yy HH:mm", locale74);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, locale74);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat79 = new org.apache.commons.lang3.time.FastDateFormat("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone48, locale74);
        java.lang.String str80 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone16, false, 0, locale74);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 100, timeZone10, locale74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNull(stringBuffer30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "d MMM y" + "'", str38, "d MMM y");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(timeZone63);
        org.junit.Assert.assertEquals(timeZone63.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(timeZone68);
        org.junit.Assert.assertEquals(timeZone68.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Indochina Summer Time" + "'", str75, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "ICT" + "'", str80, "ICT");
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone4);
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone4, locale6);
        java.util.Calendar calendar8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat7.applyRules(calendar8, stringBuffer9);
        int[] intArray13 = new int[] { 1 };
        java.lang.String str14 = fastDateFormat7.parseToken("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", intArray13);
        boolean boolean16 = fastDateFormat7.equals((java.lang.Object) "d/M/yy HH:mm");
        java.util.TimeZone timeZone17 = fastDateFormat7.getTimeZone();
        java.lang.String str18 = fastDateFormat7.getPattern();
        java.util.TimeZone timeZone19 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone27);
        java.util.Locale locale30 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone27, locale30);
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getInstance("'1/1/70 06:59", timeZone27, locale32);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone42 = fastDateFormat41.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone42);
        java.util.Locale locale44 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 06:59", timeZone42, locale44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone42);
        boolean boolean48 = fastDateFormat46.equals((java.lang.Object) 1L);
        java.util.TimeZone timeZone49 = fastDateFormat46.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone54 = fastDateFormat53.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone54);
        java.util.Locale locale56 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone54, locale56);
        java.util.Calendar calendar58 = null;
        java.lang.StringBuffer stringBuffer59 = null;
        java.lang.StringBuffer stringBuffer60 = fastDateFormat57.applyRules(calendar58, stringBuffer59);
        java.util.TimeZone timeZone61 = fastDateFormat57.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale63 = fastDateFormat62.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone61, locale63);
        java.lang.String str65 = fastDateFormat64.getPattern();
        java.util.Locale locale66 = fastDateFormat64.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat67 = new org.apache.commons.lang3.time.FastDateFormat("mm", timeZone49, locale66);
        java.util.TimeZone timeZone68 = fastDateFormat67.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone73 = fastDateFormat72.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone73);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone73);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale79 = fastDateFormat78.getLocale();
        java.lang.String str80 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone73, true, (int) (short) 1, locale79);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone73);
        java.util.TimeZone timeZone82 = fastDateFormat81.getTimeZone();
        java.lang.String str83 = fastDateFormat81.getPattern();
        java.lang.Object obj84 = fastDateFormat81.clone();
        java.util.Locale locale85 = fastDateFormat81.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat86 = new org.apache.commons.lang3.time.FastDateFormat("\u0e17\u0e35\u0e48\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z]", timeZone68, locale85);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale85);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat88 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone27, locale85);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat89 = org.apache.commons.lang3.time.FastDateFormat.getInstance("H", timeZone19, locale85);
        java.util.Locale locale90 = fastDateFormat89.getLocale();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "17) test5555(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 31 });
// flaky "7) test5555(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70" + "'", str14, "\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNull(stringBuffer60);
        org.junit.Assert.assertNotNull(timeZone61);
        org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat64);
// flaky "5) test5555(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz" + "'", str65, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "th_TH");
        org.junit.Assert.assertNotNull(timeZone68);
        org.junit.Assert.assertEquals(timeZone68.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(timeZone73);
        org.junit.Assert.assertEquals(timeZone73.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Indochina Summer Time" + "'", str80, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertNotNull(timeZone82);
        org.junit.Assert.assertEquals(timeZone82.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
// flaky "3) test5555(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str83 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z" + "'", str83, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z");
        org.junit.Assert.assertNotNull(obj84);
// flaky "2) test5555(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals(obj84.toString(), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z]");
// flaky "2) test5555(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj84), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z]");
// flaky "2) test5555(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj84), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z]");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(fastDateFormat88);
        org.junit.Assert.assertNotNull(fastDateFormat89);
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "th_TH");
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone5);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone5, locale8);
        boolean boolean10 = fastDateFormat9.getTimeZoneOverridesCalendar();
        java.util.Calendar calendar11 = null;
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.StringBuffer stringBuffer13 = fastDateFormat9.applyRules(calendar11, stringBuffer12);
        boolean boolean14 = fastDateFormat9.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone15 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone15);
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(stringBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat16);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1);
        java.util.Locale locale10 = fastDateFormat9.getLocale();
        boolean boolean11 = fastDateFormat9.getTimeZoneOverridesCalendar();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale21 = fastDateFormat20.getLocale();
        java.lang.String str22 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone15, true, (int) (short) 1, locale21);
        boolean boolean23 = fastDateFormat9.equals((java.lang.Object) true);
        int int24 = fastDateFormat9.getMaxLengthEstimate();
        java.util.Locale locale25 = fastDateFormat9.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("HH:mm", locale25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, locale25);
        java.lang.String str28 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone3, false, (int) (byte) 1, locale25);
        java.util.Locale locale29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(4, timeZone3, locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Indochina Summer Time" + "'", str22, "Indochina Summer Time");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34 + "'", int24 == 34);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str28, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone10);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone10, locale12);
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone10, locale14);
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getInstance("'1/1/70 06:59", locale16);
        java.util.TimeZone timeZone18 = fastDateFormat17.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone24);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone29 = fastDateFormat28.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone29);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone29);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale35 = fastDateFormat34.getLocale();
        java.lang.String str36 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(timeZone29, true, (int) (short) 1, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone24, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getInstance("d/M/yy HH:mm", locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone18, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = new org.apache.commons.lang3.time.FastDateFormat("\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70]", timeZone18, locale41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70 06:59", timeZone18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone18);
        fastDateFormat44.init();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.TimeZone timeZone49 = fastDateFormat48.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone49);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone49);
        java.util.TimeZone timeZone52 = fastDateFormat51.getTimeZone();
        java.lang.String str53 = fastDateFormat51.getPattern();
        boolean boolean54 = fastDateFormat44.equals((java.lang.Object) fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Indochina Summer Time" + "'", str36, "Indochina Summer Time");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
// flaky "18) test5558(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\u0e17\u0e35\u0e48 d MMMM GGGG y" + "'", str53, "\u0e17\u0e35\u0e48 d MMMM GGGG y");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z");
        java.lang.Object obj3 = fastDateFormat2.clone();
        java.lang.String str4 = fastDateFormat2.getPattern();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getInstance("\u0e21\u0e04. 70]", locale5);
// flaky "19) test5559(org.apache.commons.lang3.time.RegressionTest11)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(obj3);
// flaky "8) test5559(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals(obj3.toString(), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z]");
// flaky "6) test5559(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z]");
// flaky "4) test5559(org.apache.commons.lang3.time.RegressionTest11)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z" + "'", str4, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }
}
